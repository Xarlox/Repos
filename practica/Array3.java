/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Array3 {

    /**
     * ArrayPrecios: Ejemplo de uso de arrays de objetos A. Garcia-Beltran -
     * abril, 2007
     */
    public static void main(String[] args) {
        Array3[] catalogo; // Creacion de la referencia
        catalogo = new Array3[5]; // Creacion array de referencias precio
        for (int i = 0; i < catalogo.length; i++) {
            catalogo[i] = new Array3(); // Creacion del elemento i-esimo
//            catalogo[i].pone(10 * Math.random());
//            System.out.println("Producto " + i + " : " + catalogo[i].da());
        }
// Busqueda del maximo precio
//        double maximo = catalogo[0].da();
        for (int i = 1; i < catalogo.length; i++) {
//            if (maximo < catalogo[i].da()) {
//                maximo = catalogo[i].da();
            }
        }
//        System.out.println("El mas caro vale " + maximo + " euros");
    }