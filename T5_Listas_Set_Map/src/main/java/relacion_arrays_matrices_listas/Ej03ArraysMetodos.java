/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

import java.util.Arrays;

/**
 *
 * @author joseangel
 */
public class Ej03ArraysMetodos {

    public static void main(String[] args) {
        // crear el array de tamaño 20
        double decimales[] = new double[20];
        
        // rellenar el array con el valor 7.5 en todas posiciones
        Arrays.fill(decimales, 7.5);
        
        // copiar array anterior en uno nuevo
        double decimales2[] = Arrays.copyOf(decimales, 20);
   
        //Imprimir ambos arrays
        mostrarArray(decimales);
        mostrarArray(decimales2);
        
        //Comparar arrays
        boolean sonIguales = Arrays.equals(decimales, decimales2);
        System.out.println("¿Son iguales?: " + sonIguales);
        
        //introducir 6.3 en posicion aleatoria del array
        // crear el objeto random
        java.util.Random generador = new java.util.Random();
        int posicionAleatorio = generador.nextInt(0, 20);
        System.out.println("Se cambiara a 6.3 la posicion: " + posicionAleatorio);
        decimales[posicionAleatorio] = 6.3;
        
        // mostrar ambos arrays de nuevo para verificar cambio
        mostrarArray(decimales);
        mostrarArray(decimales2);
        
        // volver a comparar el array 
        sonIguales = Arrays.equals(decimales, decimales2);
        System.out.println("¿Son iguales?: " + sonIguales);
    }
    
    // metodo que muestra el array
    public static void mostrarArray(double[] decimales) {
        for (int i = 0; i < decimales.length; i++) {
            System.out.printf("|" + decimales[i] + "|");
        }
        System.out.println("");
    }
}
