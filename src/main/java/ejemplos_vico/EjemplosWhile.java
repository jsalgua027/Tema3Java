/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_vico;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EjemplosWhile {

    /**
     * @param args the command line arguments
     * 
     * e EL BUCLE WHILE EJECUTA ENTRE 0 Y N
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // te repite hasta que metes el numero dentro del rango indicado
        // si es verdadero se repite
        System.out.println("introduce un numero del (100 - 200)");
        int num = teclado.nextInt();//inicializacion
        while (num < 100 || num > 200) {

            System.out.println("Te has equivocado. introduce el numero otra vez");
            num = teclado.nextInt();

        }

        //while el bucle no tiene porque hacer una repeticion
        // inicializacion variable de control
        int numero = 0;

        // condicion del bucle
        //mientras la condicion del bucle sea true se rpite el codigo entre ()
        //imprimir del  0 al 10
        while (numero <= 10) {

            System.out.println(numero);

            numero++; //siempre dentro del bucle hay que actualizar la variable de control!!!!!!!

        }
        System.out.println("El bucle ha terminado");

        //del 20 al 0
        numero = 20;

        while (numero >= 0) {

            System.out.println(numero);

            numero--;// actualizacion variable de control

        }

        //del 50 al 70 de tres en tres
        numero = 50;

        while (numero <= 70) {

            System.out.println(numero);

            numero = numero + 3;
            //numero+=3;  es lo mismo!!!!!!!!!!!!!!!!!!!

        }

    }

}
