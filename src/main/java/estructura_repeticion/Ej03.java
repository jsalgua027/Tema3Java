/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_repeticion;

/**
 *
 * @author Windows10
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     * 
     *  Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120, etc.
     * No se introducen valores por teclado.

     */
    public static void main(String[] args) {
       int x =15;
       int indice=1;
        while (indice<=25) {            
            System.out.println(x);
            System.out.println(" - ");
            indice= indice+1;
            x=x*2;
        }
       
       
    }
    
}
