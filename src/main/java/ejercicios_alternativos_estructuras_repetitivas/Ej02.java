/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_alternativos_estructuras_repetitivas;

/**
 *
 * @author Windows10
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     *
     * suma los 10 primeros numeros enteros, usando las tres estruturas
     * repetitivas
     */
    public static void main(String[] args) {
        int numero = 1;
        int resultado = 0;
//        System.out.println("********************************* while**************************** ");
//        while(numero<=10){
//          System.out.println("el resultado es : "+resultado);
//        numero++;
//        resultado=numero+numero;
//        

//        System.out.println("*********************************do while**************************** ");
//        do {
//
//            System.out.println("el resultado es : " + resultado);
//            numero++;
//            resultado = numero + numero;
//
//        } while (numero <= 10);

        System.out.println("********************************for**************************** ");

        for (int i = 0; i <= 10; i++) {

            System.out.println("el resultado es : " + resultado);
            numero++;
            resultado = numero + numero;

        }

    }

}
