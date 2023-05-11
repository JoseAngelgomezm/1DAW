/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class Ej02 {

    public static void main(String[] args) {
        // Declarar variables
        final int NUMERO_A_COMPARAR_1 = 135;
        final int NUMERO_A_COMPARAR_2 = 0;
        int valorAbsoluto;
        
        // Pedimos el numero por teclado
        double numero = Double.parseDouble
        (JOptionPane.showInputDialog("Introduce un numero:"));
        
        // Si es mayor que 135
        String resultado = (numero >= NUMERO_A_COMPARAR_1) ? "mayor" : "menor";
        JOptionPane.showMessageDialog(null,
                "El numero " + numero + " es " + resultado + " que "
                + NUMERO_A_COMPARAR_1);
        
        // Si es menos o igual a 135
        String resultado2 = (numero <= NUMERO_A_COMPARAR_2) ? "Menor" 
                : "Mayor";
        JOptionPane.showMessageDialog(null,
                "El numero " + numero + " es " + resultado2 + " que "
                + NUMERO_A_COMPARAR_2);
        
        // Para obtener el valor absoluto si el numero es menor que 0
        // Multiplicamos el numero por si mismo si es menor a 0
        valorAbsoluto = (int) ((0 >= numero) ? numero - numero * 2 : numero) ;
        // Imprimimos por pantalla el resultado
        JOptionPane.showMessageDialog(null, "El valor"
                + " absoluto de " + numero + " es " + valorAbsoluto);
    }
}
