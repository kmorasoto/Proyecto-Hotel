/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;
import com.hotel.entity.reservaQuattro;
import java.util.List;

/**
 *
 * @author XLight
 */
public interface IreservaQuattroService {
    public List<reservaQuattro> getAllreservaquattro();
    public reservaQuattro getreservaQuattroById (long id);
    public void savereservaQuattro (reservaQuattro reservaquattro);
    public void delete (long id);
}
