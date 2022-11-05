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
    private static int numeroGanadorJugador = 0;
    private static int numeroGanadorMaquina = 0;

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

    //******************** RONDAS***********************
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

    //***************** NUMERO A ACERTAR  JUGADOR Y MAQUINA*********************
    private static int pidoNumeroGanadorJugador() {
        boolean repetir = true;
        numeroGanadorJugador = 0;

        do {

            do {

                try {

                    numeroGanadorJugador = Integer.parseInt(JOptionPane.showInputDialog("Que número va ser el Ganador"));
                    repetir = false;

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "El dato Introducido es erroneo");
                    //limpio buffer

                }

            } while (repetir);

        } while (JugadorNumeroDedos > 10);

        return numeroGanadorJugador;

    }
    
    private static int numeroGanadorMaquina(){
    numeroGanadorMaquina=numerosRandom.nextInt(10-0+1)+0;
     return numeroGanadorMaquina;
    }
    
    //*************NUMERO DE DEDOS JUGADOR Y MAQUINA**********************
    
    private static int numeroDedosJugador(){
    boolean repetir=true;
    JugadorNumeroDedos=0;
     do {

                do {

                    try {

                        JugadorNumeroDedos = Integer.parseInt(JOptionPane.showInputDialog("Inidica el numero de Dedos"));
                        repetir = false;

                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "El dato Introducido es erroneo");
                        //limpio buffer

                    }

                } while (repetir);

            } while (JugadorNumeroDedos > 5);

     return JugadorNumeroDedos;
    }
    
    private static int numeroDedosMaquina(){
    
    maquinaNumeroDedos=numerosRandom.nextInt(5-0+1)+0;
    return  maquinaNumeroDedos;
    }
    
    

    public static void main(String[] args) {
        String opcion = "";// gestion menu
        int contadorRondas = 0;//Rondas
        int victoriasJugador=0;//victorias
        int victoriasMaquina=0;
        int numeroRondasPedidas = 0;//solicitud de datos
        int numeroGanadorJugador = 0;
        int numeroGanadorMaquina = 0;
        int numeroDedosJugador = 0;
        int numeroDedosMaquina = 0;

        opcion = gestionoMenu();

        do {
            if (opcion.equalsIgnoreCase("iniciar")) {

                do {
                    numeroRondasPedidas = muestroPidoRondas();
                    numeroGanadorJugador=pidoNumeroGanadorJugador();
                    numeroGanadorMaquina=numeroGanadorMaquina();
                    numeroDedosJugador=numeroDedosJugador();
                    numeroDedosMaquina=numeroDedosMaquina();
                    contadorRondas++;//control de rondas
                } while (contadorRondas < numeroRondasPedidas);
                break;
            }

        } while (!opcion.equalsIgnoreCase("salir"));
    }

}
