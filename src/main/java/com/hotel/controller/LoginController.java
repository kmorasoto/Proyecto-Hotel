/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Daniela
 */
@Controller
public class LoginController {
    
    @GetMapping("/login1")
    public String index(){ 
        return "/login1"; //este si va a ser nuestro html que se encuentra en templates
    }
}
