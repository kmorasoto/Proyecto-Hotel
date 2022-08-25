/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.tour;
import com.hotel.repository.tourRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author XLight
 */
@Service
public class tourService implements ItourService {
    
    @Autowired
    private tourRepository tourRepository;
    
    @Override
    public List<tour> listTour(){
        return (List<tour>)tourRepository.findAll();
    }
}
