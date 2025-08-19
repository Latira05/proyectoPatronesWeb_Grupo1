/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dao;

/**
 *
 * @author ivann
 */

import com.domain.Usuario;
import com.domain.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRolDao extends JpaRepository<UsuarioRol, Long> {
    List<UsuarioRol> findByUsuario(Usuario usuario);
}
