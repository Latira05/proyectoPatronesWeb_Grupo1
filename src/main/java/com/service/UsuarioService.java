/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.domain.Usuario;
import java.util.List;

/**
 *
 * @author natha
 */
public interface  UsuarioService {
    
    
  
    public List <Usuario> getUsuario (boolean activos);
    
   
   // Se obtiene un Usuario, a partir del id de un usuario
    public Usuario getUsuario(Usuario usuario);
    
    // Se inserta un nuevo usuario si el id del usuario esta vacío
    // Se actualiza un usuario si el id del usuario NO esta vacío
    public void save(Usuario usuario);
    
    // Se elimina el usuario que tiene el id pasado por parámetro
    public void delete(Usuario usuario);             
}


