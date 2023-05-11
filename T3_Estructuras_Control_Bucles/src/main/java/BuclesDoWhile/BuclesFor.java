/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesDoWhile;

/**
 *
 * @author joseangel
 */
public class BuclesFor {
    public static void main(String[] args) {
        //Imprimir del 0 al 10
        //1º Inicializacion variable control (int i=0)
        //2º Condicion del bucle (i<=10)
        //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL (i++)
        for (int i=0; i<=10 ; i++){
            // 3º Codigo que queramos que se repita
            System.out.println(i);
        }
        
        System.out.println("Termina bucle del 0 al 10");
        
        //Imprimir del 0 al 20 de 2 en 2
        for (int i=0; i<=20 ; i+=2){
            // 3º Codigo que queramos que se repita
            System.out.println(i);
        }
        
        System.out.println("Termina bucle del 0 al 20 de 2 en 2");
        
        //Imprimir del 20 al 0 
        for (int i=20; i>0 ; i--){
            // 3º Codigo que queramos que se repita
            System.out.println(i);
        }
        
        System.out.println("Termina bucle del 20 al 0");
    }
}
