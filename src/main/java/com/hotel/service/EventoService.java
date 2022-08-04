/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Evento;
import com.hotel.entity.restSakura;
import com.hotel.repository.EventoRepository;
import com.hotel.repository.restSakuraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dell
 */@Service
public class EventoService implements IEventoService{
      @Autowired
    private EventoRepository eventoRepository;
    
    @Override
    public List<Evento> listEvento1(){
        return (List<Evento>)eventoRepository.findAll();
    }
}
