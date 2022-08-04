/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Habitaciones;
import com.hotel.repository.HabitacionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
@Service
public class HabitacionesService implements IHabitacionesService {

    @Autowired
    private HabitacionesRepository HabitacionesRepository;

    @Override
    public List<Habitaciones> listHabitacion() {
        return (List<Habitaciones>)HabitacionesRepository.findAll();
    }
    

}
