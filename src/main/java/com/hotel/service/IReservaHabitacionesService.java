/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Habitaciones;
import com.hotel.entity.ReservaHabitaciones;
import java.util.List;

/**
 *
 * @author Daniela
 */
public interface IReservaHabitacionesService {
    public List<ReservaHabitaciones> getAllReservaHabitaciones();
    public ReservaHabitaciones getReservaHabitacionesById (long id);
    public void saveReservaHabitaciones(ReservaHabitaciones ReservaHabitaciones);
    public void delete (long id);
    
}
