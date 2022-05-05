/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadextra;

/**
 *
 * @author hchao
 */
public class Voto {
    //atributos
    private int numeroSerie;
    private String candidatoVotado;

    //constructores
    public Voto(int numeroSerie, String candidatoVotado) {
        this.numeroSerie = numeroSerie;
        this.candidatoVotado = candidatoVotado;
    }
    
    //getters
    public int getNumeroSerie() {
        return numeroSerie;
    }
    
    public String getCandidatoVotado() {
        return candidatoVotado;
    }
    
    //setters
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setCandidatoVotado(String candidatoVotado) {
        this.candidatoVotado = candidatoVotado;
    }
}
