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
import lombok.Data;


@Data
@Entity
@Table(name = "habito")
public class Habito implements Serializable {
     private static final long serialVersionUID = 1L;
     
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habito")
    private Long id_habito;
    private Long id_usuario;
    private String nombre;
    private String descripcion;
    private String frecuencia;
    private LocalDateTime creadoEn;
    private boolean hecho;

    public Habito(Long id_usuario, String nombre, String descripcion, String frecuencia, LocalDateTime creadoEn, boolean hecho) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.frecuencia = frecuencia;
        this.creadoEn = LocalDateTime.now();
        this.hecho = hecho;
    }

   public Habito() {
    
}

                               
    
}
