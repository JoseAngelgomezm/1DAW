/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_grabacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class EjGrabar {
    public static void main(String[] args) {
        double nota;
        
        //Pedir la nota por teclado 
        nota = Double.parseDouble
        (JOptionPane.showInputDialog("Introduce un numero"));
        
        
        if (nota < 5) { // Si es menor que 5
            JOptionPane.showMessageDialog(null, 
                    "Suspenso ");
        }
        else if (nota >= 5 && nota <= 6) { // Si es mayor o igual que 5
            // y menor o igual que 6
            JOptionPane.showMessageDialog(null, 
                    "Suficiente");
        }
        else if (nota > 6 && nota <= 8) { // Si es mayor o igual que 6
            // y menor o igual que 8
            JOptionPane.showMessageDialog(null, 
                    "Notable");
        }
        else{ //Sobresaliente
            JOptionPane.showMessageDialog(null, 
                    "Sobresaliente");
        }
        
        
    }
}
