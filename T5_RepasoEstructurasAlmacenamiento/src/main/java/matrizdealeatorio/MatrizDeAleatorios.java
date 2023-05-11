/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package matrizdealeatorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jose Angel
 */
public class MatrizDeAleatorios {

    public static void main(String[] args) {
        // crear la matriz
        int[][] matriz = new int[2][2];

        rellenarMatrizConAleatoriosSinRepetir(matriz);

        // imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // metodo que rellena la matriz con numeros aleatorios sin que se repitan
    public static void rellenarMatrizConAleatoriosSinRepetir(int[][] matriz) {
        java.util.Random generador = new java.util.Random();
        // generar un numero aleatorio desde el 1 hasta el cuadradrado de la matriz
        int numeroAleatorio = generador.nextInt(1, matriz.length * matriz.length + 1);
        // crear una lista para ir guardando los numeros que van saliendo
        List<Integer> listaNumerosYaSalidos = new ArrayList<>();

        // rellenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // si el numero aleatorio esta en la lista de numeros que ya han salido
                // generar un numero nuevo
                if (listaNumerosYaSalidos.contains(numeroAleatorio)) {
                    // generar un numero nuevo hasta que salga uno que no este en la lista
                    do {                        
                        numeroAleatorio = generador.nextInt(1, matriz.length * matriz.length + 1);
                    } while (listaNumerosYaSalidos.contains(numeroAleatorio));
                    // añadir el numero que no esta repetido
                    matriz[i][j] = numeroAleatorio;
                    // guardar el numero aleatorio que ya ha salido en una lista
                    listaNumerosYaSalidos.add(numeroAleatorio);
                } else {
                    // poner el numero en la matriz
                    matriz[i][j] = numeroAleatorio;
                    // guardar el numero aleatorio que ya ha salido en una lista
                    listaNumerosYaSalidos.add(numeroAleatorio);
                    // generar un numero nuevo
                    numeroAleatorio = generador.nextInt(1, matriz.length * matriz.length + 1);
                }

            }

        }
    }
}
