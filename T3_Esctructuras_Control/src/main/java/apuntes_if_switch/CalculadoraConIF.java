/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes_if_switch;

import javax.swing.JOptionPane;

/**
 *
 * @author joseangel
 */
public class CalculadoraConIF {
    public static void main(String[] args) {
        double operando1 = Double.parseDouble("Introduce operando 1: ");
        double operando2 = Double.parseDouble("Introduce operando 2: ");
        double resultado = 0;
        String menu = """
                      Introduce un numero para seleccionar la operacion:
                      1- Sumar
                      2- Restar
                      3- Multiplicar
                      4- Dividir
                      """; 
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
         
        if (opcion == 1) {
            resultado = operando1 + operando2;
            JOptionPane.showMessageDialog(null, "La suma es:" 
                    + resultado);
        }
        else if (opcion == 2) {
            resultado = operando1 - operando2;
            JOptionPane.showMessageDialog(null, "La resta es:" 
                    + resultado);
        }
        else if (opcion == 3) {
            resultado = operando1 * operando2;
            JOptionPane.showMessageDialog(null, "La multiplicacion"
                    + " es:" + resultado);
        }
        else if (opcion == 4) {
            resultado = operando1 / operando2;
            JOptionPane.showMessageDialog(null, "La division es:"
                    + resultado);
        }
        else {
            JOptionPane.showMessageDialog(null, "La opcion "
                    + "introducida no es valida");
        }
    }
}
