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
public class Bisiestos {

    /**
     * @param args the command line arguments
     *
     * bucle hasta que introduce el cero
     *
     * si introduce el año negativo el programa lo pone positivo
     *
     * el programa tiene que decir si es bisiesto
     *
     * para que sea bisiesto tiene que ser divisible por cuatro y( no divisible
     * por 100 o por 400)
     *
     *
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anio = 0;

        do {
            System.out.println("Introduce el año para saber si es bisiesto: ");
            anio = Math.abs(teclado.nextInt());
            if (anio > 0) {

                if (anio % 4 == 0 && ((anio % 100 != 0) || (anio % 400 == 0))) {

                    System.out.println("El año es bisiesto");
                } else {
                    System.out.println("El año no es bisiesto");
                }

            }

        } while (anio != 0);

    }

}
