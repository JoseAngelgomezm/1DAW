/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesDoWhile;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Ej05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         //1º Inicializacion variable control (x)
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        do {
            // 3º Codigo que queramos que se repita (imprimir variable control)
            System.out.println(x);
            //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL
            x++;
        } while (x <= n);// 2º Condicion del bucle (mientras la variable de
                                // control sea menor al numero ingresado)
    }

}
