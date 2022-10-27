/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3D;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class FabricaDeDulces {

    /**
     * @param args the command line arguments
     *
     *
     * El programa debe tener dos opciones, la primera es realizar los cálculos
     * para ver la viabilidad de los productos y la segunda debe ser “terminar”.
     * Para terminar el programa el usuario debe escribir la palabra Salir
     * (ignorando mayúsculas y minúsculas). En caso de escribir otra cosa, el
     * programa volverá al menú principal. El programa debe filtrar los códigos
     * de los productos. En caso de introducir un código inexistente, el
     * programa preguntará de nuevo por el código a introducir. Si el usuario
     * escribe Salir (ignorando mayúsculas y minúsculas) el programa termina.
     *
     * También se debe filtrar el precio de la materia prima. En caso de que el
     * usuario introduzca un número fuera del rango, el programa debe
     * solicitarlo de nuevo. En este ejercicio también se debe solicitar el
     * coste de la mano de obra para ese producto (siempre entre 0.5€ y 0.9€).
     * En caso de error al introducir este dato, el programa solicitará de nuevo
     * esta información. El resto de restricciones son las mismas que en el
     * ejercicio 3B, pero intenta aplicar las posibles correcciones del
     * ejercicio que hicimos en clase, para que tu código no sea tan repetitivo
     * y sea más legible. Incluye comentarios en el código que permiten leer
     * mejor tu programa.
     *
     *
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String opcionMenuPrincipal;//bule control del bucle principal y la seleccion del menu del progrma
        String opcionMenuProductos;//Para el control de bucles y la seleccion de productos
        
        String menuSwith;
        

        String textoMenuPrincipal = """
                         
                                ***********************La Fabrica De Dulces**************************
                         
                                        Escriba iniciar para comenzar el programa
                                        
                                        Escriba salir para salir del programa
                         
                         
                                *********************************************************************
                         """;
        
        
        String textoMenuProductos = """
                            ************************La Esteponera*********************
                          M1. Para el cálculo con Mantecados de Limón
                          P1. Para el cálculo con Polvorones
                          T1. Para el cálculo con Turrón de Chocolate
                          T2. Para el cálculo con Turrón Clásico
                          M2. Para el cálculo con Mazapanes
                         
                         ***************************************************************
                         """;
        
        

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

        do {
            System.out.println(textoMenuPrincipal);
            opcionMenuProductos = teclado.nextLine();
            
            if(opcionMenuPrincipal.equalsIgnoreCase("inicar")){
            
                
                do {                
                    System.out.println(textoMenuProductos);
                    opcionMenuProductos=teclado.nextLine();
                    
                    
                    
                    
                    
                } while (!((opcionMenuProductos.equalsIgnoreCase("M1")||
                        (opcionMenuProductos.equalsIgnoreCase("M2")||(opcionMenuProductos.equalsIgnoreCase("p1")||
                                (opcionMenuProductos.equalsIgnoreCase("T1")||(opcionMenuProductos.equalsIgnoreCase("T2"))));
                
            
            
            }
            
            
            
            

        } while (!opcionMenuPrincipal.equalsIgnoreCase("salir"));

    }

}
