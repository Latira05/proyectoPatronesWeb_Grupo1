/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author natha
 */
@Data
@Entity
@Table(name = "meta")
public class Meta implements Serializable  {
     private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_meta")
        private Long id_meta;
        private Long id_usuario;
        private String nombre;
        private String descripcion;
        private LocalDateTime creadoEn;
        private Date fechaLimite;
        private boolean hecho;

    public Meta(Long id_usuario, String nombre, String descripcion, LocalDateTime creadoEn, Date fechaLimite, boolean hecho) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creadoEn = LocalDateTime.now();
        this.fechaLimite = fechaLimite;
        this.hecho = hecho;
    }
        
        
        
        
}
