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
public class HabitacionControllerAdmin {
    
    @Autowired
    private IHabitacionService habitacionService;
    
    @GetMapping("/habitacionAdmin")
    public String index (Model model) {
        List<Habitacion> listahabitacion = habitacionService.getAllhabitacion();
        model.addAttribute("titulo", "Habitaciones Disponibles");
        model.addAttribute("habitacion", listahabitacion);
        return "habitacionAdmin";       
    }
    
    @GetMapping("/habitacionNAdmin")
    public String crearHabitacion(Model model){
        model.addAttribute("habitacionAdmin", new Habitacion());
        return "crear_roomAdmin";
    }
    
    @PostMapping("/saveroomAdmin")
    public String guardarHabitacionAdmin (@ModelAttribute Habitacion habitacion){
        habitacionService.savehabitacion(habitacion);
        return "redirect:/habitacionAdmin";
    }
       
    @GetMapping("/edithabitacionAdmin/{id}")
    public String editarHabitacion(@PathVariable("id") Long idhabitacion, Model model){
        Habitacion habitacion = habitacionService.gethabitacionById(idhabitacion);
        model.addAttribute("habitacionAdmin", habitacion);
        return "crear_roomAdmin";
    }
    
    
    @GetMapping("/deletehabitacionAdmin/{id}")
    public String eliminarHabitacion(@PathVariable("id") Long idHabitacion){
        habitacionService.delete(idHabitacion);
        return "redirect:/habitacionAdmin";
    }
  
}
