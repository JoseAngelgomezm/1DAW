/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_ejercicios;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Ej01 {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce tu edad:");

                int edad = scanner.nextInt();

                if (edad >= 18) {
                        System.out.println("Es mayor de edad");
                } else {
                        System.out.println("No es mayor de edad");
                }

                System.out.print("mostrar la edad: ");
                System.out.println(edad);
                
                // Para 15 mostraria No es mayor de edad y luego mostraria 15
                
                // Para 18 mostraria Es mayor de edad y luego mostraria 18
                
                // Para 60 mostraria Es mayor de edad y luego mostraria 60
        }

}

