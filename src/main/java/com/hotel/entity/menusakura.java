/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author XLight
 */

@Entity
@Table (name="menusakura")

public class menusakura implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private long id;
    private String nombreplatillo;
    private String ingredientes;
    private String precio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreplatillo() {
        return nombreplatillo;
    }

    public void setNombreplatillo(String nombreplatillo) {
        this.nombreplatillo = nombreplatillo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
