/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.repository;

import com.hotel.entity.ReservaHabitacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela
 */
@Repository
public interface ReservaHabitacionRepository extends CrudRepository<ReservaHabitacion,Long> {
    ReservaHabitacion findByNombre(String nombre);  
}
