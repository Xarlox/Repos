/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Matrices {

 
        public static void main(String[] args) {
            double[][] a = new double[3][3];
            double[][] b = new double[3][3];
            double[][] c = new double[3][3];
// Asignar valores aleatorios a las elementos de las matrices sumando
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = Math.random();
                    b[i][j] = Math.random();
                }
            }
// Visualizar los valores de los elementos por pantalla
            System.out.println("Primera matriz sumando:");
            muestra(a);
            System.out.println("Segunda matriz sumando:");
            muestra(b);
// Realizar la suma
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
// Visualizar por pantalla la matriz suma
            System.out.println("Matriz suma:");
            muestra(c);
        }

        public static void muestra(double[][] m) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }
    
}