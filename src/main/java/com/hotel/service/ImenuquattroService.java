/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;
import com.hotel.entity.menuquattro;
import java.util.List;

/**
 *
 * @author XLight
 */
public interface ImenuquattroService {
    public List<menuquattro> getAllmenuquattro();
    public menuquattro getmenuquattroById (long id);
    public void savemenuquattro (menuquattro menuquattro);
    public void delete (long id);
    public menuquattro findBynombreplatillo (String nombreplatillo);
}
