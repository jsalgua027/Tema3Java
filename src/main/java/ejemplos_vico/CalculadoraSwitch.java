/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_vico;

import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class CalculadoraSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double resultado = 0;

        double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Introducir operando 1"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Introducir operando 2"));

        String menu = """
                       -------------------
                          CALCULADORA
                       -------------------
                       
                       1.-SUMAR
                       2.-RESTAR
                       3.-MULTIPLICAR
                       3.-DIVIDIR
                       
                       
                       """;
        String opcion = JOptionPane.showInputDialog(menu);
        
        switch (opcion) {
            case "1":
                resultado = operando1 + operando2;
                System.out.printf("El resultado es= %.2f", resultado);
                break;
            case "2":
                // si la opcion es 2 resto
                resultado = operando1 - operando2;
                System.out.printf("El resultado es= %.2f", resultado);
                break;
            case "3":
                // si la opcion es 3 multiplico
                resultado = operando1 * operando2;
                System.out.printf("El resultado es= %.2f", resultado);
                break;
            case "4":
                // si la opcion es 4 divido
                
                resultado = operando1 / operando2;
                System.out.printf("El resultado es= %.2f", resultado);
                break;
            default:
                JOptionPane.showConfirmDialog(null, "opcion incorrecta");
                break;
        }

        
        
    }
    
}
