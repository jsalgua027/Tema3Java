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
public class Ej06 {

    /**
     * @param args the command line arguments
     *
     * hacer un programa que lea una lista de numeros enteros, precedida del
     * numero total de enteros a leer El programa debe de calcular el total de
     * numeros pares y el total de numeros impares y el promedio de todos los
     * numeros
     *
     *
     */
    public static void main(String[] args) {
        double media;
        int tamanioArray;
        int valores = 0;
        int resultado = 0;
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> listaNumerosPares = new ArrayList<>();
        ArrayList<Integer> listaNumerosImpares = new ArrayList<>();

        System.out.println("indica cuantos numeros vas a meter en la lista");
        tamanioArray = teclado.nextInt();

        for (int i = 0; i < tamanioArray; i++) {
            System.out.println("Di los numeros que componen la lista");
            valores = teclado.nextInt();
            listaNumeros.add(valores);

        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) % 2 == 0) {
                listaNumerosPares.add(listaNumeros.get(i));

            } else {
                listaNumerosImpares.add(listaNumeros.get(i));
            }
        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            resultado += listaNumeros.get(i);
        }
        media = resultado / listaNumeros.size();
        System.out.println("El resultado de sumar todos los datos introducidos es: " + resultado + " y la media aritmética es de: " + media);

        System.out.println("La cantidad de numeros pares es de: " + listaNumerosPares.size());

        System.out.println("La cantidad de numeros impares es de: " + listaNumerosPares.size());

    }

}
