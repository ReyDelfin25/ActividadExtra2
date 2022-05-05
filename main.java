/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadextra;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author hchao
 */
public class main {
    public static void main(String[] args) throws IOException{
        BufferedReader Entrada = new BufferedReader(new InputStreamReader(System.in));
        Servel servel = new Servel();
        
        do{
            System.out.println("ESCOJA LA OPERACION QUE DESEA REALIZAR");
            System.out.println();

            System.out.println("1)Agregar Mesa");
            System.out.println("2)Elimina Elector");
            System.out.println("3)Cuadrar Mesas");
            System.out.println("4)Salir");
            
            int opciones = Integer.parseInt(Entrada.readLine());
            
            if(opciones == 4){
                System.out.println("HASTA PRONTO!!");
                break;
            }
            switch(opciones){
                case 1:
                    int numeroMesa;
                    System.out.println("Numero de mesa a agregar: ");
                    numeroMesa = Integer.parseInt(Entrada.readLine());
                    System.out.println("Numero de circunscripcion a agregar: ");
                    String circunscripcion = Entrada.readLine();
                    Mesa mesa = new Mesa(circunscripcion,numeroMesa);
                    if(servel.AgregarMesa(numeroMesa, mesa) == true)
                        System.out.println("Se agrego con exito!!");
                    else
                        System.out.println("No se logro agregar");
                break;

                case 2:
                    String rut;
                    System.out.println("Ingrese el rut del elector a eliminar: ");
                    rut = Entrada.readLine();
                    Elector elector = servel.EliminaElector(rut);
                    if(elector == null)
                        System.out.println("No se elimino");
                    else
                        System.out.println("Se elimino con exito!!");
                break;

                case 3:
                    int vector[] = servel.CuadrarMesas();
                    System.out.println("La cantidad de mesas que cuadran son: "+vector[0]);
                    System.out.println("La cantidad de mesas que la cantidad de votos fue mayor son: "+vector[1]);
                    System.out.println("La cantidad de mesas que la cantidad de votos fue menor son: "+vector[2]);
                break;
                
            }
        }while(true);
    }
}
