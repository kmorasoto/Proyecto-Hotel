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
public class menusakuraControllerAdmin {
    
    @Autowired 
    private ImenusakuraService menusakuraService;

    @GetMapping("/menusakuraAdmin")
    public String index(Model model){
        List<menusakura> listamenusakura = menusakuraService.getAllmenusakura();
        model.addAttribute("titulo","Menu Sakura");
        model.addAttribute("menusakuraAdmin", listamenusakura);
        return "menusakuraAdmin";
        }
    
    @GetMapping("/menusakuraNAdmin")
    public String crearmenusakura(Model model){
        model.addAttribute("menusakuraAdmin", new menusakura());
        return "crear_menusakuraAdmin";
    }
    
    @PostMapping("/savemenusakuraAdmin")
    public String guardarmenusakura (@ModelAttribute menusakura menusakura){
        menusakuraService.savemenusakura(menusakura);
        return "redirect:/menusakuraAdmin";
    }
    
    @GetMapping("/editmenusakuraAdmin/{id}")
    public String editarmenusakura(@PathVariable("id") Long idmenusakura, Model model){
        menusakura menusakura = menusakuraService.getmenusakuraById(idmenusakura);
        model.addAttribute("menusakuraAdmin", menusakura);
        return "crear_menusakuraAdmin";
    }
    
    @GetMapping("/deletemenusakuraAdmin/{id}")
    public String eliminarmenusakura(@PathVariable("id") Long idmenusakura){
        menusakuraService.delete(idmenusakura);
        return "redirect:/menusakuraAdmin";
    }
}
