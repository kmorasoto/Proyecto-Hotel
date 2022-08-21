/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Dormitorio;
import com.hotel.repository.DormitorioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
@Service
public class DormitorioService implements IDormitorioService {

    @Autowired
    private DormitorioRepository DormitorioRepository;
    
    @Override
    public List<Dormitorio> listDormitorio() {
        return (List<Dormitorio>)DormitorioRepository.findAll();
    }
    
}
