/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Habitacion;
import java.util.List;

/**
 *
 * @author Daniela
 */
public interface IHabitacionService {
    
    public List<Habitacion> listHabitacion();
    public List<Habitacion> getAllhabitacion();
    public Habitacion gethabitacionById (long id);
    public void savehabitacion (Habitacion habitacion);
    public void delete (long id);
    public Habitacion findByhabitacion (String habitacion);
    
}
