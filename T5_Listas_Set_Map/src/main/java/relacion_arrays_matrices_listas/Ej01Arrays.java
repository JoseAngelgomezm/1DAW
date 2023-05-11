/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

/**
 *
 * @author joseangel
 */
public class Ej01Arrays {

    public static void main(String[] args) {
        // instanciar e inicializar el array
        int[] numeros = {1, 2, 3, 4, 5, 6};

        // mostrar los elementos del array
        for (int aux : numeros) {
            System.out.println(aux);
        }

        // sumar los elementos del array
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de todos los elementos es: " + suma);

    }
}
