/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesWhile;

/**
 *
 * @author joseangel
 */
public class Ej09 {

    public static void main(String[] args) {
        int i = 0;
        int j = 6;
        while (i < 0) {
            i++;
            j++;
        }
        System.out.println(j);
    }
    // el bucle no se ejecuta porque i ya vale 0 por lo tanto ya es mas pequeño
    // que 0 y se imprime el valor de j que es la siguiente instruccion, siendo
    // su valor = 6
    
}
