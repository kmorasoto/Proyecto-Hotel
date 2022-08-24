/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Registro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.repository.RegistroRepository;

/**
 *
 * @author Daniela
 */
@Service
public class RegistroService implements IRegistroService {
    
    @Autowired
    private RegistroRepository registroRepository;
    
    @Override
    public List<Registro> listRegistro() {
        return (List<Registro>)registroRepository.findAll();
    }

    @Override
    public List<Registro> getAllregistro() {
        return (List<Registro>)registroRepository.findAll();
    }

    @Override
    public Registro getregistroById(long id) {
        return registroRepository.findById(id).orElse(null);
    }

    @Override
    public void saveregistro(Registro registro) {
        registroRepository.save(registro);
    }

    @Override
    public void delete(long id) {
        registroRepository.deleteById(id);
    }
    
    @Override
    public Registro findBynombre(String nombre) {
        return registroRepository.findByNombre(nombre);
    }    

}
