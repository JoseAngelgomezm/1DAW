/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresrelaciones;

/**
 *
 * @author Jose Angel
 */
public class Ej04 {
    public static void main(String[] args) {
        // Declaracion de variables
        int a=10;
        int b=20;
        boolean resultado1;
        boolean resultado2;
        boolean resultado3;
        boolean resultado4;
        
        // Comprobacion de operaciones relacionales
        resultado1 = a<b;
        resultado2 = a>b;
        resultado3 = a==b;
        resultado4 = a!=b;
        
        // Resultado de comprobaciones
        System.out.println("Comprobacion a<b: " + resultado1);
        System.out.println("Comprobacion a>b: " + resultado2);
        System.out.println("Comprobacion a==b: " + resultado3);
        System.out.println("Comprobacion a!=b: " + resultado4);
        
    }
}
