/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresrelaciones;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Ej14 {
    public static void main(String[] args) {
        // Declaracion de variables
        double segundos; // segundos que introduce el usuario
        double minutos;
        double horas;
        final double MINUTOSHORA = 60;
        final double SEGUNDOSHORA = 3600;
        
        // Importar objeto scanner
        Scanner teclado = new Scanner(System.in);
        // Pedir datos y recogerlos en una varibale
        System.out.println("Introduce los segundos totales: ");
        segundos = teclado.nextDouble();
        
        // Operaciones
        horas = segundos % SEGUNDOSHORA;
        
        // Mostrar resultados
        System.out.println("El tiempo que has introducido son: " + horas + "H");
        
    }
}
