/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.Login;
import com.hotel.entity.Registro;
import com.hotel.service.ILoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.hotel.service.IRegistroService;


/**
 *
 * @author Daniela
 */
@Controller
public class RegistroController {
    
    @Autowired
    private IRegistroService registroService;
    
    @GetMapping("/registro")  
    public String idx(Model model) {
        List<Registro> listaregistro = registroService.getAllregistro();
        model.addAttribute("titulo", "Lista de usuarios");
        model.addAttribute("registro", listaregistro);
        return "registro";
    }
    
    @GetMapping("/registroN")   
    public String crearRegistro(Model model){
        model.addAttribute("registro", new Registro());
        return "crear_registro";
    }
    
    @PostMapping("/saveregistro")
    public String guardarRegistro (@ModelAttribute Registro registro){
        registroService.saveregistro(registro);
        return "redirect:/login";    
    }
    
    @GetMapping("/editregistro/{id}")
    public String editarRegistro(@PathVariable("id") Long idRegistro, Model model){
        Registro registro = registroService.getregistroById(idRegistro);
        model.addAttribute("Registros", registro);
        return "crear_registro";
    }
    
    @GetMapping("/deleteregistro/{id}")
    public String eliminarRegistro(@PathVariable("id") Long idRegistro){
        registroService.delete(idRegistro);
        return"redirect:/registro";
    }
}
