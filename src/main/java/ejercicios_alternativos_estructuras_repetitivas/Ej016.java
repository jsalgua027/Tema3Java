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
public class Ej016 {

    /**
     * @param args the command line arguments Una cadena de tiendas de
     * autoservicio cuenta con sucursales en C ciudades diferenres del pais En
     * cada ciudad cuenta con T tiendas y cada tienda cuenta con N empleados,
     * asimismo, cada una registra lo que vendido en cada ciudad y cuento
     * recaudó la cadena en un solo día
     *
     * Realiza un algoritmo que permita introducir un día lo que vendio cada
     * empleado de cada tienda de cada ciudad y saber las ventas totales por
     * tienda, ciudad y totales-
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroTiendas;
        int numeroCiudades;
        int numeroEmpleados;
        double vendidoPorEmpleado = 0;
        double ventaTotalempleados = 0;
        double vendidoPorTienda = 0;
        double ventasTotalesTienda = 0;
        double vendidoPorCiudad = 0;
        double ventasTotalesCiudad = 0;
        double totales = 0;
        int opcionMenu;

        String textoMenu = """
                        
                                    1.Para introducir las ventas por empleado.
                                     
                                    2.Para salir del programa.
                        
                        
                                   """;

        do {
            System.out.println(textoMenu);
            opcionMenu = teclado.nextInt();

            if (opcionMenu == 1) {
//            
//            System.out.println("Introduce lo vendio por el empleado");
//            vendidoPorEmpleado=teclado.nextDouble();
//            vendidoPorTienda=vendidoPorEmpleado++;
//            vendidoPorCiudad=vendidoPorTienda++;
//            totales= vendidoPorCiudad++;

//       
                System.out.println("Indica el numero de ciudades");
                numeroCiudades = teclado.nextInt();
                for (int i = 0; i < numeroCiudades; i++) {
                    System.out.println("Inidica el numero de tiendas");
                    numeroTiendas = teclado.nextInt();
                    ventasTotalesCiudad = +ventasTotalesTienda;
                    for (int j = 0; j < numeroTiendas; j++) {
                        System.out.println("Indica el numero de vendedores");
                        numeroEmpleados = teclado.nextInt();
                        ventasTotalesTienda = +ventaTotalempleados;
                        for (int k = 0; k < numeroEmpleados; k++) {
                            System.out.println("¿Cuanto vendio el empleado");
                            vendidoPorEmpleado = teclado.nextDouble();
                            ventaTotalempleados = +vendidoPorEmpleado;
                            // ventaTotalempleados=+ventaTotalempleados;
                        }
                        //ventasTotalesTienda=+ventasTotalesTienda;
                    }
                    //ventasTotalesCiudad=+ventasTotalesCiudad;
                }

                /**
                 * FIBONACHI TUUUUUUUS MUERTOS!!!!!!!!!!!!!!!!!!!!!!
                 *  //calculo el termino que toca
                 * fn=fn1+fn2; 
                 * // actualizo las dos anteriores para poder calcular el siguente
                 * 
                 * fn2=fn1;
                 * fn1=fn;
                 *
                 *
                 * esperando posible solucion
                 */
                totales = ventasTotalesCiudad + ventasTotalesTienda;
                System.out.println("las ventas totales de la tienda: " + ventasTotalesTienda + " Las de ciudad es : " + ventasTotalesCiudad + " Las totales:  " + totales);

            }

        } while (opcionMenu == 1);

    }

}
