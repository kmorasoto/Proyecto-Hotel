/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Registros;
import com.hotel.repository.RegistrosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
@Service
public class RegistrosService implements IRegistrosService {
    
    @Autowired
    private RegistrosRepository RegistrosRepository;

    @Override
    public List<Registros> getAllRegistros() {
        return (List<Registros>)RegistrosRepository.findAll();
    }

    @Override
    public Registros getRegistrosById(long id) {
        return RegistrosRepository.findById(id).orElse(null);
    }

    @Override
    public void saveRegistros(Registros Registros) {
        RegistrosRepository.save(Registros);
    }

    @Override
    public void delete(long id) {
        RegistrosRepository.deleteById(id);
    }
    
    @Override
    public Registros findByNombre(String nombre) {
        return RegistrosRepository.findByNombre(nombre);
    }

}
