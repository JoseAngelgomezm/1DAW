/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercito;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author joseangel
 */
public class MainEjercito {

    public static void main(String[] args) {
        // crear lista set de soldados
        Set<Soldado> listaSoldados = new HashSet<>();
        
        // crear los soldado y añadirlos a la lista
        listaSoldados.add(new Soldado("123456", "Pepe",
                "Rodriguez", "Perez", 23));
        listaSoldados.add(new Soldado("654321", "Juan",
                "Garcia", "Sanchez", 26));
        listaSoldados.add(new Soldado("543232", "Lian",
                "Kanto", "Klim", 25));
        listaSoldados.add(new Soldado("555444", "Jose",
                "Hernandez", "Perez", 27));

        // crear el ejercito con la lista de soldados
        Ejercito ejercitoSoldados = new Ejercito(listaSoldados);

        // imprimir la lista de soldados del ejercito
        System.out.println("---------- Imprimir la lista inicial ----------");
        ejercitoSoldados.imprimirSetSoldados();

        // cantidad de soldados que hay
        System.out.println("Hay un total de: "
                + ejercitoSoldados.contarSoldados(listaSoldados)
                + " soldados");

        // alistar un soldado nuevo 
        Soldado soldadoNuevo = new Soldado("111222", "NuevoSoldado",
                "Rodriguez", "Perez", 31);
        ejercitoSoldados.alistarSoldado(soldadoNuevo);

        // alistar soldado repetido
        Soldado soldadoRepetido = new Soldado("123456", "Javi",
                "Martin", "Gonzalez", 29);
        ejercitoSoldados.alistarSoldado(soldadoRepetido);

        // imprimir la lista al alistar un soldado nuevo y repetido
        System.out.println("---------- Imprimir la lista con nuevo y repetido ----------");
        ejercitoSoldados.imprimirSetSoldados();
        // cantidad de soldados que hay
        System.out.println("Hay un total de: "
                + ejercitoSoldados.contarSoldados(listaSoldados)
                + " soldados");
        
        // saber si hay soldados
        System.out.println("Esta vacia la lista de soldados?: "
                + ejercitoSoldados.saberSiHaySoldados(listaSoldados));
        
        // saber si un soldado esta en el ejercito
        // cantidad de soldados que hay
        System.out.println("El soldado " + soldadoNuevo.getNombre() +" esta en el ejercito?: " + 
                ejercitoSoldados.estaElSoldado(soldadoNuevo));
        
        // crear un array para pasar el set al array
        ArrayList<Soldado> soldadosArray = ejercitoSoldados.obtenerListaArraySoldados();
        System.out.println("--------- Imprimir array de soldados ---------");
        // imprimir el array de soldados
        ejercitoSoldados.imprimirArray(soldadosArray);
        
        
        // eliminar un soldado que existe
        ejercitoSoldados.eliminarSoldado(soldadoNuevo);
          System.out.println("--------- Eliminar soldadoNuevo ---------");
        // imprimir la lista de soldados
        ejercitoSoldados.imprimirSetSoldados();
        
        // eliminar soldado que no existe
        Soldado soldadoNoExiste = new Soldado("999999", "", "", "", 0);
        System.out.println("--------- Eliminar soldadoRepetido que no existe ---------");
        ejercitoSoldados.eliminarSoldado(soldadoNoExiste);
        ejercitoSoldados.imprimirSetSoldados();
        
    }
}
