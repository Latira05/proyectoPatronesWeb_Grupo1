/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.security;

/**
 *
 * @author ivann
 */

import com.dao.UsuarioDao;
import com.dao.UsuarioRolDao;
import com.domain.Usuario;
import com.domain.UsuarioRol;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioDao usuarioDao;
    private final UsuarioRolDao usuarioRolDao;

    public CustomUserDetailsService(UsuarioDao usuarioDao, UsuarioRolDao usuarioRolDao) {
        this.usuarioDao = usuarioDao;
        this.usuarioRolDao = usuarioRolDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findAll()
                .stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        Collection<UsuarioRol> roles = usuarioRolDao.findAll()
                .stream()
                .filter(ur -> ur.getUsuario().getIdUsuario().equals(usuario.getIdUsuario()))
                .collect(Collectors.toList());

        Collection<GrantedAuthority> authorities = roles.stream()
                .map(ur -> new SimpleGrantedAuthority(ur.getRol().getNombre()))
                .collect(Collectors.toList());

        return new User(usuario.getUsername(), usuario.getPassword(), usuario.isActivo(), true, true, true, authorities);
    }
}
