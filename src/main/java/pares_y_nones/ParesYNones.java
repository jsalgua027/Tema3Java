/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pares_y_nones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 * 
 * 
 * pares y nones

menu iniciar y salir que se repita

dos jugadores uno es la maquina

1 elegir (pares o nones) usuario la maquina es lo contrario
2 elegir numero de dedos usuario y maquina el numero de dedos random
4 buscamos ganador y mostramos


-------una vez que tengamos  una partida  correcta----------

lo hacemos para una ronda de 10
 * 
 */



public class ParesYNones {

    /**
     * @param args the command line arguments
     */
    

     private static Random numerosRandom = new Random();
    
    private  static final String menuJuego="""
                                   
                                   ***********************Bienvenido a Pares y Nones******************
                                   
                                                    -Escriba Iniciar para comenzar el programa
                                                    -Escriba salir para finalizar el programa
                                   
                                   *********************************************************************
                                   """;
    
    
    //muestro menu y meto dato
    private static String MuestroPidoMenu(){
    String opcion;
    
        opcion=JOptionPane.showInputDialog(menuJuego);
    
    
    return opcion;
    }
    
    // valido opcion 
    public static boolean esValidoOpcion(String opcion){
    
    
    return opcion.equalsIgnoreCase("iniciar")|| opcion.equalsIgnoreCase("salir");
    }
    
    
    //gestiono menu
    
    public static String gestionoMenu(){
    String opcion;
        do {            
            
            opcion=MuestroPidoMenu();
            
        } while (!esValidoOpcion(opcion));
    
    return opcion;
    }
    
    
    public static void main(String[] args) {
       String opcion="";
       
        
        do {            
            
             gestionoMenu();
            
            
        } while (opcion.equalsIgnoreCase("salir"));
        
        
        
    }
    
}
