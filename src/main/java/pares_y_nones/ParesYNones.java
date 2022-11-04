/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pares_y_nones;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 *
 *
 * pares y nones
 *
 * menu iniciar y salir que se repita
 *
 * dos jugadores uno es la maquina
 *
 * 1 elegir (pares o nones) usuario la maquina es lo contrario 2 elegir numero
 * de dedos usuario y maquina el numero de dedos random 4 buscamos ganador y
 * mostramos
 *
 *
 * -------una vez que tengamos una partida correcta----------
 *
 * lo hacemos para una ronda de 10
 *
 */
public class ParesYNones {

    /**
     * @param args the command line arguments
     */
    private static Random numerosRandom = new Random();
    private static int JugadorNumeroDedos = 0;
    private static int maquinaNumeroDedos = 0;
    private static final String PARES = "pares";
    private static final String NONES = "nones";

    private static final String menuJuego = """
                                   
                                   ***********************Bienvenido a Pares y Nones******************
                                   
                                                    -Escriba Iniciar para comenzar el programa
                                                    -Escriba salir para finalizar el programa
                                   
                                   *********************************************************************
                                   """;

    private static final String paresONones = """
                                            
                                                    ¿Que elijes Pares o Nones?
                                            
                                            """;

    //*******************MENU INICIAL***************
    //muestro menu y meto dato
    private static String MuestroPidoMenu() {
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

            opcion = MuestroPidoMenu();

        } while (!esValidoOpcion(opcion));

        return opcion;
    }

    // seleccion de pares y nones
    //*******************SELECCION DE PARES Y NONES****************
    public static String seleccionParesYNones() {
        String opcion;
        do {            
            
             opcion = JOptionPane.showInputDialog(paresONones);
        } while (!(opcion.equalsIgnoreCase("pares")||opcion.equalsIgnoreCase("nones")));
       

        return opcion;
    }

    //selecion de manos 
    private static String cuantasManos() {
        String opcion;
        do {            
            
            
            opcion = JOptionPane.showInputDialog("¿Con Una o dos Manos?");
            
        } while (!(opcion.equalsIgnoreCase("Una")||opcion.equalsIgnoreCase("Dos")));

        

        return opcion;
    }

    //***************SOLICITUD DE DEDOS MAQUINA Y JUGADOR
    public static int numeroDedosJugador() {
        JugadorNumeroDedos = 0;
        boolean repetir = true;
        
     

        do {

            try {

                JugadorNumeroDedos = Integer.parseInt(JOptionPane.showInputDialog("Inidica el numero de Dedos"));
                repetir = false;

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "El dato Introducido es erroneo");
                //limpio buffer

            }

        } while (repetir);

        return JugadorNumeroDedos;

    }

    //metodo numeroMaquina si es a una mano 
    public static int numeroDedosMaquina(String opcion){
    
        if (opcion.equalsIgnoreCase("una")){
        maquinaNumeroDedos=numerosRandom.nextInt(5-0+1)+0;
        
        }else if (opcion.equalsIgnoreCase("dos")){
        
        maquinaNumeroDedos=numerosRandom.nextInt(10-0+1)+0;
        }
    
    return maquinaNumeroDedos;
    
    }
    
    
    
    public static void main(String[] args) {
        String opcion = "";
        String manos="";
        String paresONones="";
        int jugadorNumeroDedos;
        int maquinaNumeroDedos;

        do {

            opcion = gestionoMenu();
            if (opcion.equalsIgnoreCase("iniciar")) {

                manos = cuantasManos();

                switch (manos) {
                    case "una":

                        opcion = seleccionParesYNones();
                        switch (paresONones) {
                            case "pares":
                                JOptionPane.showMessageDialog(null, "estas en pares");
                                jugadorNumeroDedos = numeroDedosJugador();
                                maquinaNumeroDedos=numeroDedosMaquina(manos);

                                break;
                            case "nones":
                                JOptionPane.showMessageDialog(null, "estas en nones");
                                break;
                            default:

                        }
                        break;

                    case "dos":
                        opcion = seleccionParesYNones();
                        switch (opcion) {
                            case "pares":
                                JOptionPane.showMessageDialog(null, "estas en pares");
                                jugadorNumeroDedos = numeroDedosJugador();

                                break;
                            case "nones":
                                JOptionPane.showMessageDialog(null, "estas en nones");
                                break;
                            default:

                        }

                        break;
                    default:

                }

            }

        } while (!opcion.equalsIgnoreCase("salir"));

    }

}
