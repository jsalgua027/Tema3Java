/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_alternativos_estructuras_repetitivas;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ej013 {

    /**
     * @param args the command line arguments
     *
     * Un banco establece que la clave secreta para acceso a sus cajeros
     * automaticos debe ser un número de 4 dígitos, tales que ninguno de ellos
     * se repita y que la suma de los dos dígitos intermedios sea impar.
     * Escribir un programa que permita introducir los cuatro digitos y que
     * compruebe que si los digitos introducidos forman una clave valida
     */
    public static void main(String[] args) {
        int codigo1;
        int codigo2;
        int codigo3;
        int codigo4;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer digito del 1 al 9");
        codigo1 = teclado.nextInt();
        System.out.println("Introduce el segundo digito del 1 al 9");
        codigo2 = teclado.nextInt();
        if (codigo1 != codigo2) {
            System.out.println("Introduce el tercer digito del 1 al 9");
            codigo3 = teclado.nextInt();
            if ((codigo1 != codigo3) && (codigo2 != codigo3)) {
                if (!((codigo2 + codigo3) % 2 == 0)) {
                    System.out.println("Introduce el cuarto dígito");
                    codigo4 = teclado.nextInt();

                    if ((codigo1 != codigo4)&& (codigo2 != codigo4) && (codigo3 != codigo4)) {

                        System.out.println("La clave es correcta " + codigo1 + codigo2 + codigo3 + codigo4);
                    } else {

                        System.out.println("se repite el digito cuatro");
                    }

                } else {

                    System.out.println("La suma de los digitos intermedios es numero par; No vale");
                }

            } else {

                System.out.println("No se puede repetir tampoco el tercer dígito");
            }

        } else {

            System.out.println("no se puede repetir dígito");
        }

    }

}
