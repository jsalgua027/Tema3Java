/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_temario;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class OperadorCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operador condicional
        // CONDICION ? SI LA CONDICION ES VERDADERO : SI LA CONDICION ES  FALSO
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique la edad");
        int edad = teclado.nextInt();
        String txt;
        txt = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.print(txt);

    }

}
