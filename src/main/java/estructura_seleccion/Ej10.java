/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_seleccion;

/**
 *
 * @author Windows10
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     * 
     *  Modifica el código anterior para que variable2 valga 30.

     */
    public static void main(String[] args) {
        int variable = 3, variable2;
        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
                break;
            case 4:
                variable2 = 10;
                break;
            default:
                variable2 = 100;
                break;

        }
        System.out.println(variable2);
    }

}
