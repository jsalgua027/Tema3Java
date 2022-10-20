/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio3B;

import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class LaEsteponera {

    /**
     * @param args the command line arguments
     *
     * Ya se van acercando las Navidades y en muchos stands de algunos
     * supermercados se empiezan a ver los surtidos de dulces navideños que
     * tanto gustan a unos y que otros no pueden soportar. * La fábrica de
     * dulces "La Esteponera Turronera" produce algunos de estos manjares con
     * los siguientes códigos: M1 (Mantecados de Limón), P1 (Polvorones), T1
     * (Turrón de chocolate), T2 (Turrón clásico) y M2 (Mazapanes).
     *
     * Cada especialidad tiene un coste de producción que se calcula según la
     * materia prima gastada y la mano de obra empleada en producir una unidad
     * (coste producción = materia prima + mano de obra). El coste de la mano de
     * obra para producir unidades con código M1 y T1 supone 0.15€; para los que
     * tienen código M2, T2 y P1, supone 0.22€.
     *
     * Además, cada producto tiene un precio de venta que se calcula en función
     * del coste de producción. Hay que tener en cuenta lo siguiente:
     *
     * Artículos M1, M2 y P1. Precio de venta unitario = coste de producción +
     * 50 % del coste de producción. Resto de artículos. Precio de venta
     * unitario = coste de producción + 65 % del coste de producción
     *
     * La fábrica necesita un programa que realice algunos cálculos para ver si
     * es rentable vender un tipo de producto. El programa debe solicitar el
     * código de un dulce (si el código no es válido, el programa termina
     * informando de que no existe el código introducido) y el precio de la
     * materia prima que se gasta en fabricar una unidad de ese tipo (siempre
     * entre 0.1€ y 1€, en otro caso el programa terminará indicando que el
     * precio de la materia prima no es correcto). Se debe mostrar el coste de
     * producción unitario y precio de venta unitario. Además debe calcular y
     * mostrar el número de unidades a producir para que haya un beneficio de al
     * menos 2500€.
     *
     * Todas las entradas y salidas de datos deben hacerse usando JOptionPane.
     * Limita la salida a dos decimales en los casos necesarios.
     *
     * Sube el proyecto con el resultado en formato zip.
     *
     *
     */
    public static void main(String[] args) {
        // constantes 

        final double MANOBRAPORUNIDADM1T1 = 0.15;
        final double MANOBRAPORUNIDADM2T2P1 = 0.22;

        final double PORCENTAJECOSTEPRODUCIONM1M2P1 = 0.5;
        final double PORCENATJECOSTEPRODUCCIONT1T2 = 0.65;

        final double LIMITE_INFERIOR = 0.1;
        final double LIMITE_SUPERIOR = 1;

        final String MANTECADOSLIMON = "Mantecados de  Limón";
        final String POLVORONES = "Polvorones";
        final String TURRONCHOCOLATE = "Turrón de Chocolate";
        final String TURRONCLASICO = "Turrón clásico";
        final String MAZAPANES = "Mazapanes";

        String textoMenuFinal;

        final int BENEFICIOSUPERAR = 2500;
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
        //Le facilito al usuario que no se preocupe de meter mayusculas o minusculas
        switch (menuSwitch.toUpperCase()) {
            case "M1" -> {
                precioMateriaPrimaXUnidad = Double.parseDouble(JOptionPane.showInputDialog("Indique el precio de la Materia prima"));
                // si el precio de la materia prima es correcto
                if (precioMateriaPrimaXUnidad >= LIMITE_INFERIOR && precioMateriaPrimaXUnidad <= LIMITE_SUPERIOR) {
                    // coste de produccion unitario
                    costeProduccionProductoXUnidad = precioMateriaPrimaXUnidad + MANOBRAPORUNIDADM1T1;
                    // precio de venta por unidad
                    precioVentaProductoXUnidad
                            = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENTAJECOSTEPRODUCIONM1M2P1);
                    //obtengo el beneficio por unidad vendida
                    beneficioXUnidad = precioVentaProductoXUnidad - costeProduccionProductoXUnidad;
                    // como no se puede fabricar media unidades redondeo hacia arriba
                    cantidadUnidadesParaBeneficio = (int) Math.ceil(BENEFICIOSUPERAR / beneficioXUnidad);
                    //variable para mostrar resultados
                    String resultadofinal = """
                                                            Para los Mantecados de Limón
                                                            -El precio del coste de produccion por unidad es de:   %.2f euros
                                                            -El precio de venta por unidad es de:  %.2f euros
                                                            Sabiendo que el beneficio por unidad es de:  %.2f  euros
                                                            Para llegar a la cantidad de 2500 euros de beneficio se necesitan vender:  %d unidades
                                                                                   """.formatted(costeProduccionProductoXUnidad, precioVentaProductoXUnidad, beneficioXUnidad, cantidadUnidadesParaBeneficio);

                    JOptionPane.showMessageDialog(null, resultadofinal);
                    //si el precio de la materia prima se sale de rango
                } else {
                    JOptionPane.showMessageDialog(null, "El precio de la Materia Prima no es correcto");
                }
            }
            case "P1" -> {
                precioMateriaPrimaXUnidad = Double.parseDouble(JOptionPane.showInputDialog("Indique el precio de la Materia prima"));
                // si el precio de la materia prima es correcto
                if (precioMateriaPrimaXUnidad >= LIMITE_INFERIOR && precioMateriaPrimaXUnidad <= LIMITE_SUPERIOR) {
                    // coste de produccion unitario
                    costeProduccionProductoXUnidad = precioMateriaPrimaXUnidad + MANOBRAPORUNIDADM2T2P1;
                    // precio de venta por unidad
                    precioVentaProductoXUnidad
                            = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENTAJECOSTEPRODUCIONM1M2P1);
                    //obtengo el beneficio por unidad vendida
                    beneficioXUnidad = precioVentaProductoXUnidad - costeProduccionProductoXUnidad;
                    // como no se puede fabricar media unidades redondeo hacia arriba
                    cantidadUnidadesParaBeneficio = (int) Math.ceil(BENEFICIOSUPERAR / beneficioXUnidad);
                    //variable para mostrar resultados
                    String resultadofinal = """
                                                            Para los Polvorones
                                                            -El precio del coste de produccion por unidad es de:   %.2f euros
                                                            -El precio de venta por unidad es de:  %.2f euros
                                                            Sabiendo que el beneficio por unidad es de:  %.2f  euros
                                                            Para llegar a la cantidad de 2500 euros de beneficio se necesitan vender:  %d unidades
                                                                                   """.formatted(costeProduccionProductoXUnidad, precioVentaProductoXUnidad, beneficioXUnidad, cantidadUnidadesParaBeneficio);

                    JOptionPane.showMessageDialog(null, resultadofinal);
                    //si se sale fuera de rango
                } else {
                    JOptionPane.showMessageDialog(null, "El precio de la Materia Prima no es correcto");
                }
            }
            case "T1" -> {
                precioMateriaPrimaXUnidad = Double.parseDouble(JOptionPane.showInputDialog("Indique el precio de la Materia prima"));
                // si el precio de la materia prima es correcto
                if (precioMateriaPrimaXUnidad >= LIMITE_INFERIOR && precioMateriaPrimaXUnidad <= LIMITE_SUPERIOR) {
                    // coste de produccion unitario
                    costeProduccionProductoXUnidad = precioMateriaPrimaXUnidad + MANOBRAPORUNIDADM1T1;
                    // precio de venta por unidad
                    precioVentaProductoXUnidad
                            = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENATJECOSTEPRODUCCIONT1T2);
                    //obtengo el beneficio por unidad vendida
                    beneficioXUnidad = precioVentaProductoXUnidad - costeProduccionProductoXUnidad;
                    // como no se puede fabricar media unidades redondeo hacia arriba
                    cantidadUnidadesParaBeneficio = (int) Math.ceil(BENEFICIOSUPERAR / beneficioXUnidad);
                    String resultadofinal = """
                                                            Para los Mantecados de Turrón de chocolate
                                                            -El precio del coste de produccion por unidad es de:   %.2f euros
                                                            -El precio de venta por unidad es de:  %.2f euros
                                                            Sabiendo que el beneficio por unidad es de:  %.2f  euros
                                                            Para llegar a la cantidad de 2500 euros de beneficio se necesitan vender:  %d unidades
                                                                                   """.formatted(costeProduccionProductoXUnidad, precioVentaProductoXUnidad, beneficioXUnidad, cantidadUnidadesParaBeneficio);

                    JOptionPane.showMessageDialog(null, resultadofinal);
                    // si se sale fuera de rango
                } else {
                    JOptionPane.showMessageDialog(null, "El precio de la Materia Prima no es correcto");
                }
            }
            case "T2" -> {
                precioMateriaPrimaXUnidad = Double.parseDouble(JOptionPane.showInputDialog("Indique el precio de la Materia prima"));
                // si el precio de la materia prima es correcto
                if (precioMateriaPrimaXUnidad >= LIMITE_INFERIOR && precioMateriaPrimaXUnidad <= LIMITE_SUPERIOR) {
                    // coste de produccion unitario
                    costeProduccionProductoXUnidad = precioMateriaPrimaXUnidad + MANOBRAPORUNIDADM2T2P1;
                    // precio de venta por unidad
                    precioVentaProductoXUnidad
                            = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENATJECOSTEPRODUCCIONT1T2);
                    //obtengo el beneficio por unidad vendida
                    beneficioXUnidad = precioVentaProductoXUnidad - costeProduccionProductoXUnidad;
                    // como no se puede fabricar media unidades redondeo hacia arriba
                    cantidadUnidadesParaBeneficio = (int) Math.ceil(BENEFICIOSUPERAR / beneficioXUnidad);
                    String resultadofinal = """
                                                            Para los Mantecados de Turrón de clásico
                                                            -El precio del coste de produccion por unidad es de:   %.2f euros
                                                            -El precio de venta por unidad es de:  %.2f euros
                                                            Sabiendo que el beneficio por unidad es de:  %.2f  euros
                                                            Para llegar a la cantidad de 2500 euros de beneficio se necesitan vender:  %d unidades
                                                                                   """.formatted(costeProduccionProductoXUnidad, precioVentaProductoXUnidad, beneficioXUnidad, cantidadUnidadesParaBeneficio);

                    JOptionPane.showMessageDialog(null, resultadofinal);
                    //si se sale de rango el precio de la materia prima
                } else {
                    JOptionPane.showMessageDialog(null, "El precio de la Materia Prima no es correcto");
                }
            }
            case "M2" -> {
                precioMateriaPrimaXUnidad = Double.parseDouble(JOptionPane.showInputDialog("Indique el precio de la Materia prima"));
                // si el precio de la materia prima es correcto
                if (precioMateriaPrimaXUnidad >= LIMITE_INFERIOR && precioMateriaPrimaXUnidad <= LIMITE_SUPERIOR) {
                    // coste de produccion unitario
                    costeProduccionProductoXUnidad = precioMateriaPrimaXUnidad + MANOBRAPORUNIDADM2T2P1;
                    // precio de venta por unidad
                    precioVentaProductoXUnidad
                            = costeProduccionProductoXUnidad + (costeProduccionProductoXUnidad * PORCENTAJECOSTEPRODUCIONM1M2P1);
                    //obtengo el beneficio por unidad vendida
                    beneficioXUnidad = precioVentaProductoXUnidad - costeProduccionProductoXUnidad;
                    // como no se puede fabricar media unidades redondeo hacia arriba
                    cantidadUnidadesParaBeneficio = (int) Math.ceil(BENEFICIOSUPERAR / beneficioXUnidad);
                    String resultadofinal = """
                                                            Para los Mantecados de Mazapanes
                                                            -El precio del coste de produccion por unidad es de:   %.2f euros
                                                            -El precio de venta por unidad es de:  %.2f euros
                                                            Sabiendo que el beneficio por unidad es de:  %.2f  euros
                                                            Para llegar a la cantidad de 2500 euros de beneficio se necesitan vender:  %d unidades
                                                                                   """.formatted(costeProduccionProductoXUnidad, precioVentaProductoXUnidad, beneficioXUnidad, cantidadUnidadesParaBeneficio);

                    JOptionPane.showMessageDialog(null, resultadofinal);
                    //si se sale de  rango el precio de la materia prima
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
