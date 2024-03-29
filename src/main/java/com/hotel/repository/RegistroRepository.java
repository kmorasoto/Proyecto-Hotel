/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.repository;

import com.hotel.entity.Registro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela
 */
@Repository
public interface RegistroRepository extends CrudRepository<Registro,Long>{
    Registro findByNombre (String nombre); //Esto es para obtener una fila de nuestra BD, es como hacer un select.
}
