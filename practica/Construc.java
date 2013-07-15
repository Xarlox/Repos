/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Construc {
    
    //atributos

    private int dia;
    private int mes;
    private int año;

    public Construc() {
        dia = 1;
        mes = 1;
        año = 2000;
    }

    public Construc(int ndia, int nmes, int naño) {
        dia = ndia;
        mes = nmes;
        año = naño;
    }

    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
     public static void main(String[] args) {
         
     }
}