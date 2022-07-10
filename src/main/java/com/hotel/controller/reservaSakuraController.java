/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.reservaSakura;
import com.hotel.entity.restSakura;
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
 * @author XLight
 */
@Controller
public class reservaSakuraController {
    
    @Autowired
    private IreservaSakuraService reservaSakuraService;
    
    @Autowired
    private IrestSakuraService restSakuraService;
    
    @GetMapping("/reservaSakura")
    
    public String index(Model model) {
        List<reservaSakura> listareservaSakura = reservaSakuraService.getAllreservaSakura();
        model.addAttribute("titulo", "Tabla Reservas Sakura");
        model.addAttribute("reservas", listareservaSakura);
        return "reservas";
    }
    
    @GetMapping("/reservaN")
    
    public String crearreservaSakura(Model model){
        List<restSakura> listaMesas = restSakuraService.listMesa();
        model.addAttribute("reservaSakura", new reservaSakura());
        model.addAttribute("mesas", listaMesas);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarreservaSakura(@ModelAttribute reservaSakura reservaSakura){
        reservaSakuraService.savereservaSakura(reservaSakura);
        return "redirect:/reserva";    
    }
    
    @GetMapping("/editreservaSakura/{id}")
    public String editarreservaSakura(@PathVariable("id") Long idreservaSakura, Model model){
        reservaSakura reservaSakura = reservaSakuraService.getreservaSakuraById(idreservaSakura);
        List<restSakura> listarestSakura = restSakuraService.listMesa();
        model.addAttribute("reservaSakura", reservaSakura);
        model.addAttribute("mesas", listarestSakura);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarreservaSakura(@PathVariable("id") Long idreservaSakura){
        reservaSakuraService.delete(idreservaSakura);
        return"redirect:/reserva";
    }
}
