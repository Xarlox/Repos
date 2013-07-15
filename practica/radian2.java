/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carlos Saca
 */
public class radian2 {
    // Programa CONVIERTE RADIANES A GRADOS Y GRADOS A RADIANES
// Elaborado por: Leobardo L pez Rom n
// Esta formado por dos clases: RadianGrado2 y EjecutaRadianGrado2
// RadianGrado2.java
    // Datos de la clase
    private double radianes;
    private double grados;
    private double numRadianes;
    private double numGrados;

    // Metodos de entrada de datos -setters-
// ############################################################################
    public void establecerRadianes(double rad) {
        radianes = rad;
    }

    public void establecerGrados(double gra) {
        grados = gra;
    }

    public void calcularNumRadianes() {
        numRadianes = grados * (Math.PI / 180);
    }

    public void calcularNumGrados() {
        numGrados = radianes * (180 / Math.PI);
    }
//#############################################################################

    // Metodos de acceso a los datos -getters-
    public double obtenerNumRadianes() {
        return numRadianes;
    }

    public double obtenerNumGrados() {
        return numGrados;
    }

    public static void main(String args[]) {
        // Declaraciones
        // Definicion de objetos para entrada de datos por el teclado
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);

        // Variables
        String datoEntrada;
        double radian = 0, grad = 0;

        // Se declara, crea e inicia el objeto de la clase RadianGrado2 
        radian2 objRadianGrado = new radian2();

        System.out.println("\nCONVIERTE RADIANES A GRADOS Y GRADOS A RADIANES\n");

        // Leer dato
        try {
            System.out.println("------------ Lectura de datos  ------------");
            System.out.print("Teclee numero de radianes: ");
            datoEntrada = flujoEntrada.readLine();
            radian = Double.parseDouble(datoEntrada);

            System.out.print("Teclee numero de grados: ");
            datoEntrada = flujoEntrada.readLine();
            grad = Double.parseDouble(datoEntrada);
        } catch (IOException error) {
            System.err.println("Error " + error.getMessage());
        }

        // Establecer los valores leidos, en los datos del objeto
        objRadianGrado.establecerRadianes(radian);
        objRadianGrado.establecerGrados(grad);

        // Calcular 
        objRadianGrado.calcularNumRadianes();
        objRadianGrado.calcularNumGrados();

        // Imprimir salida, obteniendo los datos del objeto
        System.out.println("------------ Imprime resultados -----------");
        System.out.println("Numero de grados   = " + objRadianGrado.obtenerNumGrados());
        System.out.println("Numero de radianes = " + objRadianGrado.obtenerNumRadianes());
    }
}
