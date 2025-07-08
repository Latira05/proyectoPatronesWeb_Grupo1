/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.serviceIMPL;



import com.dao.UsuarioDao;
import com.domain.Usuario;
import com.service.UsuarioService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UsuarioServiceImpl implements UsuarioService {
 @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> getUsuario(boolean activos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 
  
    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuario(Usuario usuario) {
            throw new UnsupportedOperationException("Not supported yet.");
    }    
    @Override
    @Transactional 
    public void save(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional 
    public void delete(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
}
