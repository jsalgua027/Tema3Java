/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_seleccion;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Reescribe el programa del ejercicio 1 usando el operador ternario ?:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();
        
        String texto;
        
        texto= (edad>18)?"Es mayor de edad":"Es menor de edad";
        
        

    }

}
