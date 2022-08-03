/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.ReservaEvento;
import com.hotel.entity.reservaSakura;
import com.hotel.repository.ReservaEventoRepository;
import com.hotel.repository.reservaSakuraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dell
 */
@Service
public class ReservaEventoService implements IReservaEventoService {

    @Autowired
    private ReservaEventoRepository reservaeventoRepository;

     @Override
    public List<ReservaEvento> getAllReservaEvento() {
        return (List<ReservaEvento>) reservaeventoRepository.findAll();
    }

    @Override
    public ReservaEvento getReservaEventoById(long id) {
        return reservaeventoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveReservaEvento(ReservaEvento reservaevento) {
        reservaeventoRepository.save(reservaevento);
    }

    @Override
    public void delete(long id) {
        reservaeventoRepository.deleteById(id);
    }

    
}
