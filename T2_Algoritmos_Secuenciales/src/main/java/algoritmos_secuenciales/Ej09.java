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
public class Ej09 {
    public static void main(String[] args) {
        // Declaracion de variables
        double precioArticulo;
        double precioFinal;
        final double IVA = 1.21;
        
        // Pedir precio al usuario
        String precio = JOptionPane.showInputDialog("Introduce el precio del articulo: ");
        precioArticulo = Double.parseDouble(precio);
        
        //Aplicar el IVA
        precioFinal = precioArticulo * IVA;
        
        //Mostrar el precio final por pantalla
        JOptionPane.showMessageDialog(null, "El precio con IVA es : " + precioFinal);
        
    }
}
