/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jose Angel
 */
public class MainTrenes {

    public static void main(String[] args) {
        int[][] matriz = new int[3][4];

        rellenarIndiceTren(matriz);

        rellenarVagones(matriz);

        imprimirMatriz(matriz);

        Map<Integer, Tren> mapTrenes = generarEstructuraTrenes(matriz);

        imprimirMap(mapTrenes);

    }

    // metodo que rellena la primera casilla de las filas con el id del tren
    public static void rellenarIndiceTren(int[][] matriz) {
        // contador autoicrementado para indices empezando por 1
        int contador = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                // en la primera columna de cada fila poner el contador
                // para los ids que va incrementando por iteracion
                if (j == 0) {
                    matriz[i][j] = contador;
                    contador++;
                }
            }
        }
    }

    // metodo que rellena a partir de la primera columna con un numero 
    // de asientos por vagon
    public static void rellenarVagones(int[][] matriz) {
        java.util.Random generador = new java.util.Random();
        int numeroPlazas = generador.nextInt(0, 11);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                // rellenar desde la primera columna en adelante con un numero
                // aleatorio de pasajeros de 0 a 10
                if (j >= 1) {
                    matriz[i][j] = numeroPlazas;
                    numeroPlazas = generador.nextInt(0, 11);
                }
            }
        }
    }

    // metodo que imprime la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // generar estructura map
    public static Map<Integer, Tren> generarEstructuraTrenes(int[][] matriz) {
        Map<Integer, Tren> mapTrenes = new HashMap<>();
        int key = 0;
        int vagones = 0;
        int capacidadTotal = 0;

        // recorrer el array
        for (int i = 0; i < matriz.length; i++) {

            // reiniciar contadores cuando cambia de fila
            vagones = 0;
            capacidadTotal = 0;

            for (int j = 0; j < matriz[i].length; j++) {

                // la primera columna sera la key
                if (j == 0) {
                    key = matriz[i][j];
                }

                // las demas columnas seran los vagones
                // y se contara la capacidad y los vagones
                if (j >= 1) {
                    // si el vagon contiene un 0 no contar nada, el tren
                    // acaba aqui
                    if (matriz[i][j] == 0) {
                        break;
                        // si tiene algo distinto de 0 contarlo como un vagon
                        // y sumar el numero actual a la capacidad
                    } else {
                        vagones++;
                        capacidadTotal += matriz[i][j];
                    }
                }

                // crear el tren y añadirlo a la estrcutura map
                mapTrenes.put(key, new Tren(key, vagones, capacidadTotal));

            }
        }
        return mapTrenes;
    }

    // imprimir map
    public static void imprimirMap(Map<Integer, Tren> map) {
        for (Map.Entry<Integer, Tren> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Tren val = entry.getValue();
            System.out.println("ID tren: " + key + " Tren: " + val);
        }
    }
}
