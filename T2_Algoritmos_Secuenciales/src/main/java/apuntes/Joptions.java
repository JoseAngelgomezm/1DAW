/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import javax.swing.JOptionPane;

/**
 *
 * @author joseangel
 */
public class Joptions {
    public static void main(String[] args) {
        // Delcaracion variables
        double peso;
        int estatura;
        // Lectura de datos con JOptionPane
        
        String apellido = JOptionPane.showInputDialog("Introduce tu apellido: ");
        // Mostrar resultado con JOptionPane
        JOptionPane.showMessageDialog(null,"Tu apellido es: " + apellido);
        
        //Pedir el peso
        String pesoString =  JOptionPane.showInputDialog("Introduce tu peso: ");
        // Conversion de un string a un double con JOptionPane
        peso = Double.parseDouble(pesoString);
        // Mostrar resultado
        JOptionPane.showMessageDialog(null,"Tu peso es: " + peso);
        
         //Pedir la estatura
        String estaturaString =  JOptionPane.showInputDialog("Introduce tu estatura: ");
        // Conversion de un string a un int con JOptionPane
        estatura = Integer.parseInt(estaturaString);
        // Mostrar resultado
        JOptionPane.showMessageDialog(null,"Tu estatura es: " + estatura);
        
    }
}
