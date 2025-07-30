/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.domain.Habito;
import com.service.HabitoService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/habitos")
@CrossOrigin(origins = "*")
/**
 *
 * @author ivann
 */
public class habitoController {

    @Autowired
    private HabitoService habitoService;

    @PostMapping
    public ResponseEntity<Habito> crearHabito(@RequestBody Habito habito) {
        habitoService.save(habito);
        return ResponseEntity.ok(habito);
    }

    @PutMapping("/{id}/completar")
    public ResponseEntity<String> completarHabito(@PathVariable Long id) {
        habitoService.marcarComoCompletado(id);
        return ResponseEntity.ok("Hábito marcado como completado");
    }

    @GetMapping("/progreso/{idUsuario}")
    public ResponseEntity<Map<String, Integer>> verProgreso(@PathVariable Long idUsuario) {
        Map<String, Integer> resumen = habitoService.obtenerResumenProgreso(idUsuario);
        return ResponseEntity.ok(resumen);
    }
    
@GetMapping
public ResponseEntity<List<Habito>> listarHabitos() {
    List<Habito> habitos = habitoService.getHabito(false); // false = listar todos
    return ResponseEntity.ok(habitos);
}

@DeleteMapping("/{id}")
public ResponseEntity<String> eliminarHabito(@PathVariable Long id) {
    Habito habito = new Habito();
    habito.setId_habito(id);
    habitoService.delete(habito);
    return ResponseEntity.ok("Hábito eliminado correctamente");
}

}

