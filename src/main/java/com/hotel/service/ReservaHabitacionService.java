/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.ReservaHabitacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.repository.HabitacionRepository;
import com.hotel.repository.ReservaHabitacionRepository;

/**
 *
 * @author Daniela
 */
@Service
public class ReservaHabitacionService implements IReservaHabitacionService {

    @Autowired
    private ReservaHabitacionRepository reservahabitacionRepository;
    
    @Override
    public List<ReservaHabitacion> getAllReservaHabitacion() {
        return (List<ReservaHabitacion>) reservahabitacionRepository.findAll();
    }

    @Override
    public ReservaHabitacion getReservaHabitacionById(long id) {
        return reservahabitacionRepository.findById(id).orElse(null);
    }

    @Override
    public void saveReservaHabitacion(ReservaHabitacion reservahabitacion) {
        reservahabitacionRepository.save(reservahabitacion);
    }

    @Override
    public void delete(long id) {
        reservahabitacionRepository.deleteById(id);
    }
    
    
}
