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
public class Ej01 {

    /**
     * @param args the command line arguments
     *
     * Crear un algoritmo que lea una variable entera mes y compruebe si el
     * valor corresponde a un mes de 30,31 o 28 dias Se mostrará ademas el
     * nombre del mes. Se debe de comprobar el valor introducido esté
     * comprendido entre 1 y 12. en caso contrario se solicitara de nuevo el
     * dato mes.
     *
     *
     *
     * Número	Mes	Duración 1 Enero	31 días 2 Febrero	28 días o 29 en año
     * bisiesto 3	Marzo 31 días 4	Abril	30 días 5 Mayo	31 días 6 Junio	30 días 7
     * Julio	31 días 8 Agosto	31 días 9 Septiembre	30 días 10 Octubre	31 días 11
     * Noviembre	30 días 12 Diciembre	31 días
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        int anio;
        int controlBucle;
        Scanner teclado = new Scanner(System.in);

        String enero = "Enero tiene 31 Dias";
        String febrero = "Febrero tienes 28 dias o 29 en año bisisesto";
        String marzo = "Marzo tiene 31 Dias";
        String abril = "Abril tiene 30 Dias";
        String mayo = "Mayo tiene 31 Dias";
        String junio = "Junio tiene 30 Dias";
        String julio = "Julio tiene 31 Dias";
        String agosto = "Agosto tiene 31 Dias";
        String septiembre = "Septiembre tiene 30 Dias";
        String octubre = "Octubre tiene 31 Dias";
        String noviembre = "Noviembre tiene 30 Dias";
        String diciembre = "Diciembre tiene 31 Dias";

        String menuGeneral = """
                                   **************************************************************************************
                                                                    bienvenido al contador de días
                                   1. Para iniciar el programa
                                   2. Para salir del programa
                                  
                           
                                  ***************************************************************************************
                          """;
        do {
            System.out.println(menuGeneral);

            controlBucle = teclado.nextInt();

            if (controlBucle == 1) {
                System.out.println("Introduce el numero de mes: ");

                mes = teclado.nextInt();
                if (mes > 0 && mes <= 12) {

                    switch (mes) {
                        case 1, 3, 5, 7, 8,10,12:

                            switch (mes) {
                                case 1 ->
                                    System.out.println(enero);
                                case 3 ->
                                    System.out.println(marzo);
                                case 5 ->
                                    System.out.println(mayo);
                                case 7 ->
                                    System.out.println(julio);
                                case 8 ->
                                    System.out.println(agosto);
                                case 10 ->
                                    System.out.println(octubre);
                                default ->
                                    System.out.println(diciembre);
                            }

                            break;

                        case 4, 6, 9,11:

                            switch (mes) {
                                case 4 ->
                                    System.out.println(abril);
                                case 6 ->
                                    System.out.println(julio);
                                case 9 ->
                                    System.out.println(septiembre);

                                default ->
                                    System.out.println(noviembre);
                            }

                            break;
                        default:
                            System.out.println("febrero es una mes especial, indica el año: ");
                            anio = teclado.nextInt();

                            if ((anio % 4 == 0) &&((anio % 100 != 0) || (anio % 400 == 0)) ) {
                                System.out.println("El año es bisiesto por lo tanto febrero tendrá 29 días");

                            } else {
                                System.out.println("El año no es bisiesto por lo tanto febrero tendá 28 días");
                            }

                    }

                } else {
                    System.out.println("El numero de mes es incorrecto");

                }

                controlBucle = 1;

            }

        } while (controlBucle != 2);

    }

}
