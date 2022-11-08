/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3B_la_esteponera;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows10
 */
public class LaEsteponeraMejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // constantes 

        final double MANOBRA_POR_UNIDAD_M1T1 = 0.15;
        final double MANOBRA_POR_UNIDAD_M2T2P1 = 0.22;

        final double PORCENTAJE_COSTE_PRODUCION_M1M2P1 = 0.5;
        final double PORCENATJE_COSTE_PRODUCCION_T1T2 = 0.65;

        final double LIMITE_INFERIOR = 0.1;
        final double LIMITE_SUPERIOR = 1;

        final String MANTECADOSLIMON = "Mantecados de  Limón";
        final String POLVORONES = "Polvorones";
        final String TURRONCHOCOLATE = "Turrón de Chocolate";
        final String TURRONCLASICO = "Turrón clásico";
        final String MAZAPANES = "Mazapanes";

        String textoMenuFinal;

        final int BENEFICIO_SUPERAR = 2500;
        //variables para realizar los  calculos
        double precioMateriaPrimaXUnidad;
        double costeProduccionProductoXUnidad;
        double precioVentaProductoXUnidad;
        double beneficioXUnidad;
        int cantidadUnidadesParaBeneficio;

        //variable para el menu Switch
        String menuSwitch;

        //String textblock para mostrar por JOptions
        String textoMenu = """
                            ************************La Esteponera*********************
                          M1. Para el cálculo con Mantecados de Limón
                          P1. Para el cálculo con Polvorones
                          T1. Para el cálculo con Turrón de Chocolate
                          T2. Para el cálculo con Turrón Clásico
                          M2. Para el cálculo con Mazapanes
                         
                         ***************************************************************
                         """;

        menuSwitch = JOptionPane.showInputDialog(textoMenu);
        switch (menuSwitch.toUpperCase()) {
            case "M1" ,"M2", "P1","T1","T2" -> {
                precioMateriaPrimaXUnidad = Double.parseDouble(JOptionPane.showInputDialog("Indique el precio de la Materia prima"));
                // si el precio de la materia prima es correcto
                if (precioMateriaPrimaXUnidad >= LIMITE_INFERIOR && precioMateriaPrimaXUnidad <= LIMITE_SUPERIOR) {
                    if (menuSwitch.equalsIgnoreCase("M1") || menuSwitch.equalsIgnoreCase("T1")) {

                        costeProduccionProductoXUnidad = precioMateriaPrimaXUnidad + MANOBRA_POR_UNIDAD_M1T1;
                        if (menuSwitch.equalsIgnoreCase("M1")) {
                            precioVentaProductoXUnidad
                                    = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENTAJE_COSTE_PRODUCION_M1M2P1);
                        } else {
                            precioVentaProductoXUnidad
                                    = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENATJE_COSTE_PRODUCCION_T1T2);

                        }

                    } else {

                        costeProduccionProductoXUnidad = precioMateriaPrimaXUnidad + MANOBRA_POR_UNIDAD_M2T2P1;
                        if (menuSwitch.equalsIgnoreCase("P1") || menuSwitch.equalsIgnoreCase("M2")) {

                            precioVentaProductoXUnidad
                                    = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENTAJE_COSTE_PRODUCION_M1M2P1);

                        } else {
                            precioVentaProductoXUnidad
                                    = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENATJE_COSTE_PRODUCCION_T1T2);

                        }

                    }

                    beneficioXUnidad = precioVentaProductoXUnidad - costeProduccionProductoXUnidad;

                    cantidadUnidadesParaBeneficio = (int) Math.ceil(BENEFICIO_SUPERAR / beneficioXUnidad);

                    textoMenuFinal = switch (menuSwitch.toUpperCase()) {
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
                                                                                   """.formatted(textoMenuFinal, costeProduccionProductoXUnidad, precioVentaProductoXUnidad, beneficioXUnidad, BENEFICIO_SUPERAR, cantidadUnidadesParaBeneficio);

                    JOptionPane.showMessageDialog(null, resultadofinal);

                } else {
                    JOptionPane.showMessageDialog(null, "El precio de la Materia Prima no es correcto");
                }
            }

            //si la opcion elegida del menu es incorrecta
            default ->
                JOptionPane.showMessageDialog(null, "opcion incorrecta");
        }
    }

}
