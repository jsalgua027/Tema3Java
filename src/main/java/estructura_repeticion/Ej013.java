/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_repeticion;

/**
 *
 * @author nacho
 */
public class Ej013 {

    /**
     * @param args the command line arguments
     * Modifica el programa del ejercicio 11 para que se vea el código numérico (número entero) de cada una de las letras.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         char caracteres='A';
         int valorUnicode=0;
        int i =0;
        do {            
               System.out.println("el caracter: "+ caracteres+ " Tiene el valor unicode: "   +valorUnicode);
            valorUnicode++;
            caracteres++;
            i++;
            
        } while (i<26);
        
    }
    
}
