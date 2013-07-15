/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package radianes;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Radianes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        double angulo=0.0;
        double radianes=0.0;
        double seno=0.0;
        double coseno=0.0;
 
angulo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del angulo en grados"));
        radianes=(angulo*Math.PI)/180;
        seno=Math.sin(radianes);
        coseno=Math.cos(radianes);
        JOptionPane.showMessageDialog(null, "El seno de "+angulo+"                    es:  "+seno + "\n"+"\n"+"El coseno de "+angulo+"  es:  "+coseno);
 
 
    }
}