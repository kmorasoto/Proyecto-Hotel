/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.ReservaEventoBaby;
import java.util.List;

/**
 *
 * @author dell
 */
public interface IReservaEventoBabyService {
    public List<ReservaEventoBaby> getAllReservaEventoBaby();
    public ReservaEventoBaby getReservaEventoBabyById (long id);
    public void saveReservaEventobaby (ReservaEventoBaby reservaeventobaby);
    public void deletebaby (long id);
}
