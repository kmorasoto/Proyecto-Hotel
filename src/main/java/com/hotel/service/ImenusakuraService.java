/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;
import com.hotel.entity.menusakura;
import java.util.List;

/**
 *
 * @author XLight
 */
public interface ImenusakuraService {
    public List<menusakura> getAllmenusakura();
    public menusakura getmenusakuraById (long id);
    public void savemenusakura (menusakura menusakura);
    public void delete (long id);
    public menusakura findBynombreplatillo (String nombreplatillo);
}
