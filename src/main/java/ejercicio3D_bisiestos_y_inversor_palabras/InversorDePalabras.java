/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3D_bisiestos_y_inversor_palabras;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class InversorDePalabras {

    /**
     * @param args the command line arguments
     *
     * leo una palabra por teclado hasta que ponga salir
     *
     * si pone tomate el programa tiene que crear otra palabra pero al reves
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabra = " ";
        String palabraInvertida = " ";

        do {
            palabra = " ";
            palabraInvertida = " ";
            System.out.println("Introduce la palabra: ");
            palabra = teclado.nextLine();

            if (!palabra.equalsIgnoreCase("salir")) {

                for (int i = palabra.length() - 1; i >= 0; i--) {

                    palabraInvertida = palabraInvertida + palabra.charAt(i);

                }

                System.out.println("la palabra invertida es: " + palabraInvertida);

            }

        } while (!palabra.equalsIgnoreCase("salir"));

    }

}
