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
public class Ej012 {

    /**
     * @param args the command line arguments
     *
     * implementa un algoritmo que permita jugar con el ordenador a acertas
     * numeros. La maquina pensará un nímero entre el 10 y el 20. El jugador
     * tendra tres intentos para adivinarlo El ordenador ira ayudando al jugador
     * indicando si el número introducido por el jugador es mayor o menor al
     * pensado, Si adivina el numero se mostrará un mensajer de enhorabuena y si
     * no entonces se mostrara el numero pensado Una vez finaliza la partida la
     * máquina preguntara si se quiere jugar otra vez. " si " para volver a
     * empezar y "no" para finalizar, si escirbimos otra cosa el programa
     * avisara al usuario para que escriba la opcion correcta
     *
     *
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random numAleatorio = new Random();
        String textoMenu = """
                                                ************************ADIVINA EL NUMERO THE BEST GAME *************
                                                            Teclea   si   para empezar partida 
                                                            Teclea   no  para terminar partida
                                                  
                                                ****************************************************************************************
                          """;
        String opcionMenu = " ";

        //constantes para el numero que piensa 
        final int VALOR_MAXIMO = 20;
        final int VALOR_MINIMO = 10;

        //variables
        int numeroPensadoOrdenador; //numero que tiene que adivinar el usuario

        int contadorIntentos = 0; // variable para controlar los intentos

        int numeroUsuario = 0; // variable para los numeros que mete el usuario

        do {//bucle del menu

            System.out.println(textoMenu);
            opcionMenu = teclado.nextLine();
            if (opcionMenu.equalsIgnoreCase("si")) {

                numeroPensadoOrdenador = numAleatorio.nextInt(VALOR_MAXIMO - VALOR_MINIMO + 1) + VALOR_MINIMO;
                System.out.println("el numero pensado es: " + numeroPensadoOrdenador);
                do {//bucle para los 3 intentos
                    System.out.println("eljiga un numero del 10 al 20, tienes 3 intentos");
                    numeroUsuario = teclado.nextInt();
                    contadorIntentos++;
                    if (numeroUsuario > numeroPensadoOrdenador) { 
                        System.out.println("El indicado es menor al que tienes que adivinar");

                    } else if (numeroUsuario < numeroPensadoOrdenador) {

                        System.out.println("El indicado es mayor al que tienes que adivinar");

                    } else if (numeroUsuario == numeroPensadoOrdenador) {//premio!!
                        System.out.println("Felicidades has acertado el numero");
                    }

                } while (!((contadorIntentos >= 3) || (numeroUsuario == numeroPensadoOrdenador)));
                if (contadorIntentos == 3) {//si no los acierta al finalizar los intentos

                    System.out.println("No lo has acertado,  el numero a adivinar era: " + numeroPensadoOrdenador);
                }
                contadorIntentos = 0;
                teclado.nextLine();//limpio el buffer
            } else if (opcionMenu.equalsIgnoreCase("no")) {
                opcionMenu = "no";

            } else {

                System.out.println("El dato indicado no es el correcto");
                opcionMenu = "si";
            }

        } while (opcionMenu.equalsIgnoreCase("Si"));

    }

}
