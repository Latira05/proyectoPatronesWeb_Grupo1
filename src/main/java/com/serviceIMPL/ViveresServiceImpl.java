/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.serviceIMPL;



import com.dao.ViveresDao;
import com.domain.Viveres;
import com.service.ViveresService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ViveresServiceImpl implements ViveresService {
 @Autowired
    private ViveresDao viveresDao;
 
 
    @Override
    public List<Viveres> getViveres(boolean activos) {
         List<Viveres> lista = viveresDao.findAll();
        
        if(activos){
            lista.removeIf((Viveres cat) -> !cat.isEstatus());
        }
        return lista;
    }
    @Override
    @Transactional(readOnly = true)
    public Viveres getViveres(Viveres viveres) {
            throw new UnsupportedOperationException("Not supported yet.");
    }    
    @Override
    @Transactional 
    public void save(Viveres viveres) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional 
    public void delete(Viveres viveres) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
}
