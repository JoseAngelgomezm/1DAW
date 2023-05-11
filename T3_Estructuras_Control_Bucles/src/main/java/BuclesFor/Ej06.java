/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesFor;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Ej06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        
        //1º Inicializacion variable control (int i=1)
        //2º Condicion del bucle (i<=n) 
        //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL (i++)
       for (int i=1; i<=n; i++){
           // 3º Codigo que queramos que se repita
           System.out.println(i);
       }
    }

}
