/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Ej08ArraysCuenta {

    public static void main(String[] args) {
        int tamaño;
        tamaño = leerEnteroSinErrores();
        Scanner teclado = new Scanner(System.in);
        // crear el array 
        int[] enteros = new int[tamaño];
        // recorrer el array
        for (int i = 0; i < enteros.length; i++) {
            // rellenar el array
            System.out.println("Introduce un numero");
            int numero = teclado.nextInt();
            enteros[i] = numero;
        }

        // recorrer el array para ver cuantos asteriscos debe de poner
        for (int i = 0; i < enteros.length; i++) {
            // poner tantos asteriscos como sea el numero
            for (int j = 0; j < enteros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // metodo que lee un numero entero sin errores
    public static int leerEnteroSinErrores() {
        int numero;
        Scanner teclado = new Scanner(System.in);
        do {
            // pide el numero entero
            System.out.println("Introduce un numero entero: ");
            try {
                // codigo que puede dar error de tipo
                numero = teclado.nextInt();
                break;
                // capturar excepcion inputmismatch
            } catch (InputMismatchException ime) {
                // si la expecion se produce, pedir el numero
                System.out.println("El entero es erroneo, introducelo de nuevo");
                //  limpiar el buffer sino se creara un bucle infinito
                teclado.nextLine();
            }
        } while (true);

        return numero;
    }
}
