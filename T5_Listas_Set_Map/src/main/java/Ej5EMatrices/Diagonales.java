/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5EMatrices;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class Diagonales {

    public static void main(String[] args) {
        // crear una matriz de 3x3
        int[][] matrizEnteros = new int[3][3];

        // rellenar la matriz con numeros consecutivos
        rellenarMatriz(matrizEnteros);

        // mostrar la matriz
        mostrarMatriz(matrizEnteros);
        System.out.println("");
        
        System.out.println("DIAGONAL PRINCIPAL:");
        // diagonal principal
        mostrarDiagonalPrincipal(matrizEnteros);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("DIAGONAL SECUNDARIA:");
        // diagonal secundaria
        mostrarDiagonalSecundaria(matrizEnteros);
        
        
        // for each
        // for(int[] fila : m){
        //      for(int valor : fila){
        //          sout(valor + "");
        //  }
        //}
        // 
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

    // metodo que muestra obtiene los valores de la diagonal principal
    public static void mostrarDiagonalPrincipal(int[][] matrizParaDiagonalPrincipal) {
        int numeroDiagonalPrincipal;
        for (int i = 0; i < matrizParaDiagonalPrincipal.length; i++) {
            numeroDiagonalPrincipal = matrizParaDiagonalPrincipal[i][i];
            System.out.print(numeroDiagonalPrincipal);
        }
    }

    // metodo que muestra obtiene los valores de la diagonal secundaria
    public static void mostrarDiagonalSecundaria(int[][] matrizParaDiagonalPrincipal) {
        int numeroDiagonalSecundaria;
        for (int i = 0; i < matrizParaDiagonalPrincipal.length; i++) {
            numeroDiagonalSecundaria = matrizParaDiagonalPrincipal[i][matrizParaDiagonalPrincipal.length - 1 - i];
            System.out.print(numeroDiagonalSecundaria);

        }
    }
    
    // metodo que devuelve una lista con los elementos de la diagonal principal
    public static List<Integer> elementosDiagonalPrincipal(int[][] matrizDeLaQueMostrar){
        List<Integer> listaElementos = new ArrayList<>();
        
        for (int i = 0; i < matrizDeLaQueMostrar.length; i++) {
            listaElementos.add(matrizDeLaQueMostrar[i][i]);
            
        }
        
        return listaElementos;
    }
    
    // metodo que devuelve un array con los elementos de la diagonal secundaria
    public static int[] elementosDiagonalSecundariaArray(int[][] matrizDeLaQueMostrar){
        // crear el array con el tamaño de la matriz de la que vamos a mostrar
        // los elementos
        int[] arrayElementos = new int[matrizDeLaQueMostrar.length];
        
        
            for (int i = 0; i < arrayElementos.length; i++) {
            arrayElementos[i] = matrizDeLaQueMostrar[i][matrizDeLaQueMostrar.length -1 -i];
            
        }
        
        return arrayElementos;
    }
}
