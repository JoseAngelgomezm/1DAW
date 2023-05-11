/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercito;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author joseangel
 */
public class MainEjercitoOrdenado {

    public static void main(String[] args) {
        // crear lista set de soldados
        SortedSet<Soldado> listaSoldadosOrdenado = new TreeSet<>();
        
        // crear los soldado y añadirlos a la lista
        listaSoldadosOrdenado.add(new Soldado("123456", "Pepe",
                "Rodriguez", "Perez", 23));
        listaSoldadosOrdenado.add(new Soldado("654321", "Juan",
                "Garcia", "Sanchez", 26));
        listaSoldadosOrdenado.add(new Soldado("543232", "Lian",
                "Kanto", "Klim", 25));
        listaSoldadosOrdenado.add(new Soldado("555444", "Jose",
                "Hernandez", "Perez", 27));

        // crear el ejercito con la lista de soldados
        EjercitoOrdenado ejercitoSoldadosOrdenado = new EjercitoOrdenado(listaSoldadosOrdenado);

        // imprimir la lista de soldados del ejercito
        System.out.println("---------- Imprimir la lista inicial ----------");
        ejercitoSoldadosOrdenado.imprimirSetSoldadosOrdenado();

        // cantidad de soldados que hay
        System.out.println("Hay un total de: "
                + ejercitoSoldadosOrdenado.contarSoldadosOrdenado(listaSoldadosOrdenado)
                + " soldados");

        // alistar un soldado nuevo 
        Soldado soldadoNuevo = new Soldado("111222", "NuevoSoldado",
                "Rodriguez", "Perez", 31);
        ejercitoSoldadosOrdenado.alistarSoldadoOrdenado(soldadoNuevo);

        // alistar soldado repetido
        Soldado soldadoRepetido = new Soldado("123456", "Javi",
                "Martin", "Gonzalez", 29);
        ejercitoSoldadosOrdenado.alistarSoldadoOrdenado(soldadoRepetido);

        // imprimir la lista al alistar un soldado nuevo y repetido
        System.out.println("---------- Imprimir la lista con nuevo y repetido ----------");
        ejercitoSoldadosOrdenado.imprimirSetSoldadosOrdenado();
        // cantidad de soldados que hay
        System.out.println("Hay un total de: "
                + ejercitoSoldadosOrdenado.contarSoldadosOrdenado(listaSoldadosOrdenado)
                + " soldados");
        
        // saber si hay soldados
        System.out.println("Esta vacia la lista de soldados?: "
                + ejercitoSoldadosOrdenado.saberSiHaySoldadosOrdenado(listaSoldadosOrdenado));
        
        // saber si un soldado esta en el ejercito
        // cantidad de soldados que hay
        System.out.println("El soldado " + soldadoNuevo.getNombre() +" esta en el ejercito?: " + 
                ejercitoSoldadosOrdenado.estaElSoldadoOrdenado(soldadoNuevo));
        
        // crear un array para pasar el set al array
        ArrayList<Soldado> soldadosArray = ejercitoSoldadosOrdenado.obtenerListaArraySoldadosOrdenado();
        System.out.println("--------- Imprimir array de soldados ---------");
        // imprimir el array de soldados
        ejercitoSoldadosOrdenado.imprimirArrayOrdenado(soldadosArray);
        
        
        // eliminar un soldado que existe
        ejercitoSoldadosOrdenado.eliminarSoldadoOrdenado(soldadoNuevo);
          System.out.println("--------- Eliminar soldadoNuevo ---------");
        // imprimir la lista de soldados
        ejercitoSoldadosOrdenado.imprimirSetSoldadosOrdenado();
        
        // eliminar soldado que no existe
        Soldado soldadoNoExiste = new Soldado("999999", "", "", "", 0);
        System.out.println("--------- Eliminar soldado que no existe ---------");
        ejercitoSoldadosOrdenado.eliminarSoldadoOrdenado(soldadoNoExiste);
        ejercitoSoldadosOrdenado.imprimirSetSoldadosOrdenado();
        
    }
}
