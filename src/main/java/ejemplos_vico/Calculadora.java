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
public class Calculadora {

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

        //loggica aplicacion
        //si la opcion es 1 suma
//        if (opcion.equals("1")) {
//            resultado = operando1 + operando2;
//            System.out.printf("El resultado es= %.2f", resultado);
//
//        }
//
//        // si la opcion es 2 resto
//        if (opcion.equals("2")) {
//            resultado = operando1 - operando2;
//            System.out.printf("El resultado es= %.2f", resultado);
//
//        }
//
//        // si la opcion es 3 multiplico
//        if (opcion.equals("3")) {
//            resultado = operando1 * operando2;
//            System.out.printf("El resultado es= %.2f", resultado);
//
//        }
//
//        // si la opcion es 4 divido
//        if (opcion.equals("4")) {
//            resultado = operando1 / operando2;
//            System.out.printf("El resultado es= %.2f", resultado);
//
//        }
        //ESTO ES UN MEJORA  USANDO IF ELSE
//        if (opcion.equals("1")) {
//            resultado = operando1 + operando2;
//            System.out.printf("El resultado es= %.2f", resultado);
//
//        } else {
//
//            // si la opcion es 2 resto
//            if (opcion.equals("2")) {
//                resultado = operando1 - operando2;
//                System.out.printf("El resultado es= %.2f", resultado);
//
//            } else {
//
//                // si la opcion es 3 multiplico
//                if (opcion.equals("3")) {
//                    resultado = operando1 * operando2;
//                    System.out.printf("El resultado es= %.2f", resultado);
//
//                } else {
//                    // si la opcion es 4 divido
//                    if (opcion.equals("4")) {
//                        resultado = operando1 / operando2;
//                        System.out.printf("El resultado es= %.2f", resultado);
//
//                    } else {
//                        JOptionPane.showConfirmDialog(null, "opcion incorrecta");
//                    }
//
//                }
//            }
//        }

        //OPCION IF ELSE IF
        if (opcion.equals("1")) {
            resultado = operando1 + operando2;
            System.out.printf("El resultado es= %.2f", resultado);

        } else if (opcion.equals("2")) {

            // si la opcion es 2 resto
            resultado = operando1 - operando2;
            System.out.printf("El resultado es= %.2f", resultado);

        } else if (opcion.equals("3")) {

            // si la opcion es 3 multiplico
            resultado = operando1 * operando2;
            System.out.printf("El resultado es= %.2f", resultado);

        } else if (opcion.equals("4")) {
            // si la opcion es 4 divido

            resultado = operando1 / operando2;
            System.out.printf("El resultado es= %.2f", resultado);

        } else {
            JOptionPane.showConfirmDialog(null, "opcion incorrecta");
        }

    }
}
