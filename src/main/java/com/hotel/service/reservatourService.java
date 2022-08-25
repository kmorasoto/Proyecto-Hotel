/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.reservatour;
import com.hotel.repository.reservatourRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author XLight
 */
@Service
public class reservatourService implements IreservatourService{
    @Autowired
    private reservatourRepository reservatourRepository;
    
    @Override
    public List<reservatour> getAllreservatour(){
        return (List<reservatour>)reservatourRepository.findAll();
    }
    
    @Override
    public reservatour getreservatourById(long id){
        return reservatourRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savereservatour(reservatour reservatour){
        reservatourRepository.save(reservatour);
    }
    
    @Override
    public void delete(long id){
        reservatourRepository.deleteById(id);
    }
}
