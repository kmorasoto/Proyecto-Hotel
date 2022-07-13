/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;

import com.hotel.entity.Login;
import com.hotel.entity.Registros;
import com.hotel.service.ILoginService;
import com.hotel.service.IRegistrosService;
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
 * @author Daniela
 */
@Controller
public class RegistrosController {
    
    @Autowired
    private IRegistrosService RegistrosService;
    
    @Autowired
    private ILoginService LoginService;
    
    @GetMapping("/registros")
    
    public String idx(Model model) {
        List<Registros> listaRegistros = RegistrosService.getAllRegistros();
        model.addAttribute("titulo", "Lista de usuarios");
        model.addAttribute("Registros", listaRegistros);
        return "registros";
    }
    
    @GetMapping("/registrosN")
    
    public String crearRegistros(Model model){
        List<Login> listaUsuarios = LoginService.listUsuario();
        model.addAttribute("Registros", new Registros());
        model.addAttribute("usuarios", listaUsuarios);
        return "crear_registro";
    }
    
    @PostMapping("/saveRegistros")
    public String guardarRegistros(@ModelAttribute Registros Registros){
        RegistrosService.saveRegistros(Registros);
        return "redirect:/registros";    
    }
    
    @GetMapping("/editregistros/{id}")
    public String editarRegistros(@PathVariable("id") Long idRegistros, Model model){
        Registros Registros = RegistrosService.getRegistrosById(idRegistros);
        List<Login> listaLogin = LoginService.listUsuario();
        model.addAttribute("Registros", Registros);
        model.addAttribute("usuarios", listaLogin);
        return "crear_registro";
    }
    
    @GetMapping("/deleteregistros/{id}")
    public String eliminarRegistros(@PathVariable("id") Long idRegistros){
        RegistrosService.delete(idRegistros);
        return"redirect:/registros";
    }
}
