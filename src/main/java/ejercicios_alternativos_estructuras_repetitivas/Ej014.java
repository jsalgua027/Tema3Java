/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_alternativos_estructuras_repetitivas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ej014 {

    /**
     * @param args the command line arguments
     *
     *
     * En una tienda las personas que van a pagar el importe de su compra llegan
     * a caja y sacan una bolita de color, que les dirá que descuento tendrám
     * sobre el total de cu compra. Esta bolita se saca de forma aleatoria de un
     * saco, sin saber que bolita saldrá. Se sabe que si el color: azul--->20%
     * descuento verde-->25% blanca no tiene descuento Escribir un algoritmo que
     * dado el importe que va a pagar el cliente, imprima por pantalla el
     * importe descontado y la bolita que saco El programa preguntara si hay
     * otro cliente, El valor de la bolita es aleatorio
     *
     *
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random numAleatorio = new Random();
        String textoMenu = """
                                                ************************ADIVINA EL NUMERO THE BEST GAME *************
                                                            Teclea   si   para otro cliente
                                                            Teclea   no  para apagar el programa
                                                  
                                                ****************************************************************************************
                          """;
        String opcionMenu = " ";

        int numeroBolita;

        final double PORCENTAJE_AZUL = 0.2;
        final double PORCENTAJE_VERDE = 0.25;
        final String VERDE = "Verde";
        final String AZUL = "Azul";
        final String BLANCA = "Verde";

        double importeClienteSinDescuento;
        double importeClienteConDescuento;
        double importeDescontado;

        do {
            System.out.println(textoMenu);
            opcionMenu = teclado.nextLine();
            if (opcionMenu.equalsIgnoreCase("si")) {
                numeroBolita = numAleatorio.nextInt(3 - 1 + 1) + 1;
                System.out.println("Introduce el importe pagado por el cliente");
                importeClienteSinDescuento = teclado.nextDouble();

                switch (numeroBolita) {
                    case 1 -> {
                        importeDescontado = importeClienteSinDescuento * PORCENTAJE_AZUL;
                        importeClienteConDescuento = importeClienteSinDescuento - (importeClienteSinDescuento * PORCENTAJE_AZUL);
                        String facturaFinal = """
                                                                              ***************************FACTURA**************************
                                                                                                                         El importe inicial ha sido de:  %.2f euros
                                                                              Como ha salido la bola %s
                                                                              Se le aplica un descuento de %.2f
                                                                              El importe final a pagar es de: %.2f euros
                                                                                                                         ****************************************************************
                                                                      """.formatted(importeClienteSinDescuento, AZUL, importeDescontado, importeClienteConDescuento);
                    }
                    case 2 -> {
                        importeDescontado = importeClienteSinDescuento * PORCENTAJE_VERDE;
                        importeClienteConDescuento = importeClienteSinDescuento - (importeClienteSinDescuento * PORCENTAJE_VERDE);
                        String facturaFinal2 = """
                                                                               ***************************FACTURA**************************
                                                                                                                           El importe inicial ha sido de:  %.2f euros
                                                                               Como ha salido la bola %s
                                                                               Se le aplica un descuento de %.2f
                                                                               El importe final a pagar es de: %.2f euros
                                                                                                                           ****************************************************************
                                                                       """.formatted(importeClienteSinDescuento, VERDE, importeDescontado, importeClienteConDescuento);
                    }
                    default -> {
                        String facturaFinal3 = """
                                                                                                   ***************************FACTURA**************************
                                                                              Ha salido la bola blanca no tienes descuento
                                                                                El importe final a pagar es de: %.2f euros
                                                                                                    ****************************************************************
                                                                                                                             """.formatted(importeClienteSinDescuento);
                    }

                }

            }

        } while (opcionMenu.equalsIgnoreCase("si"));

    }

}
