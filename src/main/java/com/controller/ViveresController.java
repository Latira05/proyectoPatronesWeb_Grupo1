package com.controller;
import com.domain.Viveres;
import com.service.ViveresService;
import com.serviceIMPL.FirebaseStorageServiceIMPL;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/viveres")
public class ViveresController {
    
    @Autowired
    private ViveresService viveresService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var viveres = viveresService.getViveres(true);
        model.addAttribute("viveres", viveres);
        model.addAttribute("totalViveress", viveres.size());
        return "/viveres/listado";
    }
    
    @GetMapping("/nuevo")
    public String viveresNuevo(Viveres viveres) {
        return "/viveres/modifica";
    }

    @Autowired
    private FirebaseStorageServiceIMPL firebaseStorageService;
    
    @PostMapping("/guardar")
    public String viveresGuardar(Viveres viveres,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            viveresService.save(viveres);
            viveres.getImagen_url();
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "viveres", 
                            viveres.getId_producto());
        }
        viveresService.save(viveres);
        return "redirect:/viveres/listado";
    }

    @GetMapping("/eliminar/{idViveres}")
    public String viveresEliminar(Viveres viveres) {
        viveresService.delete(viveres);
        return "redirect:/viveres/listado";
    }

    @GetMapping("/modificar/{idViveres}")
    public String viveresModificar(Viveres viveres, Model model) {
        viveres = viveresService.getViveres(viveres);
        model.addAttribute("viveres", viveres);
        return "/viveres/modifica";
    }
}