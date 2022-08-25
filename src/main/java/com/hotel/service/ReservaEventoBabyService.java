/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.ReservaEvento;
import com.hotel.entity.ReservaEventoBaby;
import com.hotel.repository.ReservaEventoBabyRepository;
import com.hotel.repository.ReservaEventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ReservaEventoBabyService implements IReservaEventoBabyService {
    @Autowired
    private ReservaEventoBabyRepository reservaeventobabyRepository;

     @Override
    public List<ReservaEventoBaby> getAllReservaEventoBaby() {
        return (List<ReservaEventoBaby>)reservaeventobabyRepository.findAll();
    }

    @Override
    public ReservaEventoBaby getReservaEventoBabyById(long id) {
        return reservaeventobabyRepository.findById(id).orElse(null);
    }

    @Override
    public void saveReservaEventobaby(ReservaEventoBaby reservaeventobaby) {
        reservaeventobabyRepository.save(reservaeventobaby);
    }

    @Override
    public void deletebaby(long id) {
        reservaeventobabyRepository.deleteById(id);
    }
}
