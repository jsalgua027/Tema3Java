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
public class Ej04 {

    /**
     * @param args the command line arguments
     * 
     * elabora un algoritmo para que lea tantos numeros como queramos hasta qye llegue un numero 0
     * y muestre la suma de todos ellos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int resultado;
        
        do {            
            
            System.out.println("Introduce valores que se sumaran todos, el valor 0 finaliza pedirte valores");
            numero= teclado.nextInt();
            if(numero>0){
            
              resultado=numero+numero;
         
            numero++;
                System.out.println("El resultado de sumar todos los valores es: "+ resultado);
            }else{
            numero=0;
            
            }
           
             
            
        } while (numero!=0);
      //1  System.out.println("El resultado de sumar todos los valores es: "+ resultado);

    }
    
}
