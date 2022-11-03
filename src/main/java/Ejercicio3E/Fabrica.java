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
public class Fabrica {

    /**
     * @param args the command line arguments
     *
     *
     */
    private static Scanner teclado = new Scanner(System.in);

    private static String textoMenuPrincipal = """
                         
                                ***********************La Fabrica De Dulces**************************
                         
                                        Escriba iniciar para comenzar el programa.
                                        
                                        Escriba salir para salir del programa.
                         
                         
                                *********************************************************************
                         """;

    private static String textoMenuProductos = """
                            ************************La Esteponera*********************
                          M1. Para el cálculo con Mantecados de Limón.
                          P1. Para el cálculo con Polvorones.
                          T1. Para el cálculo con Turrón de Chocolate.
                          T2. Para el cálculo con Turrón Clásico.
                          M2. Para el cálculo con Mazapanes.
                                Escriba salir para abandonar el programa.
                         ***************************************************************
                         """;

    // METODOS PARA EL MENU PRINICPAL/////////////////
    //muestro menu
    public static String muestroPidoMenuPrincipal() {
        String opcion;

        System.out.println(textoMenuPrincipal);
        opcion = teclado.nextLine();

        return opcion;
    }

    // método para saber si  es la opcion de menu valida
    public static boolean esOpcionValidaMenu(String opcion) {

        return (opcion.equalsIgnoreCase("iniciar") || opcion.equalsIgnoreCase("salir"));
    }

    // compruebo que iniciar entra, salir se sale y sino se repite
    public static void filtroOpcion() {
        boolean repetir = true;
       
        do {
            if (esOpcionValidaMenu(muestroPidoMenuPrincipal())) {
               
                if(muestroPidoMenuPrincipal().equalsIgnoreCase("iniciar")){
                do {                    
                        muestroPidoMenuProductos();
                        validarMenuProductos();
                        
                } while (repetir);
                
                }else{
                        System.out.println("Adios muy buenas");
                    repetir=false;
                
                }
                    
            } 

        } while (repetir);

    }
    
    
    //METODOS DE PRODUCTOS//////////////////////
    
    // mostrar menu de productos
    
    public static String muestroPidoMenuProductos(){
    String codigoProducto;
        System.out.println(textoMenuProductos);
        codigoProducto=teclado.nextLine();
    
    
    return codigoProducto;
    }
    
    public static boolean esCodigoProductoValido(){
    
    
    
    return ((muestroPidoMenuProductos().equalsIgnoreCase("M1")
                            || muestroPidoMenuProductos().equalsIgnoreCase("P1")
                            || muestroPidoMenuProductos().equalsIgnoreCase("T1")
                            || muestroPidoMenuProductos().equalsIgnoreCase("T2")
                            || muestroPidoMenuProductos().equalsIgnoreCase("M2")
             || muestroPidoMenuProductos().equalsIgnoreCase("salir")));
}
    
    
   // si la opcion menu productos es valida
    
    public static void  validarMenuProductos(){
    boolean repetir=true;
    
        do {            
            
            if(esCodigoProductoValido()){
                if((muestroPidoMenuProductos().equalsIgnoreCase("M1")
                            || muestroPidoMenuProductos().equalsIgnoreCase("P1")
                            || muestroPidoMenuProductos().equalsIgnoreCase("T1")
                            || muestroPidoMenuProductos().equalsIgnoreCase("T2")
                            || muestroPidoMenuProductos().equalsIgnoreCase("M2")));
            repetir=false;
                
            }
            
            
            
            
            
        } while (repetir);
    
    
    
    }
    

    public static void main(String[] args) {
        
        
        
     filtroOpcion();
        
    }

}
