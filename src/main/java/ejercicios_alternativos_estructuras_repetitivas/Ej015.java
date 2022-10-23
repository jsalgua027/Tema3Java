/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_alternativos_estructuras_repetitivas;

/**
 *
 * @author Windows10
 */
public class Ej015 {

    /**
     * @param args the command line arguments
     * 
     * Una persona adquirió un producto para pagar en 20 meses
     * El primer mes pago 10 euros
     * El segundo 20 euros
     * El tercero 40 euros 
     * Realiza un algoritmo para determinar cuanto pago debe pagar mensualmente y el total  de los 20 meses
     * 
     * 
     */
    public static void main(String[] args) {
       
        int pagoMensual=10;
        int mes =1;
        int pagoTotal=0;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("El importe mensual del mes: "+mes +" es de: "+pagoMensual+ " euros");
            mes++;
            pagoMensual=pagoMensual*2;
            pagoTotal=pagoMensual+pagoMensual;
        }
        System.out.println("************************************************************************************************************************");
        System.out.println("El importe total pagado es de:  " + pagoTotal+ " euros ");
    }
    
}
