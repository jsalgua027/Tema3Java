/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_repeticion;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     *
     *
     * Implementa el programa del ejercicio 2 usando un do – while.
     *
     *
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;

        do {
            System.out.print(x);
            System.out.print(" - ");
            x= x+1;
            
        } while (x <= n);

    }

}
