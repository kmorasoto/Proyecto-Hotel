/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.reservaQuattro;
import com.hotel.repository.reservaQuattroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author XLight
 */
@Service
public class reservaQuattroService implements IreservaQuattroService{
    @Autowired
    private reservaQuattroRepository reservaquattroRepository;
    
    @Override
    public List<reservaQuattro> getAllreservaquattro(){
        return (List<reservaQuattro>)reservaquattroRepository.findAll();
    }
    
    @Override
    public reservaQuattro getreservaQuattroById(long id){
        return reservaquattroRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savereservaQuattro(reservaQuattro reservaQuattro){
        reservaquattroRepository.save(reservaQuattro);
    }
    
    @Override
    public void delete(long id){
        reservaquattroRepository.deleteById(id);
    }
}
