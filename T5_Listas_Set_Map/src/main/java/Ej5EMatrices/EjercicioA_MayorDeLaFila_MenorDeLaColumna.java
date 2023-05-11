/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5EMatrices;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class EjercicioA_MayorDeLaFila_MenorDeLaColumna {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int columnas = 0;
        int filas = 0;
        int[] coordenadas = new int[2];
        opcion = menu();
        Random generadorRandom = new Random();
        switch (opcion) {

            // opcion 1 Los elementos de la matriz se introducen a continuacion
            case 1 -> {
                // pedir filas entre 3 y 6
                do {
                    System.out.println("Introduce numero de filas entre 3 y 6");
                    try {
                        filas = teclado.nextInt();
                    } catch (Exception e) {
                        System.out.println("No es numero valido");
                        // limpiar buffer
                        teclado.nextLine();
                    }

                } while (filas < 3 || filas > 6);

                // pedir columnas entre 3 y 6
                do {
                    System.out.println("Introduce numero de columnas entre 3 y 6");
                    try {
                        columnas = teclado.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println("No es numero valido");
                        // limpiar buffer
                        teclado.nextLine();
                    }

                } while (columnas < 3 || columnas > 6);

                // crear la matriz con las filas y columnas introducidas por el usuario
                int[][] matriz = new int[filas][columnas];

                // recorrer la matriz para pedir numero de cada posicion
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        int numero = -1;

                        // pedir el numero hasta que sea uno valido
                        do {
                            System.out.println("Introduce el numero para la posicion: " + i + "-" + j);
                            try {
                                numero = teclado.nextInt();
                            } catch (InputMismatchException ime) {
                                System.out.println("El numero Introducido no es valido");
                            }
                        } while (numero < 0);
                        // insertar el numero en la posicion actual cuando sea valido
                        matriz[i][j] = numero;

                    }

                }
                System.out.println("La matriz queda de la siguiente manera: ");
                // mostrar la matriz
                imprimirMatrizEneteros(matriz);
                // mostrar coordenadas del elemento mas grande de su fila
                // y mas pequeño de su columna
                coordenadas = masGrandeFilaMasPequeñoColumna(matriz);
                // recorrer array para mostrar las coordenadas
                for (int i = 0; i < coordenadas.length; i++) {
                    System.out.print(coordenadas[i]);
                }
            }
            // opcion 2 los elementos de la matriz se generan automaticamente entre 1 y 20
            case 2 -> {
                // pedir filas entre 3 y 6
                do {
                    System.out.println("Introduce numero de filas entre 3 y 6");
                    try {
                        filas = teclado.nextInt();
                    } catch (Exception e) {
                        System.out.println("No es numero valido");
                        // limpiar buffer
                        teclado.nextLine();
                    }

                } while (filas < 3 || filas > 6);

                // pedir columnas entre 3 y 6
                do {
                    System.out.println("Introduce numero de columnas entre 3 y 6");
                    try {
                        columnas = teclado.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println("No es numero valido");
                        // limpiar buffer
                        teclado.nextLine();
                    }

                } while (columnas < 3 || columnas > 6);

                // crear la matriz con las filas y columnas introducidas por el usuario
                int[][] matriz = new int[filas][columnas];

                // recorrer la matriz para rellenar con numeros aleatorios
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        // cambiar numero con generador en cada iteracion
                        int numero = generadorRandom.nextInt(1, 21);
                        // en la posicion actual introducir el numero aleatorio
                        matriz[i][j] = numero;
                    }
                }
                System.out.println("La matriz queda de la siguiente manera: ");
                // mostrar la matriz
                imprimirMatrizEneteros(matriz);
                // mostrar coordenadas del elemento mas grande de su fila
                // y mas pequeño de su columna
                coordenadas = masGrandeFilaMasPequeñoColumna(matriz);
                // recorrer array para mostrar las coordenadas
                for (int i = 0; i < coordenadas.length; i++) {
                    System.out.print(coordenadas[i]);
                }
            }
            // opcion 3 Salir
            case 3 -> {
                System.out.println("Has elegio salir.");
            }
            default ->
                throw new AssertionError();
        }
        // opcion1 Los elementos de la matriz se introducen a continuacion
        // opcion 2 los elementos de la matriz se generan automaticamente entre 1 y 20
    }

    // metodo que muestra el menu y recoge una opcion
    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            String menu = """
                      1- Introduce un numero para determinar el tamaño de la matriz
                      (Los elementos de la matriz se introducen a continuacion)
                      
                      
                      2- Introduce un numero para determina el tamaño de la matriz
                      (los elementos de la matriz se generan automaticamente entre 1 y 20)
                      
                      3- Salir
                      """;
            System.out.println(menu);
            opcion = teclado.nextInt();
        } while (opcion < 1 || opcion > 3);

        return opcion;
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

    // metodo que recorre una fila del array y se queda con el elemento
    // mas grande y devuelve la coordenada de ese elemento
    private static int[] masGrandeFilaMasPequeñoColumna(int[][] matrizRecibe) {
        int[] coordenadas = new int[2];
        int elementoMasGrandeFila;
        int columnaMasGrande = 0;
        int filaMasGrande = 0;
        // recorrer la matriz
        for (int i = 0; i < matrizRecibe.length; i++) {
            // suponer que el valor mas grande de la fila es el primero de cada fila
            elementoMasGrandeFila = matrizRecibe[i][0];
            // tambien guardar su fila y su columna, por si esta en la posicion 0
            filaMasGrande = i;
            columnaMasGrande = 0;
            // primero recorrer la fila para obtener el mas grande
            for (int j = 0; j < matrizRecibe[i].length; j++) {
                // si el valor actual que estoy mirando es mas grande
                // que el elemento mas grande de la fila
                if (matrizRecibe[i][j] > elementoMasGrandeFila) {
                    elementoMasGrandeFila = matrizRecibe[i][j];
                    // quedarnos con la columna del elemento mas grande
                    filaMasGrande = i;
                    columnaMasGrande = j;

                }
            }
            // una vez tenemos el mas grande de la fila mirar la columna
            // para comparar el mas grande con cada uno de los elementos de la 
            // columna
            for (int k = 0; k < matrizRecibe.length; k++) {
                // si el elemento que estamos mirando
                // es mas grande que el mas grande de la fila
                // guardar coordenadas del mas grande
                if (elementoMasGrandeFila <= matrizRecibe[k][columnaMasGrande]) {
                    coordenadas[0] = filaMasGrande;
                    coordenadas[1] = columnaMasGrande;
                } else {
                    coordenadas[0] = -1;
                    coordenadas[1] = -1;
                }
            }

        }

        return coordenadas;
    }
}
