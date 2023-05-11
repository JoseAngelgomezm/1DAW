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
public class Ej07 {
    public static void main(String[] args) {
        // Declaracion variables
        double cantidadEuros;
        double dolares;
        final double VALORDOLAR = 1.01;
        
        // Pedir datos por teclado
        String euros = JOptionPane.showInputDialog("Introduce la cantidad de euros: ");
        cantidadEuros = Double.parseDouble(euros);
        
        // Convertir los euros a dolares
        dolares = cantidadEuros * VALORDOLAR;
        
        // Mostrar cuantos dolares son la cantidad de euros introducida
        JOptionPane.showMessageDialog(null, cantidadEuros + "€ equivalen a : " + dolares + "$");
                
    }
}
