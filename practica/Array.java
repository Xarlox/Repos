/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Array {

    /**
     * ArrayRaices: Ejemplo de uso de arrays A. Garcia-Beltran - abril, 2007
     */
    public static void main(String[] args) {
            int[] numero = new int[10]; // Array de valores enteros
            double[] raiz = new double[10]; // Array de valores reales
            for (int i = 0; i < numero.length; i++) {
                numero[i] = i + 1;
                raiz[i] = Math.sqrt(numero[i]);
                System.out.println(numero[i] + " : " + raiz[i]);
            }
        }
    }