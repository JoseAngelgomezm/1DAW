/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesDoWhile;

/**
 *
 * @author joseangel
 */
public class Ej04 {

    public static void main(String[] args) {
        int numero = 1;

        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);
    }

    // Imprime del 1 al 10 y luego del 10 al 1 repitiendo el numero 10
}
