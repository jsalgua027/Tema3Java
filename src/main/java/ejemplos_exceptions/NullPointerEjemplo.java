/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_exceptions;

/**
 *
 * @author Windows10
 */
public class NullPointerEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "Módulo de Programación";
        char[] arrayLetras = texto.toCharArray();
        char[] arrayNull = null;

        System.out.println("Tamaño de la cadena de texto" + texto.length());
        System.out.println("Tamaño del array de letras " + arrayLetras.length);

        //mostrarArrayLetras(arrayNull);
        mostrarArrayLetrasSinErrores(arrayNull);
    }
    // Si la referencia a arrayLetras es null entonces el método provoca excepción

    private static void mostrarArrayLetras(char[] arrayLetras) {
        // Mostramos el contenido del array
        // Cuando se intenta acceder a propiedades o métodos de un objeto 
        // que es null --> NullPointerException
        for (int i = 0; i < arrayLetras.length; i++) {
            // En cada iteración se accede al contenido entre 0 y array.length-1
            // que son las posiciones válidas del array
            System.out.println("arrayLetras[" + i + "] = " + arrayLetras[i]);
        }
    }

    private static void mostrarArrayLetrasSinErrores(char[] arrayLetras) {
        // Mostramos el contenido del array
        // Cuando se intenta acceder a propiedades o métodos de un objeto 
        // que es null --> NullPointerException
        try {
            for (int i = 0; i < arrayLetras.length; i++) {
                // En cada iteración se accede al contenido entre 0 y array.length-1
                // que son las posiciones válidas del array
                System.out.println("arrayLetras[" + i + "] = " + arrayLetras[i]);
            }
        } catch (NullPointerException npe) {
            System.out.println("El array es nulo.");
        }
    }
}
