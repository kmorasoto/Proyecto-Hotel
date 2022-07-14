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
    private IreservaSakuraService reservasakuraService;
    
    @Autowired
    private IrestSakuraService restsakuraService;
    
    @GetMapping("/reservasakura")
    
    public String index(Model model) {
        List<reservaSakura> listareservaSakura = reservasakuraService.getAllreservasakura();
        model.addAttribute("titulo", "Lista de reservas");
        model.addAttribute("reservasakura", listareservaSakura);
        return "reservasakura";
    }
    
    @GetMapping("/reservasakuraN")
    
    public String crearreservaSakura(Model model){
        List<restSakura> listaMesas = restsakuraService.listMesa();
        model.addAttribute("reservasakura", new reservaSakura());
        model.addAttribute("mesas", listaMesas);
        return "crear_reservasakura";
    }
    
    @PostMapping("/save")
    public String guardarreservaSakura(@ModelAttribute reservaSakura reservasakura){
        reservasakuraService.savereservaSakura(reservasakura);
        return "redirect:/reservasakura";    
    }
    
    @GetMapping("/editreservaSakura/{id}")
    public String editarreservaSakura(@PathVariable("id") Long idreservaSakura, Model model){
        reservaSakura reservasakura = reservasakuraService.getreservaSakuraById(idreservaSakura);
        List<restSakura> listarestSakura = restsakuraService.listMesa();
        model.addAttribute("reservasakura", reservasakura);
        model.addAttribute("mesas", listarestSakura);
        return "crear_reservasakura";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarreservaSakura(@PathVariable("id") Long idreservaSakura){
        reservasakuraService.delete(idreservaSakura);
        return"redirect:/reservasakura";
    }
}
