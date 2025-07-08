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
import lombok.Data;

/**
 *
 * @author natha
 */
@Data
@Entity
@Table(name = "viveres")
public class Viveres implements Serializable {
     private static final long serialVersionUID = 1L;
     
         
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;
     private Long id_usuario;
    private String nombre;
    private String categoria;
    private int stock;
    private double precio;
    private boolean estatus;
    private String imagen_url;

    public Viveres(Long id_usuario, String nombre, String categoria, int stock, double precio, boolean estatus, String imagen_url) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
        this.estatus = estatus;
        this.imagen_url = imagen_url;
    }

   
    
    

  
}
