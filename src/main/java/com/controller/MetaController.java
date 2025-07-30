/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.domain.Meta;
import com.service.MetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *
 * @author ivann
 */
@RestController
@RequestMapping("/api/metas")
@CrossOrigin(origins = "*")
public class MetaController {

    @Autowired
    private MetaService metaService;

 
    @PostMapping
    public ResponseEntity<Meta> crearMeta(@RequestBody Meta meta) {
        metaService.save(meta);
        return ResponseEntity.ok(meta);
    }

  
    @PutMapping("/{id}/completar")
    public ResponseEntity<String> completarMeta(@PathVariable Long id) {
        metaService.marcarComoCompletada(id);
        return ResponseEntity.ok("Meta marcada como completada");
    }

   
    @GetMapping("/progreso/{idUsuario}")
    public ResponseEntity<Map<String, Integer>> verProgreso(@PathVariable Long idUsuario) {
        Map<String, Integer> resumen = metaService.obtenerResumenProgreso(idUsuario);
        return ResponseEntity.ok(resumen);
    }

   
    @GetMapping
    public ResponseEntity<List<Meta>> listarMetas() {
        List<Meta> metas = metaService.getMeta(false);
        return ResponseEntity.ok(metas);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarMeta(@PathVariable Long id) {
        Meta meta = new Meta();
        meta.setId_meta(id);
        metaService.delete(meta);
        return ResponseEntity.ok("Meta eliminada correctamente");
    }
}



