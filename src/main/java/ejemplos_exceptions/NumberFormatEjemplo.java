/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows10
 */
public class NumberFormatEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int edad1 = leerNumeroEntero();
//        System.out.println("Edad 1: " + edad1);
        int edad2 = leerNumeroEnteroSinErrores();
        System.out.println("Edad 2: " + edad2);
    }

    private static int leerNumeroEntero() {
        String tmp = JOptionPane.showInputDialog("Introduce tu edad: ");
        int edad = Integer.parseInt(tmp);
        return edad;
    }

    private static int leerNumeroEnteroSinErrores() {

        boolean repetir = true;
        int edad = -1; // Edad no válida

        do {
            String tmp = JOptionPane.showInputDialog("Introduce tu edad: ");
            try {
                edad = Integer.parseInt(tmp);
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showConfirmDialog(null, "No has introducido un número entero.");
            }
        } while (repetir);

        return edad;
    }
}
