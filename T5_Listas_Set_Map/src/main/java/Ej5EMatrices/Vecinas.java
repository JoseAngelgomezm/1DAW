/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5EMatrices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Vecinas {

    public static void main(String[] args) {
        // crear una matriz de 3x3
        int[][] matrizEnteros = new int[3][3];
        int numeroInsertar = 0;

        // rellenar la matriz con numeros consucetivos
        rellenarMatriz(matrizEnteros);

        // mostrar la matriz
        mostrarMatriz(matrizEnteros);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una fila");
        int fila = teclado.nextInt();
        
        System.out.println("Introduce una columna");
        int columna = teclado.nextInt();
        
        
        // crear una lista con las casillas vecinas
        List<Casillas> listaCasillas = casillasVecinas(fila, columna, matrizEnteros);
        
        // mostrar la lista
        for (int i = 0; i < listaCasillas.size(); i++) {
            System.out.println(listaCasillas.get(i));
            
        }
    }

    // metodo que devuelve una lista de casillas
    // el objeto casilla contiene fila columna y elemento
    public static List<Casillas> casillasVecinas(int fila, int columna, int[][] matriz) {
        List<Casillas> listaCasillas = new ArrayList<>();

        // comprobar si la fila y la columna son validas
        if (filaValida(fila, matriz) && columnaValida(columna, matriz)) {
            // recorrer la matriz
            // se recorre desde la fila anterior que se pasa por parametro
            // hasta la siguiente fila

            for (int i = fila - 1; i <= fila + 1; i++) {
                // si la fila es valida se mira la columna
                if (filaValida(i, matriz)) {
                    // se recorre la columna desde la anterior que se pasa por parametro
                    // hasta la siguiente columna
                    for (int j = columna - 1; j <= columna + 1; j++) {
                        // si la columna tambien es valida
                        if (columnaValida(j, matriz)) {
                            // si fila y la columna es en la que estamos
                            if (i == fila && j == columna) {
                                // continuar con la ejercucion del programa
                                continue;
                            }
                            
                            listaCasillas.add(new Casillas(i, j, matriz[i][j]));
                        }

                    }

                }

            }

        }

        return listaCasillas;
    }
    // devuelve true si la fila es valida
    // false si no lo es

    public static boolean filaValida(int fila, int[][] matriz) {
        return fila >= 0 && fila < matriz.length;
    }

    // devuelve true si la columna es valida
    // false si no lo es
    public static boolean columnaValida(int columna, int[][] matriz) {
        return columna >= 0 && columna < matriz.length;
    }

    public static void mostrarMatriz(int[][] matrizAMostrar) {
        // mostrar la matriz
        for (int i = 0; i < matrizAMostrar.length; i++) {
            for (int j = 0; j < matrizAMostrar[i].length; j++) {
                System.out.printf(matrizAMostrar[i][j] + " ");
            }
            System.out.println();
        }
    }

    // metodo que rellena la matriz con numeros consecutivos
    public static void rellenarMatriz(int[][] matrizARellenar) {
        int numeroInsertar = 0;
        for (int i = 0; i < matrizARellenar.length; i++) {
            for (int j = 0; j < matrizARellenar[i].length; j++) {
                matrizARellenar[i][j] = numeroInsertar++;
            }

        }
    }
}
