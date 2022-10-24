/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico3C;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class NumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final String UNO = "I";
        final String DOS = "II";
        final String TRES = "II";
        final String CUATRO = "IIII";
        final String CINCO = "IV";
        final String SEIS = "VI";
        final String SIETE = "VII";
        final String OCHO = "VIII";
        final String NUEVE = "VIIII";
        final String DIEZ = "X";

        int opcionMenu = 0;
        int numeroElejido = 0;
        String nombre;
        int contadorVocales = 0;

        String textoMenu = """
                        
                                        ************************JUEGO EJERCICIO 3C*********************
                                                       ---------------------Elije una opcion -------------------
                                                       1.Representar el numero romano que quieras.
                                                       2.Cuenta vocales 
                                                       3.Para salir del juego.
                         
                                        *****************************************************************
                        """;

        do {//bucle menu  si marca 3 se sale
            System.out.println(textoMenu);
            opcionMenu = teclado.nextInt();

            switch (opcionMenu) {

                case 1 -> {
                    System.out.println("Inidica un numero del 1 al 10");
                    numeroElejido = teclado.nextInt();
                    switch (numeroElejido) {// para los numeros romanos
                        case 1 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + UNO);
                        case 2 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + DOS);
                        case 3 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + TRES);
                        case 4 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + CUATRO);
                        case 5 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + CINCO);
                        case 6 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + SEIS);
                        case 7 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + SIETE);
                        case 8 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + OCHO);
                        case 9 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + NUEVE);
                        case 10 ->
                            System.out.println("El numero elejido es: " + numeroElejido + " y en romano es: " + DIEZ);
                        default -> {
                        }

                    }
                }

                case 2 -> {//lector de vocales
                    teclado.nextLine();
                    System.out.println("Has elejido contar vocales, Introduce un nombre: ");
                    nombre = teclado.nextLine();

                    for (int i = 0; i < nombre.length(); i++) {//bucle que recorre el String
                        //si contiene la vocal se mete en el if y suma al contador
                        if ((nombre.charAt(i) == 'a') || (nombre.charAt(i)) == 'e' || (nombre.charAt(i) == 'i')
                                || (nombre.charAt(i) == 'o') || (nombre.charAt(i) == 'u')) {
                            contadorVocales++;

                        }

                    }
                    System.out.println("El nombre contiene :" + contadorVocales + " vocales");
                }
                default -> {
                }

            }

        } while ((opcionMenu == 1) || (opcionMenu == 2));

    }

}
