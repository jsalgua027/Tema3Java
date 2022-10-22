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
        Random numAleatorio= new Random();
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
        
        int contadorIntentos; // variable para controlar los intentos
        
        int numeroUsuario; // variable para los numeros que mete el usuario
        
        
        do {            
            
            System.out.println(textoMenu);
            opcionMenu= teclado.nextLine();
            if (opcionMenu.equalsIgnoreCase("si")||(opcionMenu.equalsIgnoreCase("no"))){
            
            
             }else{
            
                System.out.println("El dato indicado no es el correcto");
            }
            
            
            
        } while (opcionMenu.equalsIgnoreCase("Si"));
        
        
        
        
        
        
        
        
        
    }

}
