/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.repository;
import com.hotel.entity.reservaQuattro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author XLight
 */
@Repository
public interface reservaQuattroRepository extends CrudRepository<reservaQuattro,Long>{
    
}
