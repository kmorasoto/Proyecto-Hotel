/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;


import com.hotel.entity.EventoBaby;
import com.hotel.repository.EventoBabyRepository;
import com.hotel.repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dell
 */
@Service
public class EventoBabyService implements IEventoBabyService {
    @Autowired
    private EventoBabyRepository eventobabyRepository;
    
    @Override
    public List<EventoBaby> listEvento2(){
        return (List<EventoBaby>)eventobabyRepository.findAll();
    }

  
    
    
}
