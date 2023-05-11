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
public class Ej04 {
    public static void main(String[] args) {
        // declaracion variables
        double kmIntroducir;
        double precioTotal;
        final double PRECIOMINIMO = 1.25;
        final double PRECIOKM = 0.08;
        
        // Pedir datos al usuario
        String kilometros = JOptionPane.showInputDialog("Introduce los KM para determinar precio: ");
        kmIntroducir = Double.parseDouble(kilometros);
        
        // Determinar el precio total
        precioTotal = (PRECIOKM * kmIntroducir) + PRECIOMINIMO;
        
        // Mostrar resultados por pantalla
        JOptionPane.showMessageDialog(null,"El precio es: " + precioTotal);
    }
}
