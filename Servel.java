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
public class Servel {
    ArrayList<Mesa>Mesas=new ArrayList<Mesa>();
    
    public boolean AgregarMesa(int numeroMesa, Mesa mesa){
        int i;
        if(Mesas.size() > 0){
            
            for(i = 0; i < Mesas.size(); i++){
                if(Mesas.get(i).getCircunscripcion().equals(mesa.getCircunscripcion()) == false 
                && Mesas.get(i).getNumeroMesa() != numeroMesa){
                    Mesas.add(mesa);
                    return true;
                }
            }
            return false;
        }
        Mesas.add(mesa);
        return true;
    }
    
    public Elector EliminaElector(String rut){
        int i;
        Elector aux;
        
        for(i = 0; i < Mesas.size(); i++){
            aux = Mesas.get(i).EliminaElector(rut);
            return aux;
        }
        return null;
    }
    
    
    public int[] CuadrarMesas(){
        int vector[]= new int[3];
        int i;
        int cuadra = 0;
        int Mayor = 0;
        int Menor = 0;
        
        for(i = 0; i < Mesas.size(); i++){
            if(Mesas.get(i).CuadraMesa() == 0){
                cuadra++;
                vector[0] = cuadra;
            }
            
            if(Mesas.get(i).CuadraMesa() == 1){
                Mayor++;
                vector[1] = Mayor;
            }
            
            if(Mesas.get(i).CuadraMesa() == -1){
                Menor++;
                vector[2] = Menor;
            }
        }
        
        return vector;
    }
}
