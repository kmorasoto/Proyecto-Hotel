/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.Registros;
import java.util.List;



/**
 *
 * @author Daniela
 */
public interface IRegistrosService {
    public List<Registros> getAllRegistros();
    public Registros getRegistrosById(long id);
    public void saveRegistros (Registros Registros);
    public void delete (long id);
  
}
