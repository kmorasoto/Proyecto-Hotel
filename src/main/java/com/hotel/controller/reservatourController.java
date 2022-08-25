/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.reservatour;
import com.hotel.entity.tour;
import com.hotel.service.IreservatourService;
import com.hotel.service.ItourService;
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
 * @author XLight
 */
@Controller
public class reservatourController {
    
    @Autowired
    private IreservatourService reservatourService;
    
    @Autowired
    private ItourService tourService;
    
    @GetMapping("/reservatour")
    
    public String index(Model model) {
        List<reservatour> listareservatour = reservatourService.getAllreservatour();
        model.addAttribute("titulo", "Lista de reservas");
        model.addAttribute("reservatour", listareservatour);
        return "reservatour";
    }
    
    @GetMapping("/reservatourN")
    
    public String crearreservatour(Model model){
        List<tour> listaTour = tourService.listTour();
        model.addAttribute("reservatour", new reservatour());
        model.addAttribute("opciones", listaTour);
        return "crear_reservatour";
    }
    
    @PostMapping("/savereservatour")
    public String guardarreservatour(@ModelAttribute reservatour reservatour){
        reservatourService.savereservatour(reservatour);
        return "redirect:/Inicio";    
    }
    
    @GetMapping("/editreservatour/{id}")
    public String editarreservatour(@PathVariable("id") Long idreservatour, Model model){
        reservatour reservatour = reservatourService.getreservatourById(idreservatour);
        List<tour> listaresttour = tourService.listTour();
        model.addAttribute("reservatour", reservatour);
        model.addAttribute("mesas", listaresttour);
        return "crear_reservasakura";
    }
    
    @GetMapping("/deletereservatour/{id}")
    public String eliminarreservatour(@PathVariable("id") Long idreservatour){
        reservatourService.delete(idreservatour);
        return"redirect:/reservatour";
    }   
}
