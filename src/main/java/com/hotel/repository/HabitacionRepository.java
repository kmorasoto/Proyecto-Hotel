/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.repository;

import com.hotel.entity.Habitacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author Daniela
 */
@Repository
public interface HabitacionRepository extends CrudRepository<Habitacion,Long>{
    Habitacion findByHabitacion (String habitacion);
    
}
