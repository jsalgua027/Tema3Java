/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_vico;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EjemplosSwitchRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // si el usuario introduce A , B o C se debe guardar un aleatorio entre 1 y 10

        // si introduce D, guarda aleaorio entre 11 y 25
        // si introduce E. aleatori entre 26 y 33
        // en otro caso , entre 34 y 100
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        int numAleatorio;

        System.out.println("Introduce una letra (A,B,C,D,E)");
        String letraString = teclado.nextLine();
        System.out.println("La letra es  " + letraString);

//        switch (letraString) {
//            case "A","B","C":
//                // Entre 1 y 10
//                numAleatorio = generador.nextInt(10) + 1;
//                System.out.println("El numero aleatorio es = " + numAleatorio);
//                break;
//            case "D":
//                // entre 11 y 25
//                numAleatorio = generador.nextInt(25 - 11 + 1) + 11;
//                System.out.println("El numero aleatorio es = " + numAleatorio);
//                break;
//
//            case "E":
//                //entre 26 y 33
//                numAleatorio = generador.nextInt(33 - 26 + 1) + 26;
//                System.out.println("El numero aleatorio es = " + numAleatorio);
//
//                break;
//
//            default:
//                //entre 34 y 100
//                numAleatorio = generador.nextInt(100 - 34 + 1) + 34;
//                System.out.println("El numero aleatorio es = " + numAleatorio);
//
//        }
        switch (letraString) {
            case "A","B","C" -> {
                // Entre 1 y 10
                numAleatorio = generador.nextInt(10) + 1;

            }
            case "D" -> {
                // entre 11 y 25
                numAleatorio = generador.nextInt(25 - 11 + 1) + 11;

            }

            case "E" -> {
                //entre 26 y 33
                numAleatorio = generador.nextInt(33 - 26 + 1) + 26;

            }

            default -> {
                //entre 34 y 100
                numAleatorio = generador.nextInt(100 - 34 + 1) + 34;

            }

        }
        // imprimimos el resultado
        System.out.println("El numero aleatorio es = " + numAleatorio);

        numAleatorio = switch (letraString) {

            case "A","B","C" ->
                // Entre 1 y 10
                generador.nextInt(10) + 1;

            case "D" ->
                // entre 11 y 25
                generador.nextInt(25 - 11 + 1) + 11;

            case "E" ->
                //entre 26 y 33
                generador.nextInt(33 - 26 + 1) + 26;

            default ->
                //entre 34 y 100
                generador.nextInt(100 - 34 + 1) + 34;

        };

//        // creo un objeto de tipo Random llamado generador
//        // con el constructor de la clase random
//        //genera un numero aleatorio dentro del campo de  enteros
//        numAleatorio = generador.nextInt();
//        System.out.println("El numero aleatorio es : " + numAleatorio);
//        // generar numeros aleatorio entre 0 y 9
//        numAleatorio = generador.nextInt(10);
//        System.out.println("El numero aleatorio es : " + numAleatorio);
//        //generar entre 1 y 19
//        numAleatorio = generador.nextInt(19) + 1;
//        System.out.println("El numero aleatorio es : " + numAleatorio);
//
//        // generar el rango que yo quiera n un ranfo de 12 a 18
//        //nextInt(Mayor - Menor +1))
//        numAleatorio = generador.nextInt(7) + 12;
    }

}
