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
public class Ej010 {

    /**
     * @param args the command line arguments
     *
     *
     *
     * crea un algoritmo para clacular el salario semanal de unos empleados a
     * los que se le paga 15 euros la hora si no superan las 35 horas. Cada hora
     * por encima de 35 se considera extra y se paga a 22 euros la hora.
     *
     * el programa pide las horas dewl trabajador y devuelve el salario que se
     * le debe de pagar el programa debeb de preguntar si calculamos otro
     * salario si se escibe "s", si el usuario pone las horas negativas el
     * programa automaticamente las considerara horas positivas
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String salidaBucle = "";
        String textoMenu = """
                                      Para calcular otro seueldo marque:  s   
                                      Para salir marque cualquier otra letra    
                          
                         """;

        final int PRECIO_HORA_NORMAL = 15; // precio euros por hora
        final int PRECIO_HORA_EXTRA = 22;
        final int HORAS_MAXIMO = 35; // maximo de horas sin ser extras 
        int cantidadHoras = 0;
        int sueldoTotal = 0;
        int sueldoHorasExtra = 0;
        int cantidadHorasExtra;

        do {
            System.out.println("Indique la cantidad total de horas trabajas por el empleado");
            cantidadHoras =Math.abs(teclado.nextInt()); 

            sueldoTotal = (cantidadHoras > 35)
                    ? (((cantidadHoras - HORAS_MAXIMO) * PRECIO_HORA_EXTRA) + (HORAS_MAXIMO * PRECIO_HORA_NORMAL))
                    : (cantidadHoras * PRECIO_HORA_NORMAL);

            System.out.println("El sueldo del trabajador seria de: " + sueldoTotal + " euros");
            teclado.nextLine();
            System.out.println(textoMenu);
            salidaBucle = teclado.nextLine();
        } while (salidaBucle.equalsIgnoreCase("s"));

    }

}
