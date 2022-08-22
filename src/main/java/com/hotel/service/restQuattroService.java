/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.restQuattro;
import com.hotel.repository.restQuattroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author XLight
 */
@Service
public class restQuattroService implements IrestQuattroService {
    
    @Autowired
    private restQuattroRepository restquattroRepository;
    
    @Override
    public List<restQuattro> listMesa(){
        return (List<restQuattro>)restquattroRepository.findAll();
    }
}
