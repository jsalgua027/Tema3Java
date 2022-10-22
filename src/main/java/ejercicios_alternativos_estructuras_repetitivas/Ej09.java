/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_alternativos_estructuras_repetitivas;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     *
     *
     * desarrolla un programa que lea la edad e indique lo siguiente:
     *
     * si es <18 "No pudes votar"
     * si es 18 "Justo eres mayor de edad"
     *  si es 25 "Que buena edad"
     *  si es 35 "Ya denerias de tener hijos"
     * si es 45 "Deberia pensar en anrir un plan de pensiones"
     * si es de 55 "Vica la madurez"
     * si es  de 65 "Enhorabuena Jubilado"
     * si es >65, "A disfutar la vejez "
     *
     * El programa controlara la edad comprendida entre 1 y 120 años, si no es
     * asi volvera a solicita la edad
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad = 0;

        do {
            System.out.println("Indique la edad");
            edad = teclado.nextInt();

            if (edad < 18) {
                System.out.println("No pudes votar");
            } else if (edad > 65) {
                System.out.println("A disfutar de la vejez ");

            }

            switch (edad) {
                case 18 -> System.out.println("Justo eres mayor de edad");
                case 25 -> System.out.println("Que buena edad");
                case 35 -> System.out.println("Ya denerias de tener hijos");
                case 45 -> System.out.println("Deberia pensar en abrir un plan de pensiones");
                case 55 -> System.out.println("Vica la madurez");
                case 65 -> System.out.println( "Enhorabuena Jubilado");
                default -> {
                }

            }

        } while (!((edad >= 1) && (edad <= 120)));

    }

}
