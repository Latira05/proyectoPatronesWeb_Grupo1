/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.serviceIMPL;



import com.dao.TareaDao;
import com.domain.Tarea;
import com.service.TareaService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TareaServiceImpl implements TareaService {
 @Autowired
    private TareaDao tareaDao;
 
 
    @Override
    public List<Tarea> getTarea(boolean activos) {
         List<Tarea> lista = tareaDao.findAll();
        
        if(activos){
            lista.removeIf(cat -> !cat.isHecho());
        }
        return lista;
    }
    @Override
    @Transactional(readOnly = true)
    public Tarea getTarea(Tarea tarea) {
            throw new UnsupportedOperationException("Not supported yet.");
    }    
    @Override
    @Transactional 
    public void save(Tarea tarea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional 
    public void delete(Tarea tarea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
}
