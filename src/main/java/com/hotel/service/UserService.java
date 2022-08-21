/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Registros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
//Este es el que va a interactuar con el Spring Security
@Service
public class UserService implements UserDetailsService{

    @Autowired
    public IRegistrosService RegistrosService;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Registros Registros = this.RegistrosService.findByNombre(username);
        Userprincipal userPrincipal = new Userprincipal(Registros);
        return userPrincipal;
    }
    
    
}
