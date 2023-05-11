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
public class BucleWhile {
    public static void main(String[] args) {
        // EL BUCLE WHILE EJECUTA ENTRE 0 Y N VECES
        //Imprimir numero del 0 al 10
        
        // 1º Inicializacion variable control
        int numero = 0;
        
        // 2º Condicion del bucle
        //Mientras la condicion sea true se repite el codigo dentro del while
        while(numero <= 10 ){
            
            // 3º Codigo que queramos que se repita
            System.out.println(numero);
            
            //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL
            numero ++;
            
        }
        
        System.out.println("El bucle del 0 al 10 ha terminado");
        
        // Imprimir numero del 20 al 0
        
        // 1º Inicializacion variable control
        numero = 20;
        
        // 2º Condicion del bucle
        while (numero >= 0){
            // 3º Codigo que queramos que se repita
            System.out.println(numero);
            
            //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL
            numero --;
        }
        
        System.out.println("El bucle del 20 al 0 ha terminado");
        
        //Imprimir del 50 al 70 de 3 en 3
        
        // 1º Inicializacion variable control
        numero = 50;
        
        // 2º Condicion del bucle
        while (numero <= 70){
            // 3º Codigo que queramos que se repita
            System.out.println(numero);
            
            //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL
            numero+=3; 
        }
        
        System.out.println("El bucle del 50 al 70 de 3 en 3 ha terminado");
        
        
        //Pedir un numero del 100 al 200 , si no es correcto, volver a pedirlo
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero del 100 al 200");
        int num = teclado.nextInt();// 1º Inicializacion variable control

        // 2º Condicion del bucle
        while (num<100 || num>200){
            // 3º Codigo que queramos que se repita
            System.out.println("Te has equivocado, introduce un numero"
                    + " dentro del rango 100 - 200");
            //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL
            num = teclado.nextInt();// 1º Inicializacion variable control
        }
            System.out.println(num);
    }
}
