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
public class Ej05ArraysMetodos {

    public static void main(String[] args) {
        int cantidadPositivos = 0; // contador numeros positivos
        int cantidadNegativos = 0; // contador de numero negativos
        int cantidadCeros = 0; // contador de ceros
        int enteros[] = new int[10]; // array que guarda 10 enteros

        //crear objeto teclado
        Scanner teclado = new Scanner(System.in);

        // leer 10 numeros enteros
        almacenarDatosTeclado(enteros);

        //muestra los 10 numeros almacenados
        mostrarArray(enteros);

        // calcular el numero total de positivos, negativos y ceros en el array
        cantidadPositivos = contarPositivos(enteros);
        cantidadNegativos = contarNegativos(enteros);
        cantidadCeros = contarCeros(enteros);

        // mostrar resultado de positivos negativos y ceros
        String resultado = """
                           POSITIVOS: %d
                           NEGATIVOS: %d
                           CEROS    : %d
                           """.formatted(cantidadPositivos,
                cantidadNegativos, cantidadCeros);

        System.out.println(resultado);

        // media de los positivos
        calcularMediaPositivos(enteros);

        // media de los negativos
        calcularMediaNegativos(enteros);

    }

    // metodo que lee valores por teclado y los almacena en el array
    public static void almacenarDatosTeclado(int[] enteros) {
        for (int i = 0; i <= 9; i++) {
            enteros[i] = Utilidades.leerEnteroSinErrores();
        }
    }

    // metodo que cuenta los positivos del array
    public static int contarPositivos(int[] enteros) {
        int cantidadPositivos = 0;// contador de los positivos
        for (int i = 0; i < enteros.length; i++) {
            // si el numero de la posicion en la que esta es mayor que 0
            if (enteros[i] > 0) {
                cantidadPositivos++;
            }
        }
        return cantidadPositivos;
    }

    // metodo que cuenta los negativos del array
    public static int contarNegativos(int[] enteros) {
        int cantidadNegativos = 0;// contador de los negativos
        for (int i = 0; i < enteros.length; i++) {
            // si el numero de la posicion en la que esta es menor que 0
            if (enteros[i] < 0) {
                cantidadNegativos++;
            }
        }
        return cantidadNegativos;
    }

    // metodo que cuenta los ceros del array
    public static int contarCeros(int[] enteros) {
        int cantidadCeros = 0;// contador de los negativos
        for (int i = 0; i < enteros.length; i++) {
            // si el numero de la posicion en la que esta es igual que 0
            if (enteros[i] == 0) {
                cantidadCeros++;
            }
        }
        return cantidadCeros;
    }

    //metodo que muestra el array por pantalla
    public static void mostrarArray(int[] enteros) {
        for (int i = 0; i < enteros.length; i++) {
            System.out.printf(" " + enteros[i]);
        }
        System.out.println("");
    }

    // metodo que calcula la media de los positivos
    public static void calcularMediaPositivos(int[] enteros) {
        double sumaPositivos = 0;// almacena la suma de los positivos
        double media = 0;
        for (int i = 0; i < enteros.length; i++) {
            // si el numero de la posicion en la que esta es mayor que 0
            if (enteros[i] > 0) {
                // sumarlo a los positivos
                sumaPositivos += enteros[i];
            }
        }
        // calcular la media controlando excepccion
        try {
            media = sumaPositivos / contarPositivos(enteros);
        } catch (Exception ArithException) {
            media = 0;
        }
        
        // mostrar la media
        System.out.println("MEDIA DE POSITIVOS: " + media);
    }

    // metodo que calcula la media de los negativos
    public static void calcularMediaNegativos(int[] enteros) {
        double sumaNegativos = 0;// almacena la suma de los positivos
        double media = 0;
        for (int i = 0; i < enteros.length; i++) {
            // si el numero de la posicion en la que esta es menor que 0
            if (enteros[i] < 0) {
                // sumarlo a los negativos
                sumaNegativos += enteros[i];
            }
        }
        // calcular la media controlando excepccion
        try {
            media = sumaNegativos / contarNegativos(enteros);
        } catch (Exception ArithException) {
            media = 0;
        }
        // mostrar la media
        System.out.println("MEDIA DE NEGATIVOS: " + media);
    }
}
