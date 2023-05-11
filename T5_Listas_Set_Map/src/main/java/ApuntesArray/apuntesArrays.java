/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApuntesArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author joseangel
 */
public class apuntesArrays {

    public static void main(String[] args) {
        // declaracion de un array
        // tipo de array, [] para decir que es un objeto de array, nombre del array
        int[] numeros;

        //creacion de un objeto array con la palabra new [tamaño del array]
        int[] numeros2 = new int[5];

        // declaracion e inicializacion de un array con valores
        // internamente trabaja como numeros3[1] = 1 ... numeros3[6] = 7
        int[] numeros3 = {1, 2, 3, 4, 5, 6, 7};

        // mostrar elementos de indice del array
        System.out.println("Elemento de índice 5: " + numeros3[5]);

        // mostrar tamaño del array
        System.out.println("tamaño numeros3: " + numeros3.length);

        // mostrar tamaño del indice del array
        System.out.println("tamaño numeros3: " + (numeros3.length - 1));

        // imprimir los elementos del array con for
        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(" - " + numeros3[i]);
        }

        // imprimir los elementos del array con for each
        // for each se compone de 2 partes, la izquierda recibe el dato en cuestion (int aux)
        // y en la parte derecha recibe la estructura de datos (numeros3)
        // por cada interacion, guarda el elemento del indice del array, y lo guarda en aux
        // por eso se imprime aux en cada iteracion
        for (int aux : numeros3) {
            System.out.print(" - " + aux);
        }

        // podemos modificar el valor de una posicion del
        System.out.println("");
        System.out.println(numeros3[5]);
        numeros3[5] = 33;
        System.out.println(numeros3[5]);

        // binarySearch metodo de la api que busca rompiendo por la mitad el array
        // y se queda en 3 partes, la del medio, izquierda y derecha
        // requiere la ordenacion del array previamente
        // imprimir el array para ver como esta
        for (int i = 0; i < numeros3.length; i++) {
            System.out.printf(" " + numeros3[i]);
        }
        System.out.println();
        // ordenar el array
        Arrays.sort(numeros3);
        // comprobar que se  ha ordenador correctamente
        for (int i = 0; i < numeros3.length; i++) {
            System.out.printf(" " + numeros3[i]);
        }
        // buscar el numero 7 y guardarlo en una variable
         int posicion = Arrays.binarySearch(numeros3, 7);
        System.out.println();
        // imprimir la posicion en la que esta el numero que estamos buscando
        System.out.println("El numero 7 esta en la posicion: " + posicion);

    }
}
