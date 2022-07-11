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
    private reservaSakuraRepository reservasakuraRepository;
    
    @Override
    public List<reservaSakura> getAllreservasakura(){
        return (List<reservaSakura>)reservasakuraRepository.findAll();
    }
    
    @Override
    public reservaSakura getreservaSakuraById(long id){
        return reservasakuraRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savereservaSakura(reservaSakura reservaSakura){
        reservasakuraRepository.save(reservaSakura);
    }
    
    @Override
    public void delete(long id){
        reservasakuraRepository.deleteById(id);
    }
}
