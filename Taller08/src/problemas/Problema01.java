/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String cadena = "";

        for (int i = 30; i >= 10; i--) {
            cadena = String.format("%s%d-%d-%d-%d\n", cadena,
                    i, i * 2, i * 3, i * 4);
        }
        System.out.print(cadena);
        
    }

}
