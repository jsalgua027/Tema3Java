/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_repeticion;

/**
 *
 * @author nacho
 */
public class Ej011 {

    /**
     * @param args the command line arguments
     * 
     * Implementa un programa Java que permita visualizar todas las letras mayúsculas, desde la 'A' hasta la 'Z', usando un do – while.


     */
    public static void main(String[] args) {
        char caracteres='A';
        int i =0;
        do {            
            System.out.println(caracteres);
            caracteres++;
            i++;
            
        } while (i<26);
        
        
    }
    
}
