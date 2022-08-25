/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.Evento;
import com.hotel.entity.ReservaEvento;
import com.hotel.service.IEventoService;
import com.hotel.service.IReservaEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ReservaEventoController {
        
    @Autowired
    private IReservaEventoService reservaeventoService;
    
    @Autowired
    private IEventoService eventoService;
    
  
    
    @GetMapping("/reservaevento")
    public String index(Model model) {
        List<ReservaEvento> listaReservaEvento = reservaeventoService.getAllReservaEvento();
        model.addAttribute("titulo", " Reservas para Eventos");
        model.addAttribute("reservaevento", listaReservaEvento);
        return "reservaevento";
    }
    
    @GetMapping("/reservaeventoN")
    
    public String crearReservaEvento(Model model){
        List<Evento> listaEventos = eventoService.listEvento1();
        model.addAttribute("reservaevento", new ReservaEvento());
        model.addAttribute("eventos", listaEventos);
        return "crear_evento";
    }
    
    @PostMapping("/saveevento")
    public String guardarReservaEvento(@ModelAttribute ReservaEvento reservaevento){
        reservaeventoService.saveReservaEvento(reservaevento);
        return "redirect:/Inicio";    
    }
    
    @GetMapping("/editreservaevento/{id}")
    public String editarReservaEvento(@PathVariable("id") Long idReservaEvento, Model model){
        ReservaEvento reservaevento = reservaeventoService.getReservaEventoById(idReservaEvento);
        List<Evento> listaEventos = eventoService.listEvento1();
        model.addAttribute("reservaevento", reservaevento);
        model.addAttribute("eventos", listaEventos);
        return "crear_evento";
    }
    
    @GetMapping("/deleteevento/{id}")
    public String eliminarReservaEvento(@PathVariable("id") Long idReservaEvento){
        reservaeventoService.delete(idReservaEvento);
        return"redirect:/reservaevento";
    }
}
    
  

