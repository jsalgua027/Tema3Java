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
     * @param args the command line arguments
     * Una cadena de tiendas de autoservicio cuenta con sucursales en C ciudades diferenres del pais
     * En cada ciudad cuenta con T tiendas y cada tienda cuenta con N empleados, asimismo, cada una 
     * registra lo que vendio en cada ciudad y cuento recaudó la cadena en un solo día
     * 
     * Realiza un algoritmo que permita introducir un día lo que vendio cada empleado de
     * cada tienda de cada ciudad y saber las ventas totales por tienda, ciudad y totales- 
     */
    public static void main(String[] args) {
       Scanner teclado =new Scanner(System.in);
       
        int dia;
        int numeroEmpleados;
        double vendidoPorEmpleado=0;
        double vendidoPorTienda=0;
        double vendidoPorCiudad=0;
        double totales=0;
        int opcionMenu;
        
       String textoMenu="""
                        
                                    1.Para introducir las ventas por empleado.
                                     
                                    2.Para salir del programa.
                        
                        
                                   """; 
       
        
        do {            
            System.out.println(textoMenu);
            opcionMenu=teclado.nextInt();
            
            if(opcionMenu==1){
            
            System.out.println("Introduce lo vendio por el empleado");
            vendidoPorEmpleado=teclado.nextDouble();
            vendidoPorTienda=vendidoPorEmpleado++;
            vendidoPorCiudad=vendidoPorTienda++;
            totales= vendidoPorCiudad++;
            
            }
            
            
         
            
        } while (opcionMenu==1);
        
        System.out.println("las ventas totales de la tienda: "+ vendidoPorTienda + " Las de ciudad es : " +vendidoPorCiudad+"Las totales:  "+ totales);
       
       
        
    }
    
}
