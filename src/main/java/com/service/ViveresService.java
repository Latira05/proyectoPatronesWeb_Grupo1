/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.domain.Viveres;
import java.util.List;

/**
 *
 * @author natha
 */
public interface  ViveresService {
    
    
  
    public List <Viveres> getViveres (boolean activos);
    
   
   // Se obtiene un Viveres, a partir del id de un viveres
    public Viveres getViveres(Viveres viveres);
    
    // Se inserta un nuevo viveres si el id del viveres esta vacío
    // Se actualiza un viveres si el id del viveres NO esta vacío
    public void save(Viveres viveres);
    
    // Se elimina el viveres que tiene el id pasado por parámetro
    public void delete(Viveres viveres);             
}


