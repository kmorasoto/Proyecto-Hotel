/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.Habitacion;
import com.hotel.entity.ReservaHabitacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.hotel.service.IHabitacionService;
import com.hotel.service.IReservaHabitacionService;

/**
 *
 * @author Daniela
 */
@Controller
public class ReservaHabitacionController {
    
    @Autowired
    private IReservaHabitacionService reservahabitacionService;
    
    @Autowired
    private IHabitacionService habitacionService;
    
    @GetMapping("/reservahabitacion")
    public String index (Model model) {
        List<ReservaHabitacion> listaReservaHabitacion = reservahabitacionService.getAllReservaHabitacion();
        model.addAttribute("titulo","Reserva de Habitaciones");
        model.addAttribute("reservahabitacion", listaReservaHabitacion);
        return "reservahabitacion";        
    }
    
    @GetMapping("/reservahabitacionN")
    public String crearReservaHabitacion (Model model) {
        List<Habitacion> listaHabitaciones = habitacionService.listHabitacion();
        model.addAttribute("reservahabitacion", new ReservaHabitacion());
        model.addAttribute("habitaciones",listaHabitaciones);
        return "crear_habitacion";
        
    }
    
    @PostMapping("/savehabitacion")
    public String guardarReservaHabitacion (@ModelAttribute ReservaHabitacion reservahabitacion){
       reservahabitacionService.saveReservaHabitacion(reservahabitacion);
       return "redirect:/reservahabitaciones";
    }
    
    @GetMapping("/editReservaHabitacion/{id}")
    public String editarReservaHabitacion (@PathVariable("id") Long idReservaHabitacion, Model model){
       ReservaHabitacion reservahabitacion = reservahabitacionService.getReservaHabitacionById(idReservaHabitacion);
       List<Habitacion> listaHabitaciones = habitacionService.listHabitacion();
       model.addAttribute("ReservaHabitacion", reservahabitacion);
       model.addAttribute("habitaciones",listaHabitaciones);
       return "crear_habitacion";
    }
    
    @GetMapping("/deletehabitacion/{id}")
    public String eliminarReservaHabitacion (@PathVariable("id") Long idReservaHabitacion){
        reservahabitacionService.delete(idReservaHabitacion);
        return "redirect:/reservahabitacion";
    }
}
