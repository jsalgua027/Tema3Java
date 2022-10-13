/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_seleccion;

/**
 *
 * @author Windows10
 */
public class Ej08 {

    /**
     *  @param args the command line arguments
     *¿Qué realiza el siguiente programa Java?

     */
    public static void main(String[] args) {
        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
            default:
                System.out.println("Departamento no válido");
        }
        System.out.println("Código para el departamento es " + departamento);
        // la ejecución del programa lee 'B' y se va al caso que le corresponde ese char
        //muestra por consola Recursos humanos y  se sale del switch para mostrar el sout último
        
        
    }

}
