/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author joseangel
 */
public class listarEnteros {

    public static void main(String[] args) {
        // crear una lista de enteros 
        
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        
        listaEnteros.add(10);
        listaEnteros.add(9);
        listaEnteros.add(8);
        listaEnteros.add(7);
        listaEnteros.add(6);
        
        // devuelve el tamaño de la lista
        System.out.println("Tamaño de la lista: " + listaEnteros.size());
        
        // imprimir cada elemento de la lista
        // recorrer la lista
        for (int i = 0; i < listaEnteros.size(); i++) {
            // imprimir cada elemento
            System.out.println("Elemento de posicion: " + i + " es: " + listaEnteros.get(i));            
        }
        
        // la lista contiene el numero 7 
        System.out.println("El 7 esta en la lista ?: " + listaEnteros.contains(7));
        
        // busqueda de la posicion de un elemento
        System.out.println("Posicion del numero 7 en la lista: " + listaEnteros.indexOf(7));
        
        // borrar un elemento pasando el indice
        listaEnteros.remove(1);
        
        // añade un elemento
        listaEnteros.add(100);
        // muestra cada elemento
        listaEnteros.forEach(System.out::println);
        
        // cambiar elemento en un indice
        listaEnteros.set(1, 23);
        // imprimir cada elemento de la lista
        // recorrer la lista
        for (int i = 0; i < listaEnteros.size(); i++) {
            // imprimir cada elemento
            System.out.println("Elemento de posicion: " + i + " es: " + listaEnteros.get(i));            
        }
    }
}
