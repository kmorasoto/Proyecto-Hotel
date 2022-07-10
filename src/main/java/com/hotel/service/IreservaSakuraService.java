/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;
import com.hotel.entity.reservaSakura;
import java.util.List;

/**
 *
 * @author XLight
 */
public interface IreservaSakuraService {
    public List<reservaSakura> getAllreservaSakura();
    public reservaSakura getreservaSakuraById (long id);
    public void savereservaSakura (reservaSakura reservaSakura);
    public void delete (long id);
}
