/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class ejClaseStringArrayChar {

    public static void main(String[] args) {
        int respuestaInt;
        String respuestaString;
        char[] respuestaChar;
        // creacion objeto scanner
        Scanner teclado = new Scanner(System.in);

        // leer por teclado sin errores
        do {
            System.out.println("Introduce un entero");
            try {
                respuestaInt = teclado.nextInt();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un entero valido");
                teclado.nextLine();
            }
        } while (true);

        //pasar el int a String
        respuestaString = String.valueOf(respuestaInt);

        // determinar el tamaño del array de char que sera del tamaño del string
        respuestaChar = new char[respuestaString.length()];

        //pasar el string a array de char
        respuestaChar = respuestaString.toCharArray();

        // mostrar el array de char 
        System.out.println("ARRAY DE CHAR: ");
        for (int i = 0; i < respuestaChar.length; i++) {
            System.out.print(" " + respuestaChar[i]);

        }

        // mostrar si es capicua o no
        System.out.println();
        System.out.println(esCapicua(respuestaChar));

    }

    // metodo que comprueba si el numero es capicuo
    public static boolean esCapicua(char[] arrayChar) {
        boolean respuesta = false;
        // recorre el char
        for (int i = 0; i < arrayChar.length; i++) {
            // si la primera posicion es igual a la posicion final
            // menos la actual es true, si hay alguna que no lo sea es false
            if (arrayChar[i] == arrayChar[arrayChar.length - 1 - i]) {
                respuesta = true;
            } else {
                return false;
            }
        }
        return respuesta;
    }
}
