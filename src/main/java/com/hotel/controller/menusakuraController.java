/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.menusakura;
import com.hotel.service.ImenusakuraService;
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
public class menusakuraController {
    
    @Autowired 
    private ImenusakuraService menusakuraService;

    @GetMapping("/menusakura")
    public String index(Model model){
        List<menusakura> listamenusakura = menusakuraService.getAllmenusakura();
        model.addAttribute("titulo","Menu Sakura");
        model.addAttribute("menusakura", listamenusakura);
        return "menusakura";
        }
    
    @GetMapping("/menusakuraN")
    public String crearmenusakura(Model model){
        model.addAttribute("menusakura", new menusakura());
        return "crear_menusakura";
    }
    
    @PostMapping("/savemenusakura")
    public String guardarmenusakura (@ModelAttribute menusakura menusakura){
        menusakuraService.savemenusakura(menusakura);
        return "/redirect:/menusakura";
    }
    
    @GetMapping("/editmenusakura/{id}")
    public String editarmenusakura(@PathVariable("id") Long idmenusakura, Model model){
        menusakura menusakura = menusakuraService.getmenusakuraById(idmenusakura);
        model.addAttribute("menusakura", menusakura);
        return "crear_menusakura";
    }
    
    @GetMapping("/deletemenusakura/{id}")
    public String eliminarmenusakura(@PathVariable("id") Long idmenusakura){
        menusakuraService.delete(idmenusakura);
        return "redirect:/menusakura";
    }
}
