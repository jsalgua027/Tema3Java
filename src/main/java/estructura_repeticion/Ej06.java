/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_repeticion;

import java.util.Scanner;

/**
 *
 * @author jsalc
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    Scanner teclado = new Scanner(System.in);
        Scanner teclado = new Scanner (System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
    
}
