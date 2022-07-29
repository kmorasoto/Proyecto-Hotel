/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.ReservaEvento;
import com.hotel.entity.reservaSakura;
import com.hotel.entity.restSakura;
import com.hotel.service.IEventoService;
import com.hotel.service.IReservaEventoService;
import com.hotel.service.IreservaSakuraService;
import com.hotel.service.IrestSakuraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author dell
 */
@Controller
public class ReservaEventoController {
        
    @Autowired
    private IReservaEventoService reservaeventoService;
    
    @Autowired
    private IEventoService eventoService;
    
  
    
   /* public String index(Model model) {
        List<ReservaEvento> listaReservaEvento = reservaeventoService.getAllReservaevento();
        model.addAttribute("titulo", "Lista de reservas");
        model.addAttribute("reservaevento", listaReservaEvento);
        return "reservaevento";
    }*/
    
  
}
