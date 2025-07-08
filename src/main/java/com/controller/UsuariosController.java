package com.controller;
import com.domain.Usuario;
import com.service.UsuarioService;
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
@RequestMapping("/usuario")
public class UsuariosController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var usuario = usuarioService.getUsuario(true);
        model.addAttribute("usuario", usuario);
        model.addAttribute("totalUsuario", usuario.size());
        return "/usuario/listado";
    }
    
    @GetMapping("/nuevo")
    public String usuarioNuevo(Usuario usuario) {
        return "/usuario/modifica";
    }

    @Autowired
    private FirebaseStorageServiceIMPL firebaseStorageService;
    
    @PostMapping("/guardar")
    public String usuarioGuardar(Usuario usuario,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            usuarioService.save(usuario);
            //usuario.getImagen_url();
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "usuario", 
                            usuario.getId_usuario());
        }
        usuarioService.save(usuario);
        return "redirect:/usuario/listado";
    }

    @GetMapping("/eliminar/{idUsuario}")
    public String usuarioEliminar(Usuario usuario) {
        usuarioService.delete(usuario);
        return "redirect:/usuario/listado";
    }

    @GetMapping("/modificar/{idUsuario}")
    public String usuarioModificar(Usuario usuario, Model model) {
        usuario = usuarioService.getUsuario(usuario);
        model.addAttribute("usuario", usuario);
        return "/usuario/modifica";
    }
}