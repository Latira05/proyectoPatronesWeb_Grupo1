/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.domain;

/**
 *
 * @author ivann
 */

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


    @ManyToOne(optional = false)
    @JoinColumn(name = "id_rol")
    private Rol rol;
}

