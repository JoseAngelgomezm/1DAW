/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5EMatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class EjercicioB_Arbolito {

    public static void main(String[] args) {
        int alturaArbol = 0;
        Scanner teclado = new Scanner(System.in);

        // las columnas no pueden ser menos de 2 ni mas de 10 y debe ser un entero
        do {
            // Pedir las columnas por teclado al usuario
            System.out.println("Introduce altura para la copa del arbol 2-10");
            try {
                alturaArbol = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un valor valido");
                teclado.nextLine();
            }
            
        } while (alturaArbol < 2 || alturaArbol > 10);

        String[][] arbol = generarElementosArbol(alturaArbol);

        imprimirArbol(arbol);

    }

    // metodo que recibe las columnas y genera la dimensiones del arbol
    public static String[][] generarElementosArbol(int alturaQueRecibe) {
        // variables de filas y columnas
        int filas = 2 + alturaQueRecibe; // las que recibe introducidas por el usuario
        // mas las 2 filas del tronco

        int columnas = (alturaQueRecibe * 2) - 1; // las columnas seran la altura
        // que recibe del usuario multiplicado por 2 menos 1

        // crear array 2d con las filas y columnas
        String[][] arbol = new String[filas][columnas];

        // hacer la copa del arbol hasta las 2 ultimas filas
        for (int i = 0; i < arbol.length; i++) {

            for (int j = 0; j < arbol[i].length; j++) {
                // pintar mientras la j este entre el rango
                // de la mitad menos la i y la mitad mas la i
                if (j >= Math.abs(arbol[i].length / 2) - i && j <= Math.abs(arbol[i].length / 2) + i) {
                    arbol[i][j] = "+";
                    // sino pintar un espacio en blanco
                } else {
                    arbol[i][j] = " ";
                }
            }

        }

        // pintar el tronco en las 2 ultimas filas
        // arbol.length -2 desde las 2 ultimas filas hasta el final
        for (int i = arbol.length - 2; i < arbol.length; i++) {

            for (int j = 0; j < arbol[i].length; j++) {
                // cuando la columna sea la del medio
                if (j == Math.abs(arbol[i].length / 2)) {
                    arbol[i][j] = "+";
                } else {
                    arbol[i][j] = " ";
                }

            }
        }

        return arbol;
    }

// metodo que imprime el arbol
    private static void imprimirArbol(String[][] matrizAMostrar) {

        // recorrer la matriz
        for (int i = 0; i < matrizAMostrar.length; i++) {
            for (int j = 0; j < matrizAMostrar[i].length; j++) {
                // mostrar cada uno de los elementos
                System.out.print(matrizAMostrar[i][j] + " ");

            }
            // salto de linea para separar cada una de las filas
            System.out.println("");
        }
    }
}
