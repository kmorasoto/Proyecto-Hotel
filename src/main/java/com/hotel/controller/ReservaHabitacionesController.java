/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.Habitaciones;
import com.hotel.entity.ReservaHabitaciones;
import com.hotel.service.IHabitacionesService;
import com.hotel.service.IReservaHabitacionesService;
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
 * @author Daniela
 */
@Controller
public class ReservaHabitacionesController {
    
    @Autowired
    private IReservaHabitacionesService ReservaHabitacionesService;
    
    @Autowired
    private IHabitacionesService HabitacionesService;
    
    @GetMapping("/reservahabitaciones")
    public String index (Model model) {
        List<ReservaHabitaciones> listaReservaHabitaciones = ReservaHabitacionesService.getAllReservaHabitaciones();
        model.addAttribute("titulo","Reserva de Habitaciones");
        model.addAttribute("ReservaHabitaciones", listaReservaHabitaciones);
        return "reservahabitaciones";        
    }
    
    @GetMapping("/reservahabitacionesN")
    public String crearReservaHabitaciones (Model model) {
        List<Habitaciones> listaHabitaciones = HabitacionesService.listHabitacion();
        model.addAttribute("ReservaHabitaciones", new ReservaHabitaciones());
        model.addAttribute("habitaciones",listaHabitaciones);
        return "crear_reservahabitaciones";
        
    }
    
    @PostMapping("/saveReservahabitaciones")
    public String guardarReservaHabitaciones (@ModelAttribute ReservaHabitaciones reservahabitaciones){
       ReservaHabitacionesService.saveReservaHabitaciones(reservahabitaciones);
       return "redirect:/reservahabitaciones";
    }
    
    @GetMapping("/editReservaHabitaciones/{id}")
    public String editarReservaHabitaciones (@PathVariable("id") Long idReservaHabitaciones, Model model){
       ReservaHabitaciones ReservaHabitaciones = ReservaHabitacionesService.getReservaHabitacionesById(idReservaHabitaciones);
       List<Habitaciones> listaHabitaciones = HabitacionesService.listHabitacion();
       model.addAttribute("ReservaHabitaciones", ReservaHabitaciones);
       model.addAttribute("habitaciones",listaHabitaciones);
       return "crear_reservahabitaciones";
    }
    
    @GetMapping("/deleteReservaHabitaciones/{id}")
    public String eliminarReservaHabitaciones (@PathVariable("id") Long idReservaHabitaciones){
        ReservaHabitacionesService.delete(idReservaHabitaciones);
        return "redirect:/reservahabitaciones";
    }
}
