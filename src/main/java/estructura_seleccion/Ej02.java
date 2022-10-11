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
public class Ej02 {

    /**
     * Utilizando el operador ternario ?: de Java, implementa las siguientes
     * sentencias: a)Si el número “x” es mayor o igual que 135 se devolverá
     * “mayor”, si es menor se devolverá “menor”. Las cadenas que se devuelven
     * se guardarán en una variable llamada resultado.
     *
     * b)Si el número “x” es menor o igual que cero se imprimirá en pantalla
     * “Menor que cero” , si no se imprimirá “Mayor que cero”.
     *
     * c)Guardar el valor absoluto de un número entero en una variable entera
     * (sin usar la función Math.abs()
     *
     */
    public static void main(String[] args) {
        // Apartado A
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dale un valor a X");
        int x = teclado.nextInt();

        String resultado = (x >= 135) ? "Mayor" : "menor";

        System.out.println(resultado);

        System.out.println("**********************Apartado b *******************");

        String resultadoApartadoB = (x <= 0) ? "Menor cero" : "Mayor que cero";
        System.out.println(resultadoApartadoB);

        System.out.println("**********************Apartado c*******************");
        int valorAbsoluto;
       
            valorAbsoluto = (x >= 0) ? x : -x;
        System.out.println("El valor absoluto es: " + valorAbsoluto);
      
    }

}
