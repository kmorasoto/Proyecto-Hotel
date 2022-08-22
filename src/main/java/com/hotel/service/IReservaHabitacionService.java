/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Habitacion;
import com.hotel.entity.ReservaHabitacion;
import java.util.List;

/**
 *
 * @author Daniela
 */
public interface IReservaHabitacionService {
    public List<ReservaHabitacion> getAllReservaHabitacion();
    public ReservaHabitacion getReservaHabitacionById (long id);
    public void saveReservaHabitacion(ReservaHabitacion reservahabitacion);
    public void delete (long id);
    
}
