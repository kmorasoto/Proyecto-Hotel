/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Registro;
import java.util.List;



/**
 *
 * @author Daniela
 */
public interface IRegistroService {
    
    public List<Registro> listRegistro();
    public List<Registro> getAllregistro();
    public Registro getregistroById(long id);
    public void saveregistro (Registro registro);
    public void delete (long id);
    public Registro findBynombre (String nombre);
  
}
