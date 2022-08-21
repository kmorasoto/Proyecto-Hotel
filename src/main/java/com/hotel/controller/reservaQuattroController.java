/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.reservaQuattro;
import com.hotel.entity.restQuattro;
import com.hotel.service.IreservaQuattroService;
import com.hotel.service.IrestQuattroService;
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
public class reservaQuattroController {
    
    @Autowired
    private IreservaQuattroService reservaquattroService;
    
    @Autowired
    private IrestQuattroService restquattroService;
    
    @GetMapping("/reservaquattro")
    
    public String index(Model model) {
        List<reservaQuattro> listareservaQuattro = reservaquattroService.getAllreservaquattro();
        model.addAttribute("titulo", "Lista de reservas");
        model.addAttribute("reservaquattro", listareservaQuattro);
        return "reservaquattro";
    }
    
    @GetMapping("/reservaquattroN")
    
    public String crearreservaQuattro(Model model){
        List<restQuattro> listaMesas = restquattroService.listMesa();
        model.addAttribute("reservaquattro", new reservaQuattro());
        model.addAttribute("mesas", listaMesas);
        return "crear_reservaquattro";
    }
    
    @PostMapping("/savereservaquattro")
    public String guardarreservaQuattro(@ModelAttribute reservaQuattro reservaquattro){
        reservaquattroService.savereservaQuattro(reservaquattro);
        return "redirect:/restauranteQuattro.html";    
    }
    
    @GetMapping("/editreservaQuattro/{id}")
    public String editarreservaQuattro(@PathVariable("id") Long idreservaQuattro, Model model){
        reservaQuattro reservaquattro = reservaquattroService.getreservaQuattroById(idreservaQuattro);
        List<restQuattro> listarestQuattro = restquattroService.listMesa();
        model.addAttribute("reservaquattro", reservaquattro);
        model.addAttribute("mesas", listarestQuattro);
        return "crear_reservaquattro";
    }
    
    @GetMapping("/deletereservaquattro/{id}")
    public String eliminarreservaQuattro(@PathVariable("id") Long idreservaQuattro){
        reservaquattroService.delete(idreservaQuattro);
        return"redirect:/reservaquattro";
    }   
}
