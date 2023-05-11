/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class Ej06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            // Pedir el lado del cuadrado
            System.out.println("Introduce un lado del cuadrado: ");
            double lado = entrada.nextDouble();
            // Realizar la operacion
            double resultado = Math.pow(lado, 2);
            // Mostrar el resultado
            System.out.println("El area del cuadrado es: " + resultado);
        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el área de un triángulo...");
            // Pedir base y altura del triangulo
            System.out.println("Introduce la base del triangulo: ");
            double baseTriangulo = entrada.nextDouble();
            System.out.println("Introduce la altura del triangulo: ");
            double alturaTriangulo = entrada.nextDouble();
            // Realizar las operaciones
            double resultado = baseTriangulo * alturaTriangulo / 2;
            // Mostrar el resultado
            System.out.println("El area del triangulo es : " + resultado);

        } else if (opcion == 3) {

            System.out.println("Ha seleccionado calcular el área de un círculo...");
            // Pedir el radio del circulo
            System.out.println("Introduce el radio del circulo: ");
            double radioCirculo = entrada.nextDouble();
            // Realizar operaciones para determinar area
            double resultado = Math.PI * Math.pow(radioCirculo, 2);
            // Mostrar resultado por pantalla
            System.out.println("El area del circulo es: " + resultado);
        } else {
            System.out.println("Ha seleccionado terminar");
        }

    }
}
