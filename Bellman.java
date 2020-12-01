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
public class Bellman {
    // se construye la clase con el escenario y los arreglos distancia y previo
    CrearEscenario escenario;
    int[] distancia, previo;
    //Variables usada para calcular numero de iteracciones
    int NumIteraciones;
    int[] ListDistanciaAnterior;
    
    //cabe resaltar que el arreglo distancia[] guarda la distancia del nodo seleccionado hasta cualquier punto del nodo
    //el arreglo previo[] guarda el nodo previo al nodo respectivo
    public Bellman(CrearEscenario escenario) {
        this.escenario = escenario;
        this.distancia = new int[this.escenario.getVertices()];
        this.previo = new int[this.escenario.getVertices()];
        this.ListDistanciaAnterior=new int[this.escenario.getVertices()];
        
        for (int i=0; i<escenario.getVertices();i++){
                this.distancia[i]=1000;
                this.previo[i]=-1;
                this.ListDistanciaAnterior[i]=1000;
            
        }  
    }

    public int[] getDistancia() {
        return distancia;
    }

    public void setDistancia(int[] distancia) {
        this.distancia = distancia;
    }

    public int[] getPrevio() {
        return previo;
    }

    public void setPrevio(int[] previo) {
        this.previo = previo;
    }
    
    public void Iterarconlimite(int seleccionado){
        
        //La distancia del punto seleccionado es 0
        int cantidad = this.escenario.getVertices();
        distancia[seleccionado-1]=0;
        
        //Se crea dos variables, uno de tipo boleean y otro un entero
        boolean confirmacion = false;
        int prueba = 0;
        
        //se realiza while
        while(confirmacion==false){
        for(int i=0; i<cantidad;i++){
                //por cada punto, se halla sus aristas
                this.EncontrarAristas(i);
        }
        
        //se compara cada nodo de lista distancia con la lista distancia anterior
        for(int i=0;i<cantidad;i++){
            if(this.distancia[i]==this.ListDistanciaAnterior[i]){
                //lleva contando si son iguakes
                prueba++;
            }
        }
        
        //si el contador llega hasta la cantidad de nodos, significa que
        //ningun nodo ha cambiado de peso
        if(prueba==cantidad){
            confirmacion = true;
        }else{
            //caso contrario, se actualiza la lista de distancia anterior
            for(int i=0;i<cantidad;i++){
                this.ListDistanciaAnterior[i]=this.distancia[i];
            }
            //numero de iteracciones crece
            this.NumIteraciones++;
        }
        //contador se vuelve cero
        prueba=0;
    }
      
    
        
    }
    public void Iterar(int seleccionado){
        
         //La distancia del punto seleccionado es 0
        int cantidad = this.escenario.getVertices();
        distancia[seleccionado-1]=0;
        //se usa todos los nodos
        
        //cabe resaltar que se itera hasta n-1 veces
        //puede cambiar las iteraciones solo reemplazando el valor "cantidad-1"
        for(int j=0;j<cantidad-1;j++){
        for(int i=0; i<cantidad;i++){
                //por cada punto, se halla sus aristas
                this.EncontrarAristas(i);
        }
        
    }
    }
    
    public void EncontrarAristas(int origen){
        //se pretende hallar todas las aristas de los puntos adyacentes al origen (tienen que tener peso para trabajar)
        int[][] peso = this.escenario.getPeso();
        int cantidad = this.escenario.getVertices();
        for (int i=0;i<cantidad;i++){
            if(peso[origen][i]!=0){
         
               int u = origen;
               int v = i;
               int w = peso[origen][i];
               // cuando se halle un arista, se realiza el metodo de relajacion
               relajacion(u,v,w);
            }
        }
    }
    public void relajacion(int origen, int adyacente, int peso){
        //se realiza su respectivo metodo de relajacion
        if(distancia[origen]+peso<distancia[adyacente]){
            distancia[adyacente]=distancia[origen]+peso;
            this.previo[adyacente]= origen+1;
        }
    }
    
    
    
    public void Imprimir(){
        //Imprime los arreglos distancias y previos
        int cantidad = this.escenario.getVertices();
        String cadena = "Vertice \t";
        
        for(int i=0; i<cantidad; i++){
            cadena = cadena + (i+1)+"\t";  
    }
        cadena = cadena + "\n" + "Distancia: \t";
    for(int i=0; i<cantidad; i++){
        if(distancia[i]==1000){
            cadena = cadena + "nulo"+"\t";
        }else
            cadena = cadena + distancia[i]+"\t";  
    }
        cadena = cadena + "\n" + "Previo: \t";
    for(int i=0; i<cantidad; i++){
            cadena = cadena + previo[i]+"\t";  
    }
        System.out.println(cadena);;
        
        //Esto imprime el cuadro mas el numero de iteraciones
        if(this.NumIteraciones!=0){
        System.out.println("Numero de iteraciones: "+this.NumIteraciones);
        }
        
        
    }
    
    
    
    
}
