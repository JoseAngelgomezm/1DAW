/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos_secuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author joseangel
 */
public class Ej12 {
    public static void main(String[] args) {
        // Un trabajador tiene un sueldo base segun su rango, rango1: 900€ rango2: 1000€
        // rango3: 1200€
        // Por hora extra cobra 10€ si es rango1, 12 si es rango2 y 15 si es rango 3
        // determinar el sueldo de un trabajor pidiendo el rango por teclado y las horas
        // extra que trabaja para determinar el sueldo del mes.
        
        
        final int SUELDOBASERANGO1 = 900;
        final int SUELDOBASERANGO2 = 1000;
        final int SUELDOBASERANGO3 = 1200;
        final double PRECIOHORAEXTRARANGO1 = 10;
        final double PRECIOHORAEXTRARANGO2 = 12;
        final double PRECIOHORAEXTRARANGO3 = 15;
        double sueldoFinalRango1;
        double sueldoFinalRango2;
        double sueldoFinalRango3;
        double horasExtras;
        String rango = "";
        
        // Creacion del objeto scanner
        Scanner teclado = new Scanner(System.in);
        
        
        
        // Pedir el rango del trabajador
        System.out.println("Introduce el rango del trabajador "
                + "(escribe rango1, rango2 o rango3: ");
        rango = teclado.nextLine();
        
        // Pedir las horas extras
        horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Introduce "
                + "las horas extras: ")) ;
        
        // Comprobar que rango es el trabajador
        if ("rango1".equals(rango)) { //Si es rango1
            sueldoFinalRango1 = (PRECIOHORAEXTRARANGO1 * horasExtras) + SUELDOBASERANGO1;
            //Mostrar por pantalla el resultado
            System.out.println("El sueldo del trabajador "
                    + "rango 1 es: " + sueldoFinalRango1);
        }
        
        else if ("rango2".equals(rango)) { // Si es rango2
            sueldoFinalRango2 = (PRECIOHORAEXTRARANGO2 * horasExtras) + SUELDOBASERANGO2;
            //Mostrar por pantalla el resultado
            JOptionPane.showMessageDialog(null, "El sueldo del trabajador "
                    + "rango 2 es : "+ sueldoFinalRango2);
        }
        
        else if ("rango3".equals(rango)) { // Si es rango3
            sueldoFinalRango3 = (PRECIOHORAEXTRARANGO3 * horasExtras) + SUELDOBASERANGO3;
            //Mostrar por pantalla el resultado
            JOptionPane.showMessageDialog(null, "El sueldo del trabajador "
                    + "rango 3 es : " + sueldoFinalRango3);
        }
  
    }
}
