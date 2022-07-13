/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Login;
import com.hotel.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
@Service
public class LoginService implements ILoginService {
    
    @Autowired
    private LoginRepository LoginRepository;

    @Override
    public List<Login> listUsuario() {
        return (List<Login>)LoginRepository.findAll();
    }
    
}
