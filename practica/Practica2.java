/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Practica2 {

    public static void main(String[] args) {
        String saludo = "Hola";
        String despedida;
        despedida = "Adios";
        String cortesia = saludo + " y " + despedida;
        System.out.print(cortesia + " tiene ");
        System.out.println(cortesia.length() + " caracteres");
        for (int i = cortesia.length() - 1; i >= 0; i--) {
            System.out.print(cortesia.charAt(i));
        }
    }
}
