/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class Ej10 {
    public static void main(String[] args) {
        // Declaracion de variables
        double medidaA;
        double medidaB;
        double medidaC;
        double area;
        double area2;
        
        
        // Pedir datos por pantalla
        String medida1 = JOptionPane.showInputDialog("Introduce la mediad A: ");
        medidaA = Double.parseDouble(medida1);
        
        String medida2 = JOptionPane.showInputDialog("Introduce la mediad B: ");
        medidaB = Double.parseDouble(medida2);
        
        String medida3 = JOptionPane.showInputDialog("Introduce la mediad C: ");
        medidaC = Double.parseDouble(medida3);
        
        // Determinar el area
        area = ((medidaA + medidaC) / 2) * medidaB;
        
        //Mostrar resultado por pantalla
        JOptionPane.showMessageDialog(null, "El area de la pieza es : " + area);
    }
}
