/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.repository;

import com.hotel.entity.Evento;
import com.hotel.entity.EventoBaby;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dell
 */@Repository
public interface EventoBabyRepository extends CrudRepository<EventoBaby,Long>{
    
}
