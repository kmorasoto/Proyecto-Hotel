/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.menusakura;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.repository.menusakuraRepository;

/**
 *
 * @author XLight
 */
@Service
public class menusakuraService implements ImenusakuraService{
    @Autowired
    private menusakuraRepository menusakuraRepository;
    
    @Override
    public List<menusakura> getAllmenusakura(){
        return(List<menusakura>)menusakuraRepository.findAll();
    }
    
    @Override
    public menusakura getmenusakuraById(long id){
        return menusakuraRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savemenusakura(menusakura menusakura){
        menusakuraRepository.save(menusakura);
    }
    
    @Override
    public void delete(long id){
        menusakuraRepository.deleteById(id);
    }
    
    @Override
    public menusakura findBynombreplatillo(String nombreplatillo){
        return menusakuraRepository.findBynombreplatillo(nombreplatillo);
    }
}
