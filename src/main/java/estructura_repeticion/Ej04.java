/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_repeticion;

/**
 *
 * @author Windows10
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;

        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);

    }
    //el primer while termina cunado numero es mayor que 11 y va mostrando numero + 1 por cada ejecucion
    // en el do while hace lo contrario mientras numero sea mayo que uno va restando uno a numero
}
