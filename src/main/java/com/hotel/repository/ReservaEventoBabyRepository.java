/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.repository;


import com.hotel.entity.ReservaEventoBaby;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dell
 */@Repository
public interface ReservaEventoBabyRepository extends CrudRepository<ReservaEventoBaby,Long>{
    ReservaEventoBaby findByNombre(String nombre);
}
