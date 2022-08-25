/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;
import com.hotel.entity.reservatour;
import java.util.List;

/**
 *
 * @author XLight
 */
public interface IreservatourService {
    public List<reservatour> getAllreservatour();
    public reservatour getreservatourById (long id);
    public void savereservatour (reservatour reservatour);
    public void delete (long id);
}
