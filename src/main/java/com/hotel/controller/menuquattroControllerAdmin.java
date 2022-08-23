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
public class menuquattroControllerAdmin {
    
    @Autowired 
    private ImenuquattroService menuquattroService;

    @GetMapping("/menuquattroAdmin")
    public String index(Model model){
        List<menuquattro> listamenuquattro = menuquattroService.getAllmenuquattro();
        model.addAttribute("titulo","Menu Quattro");
        model.addAttribute("menuquattroAdmin", listamenuquattro);
        return "menuquattroAdmin";
        }
    
    @GetMapping("/menuquattroNAdmin")
    public String crearmenuquattro(Model model){
        model.addAttribute("menuquattroAdmin", new menuquattro());
        return "crear_menuquattroAdmin";
    }
    
    @PostMapping("/savemenuquattroAdmin")
    public String guardarmenuquattro (@ModelAttribute menuquattro menuquattro){
        menuquattroService.savemenuquattro(menuquattro);
        return "redirect:/menuquattroAdmin";
    }
    
    @GetMapping("/editmenuquattroAdmin/{id}")
    public String editarmenuquattro(@PathVariable("id") Long idmenuquattro, Model model){
        menuquattro menuquattro = menuquattroService.getmenuquattroById(idmenuquattro);
        model.addAttribute("menuquattroAdmin", menuquattro);
        return "crear_menuquattroAdmin";
    }
    
    @GetMapping("/deletemenuquattroAdmin/{id}")
    public String eliminarmenuquattro(@PathVariable("id") Long idmenuquattro){
        menuquattroService.delete(idmenuquattro);
        return "redirect:/menuquattroAdmin";
    }
}
