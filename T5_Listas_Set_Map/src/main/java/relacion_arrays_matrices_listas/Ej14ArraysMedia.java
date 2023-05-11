/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;


import java.util.Random;

/**
 *
 * @author Jose Angel
 */
public class Ej14ArraysMedia {

    public static void main(String[] args) {
        // declarar matriz 3x3
        int[][] tablaEnteros;
        // inicializar la matriz que contiene 3 filas y 3 columnas
        tablaEnteros = new int[3][3];

        // llamada al metodo que rellena con numeros aleatorios 
        rellenarMatrizAleatorios(tablaEnteros);

        // mostrar la matriz
        imprimirMatrizEneteros(tablaEnteros);

        System.out.println("");

        // mostrar la media
        double media = calcularMediaMatrizEnteros(tablaEnteros);
        System.out.println("Media: " + media);

        // crear array para guardar valores minimo y maximo
        int mayor = CalcularMaximoMatriz(tablaEnteros);
        int menor = CalcularMinimoMatriz(tablaEnteros);

        // mostrar el minimo y el maximo
        System.out.println("Minimo: " + menor);
        System.out.println("Maximo: " + mayor);
        

    }

    // metodo que imprime una matriz de enteros
    private static void imprimirMatrizEneteros(int[][] matrizAMostrar) {

        // recorrer la matriz
        for (int i = 0; i < matrizAMostrar.length; i++) {
            for (int j = 0; j < matrizAMostrar[i].length; j++) {
                // mostrar cada uno de los elementos
                System.out.print(matrizAMostrar[i][j] + " ");

            }
            // salto de linea para separar cada una de las filas
            System.out.println("\n");
        }
    }

    // metodo que rellena la matriz con aleatorios entre 1 y 100
    private static void rellenarMatrizAleatorios(int[][] matrizARellenar) {
        // Constructor random
        Random generador = new Random();
        int numeroAleatorio;
        // recorrer la matriz
        for (int i = 0; i < matrizARellenar.length; i++) {
            for (int j = 0; j < matrizARellenar[i].length; j++) {
                // cambiar numero aleatorio en cada vuelta (entre 1 y 100)
                numeroAleatorio = generador.nextInt(1, 101);
                // colocar el numero aleatorio en la posicion
                matrizARellenar[i][j] = numeroAleatorio;

            }

        }
    }

    // metodo que calcula la media de todos los numeros
    private static double calcularMediaMatrizEnteros(int[][] matrizParaMedia) {
        double sumaMatriz = 0; // contador que suma cada elemento de la matriz
        // recorrer la matriz
        for (int i = 0; i < matrizParaMedia.length; i++) {
            for (int j = 0; j < matrizParaMedia[i].length; j++) {
                // sumar cada uno de los numeros de la matriz
                sumaMatriz += matrizParaMedia[i][j];

            }
        }
        // calcular tamaño total de la matriz multipicando filas por columnas
        int tamañoTotalMatriz = matrizParaMedia.length * matrizParaMedia[0].length;
        // calcular la media
        double media = sumaMatriz / tamañoTotalMatriz;
        return media;
    }

    
    // metodo que calcula el minimo de una matriz
    private static int CalcularMinimoMatriz(int[][] matrizSaberMinimo){
        // asginar al maximo el primer valor de la matriz
        int minimo = matrizSaberMinimo[0][0];
        // recorrer la matriz
        for (int i = 0; i < matrizSaberMinimo.length; i++) {
            for (int j = 0; j < matrizSaberMinimo[i].length; j++) {
                // si la posicion actual es menor que el maximo
                if (matrizSaberMinimo[i][j] < minimo) {
                    // el minimo ahora, sera el numero actual para que en la
                    // siguiente iteracion compare el siguiente numero
                    // con el anterior mas pequeño
                    minimo = matrizSaberMinimo[i][j];
                }

            }
        }
        return minimo;
    }
    
    // metodo que calcula el maximo de una matriz
    private static int CalcularMaximoMatriz(int[][] matrizSaberMaximo){
         // asginar al maximo el primer valor de la matriz
        int maximo = matrizSaberMaximo[0][0];
        // recorrer la matriz
        for (int i = 0; i < matrizSaberMaximo.length; i++) {
            for (int j = 0; j < matrizSaberMaximo[i].length; j++) {
                // si la posicion actual es mayor que el maximo
                if (matrizSaberMaximo[i][j] > maximo) {
                    // el maximo ahora, sera el numero actual para que en la
                    // siguiente iteracion compare el siguiente numero
                    // con el anterior mas grande
                    maximo = matrizSaberMaximo[i][j];
                }

            }
        }
        return maximo;
    }
    
}
