/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.domain.Meta;
import java.util.List;

/**
 *
 * @author natha
 */
public interface  MetaService {
    
    
  
    public List <Meta> getMeta (boolean activos);
    
   
   // Se obtiene un Meta, a partir del id de un meta
    public Meta getMeta(Meta meta);
    
    // Se inserta un nuevo meta si el id del meta esta vacío
    // Se actualiza un meta si el id del meta NO esta vacío
    public void save(Meta meta);
    
    // Se elimina el meta que tiene el id pasado por parámetro
    public void delete(Meta meta);             
}


