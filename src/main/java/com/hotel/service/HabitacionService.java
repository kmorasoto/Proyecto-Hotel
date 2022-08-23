/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Habitacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.repository.HabitacionRepository;

/**
 *
 * @author Daniela
 */
@Service
public class HabitacionService implements IHabitacionService {

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Override
    public List<Habitacion> listHabitacion() {
        return (List<Habitacion>)habitacionRepository.findAll();
    }

    @Override
    public List<Habitacion> getAllhabitacion() {
        return(List<Habitacion>)habitacionRepository.findAll();
    }

    @Override
    public Habitacion gethabitacionById(long id) {
        return habitacionRepository.findById(id).orElse(null);
    }

    @Override
    public void savehabitacion(Habitacion habitacion) {
        habitacionRepository.save(habitacion);
    }

    @Override
    public void delete(long id) {
        habitacionRepository.deleteById(id);
    }

    @Override
    public Habitacion findByhabitacion(String habitacion) {
        return habitacionRepository.findByHabitacion(habitacion);
    }
    

}
