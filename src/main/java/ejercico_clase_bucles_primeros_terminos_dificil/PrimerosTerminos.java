/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico_clase_bucles_primeros_terminos_dificil;

/**
 *
 * @author nacho
 */
public class PrimerosTerminos {

    /**
     * @param args the command line arguments
     *
     * realiza un programa que imprima por consola los primeros 35 terminos
     * sabiendo que los dos primeros son 0 y 1 el resto es fn= fn-1 +fn-2;
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = 0;
        int numero2 = 1;
        int resultado;

//        for (int i = 0; i <= 35; i++) {
//
//            if (numero1 == 0) {
//                System.out.println(numero1);
//                numero1++;
//            } else if (numero2 == 1) {
//                numero1++;
//                System.out.println(numero2);
//            } else if ((numero1 != 0) || (numero2 != 1)) {
//
//                resultado = numero1+numero2;
//                System.out.println(resultado);
//                numero1++;
//            }

            // forma correcta de hacerlo
            int fn1=1;
            int fn=0;
            int fn2=0;
            
            System.out.println(fn2+" - "+ fn1 +" - ");
            
            for (int i = 2; i < 35; i++) {
                //calculo el termino que toca
                fn=fn1+fn2;
                // actualizo las dos anteriores para poder calcular el siguente
                fn2=fn1;
                fn1=fn;
                
                // imprimo el termino
                System.out.println(fn+" - ");
                
            }
                    
            
        }

    }


