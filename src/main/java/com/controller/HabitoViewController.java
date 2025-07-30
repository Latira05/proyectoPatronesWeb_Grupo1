/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.service.HabitoService;
import com.domain.Habito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ivann
 */

@Controller
public class HabitoViewController {

    @Autowired
    private HabitoService habitoService;

    @GetMapping("/habitos")
    public String mostrarHabitos(Model model) {
        model.addAttribute("habitos", habitoService.getHabito(false));
        model.addAttribute("habito", new Habito());
        return "habitosMeta/listar-habitos";
    }
    
@GetMapping("/progreso-habitos")
public String mostrarProgreso() {
    return "habitosMeta/progreso-habitos";
}
@GetMapping("/progreso-habitos")
public String verProgresoHabitos() {
    return "habitosMeta/progreso-habitos"; // Ruta dentro de templates
}

}

