/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progr.objects;

/**
 *
 * @author SirBobby
 */
public class Persona {

    public Persona(String nombre, String apellido, int edad) {
        this.sNombre = nombre;
        this.sApellido = apellido;
        this.sEdad = edad;
    }

    public String getNombre() {
        return sNombre;
    }

    public void setNombre(String nombre) {
        this.sNombre = nombre;
    }

    public String getApellido() {
        return sApellido;
    }

    public void setApellido(String apellido) {
        this.sApellido = apellido;
    }

    public int getEdad() {
        return sEdad;
    }

    public void setEdad(int edad) {
        this.sEdad = edad;
    }
    
    private String sNombre;
    private String sApellido;
    private int sEdad;
}
