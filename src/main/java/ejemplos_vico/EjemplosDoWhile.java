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
public class EjemplosDoWhile {

    /**
     * @param args the command line arguments
     *
     * EJECUTA ENTRE 1 Y N
     */
    public static void main(String[] args) {
        //El bucle do while siempre hace al meno una interaccion

        // imprimir del 0 al 10
        int numero = 0;

        do {
            System.out.println(numero);
            numero++;

        } while (numero <= 10);
        System.out.println("sale del bucle");

        // del 0 al 10
        numero = 10;

        do {
            System.out.println(numero);
            numero--;

        } while (numero >= 0);

        // ejemplo con Scanner
        Scanner teclado = new Scanner(System.in);

        int valor = 0;
        do {
            System.out.println("introduce un numero del (100 - 200)");
            valor = teclado.nextInt();
        } while (valor < 100 || valor > 200);

    }
}
