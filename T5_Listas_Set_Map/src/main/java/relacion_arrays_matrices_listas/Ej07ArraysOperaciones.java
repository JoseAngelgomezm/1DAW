/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Ej07ArraysOperaciones {

    public static void main(String[] args) {
        // arrays
        int[] a1;
        int[] a2;
        int[] resultados;

        // variables
        int tamaño = 0;

        // objeto scanner 
        Scanner teclado = new Scanner(System.in);
        // objeto random
        java.util.Random generador = new java.util.Random();

        // pedir por teclado sin errores y filtrando el tamaño del array
        do {
            System.out.println("introduce el tamaño de los arrays (entero positivo): ");
            // bloque try catch
            try {
                tamaño = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero valido");
                teclado.nextLine();
            }
        } while (tamaño < 0);

        // declarar arrays con el tamaño anteriormente insertado
        a1 = new int[tamaño];
        a2 = new int[tamaño];
        resultados = new int[tamaño];
        
        // llenar a1 y a2 a la vez de numeros aleatorios
        for (int i = 0; i < a1.length; i++) {
            a1[i] = generador.nextInt(1, 101);
            a2[i] = generador.nextInt(1, 101);
        }
        
        // llamada a la funcion multiplicar que deuelve los resultados
        resultados = multiplicarArrays(a1, a2, tamaño);

        // llamada a la funcion para mostrar arrays
        mostrarArrays(a1, a2, resultados);
    }

    // metodo que multiplica los arrays y devuleve el resultado
    public static int[] multiplicarArrays(int[] a1, int[] a2, int tamaño) {
        int[] resultados = new int[tamaño];
        // bucle para recorrer array
        for (int i = 0; i < resultados.length; i++) {
            // guardar en cada posicion de resultados, el resultado de la
            // multiplicacion de la misma posicion de a1 por a2
            resultados[i] = a1[i] * a2[i];
        }

        return resultados;
    }

    // metodo que imprime por pantalla los arrays
    public static void mostrarArrays(int[] a1, int[] a2, int[] a3) {
        System.out.println("Array 1: ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(" " + a1[i]);
        }
        System.out.println("");
        System.out.println("Array 2: ");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(" " + a2[i]);
        }
        System.out.println("");
        System.out.println("Array 3: ");
        for (int i = 0; i < a3.length; i++) {
            System.out.print(" " + a3[i]);
        }

    }
}
