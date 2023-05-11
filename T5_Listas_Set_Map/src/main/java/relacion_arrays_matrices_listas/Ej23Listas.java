/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author joseangel
 */
public class Ej23Listas {

    public static void main(String[] args) {
        // objeto random
        Random generador = new Random();
        // numeros aleatorio para capacidades iniciales
        int capacidadAleatoria1 = generador.nextInt(1, 16);
        int capacidadAleatoria2 = generador.nextInt(10, 21);
        int numeroAleatorioAgregar;// variable para guardar el numero que se guarda en la lista

        // crear las 2 listas de enteros
        ArrayList<Integer> listaEnteros1 = new ArrayList<>();
        ArrayList<Integer> listaEnteros2 = new ArrayList<>();

        // rellenar las 2 listas 
        for (int i = 0; i < capacidadAleatoria1; i++) {
            // generar un numero aleatorio entre 50 y 100
            numeroAleatorioAgregar = generador.nextInt(50, 101);
            // añadirlo a la posicion de la iteracion
            listaEnteros1.add(numeroAleatorioAgregar);
        }

        for (int i = 0; i < capacidadAleatoria2; i++) {
            // generar un numero aleatorio entre 50 y 100
            numeroAleatorioAgregar = generador.nextInt(50, 101);
            // añadirlo a la posicion de la iteracion
            listaEnteros2.add(numeroAleatorioAgregar);
        }

        System.out.println("LISTA 1: ");
        // mostrar lista 1
        mostrarListas(listaEnteros1);
        System.out.println("------------------------------------------------");
        // mostrar lista2
        System.out.println("LISTA 2: ");
        mostrarListas(listaEnteros2);
        System.out.println("------------------------------------------------");
        // mostrar lista3
        System.out.println("LISTA 3: ");
        ArrayList<Integer> listaEnteros3 = new ArrayList<>();
        listaEnteros3 = contenedor(listaEnteros1, listaEnteros2);
        mostrarListas(listaEnteros3);
        System.out.println("------------------------------------------------");
        // mostrar lista4
        System.out.println("LISTA 4: ");
        ArrayList<Integer> listaEnteros4 = new ArrayList<>();
        listaEnteros4 = paresImpares(listaEnteros1, listaEnteros2);
        listaEnteros4.forEach(System.out::println);
        System.out.println("------------------------------------------------");

    }

    public static void mostrarListas(ArrayList<Integer> listaAMostrar) {
        for (Integer entero : listaAMostrar) {
            System.out.println(entero);
        }
    }

    // metodo que recibe 2 listas y mete en una lista nueva lo que hay en la lista1
    // y no esta en la lista2
    public static ArrayList<Integer> contenedor(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> lista3 = new ArrayList<>();
        // recorre la lista1
        for (int i = 0; i < lista1.size(); i++) {
            // si el elemento de la lista1 que estamos revisando no esta en la lista 2
            if (!lista2.contains(lista1.get(i))) {
                // añade ese elemento a la lista 3
                lista3.add(lista1.get(i));
            }
        }
        return lista3;
    }

    public static ArrayList<Integer> paresImpares(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> lista4 = new ArrayList<>();
        // recorrer la lista 1
        for (int i = 0; i < lista1.size(); i++) {
            // si el elementos que se esta revisando es par
            if (lista1.get(i) % 2 == 0) {
                // añadir ese elemento a la lista 4
                lista4.add(lista1.get(i));
            }
        }

        // recorrer la lista 2
        for (int i = 0; i < lista2.size(); i++) {
            // si el elementos que se esta revisando es impar
            if (lista2.get(i) % 2 == 1) {
                // añadir ese elemento a la lista 4
                lista4.add(lista2.get(i));
            }

        }
        return lista4;
    }
}
