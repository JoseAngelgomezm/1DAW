/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos_secuenciales;

import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class Ej08 {
    public static void main(String[] args) {
        // Declaracion variables
        double presupuestoTotal; // Variable para guardar datos pedido por teclado
        double presupuestoGinecologia;
        double presupuestoTraumatologia;
        double presupuestoPediatria;
        final double CUARENTAGINECOLOGIA = 0.4;
        final double TREINTATRAUMATOLOGIA = 0.3;
        final double TREINTAPEDIATRIA = 0.3;
        // Declaracion objeto scanner
        Scanner teclado = new Scanner(System.in);
        // Mensaje pedir presupuesto
        System.out.println("Introduce la cantidad del presupuesto total en €: ");
        // Guardar valores presupuesto
        presupuestoTotal= teclado.nextDouble();
        
        // Operaciones para determinar los porcentajes
        presupuestoGinecologia = presupuestoTotal * CUARENTAGINECOLOGIA;
        presupuestoTraumatologia = presupuestoTotal * TREINTATRAUMATOLOGIA;
        presupuestoPediatria = presupuestoTotal * TREINTAPEDIATRIA;
        
        // Mostrar resultados
        System.out.println("Presupuesto para Ginecologia: " + presupuestoGinecologia + "€");
        System.out.println("Presupuesto para Traumatologia: " + presupuestoTraumatologia + "€");
        System.out.println("Presupuesto para Pediatria: " + presupuestoPediatria + "€");
        
    }
}
