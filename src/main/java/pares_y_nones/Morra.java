/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pares_y_nones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jsalc
 */
public class Morra {

    /**
     * @param args the command line arguments
     */
    private static Random numerosRandom = new Random();
    private static int JugadorNumeroDedos = 0;
    private static int maquinaNumeroDedos = 0;
    
    
     private static final String menuJuego = """
                                   
                                   ***********************Bienvenido a Pares y Nones******************
                                   
                                                    -Escriba INICIAR para comenzar el programa
                                                    -Escriba SALIR  para finalizar el programa
                                   
                                   *********************************************************************
                                   """;
     
      private static final String rondas = """
                                                En este juego no existe el empate elige rondas Impares
                                                            ¿Cuantas rondas quieres jugar?
                                            
                                            """;
     
       //*******************MENU INICIAL***************
    //muestro menu y meto dato
    private static String muestroPidoMenu() {
        String opcion;

        opcion = JOptionPane.showInputDialog(menuJuego);

        return opcion;
    }

    // valido opcion 
    public static boolean esValidoOpcion(String opcion) {

        return opcion.equalsIgnoreCase("iniciar") || opcion.equalsIgnoreCase("salir");
    }

    //gestiono menu
    public static String gestionoMenu() {
        String opcion;
        do {

            opcion = muestroPidoMenu();

        } while (!esValidoOpcion(opcion));

        return opcion;
    }
    
    
     // muestro y pido Numero de rondas
    private static int muestroPidoRondas() {
        int numeroRondas = 0;
        boolean repetir = true;
        do {
            repetir = true;

            do {

                try {

                    numeroRondas = Integer.parseInt(JOptionPane.showInputDialog(rondas));
                    repetir = false;

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "El dato Introducido es erroneo");
                    //limpio buffer

                }

            } while (repetir);

        } while (numeroRondas < 1 || numeroRondas % 2 == 0);

        return numeroRondas;
    }

    public static void main(String[] args) {
       String opcion="";
       
       opcion=gestionoMenu();
               
        do {    
           if(opcion.equalsIgnoreCase("iniciar")){
           
               System.out.println("estoy en iniciar");
           }
            
        } while (!opcion.equalsIgnoreCase("salir"));
    }

}
