/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_seleccion;

import java.util.Scanner;

/**
 *
 * 5.- Implementa y completa el siguiente programa. Ten en cuenta que cuando se
 * entre en cada una de las opciones (1,2 o 3) el programa realice su función.
 * Esto es, si se selecciona la opción 1, el programa debe entrar en la parte de
 * calcular el área de un cuadrado y debe solicitar los dos lados y mostrar el
 * resultado. Así con el resto de opciones.
 *
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            //area de un cuadrado es lado por lado siendo sus lados iguales 
            double ladoCuadrado;
            double resultadoCuadrado;
            System.out.println("Indique el lado del cuadrado");
            ladoCuadrado = entrada.nextDouble();
            resultadoCuadrado = Math.pow(ladoCuadrado, 2);
            System.out.println("El área del cuadrado es= " + resultadoCuadrado);
        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                // el area de cualquier trinagulo es (base*altura)/2
                double base;
                double altura;
                double resultadoTriangulo;
                System.out.println("Indique la altura del triangulo");
                altura = entrada.nextDouble();
                System.out.println("Indique la base del triangulo");
                base = entrada.nextDouble();
                resultadoTriangulo = (base * altura) / 2;
                System.out.println("El área del triangulo es= " + resultadoTriangulo);
            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo...");
                    //area circulo es Pi*r al cuadrado
                    double radioCirculo;
                    double resultadoCirculo;
                    System.out.println("Indique el radio del circulo");
                    radioCirculo = entrada.nextDouble();
                    resultadoCirculo = Math.pow(radioCirculo, 2) * Math.PI;
                    System.out.println("El área del circulo es= " + resultadoCirculo);
                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }

        }

    }
}
