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
public class Utilidades {

    private static Scanner teclado = new Scanner(System.in);
    private static java.util.Random generadorRandom = new java.util.Random();

    // Pide un numero entero hasta que se introduzca un entero.

    /**
     * Lee un numero entero sin errores
     * @return devuelve el numero entero.
     */
    public static int leerEnteroSinErrores() {
        int numero;

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

    // Pide un numero entero hasta que esté en un rango de numeros

    /**
     * Pide un numero entero hasta que este en el rango de los parametros de entrada
     * @param minimo minimo en el que queremos que este el numero
     * @param maximo maximo en el que queremos que este el numero
     * @return devuelve el numero en el rango que pasamos por parametro
     */
    public static int leerEnteroEnUnRango(int minimo, int maximo) {
        int numero;
        do {
            numero = leerEnteroSinErrores();
        } while (numero < minimo || numero > maximo);

        return numero;
    }

    // Genera un numero aleatorio dando el minimo y el maximo

    /**
     *
     * @param minimo
     * @param maximo
     * @return
     */
    public static int generarRandomEnRango(int minimo, int maximo) {
        int numero;
        maximo++;
        numero = generadorRandom.nextInt(minimo, maximo);
        return numero;
    }

    // Comprobar que un numero esta en un rango

    /**
     *  Pide un numero por teclado y comprueba si esta en el rango
     *  que le pasamos en la llamada
     * @param minimo numero minimo del rango
     * @param maximo numero maximo del rango
     * @return devuelve true o false si esta en el rango o no
     */
    public static boolean comprobarEnteroRango(int minimo, int maximo) {
        int numero = leerEnteroSinErrores();
//        if () {
//            comprobador = false;
//        }
//        else{
//            comprobador = true;
//        }
//        return comprobador;
        return numero <= maximo && numero >= minimo;
    }

    // algoritmo burbuja

    /**
     * recibe un array de enteros y lo ordena
     * @param numeros array de enteros
     */
    public static void ordenarArrayBurbuja(int[] numeros) {
        int tmp;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    tmp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = tmp;
                }
            }
        }

    }

    // metodo que busca elemento en un array y nos devuleve la posicion
    // en la que esta, si hay varios nos devuelve la primera, si no existe
    // devuelve -1

    /**
     * Busca un elemento en un array
     * @param arrayEnteros en el cual queremos buscar un elemento
     * @param elementoABuscar elemento que buscaremos en el array
     * @return devuelve la posicion en la que esta el elemento y -1 si no existe
     */
    public static int busquedaSecuencial(int[] arrayEnteros, int elementoABuscar) {
        int indiceBusqueda = -1;
        // recorrer al array
        for (int i = 0; i < arrayEnteros.length; i++) {
            // comparar el elemento de la posicion en la que estoy
            // con el elemento a buscar
            if (arrayEnteros[i] == elementoABuscar) {
                indiceBusqueda = i;// guarda la posicion del array para devolver
                break;
            }
        }
        return indiceBusqueda;
    }

    // se le pasa un numero de fila y te devuelve las columnas que tiene esa fila
    // devuelve -1 si no tiene columnas

    /**
     *
     * @param matrizSaberColumnas matriz que recibe de la cual queremos saber las columnas
     * @param numeroDeFilaParaSaberColumnas numero de fila de la cual queremos saber el numero de columnas que tiene
     * @return devuelve -1 si la fila no existe
     */
    public static int calcularColumnasMatrizInt(int[][] matrizSaberColumnas, int numeroDeFilaParaSaberColumnas) {
        int numeroColumnas = -1;
        
        if (numeroDeFilaParaSaberColumnas < matrizSaberColumnas.length && numeroDeFilaParaSaberColumnas > 0) {
            numeroColumnas = matrizSaberColumnas[numeroDeFilaParaSaberColumnas].length;
        }
        return numeroColumnas;
    }

}
