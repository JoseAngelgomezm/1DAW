/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author joseangel
 */
public class Ej01 {
     public static void main(String[] args) {
         // 1.a)
         //Datos primitivos
         //Enteros
         byte numero1;
         short numero2;
         int numero3;
         long numero4;
         
         //Coma Flotante
         float numero5;
         double numero6;
         
         //Caracteres
         char letra1;
         
         //Boleano
         boolean opcion1;
         
         // 1.b)
         final double CONSTANTE_PI;
         final int CONSTANTE_PRECIO;
         
         // 1.c)
         String cadena;
         
         // 1.d)
         numero1 = 2;
         numero2 = 500;
         numero3 = 8000;
         numero4 = 700l;
         numero5 = 70.665f;
         numero6 = 5.7677;
         letra1 = 'A';
         opcion1 = true;
         CONSTANTE_PI = 3.141516;
         CONSTANTE_PRECIO = 40;
         cadena = "AEIOU";
         
         // 1.e)
         System.out.println("byte: " + numero1);
         System.out.println("short: " + numero2);
         System.out.println("int: " + numero3);
         System.out.println("long: " + numero4);
         System.out.println("float: " + numero5);
         System.out.println("double: " + numero6);
         System.out.println("char: " + letra1);
         System.out.println("boolean: " + opcion1);
         System.out.println("Constante double: " + CONSTANTE_PI);
         System.out.println("Constante int: " + CONSTANTE_PRECIO);
         System.out.println("Objeto String: " + cadena);
         
         // 1.f)
         System.out.printf("float 2 decimales: %.2f %ndouble 2 decimales: %.2f " 
                 ,numero5, numero6);

    }
}
