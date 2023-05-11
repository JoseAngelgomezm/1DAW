/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Pila<T> {

    private List<T> lista;
    private int tamañoPila;

    // metodo que añade un elemento a la pila
    public void apilarElemento(T elementoApilar) {
        // si la pila esta llena
        if (estaLlena()) {
            // no se puede apilar mas
            System.out.println("No se puede apilar mas");
        } else {
            this.lista.add(0, elementoApilar);
        }
    }

    // metodo que elimina un elemento de la listas
    public void desapilarElemento() {
        // si la pila esta llena
        if (estaLlena()) {
            // eliminar el elemento 0
            this.lista.remove(0);

            // si la pila no esta llena
        } else if (!this.estaLlena()) {

            // recorrer la lista y eliminar el primero que encuentra
            for (int i = 0; i < lista.size(); i++) {
                if (this.lista.get(i) != null) {
                    this.lista.remove(i);
                    break;
                }
            }
        }
    }

    // metodo devuelve true si esta vacia
    public boolean estaVacia() {
        return this.lista.isEmpty();
    }

    // metodo devuelve true si esta llena
    public boolean estaLlena() {
        // si el tamaño de la pila es igual al tamaño
        return this.lista.size() == this.tamañoPila;
    }

    // metodo que imprime la pila
    public void imprimirPila() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    // metodo que devuelve cuantos elementos tiene la pila
    public int cuantosElementosTiene() {
        int contadorElementos = 0;
        // recorrer la lista
        for (int i = 0; i < this.lista.size(); i++) {
            // si el elemento que estamos mirando es distinto de null
            // contarlo
            if (!this.lista.get(i).equals(null)) {
                contadorElementos++;
            }

        }
        return contadorElementos;
    }

    // constructor
    public Pila(int tamañoPila) {
        this.tamañoPila = tamañoPila;
        this.lista = new ArrayList<>(this.tamañoPila);

    }
    
    

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public int getTamañoPila() {
        return tamañoPila;
    }

    public void setTamañoPila(int tamañoPila) {
        this.tamañoPila = tamañoPila;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.lista);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pila<?> other = (Pila<?>) obj;
        return Objects.equals(this.lista, other.lista);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila{");
        sb.append("lista=").append(lista);
        sb.append(", tama\u00f1oPila=").append(tamañoPila);
        sb.append('}');
        return sb.toString();
    }
    
    
}
