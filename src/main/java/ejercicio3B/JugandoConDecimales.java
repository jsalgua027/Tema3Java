/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3B;

import java.math.BigDecimal;

/**
 *
 * @author Windows10
 */
public class JugandoConDecimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // perdemos decimales
        for (double d = 5; d >= 0; d -= 0.1) {
            System.out.println("D vale: " + d);
        }
        System.out.println("*************************************************BigDecimal*****************************************");
        // vemos la clase BigDecimal
        BigDecimal bd = new BigDecimal(9.1);
        System.out.println("valor: " + bd);

    }

}
