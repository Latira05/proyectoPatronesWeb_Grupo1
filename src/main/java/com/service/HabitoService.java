/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.domain.Habito;
import java.util.List;
import java.util.Map;

/**
 *
 * @author natha
 */
public interface  HabitoService {
    
    
  
    public List <Habito> getHabito (boolean activos);
    
   
   // Se obtiene un Habito, a partir del id de un habito
    public Habito getHabito(Habito habito);
    
    // Se inserta un nuevo habito si el id del habito esta vacío
    // Se actualiza un habito si el id del habito NO esta vacío
    public void save(Habito habito);
    
    // Se elimina el habito que tiene el id pasado por parámetro
    public void delete(Habito habito);  
    
    public void marcarComoCompletado(Long id);
    public Map<String, Integer> obtenerResumenProgreso(Long idUsuario);

}


