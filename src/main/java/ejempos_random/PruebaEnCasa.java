/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejempos_random;

import java.util.Random;

/**
 *
 * @author Windows10
 */
public class PruebaEnCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numeroRand = new Random();

        int aleatorio = numeroRand.nextInt();

        System.out.println("el numero aleatorio es= " + aleatorio);

        System.out.println("**************numero aleatorio entre 0 y 19*************");

        aleatorio = numeroRand.nextInt(20);
        System.out.println("entre 0 y 19 = " + aleatorio);

        System.out.println("**************numero aleatorio entre 1 y 20*************");

        aleatorio = numeroRand.nextInt(20) + 1;

        System.out.println("entre 1 y 20  es= " + aleatorio);

        System.out.println(" *********Numeros aleatoris entre dos rangos*********** ");

        int minimo = 20;
        int maximo = 50;

        aleatorio = numeroRand.nextInt(maximo - minimo + 1) + minimo;

        System.out.println("en 20 y 50 el numero aleatorio es = " + aleatorio);

        System.out.println("generar numeros aleatorios en un array de tamaño indicado");
        System.out.println("El tamaño va ser de 10 y los valores estan entre 1 y 20");
        int tamanio = 10;

        int[] numerosAleatorios = numeroRand.ints(tamanio, 1, 20).toArray();

        for (int i = 0; i < numerosAleatorios.length; i++) {

            System.out.print(numerosAleatorios[i] + " || " );

        }
        // le doy un salto de linea /b para mostralo bien por consola
        System.out.println("/b");

        System.out.println("*************JUGAMOS CON CARACTERES ALEATORIOS*************");

        // de 0 a 25 son los numeros de las letras de la a hasta la z
        char letrasMinusculas = (char) (numeroRand.nextInt(26) + 'a');
        // si queremos que lo haga con las mayusculas ponemos 'A'
        System.out.println("Letras minusculas = " + letrasMinusculas);
        
        
        System.out.println("****** otra forma es generando un String y  usar el metodo charAt");
        // genero el string
        final String LETRAS= "ABCDEFGHIJKLMÑOPQRSTUVWXYZ";
        // genero un numero aleatorio denro del tamaño del String
        
        int indiceLetrasSacar= numeroRand.nextInt(LETRAS.length());
        
        //genero el char con el indice generado del String generado
        
        char letra = LETRAS.charAt(indiceLetrasSacar);
        
        System.out.println("La letra sacada es = " + letra);
        

    }

}
