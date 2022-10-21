/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_repeticion;

/**
 *
 * @author nacho
 */
public class Ej012 {

    /**
     * @param args the command line arguments
     * Modifica el programa del ejercicio 10 para que se vea el código numérico (número entero) de cada una de las letras.

     */
    public static void main(String[] args) {
          char caracter='a';
        int valorUnicode=caracter;
        
        for (int i = 0; i < 26; i++) {
            
              System.out.println("el caracter: "+ caracter+ " Tiene el valor unicode: "   +valorUnicode);
            caracter++;
            valorUnicode++;
          
        }
    }
    
}
