/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class BucleDoWhile {
    public static void main(String[] args) {
        // EL BUCLE DO WHILE EJECUTA ENTRE 1 Y N VECES
        
        //Imprimir 0 al 10
        
        //1º Inicializacion variable control
        int numero = 0;
        do {
            // 3º Codigo que queramos que se repita
            System.out.println(numero);
            
            //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL
            numero++;
            
        } while (numero<=10);// 2º Condicion del bucle
        
        System.out.println("Bucle del 0 al 10 terminado");
        
        //Imprimir del 10 al 0
        
        //1º Inicializacion variable control
        numero=10;
        do{
            // 3º Codigo que queramos que se repita
            System.out.println(numero);
            
            //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL
            numero--;
            
        } while(numero>=0);// 2º Condicion del bucle
        
        System.out.println("Bucle del 10 al 0 terminado");
        
        // Pedir datos al usuario hasta que sea un numero entre 100 - 200
        Scanner teclado = new Scanner(System.in);
        
        int valor;
        
        do{
            // 3º Codigo que queramos que se repita
            System.out.println("Introduce un numero entre 100 y 200");
            valor = teclado.nextInt();//1º Inicializacion variable control
            
            //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL
            
        } while(valor < 100 || valor > 200); // 2º Condicion del bucle
        
        
    }
}
