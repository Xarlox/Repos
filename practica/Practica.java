/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
            String saludo = "Hola";
            String despedida;
            despedida = "Adios";
            if (saludo.equals(despedida)) {
                System.out.println(saludo);
            } else {
                System.out.println(despedida);
            }
            String cortesia = saludo + " y " + despedida;
            System.out.print(cortesia + " tiene ");
            System.out.println(cortesia.length() + " caracteres");
            for (int i = cortesia.length() - 1; i >= 0; i--) {
                System.out.print(cortesia.charAt(i));
            }
            System.out.println();
            System.out.println(cortesia.substring(1, 4));
            String s1, s2;
            double x = -14.25;
            s1 = Double.toString(x);
            System.out.println(s1);
            s2 = "156";
            int n = Integer.parseInt(s2);
            System.out.println(n);
        }
    }

