/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Array4 {

    /**
     * Ecos: Ejemplo de manipulacion de cadenas A. Garcia-Beltran - marzo, 2007
     */
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Eco de palabras:");
        while (i < args.length) {
            System.out.print(args[i] + " ");
            i++;
        };
        System.out.println();
        System.out.println("Eco inverso de palabras:");
        for (i = 0; i < args.length; i++) {
            System.out.print(args[args.length - i - 1] + " ");
        }
        System.out.println();
        System.out.println("Eco inverso de caracteres:");
        for (i = args.length - 1; i >= 0; i--) {
            for (int k = 0; k < args[i].length(); k++) {
                System.out.print(args[i].charAt(args[i].length() - k - 1));
            }
            System.out.print(" ");
        }
    }
}