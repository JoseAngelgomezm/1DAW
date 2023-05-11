/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author joseangel
 */
public class MainTraductor {

    public static void main(String[] args) {
        // crear la estructura
        SortedMap<PalabraExtranjera, PalabraEspañol> estrcutura = new TreeMap<>();

        // crear el tradcutor
        Traductor traductorPalabras = new Traductor(estrcutura);

        // agregar una entrada
        traductorPalabras.agregarPalabra("Cat", "Perro");
        traductorPalabras.agregarPalabra("Dog", "Perro");
        traductorPalabras.agregarPalabra("Water", "Agua");
        traductorPalabras.agregarPalabra("White", "Blanco");
        traductorPalabras.agregarPalabra("Table", "Mesa");
        traductorPalabras.agregarPalabra("Door", "Puerta");
        traductorPalabras.agregarPalabra("Key", "Llave");
        traductorPalabras.agregarPalabra("Car", "Coche");
        traductorPalabras.agregarPalabra("Airplane", "Avion");

        // modificar una entrada
        traductorPalabras.modificarPalabra("Cat", "Gato");

        // borrar una entrada
        traductorPalabras.borrarPalabra("water");
        
        System.out.println("ESTRUCTURA DE DATOS");
        // imprimir estrcutura
        traductorPalabras.imprimirDatos();
        
        System.out.println("TRADUCCIONES");
        // traducir palabra
        traductorPalabras.traducirPalabra("Cat");
        traductorPalabras.traducirPalabra("Water");
        traductorPalabras.traducirPalabra("Airplane");
        traductorPalabras.traducirPalabra("Key");

        System.out.println("LISTA DE PALABRAS EXTRANJERAS");
        // obtener una lista de las palabras extranjeras
        List<PalabraExtranjera> listaExtranjeras = traductorPalabras.obtenerListaExtranjeras();
        // imprimir la lista
        for (int i = 0; i < listaExtranjeras.size(); i++) {
            System.out.println(listaExtranjeras.get(i).getValorExtranjera());

        }

        System.out.println("LISTA DE PALABRAS ESPAÑOLAS");
        //Obtener una lista de palabras españolas
        List<PalabraEspañol> listaEspañolas = traductorPalabras.obtenerListaEspañolas();
        // imprimir la lista
        for (int i = 0; i < listaEspañolas.size(); i++) {
            System.out.println(listaEspañolas.get(i).getValorEspañol());

        }

    }

}
