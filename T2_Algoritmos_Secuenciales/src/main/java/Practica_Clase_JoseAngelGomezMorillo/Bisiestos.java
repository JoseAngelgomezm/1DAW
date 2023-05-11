/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Practica_Clase_JoseAngelGomezMorillo;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Bisiestos {

    public static void main(String[] args) {
        // Bucle hasta que el usuario introduzca 0
        Scanner teclado = new Scanner(System.in);// crear objeto scanner
        int año;
        do {
            // Pedir año al usuario
            System.out.println("Introduce un año (0) para cerrar: ");
            año = teclado.nextInt();

            // Si el año es negativo, ponerlo positivo
            if (año < 0) {
                año = año * -1;
            }
            // si el año es mayor que 1, decir si es bisiesto o no
            if (año >= 1) {
                System.out.println("Has introducido el año: " + año);

                // Tiene que decir que si el año es bisiesto o no
                // Condiciones para ser bisiesto: divisible por 4 y (no divisible por 100
                // o divisible por 400)
                if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                    System.out.println("El año " + año + " es bisiesto");
                } else {
                    System.out.println("El año " + año + " no es bisiesto");
                }
                // bisiestos : 2000 , 2004  no bisiesto: 1900

            }
            // sino sera 0 por lo tanto salir
            else {
                System.out.println("has introducido 0, cerrando el programa");;
            }

        } while (año !=0 );

    }
}
