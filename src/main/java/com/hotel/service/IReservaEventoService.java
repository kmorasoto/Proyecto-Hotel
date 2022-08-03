/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hotel.service;

import com.hotel.entity.ReservaEvento;
import com.hotel.entity.reservaSakura;
import java.util.List;

/**
 *
 * @author dell
 */
public interface IReservaEventoService {
    public List<ReservaEvento> getAllReservaEvento();
    public ReservaEvento getReservaEventoById (long id);
    public void saveReservaEvento (ReservaEvento reservaevento);
    public void delete (long id);
}
