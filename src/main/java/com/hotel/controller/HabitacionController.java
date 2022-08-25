/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.Habitacion;
import com.hotel.service.IHabitacionService;
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
public class HabitacionController {
    
    @Autowired
    private IHabitacionService habitacionService;
    
    @GetMapping("/habitacion")
    public String index (Model model) {
        List<Habitacion> listahabitacion = habitacionService.getAllhabitacion();
        model.addAttribute("titulo", "Habitaciones Disponibles");
        model.addAttribute("habitacion", listahabitacion);
        return "habitacion";       
    }
    
    @GetMapping("/habitacionN")
    public String crearHabitacion(Model model){
        model.addAttribute("habitacion", new Habitacion());
        return "crear_room";
    }
    
    @PostMapping("/saveroom")
    public String guardarHabitacion (@ModelAttribute Habitacion habitacion){
        habitacionService.savehabitacion(habitacion);
        return "redirect:/habitacion";
    }
       
    @GetMapping("/edithabitacion/{id}")
    public String editarHabitacion(@PathVariable("id") Long idHabitacion, Model model){
        Habitacion habitacion = habitacionService.gethabitacionById(idHabitacion);
        model.addAttribute("Habitacion", habitacion);
        return "crear_room";
    }
    
    @GetMapping("/deletehabitacion/{id}")
    public String eliminarHabitacion(@PathVariable("id") Long idHabitacion){
        habitacionService.delete(idHabitacion);
        return "redirect:/habitacion";
    }
    
    @GetMapping("/habitaciones1")
    public String index(){
        return "/habitaciones1";
    }   
    
}
