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
public class Ej06 {
    public static void main(String[] args) {
        // Declaracion variables
        double dineroPersona1;
        double dineroPersona2;
        double dineroPersona3;
        double porcentajePersona1;
        double porcentajePersona2;
        double porcentajePersona3;
        double dineroTotal;
        final double PORCENTAJE100 = 100;
        
        // Pedir los datos por teclado
        String dp1 = JOptionPane.showInputDialog("Introduce la cantidad que "
                + "invierte la persona 1: ");
        dineroPersona1 = Double.parseDouble(dp1);
        
        String dp2 = JOptionPane.showInputDialog("Introduce la cantidad "
                + "que invierte la persona 2: ");
        dineroPersona2 = Double.parseDouble(dp2);
        
        String dp3 = JOptionPane.showInputDialog("Introduce la cantidad "
                + "que invierte la persona 3: ");
        dineroPersona3 = Double.parseDouble(dp3);
        
        // Calcular el porcentaje que corresponde a cada uno
        dineroTotal = dineroPersona1 + dineroPersona2 + dineroPersona3; // Determinar el total invertido
        // Sacar lo que corresponde a cada persona
        porcentajePersona1 = (dineroPersona1 * PORCENTAJE100) / dineroTotal; 
        porcentajePersona2 = (dineroPersona2 * PORCENTAJE100) / dineroTotal;
        porcentajePersona3 = (dineroPersona3 * PORCENTAJE100) / dineroTotal;
        
        // Mostrar resultados por pantalla
        JOptionPane.showMessageDialog(null, "La persona 1 invierte : " + porcentajePersona1 + "%");
        JOptionPane.showMessageDialog(null, "La persona 2 invierte : " + porcentajePersona2 + "%");
        JOptionPane.showMessageDialog(null, "La persona 3 invierte : " + porcentajePersona3 + "%");
    }
}
