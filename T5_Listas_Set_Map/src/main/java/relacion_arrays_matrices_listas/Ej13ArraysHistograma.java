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
public class Ej13ArraysHistograma {
    
    public static void main(String[] args) {
        int numeroTeclado = -1;
        int salir = 0;
        String[] arrayAsteriscos = new String[19];// array que guardara el histograma
        Scanner teclado = new Scanner (System.in);
        
        // rellenar el array con numeros del 1 al 20
        for (int i = 0; i < arrayAsteriscos.length; i++) {
                arrayAsteriscos[i] = String.valueOf(i+1) + ": ";
        }
        
        // pedir numeros hasta introducir 0
        do {            
            System.out.println("Introduce un entero entre 1-20: ");
            // bloque try catch para no introducir letras
            try {
                 numeroTeclado = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero");
                teclado.nextLine();
            }
            // si el numero es mayor que 0 guardar un asterisco en la posicion
            // del array introducida por teclado -1
            if (numeroTeclado > 0) {
                // bloque try catch para no salir del array +20 o -1
                try {
                    arrayAsteriscos[numeroTeclado-1] += "*";
                } catch (ArrayIndexOutOfBoundsException aob) {
                    System.out.println("Introduce un numero entre 1 y 20");
                }
                
            }
        } while (numeroTeclado != salir);// pedir numeros hasta que sea 0
       
        // recorrer el array para imprimir numeros y asteriscos
        for (String arrayAsterisco : arrayAsteriscos) {
            System.out.println(arrayAsterisco);
        }
        
    }
    
    // metodo que lee un numero entero sin errores
    public static int leerEnteroSinErrores() {
        int numero = 0;
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
        } while (numero < 1 && numero > 21);

        return numero;
    }
}
