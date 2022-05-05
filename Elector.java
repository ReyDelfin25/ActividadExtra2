/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadextra;

/**
 *
 * @author hchao
 */
public class Elector {
    //atributos
    private String rut;
    private String circunscripcion;
    private boolean asiste;
    
    //constructores
    public Elector(String rut, String circunscripcion, boolean asiste) {
        this.rut = rut;
        this.circunscripcion = circunscripcion;
        this.asiste = asiste;
    }
    
    //getters
    public String getRut() {
        return rut;
    }
    
    public String getCircunscripcion() {
        return circunscripcion;
    }
    
    public boolean isAsiste() {
        return asiste;
    }
    
    //setters
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setCircunscripcion(String circunscripcion) {
        this.circunscripcion = circunscripcion;
    }

    public void setAsiste(boolean asiste) {
        this.asiste = asiste;
    }

}
