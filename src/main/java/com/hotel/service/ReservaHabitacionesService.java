/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.ReservaHabitaciones;
import com.hotel.repository.HabitacionesRepository;
import com.hotel.repository.ReservaHabitacionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
@Service
public class ReservaHabitacionesService implements IReservaHabitacionesService {

    @Autowired
    private ReservaHabitacionesRepository ReservaHabitacionesRepository;
    
    @Override
    public List<ReservaHabitaciones> getAllReservaHabitaciones() {
        return (List<ReservaHabitaciones>) ReservaHabitacionesRepository.findAll();
    }

    @Override
    public ReservaHabitaciones getReservaHabitacionesById(long id) {
        return ReservaHabitacionesRepository.findById(id).orElse(null);
    }

    @Override
    public void saveReservaHabitaciones(ReservaHabitaciones ReservaHabitaciones) {
        ReservaHabitacionesRepository.save(ReservaHabitaciones);
    }

    @Override
    public void delete(long id) {
        ReservaHabitacionesRepository.deleteById(id);
    }
    
    
}
