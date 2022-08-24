/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author dell
 */@Controller
public class Inicio {
     
     @GetMapping ("/Inicio")
    public String index(){
    return "/Inicio";
    } 
    
    @GetMapping ("/nosotros")
    public String nosotros(){
    return "/nosotros";
    } 
    
    @GetMapping ("/detallesRooms")
    public String detallesRooms(){
    return "/detallesRooms";
    } 
    
     @GetMapping ("/eventos")
    public String eventos(){
    return "/eventos";
    }
    
    @GetMapping ("/habitaciones")
    public String habitaciones(){
    return "/habitaciones";
    }
      
    @GetMapping ("/logins")
    public String logins(){
    return "/logins";
    }
    
    @GetMapping ("/masDetallesR1")
    public String masDetallesR1(){
    return "/masDetallesR1";
    }
    
     @GetMapping ("/masDetallesR2")
    public String masDetallesR2(){
    return "/masDetallesR2";
    }
    
     @GetMapping ("/masDetallesR3")
    public String masDetallesR3(){
    return "/masDetallesR3";
    }
    
     @GetMapping ("/masDetallesR4")
    public String masDetallesR4(){
    return "/masDetallesR4";
    }
        
     @GetMapping ("/preguntasFrecuentes")
    public String preguntasFrecuentes(){
    return "/preguntasFrecuentes";
    }
    
    /*@GetMapping ("/registro")
    public String registro(){
    return "/registro";
    }*/
    
    @GetMapping ("/restauranteQuattro")
    public String restauranteQuattro(){
    return "/restauranteQuattro";
    }
    
     @GetMapping ("/restauranteSakura")
    public String restauranteSakura(){
    return "/restauranteSakura";
    }
    
     @GetMapping ("/toursS")
    public String toursS(){
    return "/toursS";
    }
}
