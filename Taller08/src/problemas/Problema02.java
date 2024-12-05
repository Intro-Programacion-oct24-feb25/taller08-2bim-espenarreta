/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double celcius;
        double fahrenheit = 20.0;
        String cadena = "";

        for (int operacion = 0; operacion <= 20; operacion++) {

            celcius = 5.0 / 9.0 * (fahrenheit - 32);

            cadena = String.format("%sOperación(%d)Fahrenheit: %.2f ===>"
                    + " Celcius: %.2f\n",
                    cadena,
                    operacion,
                    fahrenheit,
                    celcius);

            fahrenheit = fahrenheit + 4;
        }
        System.out.printf(cadena);
    }
    
}
