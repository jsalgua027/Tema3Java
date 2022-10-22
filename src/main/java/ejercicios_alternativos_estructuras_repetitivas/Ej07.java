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
public class Ej07 {

    /**
     * @param args the command line arguments
     * 
     * Mostrar la tabla de multiplicar de un numero.Para ello el algoritmo pedira el numero del que se quiera hacer
     * y se mostrara del 1 al 10
     * 
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       int numero;
       int multiplicador=1;
       int resultado;
        System.out.println("Indique de que numero quiere la tabla de multiplicar");
        numero= teclado.nextInt();
        
        for (int i = 0; i <10; i++) {
          
          
            resultado= numero*multiplicador;
              multiplicador++;
                System.out.println(resultado);
        }
        
               
    }
    
}
