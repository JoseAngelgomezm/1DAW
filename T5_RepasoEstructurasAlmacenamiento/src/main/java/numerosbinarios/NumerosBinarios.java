/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerosbinarios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Angel
 */
public class NumerosBinarios {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];// crear la matriz
        int[] coordenadas = new int[2];// crear array para guardar coordenadas
        
        rellenarMatrizBinario(matriz);

        // imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        

        coordenadas = buscarVecinaEsquina(matriz);

        System.out.println("Coordenadas del encontrado: ");
        for (int i = 0; i < coordenadas.length; i++) {
            System.out.print(coordenadas[i]);
        }
    }

    // metodo que rellena la matriz con numeros binarios aleatorios 
    public static void rellenarMatrizBinario(int[][] matriz) {
        java.util.Random generador = new java.util.Random();
        // generar un numero aleatorio entre 1 y 0
        int numeroAleatorio = generador.nextInt(0, 2);

        // rellenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numeroAleatorio;
                numeroAleatorio = generador.nextInt(0, 2);
            }

        }
    }
    
    // metodoq ue busca las 4 esquinas que tengan un 1
    // devuelve -1 en caso de no encontrarla
    public static int[] buscarVecinaEsquina(int[][] matriz) {
        int[] filaColumna = new int[2];//almacenar fila y columna
        // establecer a -1 las posiciones
        filaColumna[0] = -1;
        filaColumna[1] = -1;
  
        final int NUMERO_ESQUINAS = 1;// numero que buscara en las esquinas
        
        // recorrer la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                // si la fila es la primera o la ultima no buscar
                if (i == 0 || i == (matriz.length - 1)) {
                    continue;
                }

                // si la columna es la primera o la ultima no buscar
                if (j == 0 || j == (matriz[0].length - 1)) {
                    continue;
                }

                // si no estamos en las esquinas y el numero actual es 0
                if (matriz[i][j] == 0) {
                    // revisar las 4 esquinas
                    if (matriz[i - 1][j - 1] == NUMERO_ESQUINAS &&
                        matriz[i + 1][j + 1] == NUMERO_ESQUINAS &&
                        matriz[i + 1][j - 1] == NUMERO_ESQUINAS && 
                        matriz[i - 1][j + 1] == NUMERO_ESQUINAS) {
                        // si en las 4 esquinas hay un 1
                        // guardar las coordenadas del elemento que estamos mirando
                        filaColumna[0] = i;
                        filaColumna[1] = j;
                        // pararlo para que no siga buscando
                        break;
                    }
                }
            }
        }
        return filaColumna;
    }
}
