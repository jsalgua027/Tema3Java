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
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ESTRUCTURA IF  solo se muestra el mensaje si se cumplpe la condición
        Scanner teclado=new Scanner(System.in);
        System.out.println("Inserte la calificación?");
        int calificacion=teclado.nextInt();
        if (calificacion == 10) {
            System.out.println("Matrícula de Honor");

        }

    }

}
