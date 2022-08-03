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
    
  
    
    @GetMapping("/reservaevento")
    
    public String index(Model model) {
        List<ReservaEvento> listaReservaEvento = reservaeventoService.getAllReservaEvento();
        model.addAttribute("titulo", " Tabla Reserva Evento");
        model.addAttribute("reservaevento", listaReservaEvento);
        return "reservaevento";
    }
    
    @GetMapping("/reservaeventoN")
    
    public String crearReservaEvento(Model model){
        List<Evento> listaEvento = eventoService.listEvento();
        model.addAttribute("reservaevento", new ReservaEvento());
        model.addAttribute("evento", listaEvento);
        return "crear";
    }
    
    @PostMapping("/saveevento")
    public String guardarReservaEvento(@ModelAttribute ReservaEvento reservaevento){
        reservaeventoService.saveReservaEvento(reservaevento);
        return "redirect:/reservarevento";    
    }
    
    @GetMapping("/editReservaEvento/{id}")
    public String editarReservaEvento(@PathVariable("id") Long idReservaEvento, Model model){
        ReservaEvento reservaevento = reservaeventoService.getReservaEventoById(idReservaEvento);
        List<Evento> listaEvento = eventoService.listEvento();
        model.addAttribute("ReservaEvento", reservaevento);
        model.addAttribute("evento", listaEvento);
        return "crear";
    }
    
    @GetMapping("/deleteevento/{id}")
    public String eliminarReservaEvento(@PathVariable("id") Long idReservaEvento){
        reservaeventoService.delete(idReservaEvento);
        return"redirect:/reservaevento";
    }
}
    
  

