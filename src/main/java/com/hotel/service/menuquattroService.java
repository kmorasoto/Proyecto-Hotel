/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.menuquattro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.repository.menuquattroRepository;

/**
 *
 * @author XLight
 */
@Service
public class menuquattroService implements ImenuquattroService{
    
    @Autowired
    private menuquattroRepository menuquattroRepository;
    
    @Override
    public List<menuquattro> getAllmenuquattro(){
        return(List<menuquattro>)menuquattroRepository.findAll();
    }
    
    @Override
    public menuquattro getmenuquattroById(long id){
        return menuquattroRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savemenuquattro(menuquattro menuquattro){
        menuquattroRepository.save(menuquattro);
    }
    
    @Override
    public void delete(long id){
        menuquattroRepository.deleteById(id);
    }
    
    @Override
    public menuquattro findBynombreplatillo(String nombreplatillo){
        return menuquattroRepository.findBynombreplatillo(nombreplatillo);
    }
}
