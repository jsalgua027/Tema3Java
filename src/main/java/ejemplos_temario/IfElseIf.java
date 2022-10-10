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
public class IfElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ESTRUCTURA    if else if usamos el ejemplo de las calificaciones

        Scanner teclado = new Scanner(System.in);

        int calificacion = teclado.nextInt();

        if (calificacion == 10) {
            System.out.println("Matrícula de Honor");
        } else if (calificacion == 9) {
            System.out.println("Sobresaliente");
        } else if (calificacion >= 7) {
            System.out.println("Notable");
        } else if (calificacion == 6) {
            System.out.println("Bien");
        } else if (calificacion == 5) {

            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

    }

}
