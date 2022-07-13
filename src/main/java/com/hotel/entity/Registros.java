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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniela
 */
@Entity
@Table (name = "registros")
public class Registros implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private long id;
    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    
    @ManyToOne
    @JoinColumn(name="login_id")
    private Login usuario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login getUsuario() {
        return usuario;
    }

    public void setUsuario(Login usuario) {
        this.usuario = usuario;
    }
    
 
    
}
