/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadextra;
import java.util.ArrayList;

/**
 *
 * @author hchao
 */
public class Mesa {
    //atributos
    private String circunscripcion;
    int numeroMesa;
    
    ArrayList<Elector>Electores=new ArrayList<Elector>();
    ArrayList<Voto>Votos=new ArrayList<Voto>();

    public Mesa(String circunscripcion, int numeroMesa) {
        this.circunscripcion = circunscripcion;
        this.numeroMesa = numeroMesa;
    }

    public String getCircunscripcion() {
        return circunscripcion;
    }

    public void setCircunscripcion(String circunscripcion) {
        this.circunscripcion = circunscripcion;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    
    
    
    public Elector EliminaElector(String rut){
        int i;
        Elector aux;
        
        for(i = 0; i < Electores.size();i++){
            if(Electores.get(i).getRut() == rut){
                aux = Electores.get(i);
                Electores.remove(i);
                return aux;
            }
        }
        return null;
    }
    
    public int CuadraMesa(){
        int i;
        int siVoto = 0;
        for(i = 0; i < Electores.size();i++){
            if(Electores.get(i).isAsiste() == true){
                siVoto++;
            }
        }
        
        if(Votos.size() < siVoto)//si es menor retorna -1
            return -1;
        
        if(Votos.size() > siVoto)//si es mayor retorna 1
            return 1;
        
        return 0;//si no se cumple ninguna entonces son iguales y retorna 0
    }
}
