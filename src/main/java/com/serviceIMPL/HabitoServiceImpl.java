/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.serviceIMPL;



import com.dao.HabitoDao;
import com.domain.Habito;
import com.service.HabitoService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HabitoServiceImpl implements HabitoService {
 @Autowired
    private HabitoDao habitoDao;
 
 
    @Override
    public List<Habito> getHabito(boolean activos) {
         List<Habito> lista = habitoDao.findAll();
        
        if(activos){
            lista.removeIf(cat -> !cat.isHecho());
        }
        return lista;
    }
    @Override
    @Transactional(readOnly = true)
    public Habito getHabito(Habito habito) {
            throw new UnsupportedOperationException("Not supported yet.");
    }    
    @Override
    @Transactional 
    public void save(Habito habito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional 
    public void delete(Habito habito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
}
