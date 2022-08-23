/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.menuquattro;
import com.hotel.service.ImenuquattroService;
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
public class menuquattroController {
    
    @Autowired 
    private ImenuquattroService menuquattroService;

    @GetMapping("/menuquattro")
    public String index(Model model){
        List<menuquattro> listamenuquattro = menuquattroService.getAllmenuquattro();
        model.addAttribute("titulo","Menu Quattro");
        model.addAttribute("menuquattro", listamenuquattro);
        return "menuquattro";
        }
    
    @GetMapping("/menuquattroN")
    public String crearmenuquattro(Model model){
        model.addAttribute("menuquattro", new menuquattro());
        return "crear_menuquattro";
    }
    
    @PostMapping("/savemenuquattro")
    public String guardarmenuquattro (@ModelAttribute menuquattro menuquattro){
        menuquattroService.savemenuquattro(menuquattro);
        return "redirect:/menuquattro";
    }
    
    @GetMapping("/editmenuquattro/{id}")
    public String editarmenuquattro(@PathVariable("id") Long idmenuquattro, Model model){
        menuquattro menuquattro = menuquattroService.getmenuquattroById(idmenuquattro);
        model.addAttribute("menuquattro", menuquattro);
        return "crear_menuquattro";
    }
    
    @GetMapping("/deletemenuquattro/{id}")
    public String eliminarmenuquattro(@PathVariable("id") Long idmenuquattro){
        menuquattroService.delete(idmenuquattro);
        return "redirect:/menuquattro";
    }
}
