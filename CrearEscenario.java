/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmo_Bellman;

/**
 *
 * @author USER
 */
public class CrearEscenario {
    //aqui se crea la respectiva estructura, se emplea el llamado grafos
    private int Vertices;
    private int[][] peso;

    public CrearEscenario(int Vertices) {
        this.Vertices = Vertices;
        this.peso = new int[this.Vertices][this.Vertices];
        for (int i=0; i<this.Vertices;i++){
            for (int j=0; j<this.Vertices;j++){
                this.peso[i][j]=0;
            }
        }
    }

    public int[][] getPeso() {
        return peso;
    }

    public void setPeso(int[][] peso) {
        this.peso = peso;
    }
    
    

    public int getVertices() {
        return Vertices;
    }

    public void setVertices(int MaxVertices) {
        this.Vertices = MaxVertices;
    }
    
    

    
    
    public void CrearConexion(int vertice, int siguiente, int peso){
        // en la interseccion, se crea la distancia entre ambos nodos
        this.peso[vertice-1][siguiente-1] = peso;    
        
    }
    
    public void ImprimirEstructura(){
        //imprime la estructura
        String cadena = "Tabla\t";
        for (int i=0; i<this.Vertices;i++){
            cadena = cadena + (i+1) + "\t";
        }
       
        cadena = cadena + "\n";
        for (int i=0; i<this.Vertices;i++){
            cadena = cadena + (i+1) + "\t";
            for(int j=0;j<this.Vertices;j++){
                cadena = cadena + this.peso[i][j] + "\t";
            }
            cadena = cadena + "\n";
        }
        System.out.println(cadena);
    }    
    
          
}
