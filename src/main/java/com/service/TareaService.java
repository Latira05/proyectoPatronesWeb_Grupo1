/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.domain.Tarea;
import java.util.List;

/**
 *
 * @author natha
 */
public interface  TareaService {
    
    
  
    public List <Tarea> getTarea (boolean activos);
    
   
   // Se obtiene un Tarea, a partir del id de un tarea
    public Tarea getTarea(Tarea tarea);
    
    // Se inserta un nuevo tarea si el id del tarea esta vacío
    // Se actualiza un tarea si el id del tarea NO esta vacío
    public void save(Tarea tarea);
    
    // Se elimina el tarea que tiene el id pasado por parámetro
    public void delete(Tarea tarea);             
}


