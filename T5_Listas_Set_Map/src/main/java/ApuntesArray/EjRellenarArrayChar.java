/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApuntesArray;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class EjRellenarArrayChar {

    // con un metodo rellenar un array de char con un abacedario
    // con un metodo rellenar de enteros un array de enteros que contenga una posicion valida del array de char (0-25)
    // generar el array de enteros con numeros aleatorios
    // con un metodo rellenar un array de string con los arrays generados automaticamente con las posicion del array de enteros y las letras del abecedario
    public static void main(String[] args) {
        // preguntar por los arrays que quiere el usuario
        int numeroPosicionesArrays = preguntarArrays();
        char[] abecedario = new char[26];
        int[] posicionesAleatorias = new int[26];
        // array de string con la longitud del numero de arrays que hemos pedido
        String[] arrayConTodosLosAleatorios = new String[numeroPosicionesArrays];

        // rellenar el array de char con el abacedario
        abecedario = generarCharAbecedario();
        // mostrar el array de char
        mostrarArrayChar(abecedario);
        System.out.println();

        // crear el array de posiciones aleatorias
        posicionesAleatorias = generarPosicionesAleatorias();
        mostrarArrayInt(posicionesAleatorias);
        System.out.println();
        
        // crear el array de string con las letras de las posiciones aleatorias
        arrayConTodosLosAleatorios = generarArrayString(posicionesAleatorias, abecedario, numeroPosicionesArrays);
        mostrarArrayString(arrayConTodosLosAleatorios);
        
    }

    // metodo para preguntar cuantos arrays queremos generar
    public static int preguntarArrays() {
        Scanner teclado = new Scanner(System.in);
        int numeroArrays;
        do {
            System.out.println("¿Cuantas cadenas de texto quieres generar?: ");
            try {
                numeroArrays = teclado.nextInt();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero valido");
                teclado.nextLine();
            }
        } while (true);
        return numeroArrays;
    }

    // metodo que rellena un array con un abecedario
    public static char[] generarCharAbecedario() {
        char[] aRellenarConAbecedario = new char[26];
        // determinamos la primera letra
        char primeraLetra = 'A';
        for (int i = 0; i < aRellenarConAbecedario.length; i++) {
            // añadimos al array de char la letra +1 en cada posicion
            aRellenarConAbecedario[i] = primeraLetra++;
        }
        return aRellenarConAbecedario;
    }

    // metodo que muestra el array de char
    public static void mostrarArrayChar(char[] arrayAMostrar) {
        for (int i = 0; i < arrayAMostrar.length; i++) {
            System.out.print(" " + arrayAMostrar[i]);

        }
    }

    // metodo que genera un array de enteros con numeros aleatorios (posiciones
    // validas del array del abecedario)
    public static int[] generarPosicionesAleatorias() {
        //objeto random
        java.util.Random generador = new java.util.Random();
        int[] posiciones = new int[26];
        for (int i = 0; i < posiciones.length; i++) {
            // rellenar el array con posiciones aleatorias del 0 al 26
            // numero random que genera del 0 al 26
            int numero = generador.nextInt(0, 27);
            posiciones[i] = numero;
        }
        return posiciones;
    }

    // metodo que muestra el array de posiciones
    public static void mostrarArrayInt(int[] posiciones) {
        for (int i = 0; i < posiciones.length; i++) {
            System.out.print(" " + posiciones[i]);
        }
    }

    // metodo que rellear el array de string con letras de las posiciones
    // generadas aleatorias
    public static String[] generarArrayString(int[] posiciones, char[] abecedario, int numeroPosicionesArrays) {
        String[] arrayDeString = new String[numeroPosicionesArrays];
        for (int i = 0; i < arrayDeString.length; i++) {
        
            
        }
        return arrayDeString;
    }
    
    // metodo que muestra el string de arrays
    public static void mostrarArrayString(String[] arrayDeString) {
        for (int i = 0; i < arrayDeString.length; i++) {
            System.out.print(" " + arrayDeString[i]);
        }
    }
}
