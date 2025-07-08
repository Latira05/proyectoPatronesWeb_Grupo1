/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.serviceIMPL;



import com.dao.MetaDao;
import com.domain.Meta;
import com.service.MetaService;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MetaServiceImpl implements MetaService {
 @Autowired
    private MetaDao metaDao;
 
 
    @Override
    public List<Meta> getMeta(boolean activos) {
         List<Meta> lista = metaDao.findAll();
        
        if(activos){
            lista.removeIf(cat -> !cat.isHecho());
        }
        return lista;
    }
    @Override
    @Transactional(readOnly = true)
    public Meta getMeta(Meta meta) {
            throw new UnsupportedOperationException("Not supported yet.");
    }    
    @Override
    @Transactional 
    public void save(Meta meta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional 
    public void delete(Meta meta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
}
