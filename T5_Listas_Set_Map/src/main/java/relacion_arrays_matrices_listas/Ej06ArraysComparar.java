/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

import java.util.Arrays;

/**
 *
 * @author joseangel
 */
public class Ej06ArraysComparar {

    public static void main(String[] args) {
        // creacion de arrays
        int[] numeros1 = {1, 2, 3};
        int[] numeros2 = {1, 2, 3};
        int[] numeros3 = {1, 2, 3, 4};
        int[] numeros4 = {1, 2, 3};
        int[] numeros5 = {1, 2, 3};
        int[] numeros6 = {1, 2, 2};

        // compara el array 1 con todos los demas
        System.out.println("COMPARACIONES CON ARRAYS.EQUALS");
        System.out.println("¿Es numeros 1 igual que numeros2?: "
                + Arrays.equals(numeros1, numeros2));
        System.out.println("¿Es numeros 1 igual que numeros3?: "
                + Arrays.equals(numeros1, numeros3));
        System.out.println("¿Es numeros 1 igual que numeros4?: "
                + Arrays.equals(numeros1, numeros4));
        System.out.println("¿Es numeros 1 igual que numeros5?: "
                + Arrays.equals(numeros1, numeros5));
        System.out.println("¿Es numeros 1 igual que numeros6?: "
                + Arrays.equals(numeros1, numeros6));

        System.out.println("COMPARACIONES CON METODO CREADO");
        System.out.println("¿Es numeros 1 igual que numeros2?: "
                + compararArrays(numeros1, numeros2));
        System.out.println("¿Es numeros 1 igual que numeros2?: "
                + compararArrays(numeros1, numeros3));
        System.out.println("¿Es numeros 1 igual que numeros2?: "
                + compararArrays(numeros1, numeros4));
        System.out.println("¿Es numeros 1 igual que numeros2?: "
                + compararArrays(numeros1, numeros5));
        System.out.println("¿Es numeros 1 igual que numeros2?: "
                + compararArrays(numeros1, numeros6));

    }

    // metodo que compara 2 arrays y determina si son iguales
    public static boolean compararArrays(int[] array1, int[] array2) {
        boolean resultado = false;
        // si la longitud de array1 es distinta de la de array2 son disntitos
        if (array1.length != array2.length) {
            return resultado;
        }
        // si las longitudes son iguales, hay que comparar la posiciones
        for (int i = 0; i < array2.length; i++) {
            // si la posicion de array1 y array2 son iguales
            if (array1[i] == array2[i]) {
                // poner resultado a true
                resultado = true;
            } else {
                // sino ponerlo a false
                resultado = false;
            }
        }
        // devolver resultado
        return resultado;
    }
}
