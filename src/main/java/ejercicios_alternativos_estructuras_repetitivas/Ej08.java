/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_alternativos_estructuras_repetitivas;

/**
 *
 * @author Windows10
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     *
     * realiza un algoritmo que muestre los numeros de 1 al 50, sin mostrar los
     * multiplos de 5
     *
     *
     */
    public static void main(String[] args) {
        int numeros = 1;

        for (int i = 0; i < 50; i++) {

            numeros++;
            if (numeros % 5 == 0) {

                System.out.println(" -  " + numeros);

            }

        }
    }

}
