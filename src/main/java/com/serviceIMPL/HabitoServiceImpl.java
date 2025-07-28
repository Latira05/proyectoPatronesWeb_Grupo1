/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.serviceIMPL;

import com.dao.HabitoDao;
import com.domain.Habito;
import com.service.HabitoService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HabitoServiceImpl implements HabitoService {

    @Autowired
    private HabitoDao habitoDao;

    @Override
    public List<Habito> getHabito(boolean activos) {
        List<Habito> lista = habitoDao.findAll();
        if (activos) {
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
        if (habito.getCreadoEn() == null) {
            habito.setCreadoEn(java.time.LocalDateTime.now());
        }
        if (!habito.isHecho()) {
            habito.setHecho(false);
        }
        habitoDao.save(habito);
    }

    @Override
    @Transactional
    public void delete(Habito habito) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void marcarComoCompletado(Long id) {
        Habito habito = habitoDao.findById(id).orElse(null);
        if (habito != null) {
            habito.setHecho(true);
            habitoDao.save(habito);
        }
    }

    @Override
    public Map<String, Integer> obtenerResumenProgreso(Long idUsuario) {
        List<Habito> habitos = habitoDao.findAll();
        int completados = 0;
        int pendientes = 0;

        for (Habito h : habitos) {
            if (h.getId_usuario().equals(idUsuario)) {
                if (h.isHecho()) {
                    completados++;
                } else {
                    pendientes++;
                }
            }
        }

        Map<String, Integer> resumen = new HashMap<>();
        resumen.put("completados", completados);
        resumen.put("pendientes", pendientes);
        resumen.put("total", completados + pendientes);
        return resumen;
    }
}
