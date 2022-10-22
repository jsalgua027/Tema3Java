/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_alternativos_estructuras_repetitivas;

/**
 *
 * @author Windows10
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;

        System.out.println("********************************* while**************************** ");
        while (numero <= 100) {

            System.out.println("el numero es: " + numero);

            numero++;

        }
        System.out.println("********************************* do  while**************************** ");
        do {

            System.out.println("el numero es: " + numero);

            numero++;

        } while (numero <= 100);

        System.out.println("********************************* for**************************** ");

        for (int i = 0; i <= 100; i++) {
            System.out.println("el numero es: " + numero);

            numero++;
        }

    }

}
