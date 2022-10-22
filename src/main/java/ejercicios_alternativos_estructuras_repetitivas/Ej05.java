/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_alternativos_estructuras_repetitivas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     *
     *
     * lle una serie de numeros y calcular la media aritemtica, hasta que llegue
     * a cero
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList();

        int numero;
        int resultado = 0;

        do {

            System.out.println("Introduce valores que se sumaran todos, el valor 0 finaliza pedirte valores");
            numero = teclado.nextInt();
            if (numero > 0) {

                listaNumeros.add(numero);

            } else {
                numero = 0;

            }

        } while (numero != 0);

        for (int i = 0; i < listaNumeros.size(); i++) {
            resultado += listaNumeros.get(i);
        }
           double media= resultado/listaNumeros.size();
        System.out.println("El resultado de sumar todos los datos introducidos es: " + resultado+ " y la media aritmética es de: " + media);
    }

}
