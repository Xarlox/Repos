/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Array2 {

    /**
     * NotaMedia: Ejemplo de empleo de vector de reales A. Garcia-Beltran -
     * abril, 2007
     */
    public static void main(String[] args) {
        double[] notas = leerNotas();
        if (notas.length == 0) {
            System.out.println("No hay notas");
        } else {
            int i;
            double suma = 0;
            for (i = 0; i < notas.length; i++) {
                System.out.println("Nota " + (i + 1) + ": " + notas[i]);
                suma += notas[i];
            }
            System.out.println("La nota media es: " + suma / i);
        }
    }

    public static double[] leerNotas() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double valor = 0;
        double[] vector = new double[20];
        int indice = 0;
        String cadena;
        System.out.println("Introduce una nota por linea");
        try {
            while ((cadena = in.readLine()) != null) {
                valor = Double.parseDouble(cadena);
                vector[indice] = valor;
                indice++;
            }
        } catch (Exception e) {
        } // No se procesan los errores
        return null;
    }
}