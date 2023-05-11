/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listareproduccionListas;

import java.util.ArrayList;
import java.util.Collections;
import listareproduccionListas.Cancion;

/**
 *
 * @author Jose Angel
 */
public class ListaReproduccion {

    // la lista de reproduccion se compone de una lista de lista de canciones
    private ArrayList<Cancion> canciones;

    // constructor
    public ListaReproduccion(int numeroCanciones) {
        this.canciones = new ArrayList<>(numeroCanciones);

    }

    // metodo que devulve el numero de canciones que hay en la lista
    public int numeroCanciones() {
        int numeroCanciones = this.canciones.size();
        return numeroCanciones;
    }

    // metodo que dice si esta vacia la lista o no
    public boolean estaVacia() {
        int numeroCanciones = this.canciones.size();
        return (numeroCanciones < 1);
    }

    // metodo que devuelve la cancion de la posicion indicada
    public Cancion escucharCancion(int numeroCancion) {
        return this.canciones.get(numeroCancion);
    }

    // metodo que pone la cancion que pasamos por parametro en la posicion indicada
    public void cambiarCancion(int posicion, Cancion cancionAponerEnEsPosicion) {
        this.canciones.set(posicion, cancionAponerEnEsPosicion);
    }

    // metodo que agrega al final de la lista la cancion que pasamos por parametro
    public void grabarCancion(Cancion cancionAponerEnEsPosicion) {
        this.canciones.add(this.canciones.size(), cancionAponerEnEsPosicion);
    }

    // metodo que eliminar la cancion de la posicion que pasamos por parametro
    public void eliminarCancion(int posicionCancionAEliminar) {
        this.canciones.remove(posicionCancionAEliminar);
    }

    // metodo que elimina la cancion si existe en la lista
    public void eliminarCancion(Cancion cancionAEliminar) {
        // si la lista contiene la cancion
        if (this.canciones.contains(cancionAEliminar)) {
            // la elimina
            this.canciones.remove(cancionAEliminar);
        }
    }

    // metodo que busca una cancion y devuelve su posicion
    public void buscarCancion(Cancion cancionABuscar) {
        // si la cancion esta en la lista
        if (this.canciones.contains(cancionABuscar)) {
            // devuelve la posicion de la primera vez que aperece
            this.canciones.indexOf(cancionABuscar);
        }
    }

    // metodo que imprime el nombre de las canciones que estan en la lista
    public void imprimirLista() {

    }

    // metodos de ordenacion
    public void ordenarListaPorNombre() {

    }

    // metodos de busqueda
    public int busacrCancion() {
        int posicion = 1;
        return posicion;
    }

    // getter y setter
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

}
