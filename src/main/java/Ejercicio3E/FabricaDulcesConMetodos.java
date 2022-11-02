/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3E;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class FabricaDulcesConMetodos {

    /**
     * @param args the command line arguments
     *
     *
     * 1 metodo mostrar menu prinicpal 2 metodo para leer códigos 3 metodo que
     * filtre el código 4 metodo para leer la metaria prima 5 metod para filtra
     * la materia prima 6 metodo para leer la mano de obra 7 metodo para filtra
     * la mano de obra 8 metodo para calcular el coste de produccion 9 metodo
     * calcular el precio de venta unitario 10 metodo calcular unidades para el
     * beneficio
     */
    private static Scanner teclado = new Scanner(System.in);

    // método para mostrar el menu
    private static void mostarMenu(String aux) {
        System.out.println(aux);

    }

    // método para leer códigos del menu Principal
    public static String leerCodigosMenu() {
        String aux = teclado.nextLine();

        return aux;
    }

    //método para filtra opciones menu principal
    public static boolean flitrarMenuPrincipal(String aux) {

        return aux.equalsIgnoreCase("iniciar");
    }

    //metodo para flitar menu de productos
    
    public static boolean filtrarMenuProductos(String aux){
    
     return aux.equalsIgnoreCase("M1") || aux.equalsIgnoreCase("P1")||
             aux.equalsIgnoreCase("T1")|| aux.equalsIgnoreCase("T2")|| aux.equalsIgnoreCase("M2");
    }
    
    
    
    public static void main(String[] args) {
        //   Scanner teclado = new Scanner(System.in);

        String opcionMenuPrincipal = " ";//bule control del bucle principal y la seleccion del menu del progrma
        String opcionMenuProductos = " ";//Para el control de bucles y la seleccion de productos
        String textoMenuFinalPolvorones = " "; // resultado final de todos los cálculos

        String menuSwith;

        String textoMenuPrincipal = """
                         
                                ***********************La Fabrica De Dulces**************************
                         
                                        Escriba iniciar para comenzar el programa.
                                        
                                        Escriba salir para salir del programa.
                         
                         
                                *********************************************************************
                         """;

        String textoMenuProductos = """
                            ************************La Esteponera*********************
                          M1. Para el cálculo con Mantecados de Limón.
                          P1. Para el cálculo con Polvorones.
                          T1. Para el cálculo con Turrón de Chocolate.
                          T2. Para el cálculo con Turrón Clásico.
                          M2. Para el cálculo con Mazapanes.
                                Escriba salir para abandonar el programa.
                         ***************************************************************
                         """;

        final double PORCENTAJE_COSTE_PRODUCION_M1M2P1 = 0.5;
        final double PORCENATJE_COSTE_PRODUCCION_T1T2 = 0.65;

        final double LIMITE_INFERIOR_MATERIA_PRIMA = 0.1;
        final double LIMITE_SUPERIOR_MATERIA_PRIMA = 1;

        final double LIMITE_INFERIOR_MANO_OBRA = 0.5;
        final double LIMITE_SUPERIOR_MANO_OBRA = 0.9;

        final int BENEFICIO_SUPERAR = 2500;
        // variables para obtener resultados
        double precioMateriaPrimaXUnidad;
        double precioVentaProductoXUnidad;
        double costeProduccionProductoXUnidad;
        double beneficioXUnidad;
        int cantidadUnidadesParaBeneficio;
        double manoObraPorUnidad;

        final String MANTECADOSLIMON = "Mantecados de  Limón";
        final String POLVORONES = "Polvorones";
        final String TURRONCHOCOLATE = "Turrón de Chocolate";
        final String TURRONCLASICO = "Turrón clásico";
        final String MAZAPANES = "Mazapanes";

        do {//bucle del menu inicial ---> si escribe salir termina el bucle
            mostarMenu(textoMenuPrincipal);
          
            opcionMenuPrincipal = leerCodigosMenu();
       

            if (flitrarMenuPrincipal(opcionMenuPrincipal)) {

                do {//bucle menu de productos---> si lo mete erroneo se repite el menu de productos
                    mostarMenu(textoMenuProductos);
                 
                    opcionMenuProductos=leerCodigosMenu();
                    
                    if (filtrarMenuProductos(opcionMenuProductos)) {
                        do { //bucle límite materia prima

                            System.out.println("Indique el precio de la Materia Prima");
                            precioMateriaPrimaXUnidad = teclado.nextDouble();
                            teclado.nextLine();//limpio buffer
                            // si el precio de la materia prima es correcto
                            if (precioMateriaPrimaXUnidad >= LIMITE_INFERIOR_MATERIA_PRIMA && precioMateriaPrimaXUnidad <= LIMITE_SUPERIOR_MATERIA_PRIMA) {

                                do {//bucle limite de mano de obra

                                    System.out.println("indique el precio de la Mano de Obra Por Unidad: ");
                                    manoObraPorUnidad = teclado.nextDouble();
                                    teclado.nextLine();//limpio buffer
                                    // si el coste de mano de obra es el correcto
                                    if (manoObraPorUnidad >= LIMITE_INFERIOR_MANO_OBRA && manoObraPorUnidad <= LIMITE_SUPERIOR_MANO_OBRA) {
                                        //para los productos M1 y T1 costes de produccion
                                        if (opcionMenuProductos.equalsIgnoreCase("M1") || opcionMenuProductos.equalsIgnoreCase("T1")) {

                                            costeProduccionProductoXUnidad = precioMateriaPrimaXUnidad + manoObraPorUnidad;
                                            //para M1 precio venta por unidad
                                            if (opcionMenuProductos.equalsIgnoreCase("M1")) {
                                                precioVentaProductoXUnidad
                                                        = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENTAJE_COSTE_PRODUCION_M1M2P1);
                                                //para T1 precio venta por unidad
                                            } else {
                                                precioVentaProductoXUnidad
                                                        = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENATJE_COSTE_PRODUCCION_T1T2);

                                            }
                                            // para P1 M2  T2 costes de produccion
                                        } else {

                                            costeProduccionProductoXUnidad = precioMateriaPrimaXUnidad + manoObraPorUnidad;
                                            //para P1 y M2 costes de venta por Unidad
                                            if (opcionMenuProductos.equalsIgnoreCase("P1") || opcionMenuProductos.equalsIgnoreCase("M2")) {

                                                precioVentaProductoXUnidad
                                                        = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENTAJE_COSTE_PRODUCION_M1M2P1);
                                                //para T2 cpstes de venta por Unidad
                                            } else {
                                                precioVentaProductoXUnidad
                                                        = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENATJE_COSTE_PRODUCCION_T1T2);

                                            }

                                        }
                                        //beneficios por unidad para todos los productos
                                        beneficioXUnidad = precioVentaProductoXUnidad - costeProduccionProductoXUnidad;

                                        cantidadUnidadesParaBeneficio = (int) Math.ceil(BENEFICIO_SUPERAR / beneficioXUnidad);

                                        textoMenuFinalPolvorones = switch (opcionMenuProductos.toUpperCase()) {
                                            case "M1" ->
                                                MANTECADOSLIMON;
                                            case "P1" ->
                                                POLVORONES;
                                            case "T1" ->
                                                TURRONCHOCOLATE;
                                            case "T2" ->
                                                TURRONCLASICO;
                                            default ->
                                                MAZAPANES;
                                        };

                                        String resultadofinal = """
                                                            Para los  de %s
                                                            -El precio del coste de produccion por unidad es de:   %.2f euros
                                                            -El precio de venta por unidad es de:  %.2f euros
                                                            Sabiendo que el beneficio por unidad es de:  %.2f  euros
                                                            Para llegar a la cantidad de %d euros de beneficio se necesitan vender:  %d unidades
                                                                                   """.formatted(textoMenuFinalPolvorones, costeProduccionProductoXUnidad, precioVentaProductoXUnidad, beneficioXUnidad, BENEFICIO_SUPERAR, cantidadUnidadesParaBeneficio);

                                        System.out.println(resultadofinal);

                                    } else {
                                        System.out.println("El precio de la Mano de Obra Por Unidad es incorrecto");
                                    }

                                } while (!(manoObraPorUnidad >= LIMITE_INFERIOR_MANO_OBRA && manoObraPorUnidad <= LIMITE_SUPERIOR_MANO_OBRA));

                            } else {
                                System.out.println("El precio de la materia prima no es el correcto");
                            }

                        } while (!(precioMateriaPrimaXUnidad >= LIMITE_INFERIOR_MATERIA_PRIMA && precioMateriaPrimaXUnidad <= LIMITE_SUPERIOR_MATERIA_PRIMA));

                    } else {
                        if (!opcionMenuProductos.equalsIgnoreCase("salir")) {//para que no salga  codigo erroneo con salir
                            System.out.println("El codigo de producto es erroneo");
                        }

                    }

                } while (!(opcionMenuProductos.equalsIgnoreCase("M1")
                        || opcionMenuProductos.equalsIgnoreCase("P1")
                        || opcionMenuProductos.equalsIgnoreCase("T1")
                        || opcionMenuProductos.equalsIgnoreCase("T2")
                        || opcionMenuProductos.equalsIgnoreCase("M2")
                        || opcionMenuProductos.equalsIgnoreCase("salir")));

            }

        } while (flitrarMenuPrincipal(opcionMenuPrincipal));
    }

}