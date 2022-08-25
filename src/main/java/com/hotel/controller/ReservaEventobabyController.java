/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;


import com.hotel.entity.EventoBaby;
import com.hotel.entity.ReservaEventoBaby;
import com.hotel.service.IEventoBabyService;
import com.hotel.service.IReservaEventoBabyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

 @Controller
public class ReservaEventobabyController {
   
        @Autowired
    private IReservaEventoBabyService reservaeventobabyService;
        
      @Autowired
    private IEventoBabyService eventobabyService;
      
  
     
     
     @GetMapping("/reservaeventoB")
    
    public String index(Model model) {
        List<ReservaEventoBaby> listaReservaEventoBaby = reservaeventobabyService.getAllReservaEventoBaby();
        model.addAttribute("titulo", " Reservas para Eventos");
        model.addAttribute("reservaeventoB", listaReservaEventoBaby);
        return "reservaeventoB";
    }
     
       @GetMapping("/reservaeventoNB")
    
    public String crearReservaEventoBaby(Model model){
        List<EventoBaby> listaEventosB = eventobabyService.listEvento2();
        model.addAttribute("reservaeventobaby", new ReservaEventoBaby());
        model.addAttribute("eventosbaby", listaEventosB);
        return "crear_eventoB";
    }
    
    @PostMapping("/saveeventoB")
    public String guardarReservaEventoB(@ModelAttribute ReservaEventoBaby reservaeventobaby){
        reservaeventobabyService.saveReservaEventobaby(reservaeventobaby);
        return "redirect:/Inicio";    
    }
    
    @GetMapping("/editreservaeventoB/{id}")
    public String editarReservaEventoBaby(@PathVariable("id") Long idReservaEventoBaby, Model model){
        ReservaEventoBaby reservaeventobaby = reservaeventobabyService.getReservaEventoBabyById(idReservaEventoBaby);
        List<EventoBaby> listaEventosB = eventobabyService.listEvento2();
        model.addAttribute("reservaevento", reservaeventobaby);
        model.addAttribute("eventosbaby", listaEventosB);
        return "crear_eventoB";
    }
    
     @GetMapping("/deleteeventobaby/{id}")
    public String eliminarReservaEventobaby(@PathVariable("id") Long idReservaEventobaby){
        reservaeventobabyService.deletebaby(idReservaEventobaby);
        return"redirect:/reservaeventoB";
    }
}
