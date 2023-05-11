/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

import java.util.ArrayList;

/**
 *
 * @author joseangel
 */
public class Ej12ArraysChar {
    public static void main(String[] args) {
        // declarar e inicializar la matriz
        char[][] tablaCaracteres = new char[][]{
                                            {'a','b','c'},
                                            {'j','k','l','m','n'}
                                            };
        
        imprimirTablaCaracteres(tablaCaracteres);
        
    }
    
    private static void imprimirTablaCaracteres(char[][] arrayAMostrar){
        
        // recorrer la matriz
        for (int i = 0; i < arrayAMostrar.length; i++) {
            for (int j = 0; j < arrayAMostrar[i].length; j++) {
                // mostrar cada uno de los elementos
                System.out.print(arrayAMostrar[i][j] + " ");
            }
            // salto de linea para separar cada una de las filas
            System.out.println("\n");
        }
    }
}
