/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3E;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class LaFabricaConMetodos {

    /**
     * @param args the command line arguments
     */
    private static Scanner teclado = new Scanner(System.in);
//*************************CONSTANTES A USAR EN LOS METODOS ***********************
    private static final String TEXTO_MENU_PRINCIPAL = """
                         
                                ***********************La Fabrica De Dulces**************************
                         
                                        Escriba iniciar para comenzar el programa.
                                        
                                        Escriba salir para salir del programa.
                         
                         
                                *********************************************************************
                         """;

    private static final String TEXTO_MENU_PRODUCTOS = """
                            ************************La Esteponera*********************
                          M1. Para el cálculo con Mantecados de Limón.
                          P1. Para el cálculo con Polvorones.
                          T1. Para el cálculo con Turrón de Chocolate.
                          T2. Para el cálculo con Turrón Clásico.
                          M2. Para el cálculo con Mazapanes.
                                Escriba salir para abandonar el programa.
                         ***************************************************************
                         """;

    private static final double PORCENTAJE_COSTE_PRODUCION_M1M2P1 = 0.5;
    private static final double PORCENATJE_COSTE_PRODUCCION_T1T2 = 0.65;

    private static final double LIMITE_INFERIOR_MATERIA_PRIMA = 0.1;
    private static final double LIMITE_SUPERIOR_MATERIA_PRIMA = 1.0;

    private static final double LIMITE_INFERIOR_MANO_OBRA = 0.5;
    private static final double LIMITE_SUPERIOR_MANO_OBRA = 0.9;

    private static final int BENEFICIO_SUPERAR = 2500;

    //****************************************** METODOS PARA EL MENU PRINICPAL*************************
    //muestro menu principal
    public static String muestroPidoMenuPrincipal() {
        String opcion;

        System.out.println(TEXTO_MENU_PRINCIPAL);
        opcion = teclado.nextLine();

        return opcion;
    }

    //valido la opcion 
    public static boolean esValidaOpcionMenuPricipal(String opcion) {

        return opcion.equalsIgnoreCase("salir") || opcion.equalsIgnoreCase("iniciar");
    }

    //pido la opcion 
    public static String pidoOpcionMenu() {
        String opcion;
        do {
            opcion = muestroPidoMenuPrincipal();
        } while (!esValidaOpcionMenuPricipal(opcion));

        return opcion;
    }

    //*******************************************************METODOS PARA PRODUCTOS
    //muestro menu productos
    public static String muestroPidoMenuProductosl() {
        String opcion;

        System.out.println(TEXTO_MENU_PRODUCTOS);
        opcion = teclado.nextLine();

        return opcion;
    }
//es valido el código Producto

    public static boolean esCodigoProductosValido(String codigo) {

        return (codigo.equalsIgnoreCase("M1")
                || codigo.equalsIgnoreCase("P1")
                || codigo.equalsIgnoreCase("T1")
                || codigo.equalsIgnoreCase("T2")
                || codigo.equalsIgnoreCase("M2")
                || codigo.equalsIgnoreCase("salir"));
    }

    //pido opcion productos
    public static String pidoMenuProductos() {
        String opcion;

        do {
            opcion = muestroPidoMenuProductosl();

        } while (!esCodigoProductosValido(opcion));
        return opcion;
    }
    
    //***********************************************************MATERIA PRIMA

    //metodo para leer materia prima 
    public static double leerMateriaPrima() {
        double num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce la Materia Prima");
            try {

                num = teclado.nextDouble();
                repetir = false;
              

            } catch (InputMismatchException ime) {
                System.out.println("el dato introducido es erroneo");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }
// si entra dentro del rango es valido

    public static boolean filtroMateriaPrima(double materiaPrima) {

        return (materiaPrima >= LIMITE_INFERIOR_MATERIA_PRIMA && materiaPrima <= LIMITE_SUPERIOR_MATERIA_PRIMA);
    }

    //pido materia prima
    public static double pidoMateriaPirma() {
        double materiaPrima;
      
        do {
            materiaPrima = leerMateriaPrima();
          
        } while (!filtroMateriaPrima(materiaPrima));

        return materiaPrima;

    }
    
    
    //**************************************************************MANO DE OBRA**************************************

    // método para leer mano de obra
    public static double leerManoObra() {
        double num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce la Mano de obra");
            try {

                num = teclado.nextDouble();
                break;

            } catch (InputMismatchException ime) {
                System.out.println("el dato introducido es erroneo");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }

    //metodo para rango de mano de obra
    public static boolean filtroManoObra(double manoObra) {

        return (manoObra >= LIMITE_INFERIOR_MANO_OBRA && manoObra <= LIMITE_SUPERIOR_MANO_OBRA);
    }

    // pido mano de obra
    public static double pidoManoObra() {
        double manoObra;
        
        do {
            manoObra = leerManoObra();
        

        } while (!filtroManoObra(manoObra));

        return manoObra;

    }

    //***********************************************CALCULOS*************************************************
    //metodo para calcular costes de produccion
    public static double costesProduccion(double precioMateriaPrima, double manoObra) {
        double costesProduccion;

        costesProduccion = precioMateriaPrima + manoObra;

        return costesProduccion;
    }

    public static double precioVentaXUnidad(String opcion, double costeProduccion) {
        double precioVentaXUnidad;

        if (opcion.equalsIgnoreCase("M1") || opcion.equalsIgnoreCase("M2") || opcion.equalsIgnoreCase("P1")) {

            precioVentaXUnidad = costeProduccion + (costeProduccion * PORCENTAJE_COSTE_PRODUCION_M1M2P1);

        } else {
            precioVentaXUnidad = costeProduccion + (costeProduccion * PORCENATJE_COSTE_PRODUCCION_T1T2);

        }

        return precioVentaXUnidad;
    }
    // calculo unidades para el benficio

    public static int unidadesParaBeneficio(double precioVentaXUNidad, double costeProduccion) {
        double beneficioXUnidad;
        int unidades;
        beneficioXUnidad = precioVentaXUNidad - costeProduccion;
        unidades = (int) Math.ceil(BENEFICIO_SUPERAR / beneficioXUnidad);
        return unidades;
    }

    public static void main(String[] args) {
        String opcion = "";
        String codigoProducto = "";
        double materiaPrima = 0;
        double manoDeObra = 0;
        double costesProduccion = 0;
        double costesVentaXUnidad = 0;
        int cantidadUnidadesBeneficio = 0;
        String textoMenuFinalPolvorones = " "; // resultado final de todos los cálculos
        final String MANTECADOSLIMON = "Mantecados de  Limón";
        final String POLVORONES = "Polvorones";
        final String TURRONCHOCOLATE = "Turrón de Chocolate";
        final String TURRONCLASICO = "Turrón clásico";
        final String MAZAPANES = "Mazapanes";

        do {

            opcion = pidoOpcionMenu();
            if (!opcion.equalsIgnoreCase("salir")) {
                codigoProducto = pidoMenuProductos();
                if (!codigoProducto.equalsIgnoreCase("salir")) {
                    materiaPrima = pidoMateriaPirma();
                    manoDeObra = pidoManoObra();
                    if (codigoProducto.equalsIgnoreCase("M1") || codigoProducto.equalsIgnoreCase("T1")) {

                        costesProduccion = costesProduccion(materiaPrima, manoDeObra);
                        if (codigoProducto.equalsIgnoreCase("M1")) {
                            costesVentaXUnidad = precioVentaXUnidad(codigoProducto, costesProduccion);
                        } else {
                            costesVentaXUnidad = precioVentaXUnidad(codigoProducto, costesProduccion);
                        }
                    } else {
                        costesProduccion = costesProduccion(materiaPrima, manoDeObra);
                        if (codigoProducto.equalsIgnoreCase("P1") || codigoProducto.equalsIgnoreCase("M2")) {
                            costesVentaXUnidad = precioVentaXUnidad(codigoProducto, costesProduccion);

                        } else {

                            costesVentaXUnidad = precioVentaXUnidad(codigoProducto, costesProduccion);
                        }
                    }
                    //calculo unidades para beneficio
                    cantidadUnidadesBeneficio = unidadesParaBeneficio(costesVentaXUnidad, costesProduccion);

                    textoMenuFinalPolvorones = switch (codigoProducto.toUpperCase()) {
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
                                                             Para llegar a la cantidad de %d euros de beneficio se necesitan vender:  %d unidades
                                                           
                                                                                   """.formatted(textoMenuFinalPolvorones, costesProduccion, costesVentaXUnidad, BENEFICIO_SUPERAR, cantidadUnidadesBeneficio);

                    System.out.println(resultadofinal);
                    teclado.nextLine();//limpio buffer
                    
                } else {
                    opcion = "salir";
                }

            }

        } while (opcion.equalsIgnoreCase("iniciar"));

    }

}
