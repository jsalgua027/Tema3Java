/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_seleccion;

/**
 *
 * @author Windows10
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A
        
//        boolean unaCondicion = true;
//        resultado = unaCondicion ? valor1 : valor2;
//        devuleve valor1
        
        
        //B
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        //devuleve 100
        //c
        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente" : (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
        // devuelve aun no hemos vendido todo
    }

}
