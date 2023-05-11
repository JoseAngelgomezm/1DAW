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
public class Ej03 {
    public static void main(String[] args) {
        //Declaracion de variables para guardar las notas
        float nota1;
        float nota2;
        float nota3;
        float notaMedia;
        final int NUMEROTOTALNOTAS = 3;
        // pedir las notas por teclado
        String primeraNota = JOptionPane.showInputDialog("Introduce la primera nota: ");
        // Convertir la nota a float
        nota1 = Float.parseFloat(primeraNota);
        
        String segundaNota = JOptionPane.showInputDialog("Introduce la segunda nota: ");
        // Convertir la nota a float
        nota2 = Float.parseFloat(segundaNota);
        
        String terceraNota = JOptionPane.showInputDialog("Introduce la tercera nota: ");
        // Convertir la nota a float
        nota3 = Float.parseFloat(terceraNota);
        
        // Sacar la media de las notas
        notaMedia = (nota1 + nota2 + nota3) / NUMEROTOTALNOTAS;
        
        // Mostrar el resultado
        JOptionPane.showMessageDialog(null,"La nota Media es: " + notaMedia);
    }
}
