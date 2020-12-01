/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Algoritmo_Bellman.Bellman;
import Algoritmo_Bellman.CrearEscenario;
import java.util.Scanner;


/**
 *
 * @author USER
 */
public class Prueba {
    public static void main(String[] args) {
        //use esto para realizar pruebas
        
        ////long inicio1 = System.nanoTime();
        //long final1 = System.nanoTime();
        //funcion que permite tomar el tiempo en nanosegundos
        //System.out.println("Tiempo ejecucion: "+(final1-inicio1)/1e6+" milisegundos");
        //con eso se halla el tiempo de ejecucion
        //algoritmo.Iterarconlimite(1);
        //con ese algoritmo imprime la tabla mas su numero de iteraciones;
        
       
       
        
        CrearEscenario facil = new CrearEscenario(5);
        facil.CrearConexion(1, 2, 5);
        facil.CrearConexion(2, 3, 7);
        facil.CrearConexion(4, 3, 4);
        facil.CrearConexion(4, 1, 3);
        facil.CrearConexion(5, 1, 6);
        facil.CrearConexion(5, 4, 8);
        facil.CrearConexion(3, 5, 2);
        facil.CrearConexion(2, 4, 3);
        facil.CrearConexion(4, 2, 5);
    
        Bellman algoritmo1 = new Bellman(facil);
        
        //long inicio1 = System.nanoTime();
        algoritmo1.Iterar(1);
        //long final1 = System.nanoTime();
        
        //algoritmo1.Iterarconlimite(1);
        
       algoritmo1.Imprimir();
       
        //System.out.println("Tiempo ejecucion: "+(final1-inicio1)/1e6+" milisegundos");*/
        
        CrearEscenario medio = new CrearEscenario(11);
        medio.CrearConexion(1, 3, 15);
        medio.CrearConexion(1, 9, 11);
        medio.CrearConexion(1, 2, 10);
        medio.CrearConexion(3, 5, 18);
        medio.CrearConexion(3, 10, 20);
        medio.CrearConexion(3, 4, 13);
        medio.CrearConexion(4, 2, 10);
        medio.CrearConexion(4, 10, 11);
        medio.CrearConexion(5, 6, 25);
        medio.CrearConexion(5, 7, 11);
        medio.CrearConexion(6, 8, 14);
        medio.CrearConexion(6, 4, 12);
        medio.CrearConexion(7, 8, 12);
        medio.CrearConexion(7, 11, 9);
        medio.CrearConexion(8, 11, 13);
        medio.CrearConexion(9, 2, 13);
        medio.CrearConexion(9, 4, 14);
        medio.CrearConexion(10, 5, 17);
        medio.CrearConexion(10, 6, 21);
        medio.CrearConexion(11, 6, 10);
        medio.CrearConexion(11, 5, 9);
    
        Bellman algoritmo2 = new Bellman(medio);
        
        //long inicio2 = System.nanoTime();
        algoritmo2.Iterar(1);
        //long final2 = System.nanoTime();
        
        //algoritmo2.Iterarconlimite(1);
        
        algoritmo2.Imprimir();
         
       // System.out.println("Tiempo ejecucion: "+(final2-inicio2)/1e6+" milisegundos");*/
        
        
        
        CrearEscenario dificil = new CrearEscenario(16);
        dificil.CrearConexion(1, 9, 40);
        dificil.CrearConexion(1, 5, 28);
        dificil.CrearConexion(2, 1, 21);
        dificil.CrearConexion(3, 2, 25);
        dificil.CrearConexion(3, 7, 35);
        dificil.CrearConexion(4, 3, 22);
        dificil.CrearConexion(5, 4, 23);
        dificil.CrearConexion(5, 1, 30);
        dificil.CrearConexion(5, 6, 27);
        dificil.CrearConexion(5, 13, 50);
        dificil.CrearConexion(6, 7, 21);
        dificil.CrearConexion(7, 11, 25);
        dificil.CrearConexion(7, 8, 26);
        dificil.CrearConexion(8, 1, 24);
        dificil.CrearConexion(9, 7, 25);
        dificil.CrearConexion(9, 13, 35);
        dificil.CrearConexion(10, 9, 20);
        dificil.CrearConexion(11, 10, 28);
        dificil.CrearConexion(11, 15, 37);
        dificil.CrearConexion(12, 11, 23);
        dificil.CrearConexion(13, 12, 25);
        dificil.CrearConexion(13, 9, 32);
        dificil.CrearConexion(13,7,23);
        dificil.CrearConexion(13, 14, 21);
        dificil.CrearConexion(14, 15, 22);
        dificil.CrearConexion(15, 16, 24);
        dificil.CrearConexion(16, 9, 28);
      
        Bellman algoritmo3 = new Bellman(dificil);
        
        //long inicio3 = System.nanoTime();
        algoritmo3.Iterar(1);
        //long final3 = System.nanoTime();
        
        //algoritmo3.Iterarconlimite(1);
        
        algoritmo3.Imprimir();
     
        //System.out.println("Tiempo ejecucion: "+(final3-inicio3)/1e6+" milisegundos");
        
        
    }
}
