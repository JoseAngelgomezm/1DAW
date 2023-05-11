/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Clase_JoseAngelGomezMorillo;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class InversorPalabras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);// crear objeto scanner
        String palabra;
        String palabraInvertida = "";
        // Pedir una palabra hasta que el usuario introduzca la palabra "salir"
        do {
            //Pedir palabra
            System.out.println("Introduce una palabra");
            palabra = teclado.nextLine().toLowerCase();
            
            // si pone otra palabara que no sea salir
            // crear palabra con letras alreves
            
            // Leer cada letra del string empezando por el final
            // i vale el tamaño de la palabra
            // mientras que el tamaño de la palabra sea mayor que 0
            // coger la letra que corresponde
            for (int i = palabra.length(); i >= 1 ; i--) {
                // Guardar en la letra auxiliar la posicion de la palabra -1
                // sino hay error de desbordamiento
                char letraAux = palabra.charAt(i-1);
                // una vez que tenemos la letra concatenar letra a letra
                // en un string
                palabraInvertida = palabraInvertida + String.valueOf(letraAux);
            }
            System.out.println("La palabra " + palabra + " invertida es : " + palabraInvertida);
            
        } while (palabra == "salir");
        
    }
}
