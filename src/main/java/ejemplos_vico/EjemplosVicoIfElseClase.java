/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_vico;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EjemplosVicoIfElseClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = teclado.nextLine();

        System.out.println("Intoduce una letra a buscar");
        String letraBuscar = teclado.nextLine();

        //si la letra esta contenida en el  nombre, mostrar
        //el numero de carateres que tiene le nombre y el numero de posicion
        //donde esta la letra
        //En otro caso, mostrar si el número de letras del nombre es par o impar
        //********************************************************************
//         opcion básica boolean letraContenida=nombre.contains(letraBuscar);
//        
//        if (letraContenida== true){
//            
//        }
        int posicion = 0;

        // version1
        if (nombre.contains(letraBuscar)) {

            //que me diga temaño de la cadena
            System.out.println("el numero de caracteres es = " + nombre.length());
            //posición donde esta la letra
            posicion = nombre.indexOf(nombre);
            System.out.println("la posición de la letra es =" + posicion);

        } else {

            if (nombre.length() % 2 == 0) {//si el número de letras del string es par

                System.out.println("El mumero de caracteres es par");
            } else {
                System.out.println("El numero de caracteres es impar");
            }

        }

        // version 2 if else if 
        if (nombre.contains(letraBuscar)) {

            //que me diga temaño de la cadena
            System.out.println("el numero de caracteres es = " + nombre.length());
            //posición donde esta la letra
            posicion = nombre.indexOf(nombre);
            System.out.println("la posición de la letra es =" + posicion);

        } else if (nombre.length() % 2 == 0) {//si el número de letras del string es par

            System.out.println("El mumero de caracteres es par");
        } else {
            System.out.println("El numero de caracteres es impar");
        }
        
        // version 3 con operador ternario
        if(nombre.contains(letraBuscar)){
            
            //que me diga temaño de la cadena
            System.out.println("el numero de caracteres es = "+ nombre.length());
            //posición donde esta la letra
            posicion = nombre.indexOf(nombre);
            System.out.println("la posición de la letra es =" + posicion);
        
        }else{
        
            
        
            String textoResultado =(nombre.length()%2==0)? 
                    "El mumero de caracteres es par":"El numero de caracteres es impar";
            System.out.println(textoResultado);
            
        }
        
        System.out.println("adios"+ posicion);

    }

}
