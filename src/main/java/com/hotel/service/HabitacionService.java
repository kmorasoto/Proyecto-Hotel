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
    

}
