/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.restSakura;
import com.hotel.repository.restSakuraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author XLight
 */
@Service
public class restSakuraService implements IrestSakuraService {
    
    @Autowired
    private restSakuraRepository restSakuraRepository;
    
    @Override
    public List<restSakura> listMesa(){
        return (List<restSakura>)restSakuraRepository.findAll();
    }
}
