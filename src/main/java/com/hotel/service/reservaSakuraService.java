/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.reservaSakura;
import com.hotel.repository.reservaSakuraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author XLight
 */
@Service
public class reservaSakuraService implements IreservaSakuraService{
    @Autowired
    private reservaSakuraRepository reservaSakuraRepository;
    
    @Override
    public List<reservaSakura> getAllreservaSakura(){
        return (List<reservaSakura>)reservaSakuraRepository.findAll();
    }
    
    @Override
    public reservaSakura getreservaSakuraById(long id){
        return reservaSakuraRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savereservaSakura(reservaSakura reservaSakura){
        reservaSakuraRepository.save(reservaSakura);
    }
    
    @Override
    public void delete(long id){
        reservaSakuraRepository.deleteById(id);
    }
}
