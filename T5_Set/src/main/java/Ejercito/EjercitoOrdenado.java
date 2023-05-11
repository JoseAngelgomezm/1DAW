/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercito;


import java.util.ArrayList;
import java.util.Set;
import java.util.SortedSet;

/**
 *
 * @author joseangel
 */
public class EjercitoOrdenado {
    
    private SortedSet<Soldado> setSoldados;
    
    public EjercitoOrdenado(SortedSet<Soldado> Soldados) {
        this.setSoldados = Soldados;
    }
    
    @Override
    public String toString() {
        return "Ejercito{" + "listaSoldados=" + this.setSoldados + '}';
    }

    // metodo que imprime el set de soldados del ejercito
    public void imprimirSetSoldadosOrdenado() {
        for (Soldado soldadoImprimir : this.setSoldados) {
            System.out.println(soldadoImprimir);
        }
        
    }

    // metodo que imprime el array de soldados del ejercito
    public void imprimirArrayOrdenado(ArrayList<Soldado> arrayImprimir) {
        for (int i = 0; i < arrayImprimir.size(); i++) {
            System.out.println(arrayImprimir.get(i));
            
        }
    }

    // metodo que devuelve el numero de soldados que hay
    public int contarSoldadosOrdenado(SortedSet<Soldado> setRecibe) {
        int numeroSoldados;
        return numeroSoldados = setRecibe.size();
    }

    // metodo que alista un soldado
    public void alistarSoldadoOrdenado(Soldado soldadoAlistar) {
        this.setSoldados.add(soldadoAlistar);
    }

    // metodo que devuelve si la lista esta vacia
    public boolean saberSiHaySoldadosOrdenado(SortedSet<Soldado> setRecibe) {
        boolean siVacia = setSoldados.isEmpty();
        return siVacia;
    }

    // metodo que devuelve true o false si el soldado esta en la lista
    public boolean estaElSoldadoOrdenado(Soldado soldadoQueEsta) {
        boolean estaElSoldado = this.setSoldados.contains(soldadoQueEsta);
        return estaElSoldado;
        
    }

    // metodo que devuelve un arraylist de todos los soldados
    public ArrayList<Soldado> obtenerListaArraySoldadosOrdenado() {
        // metodo ArrayList Collections que al pasarle una coleccion de 
        // datos los convierte a arraylist
        return new ArrayList(this.setSoldados);
    }
    
    // metodo que elimina un soldado del set
    public void eliminarSoldadoOrdenado(Soldado soldadoEliminar){
        if (this.setSoldados.contains(soldadoEliminar)) {
             this.setSoldados.remove(soldadoEliminar);
        }else{
            System.out.println("El soldado con nif: " + soldadoEliminar.getNif() + " no existe");
        }
       
    }
    
    public Set<Soldado> getListaSoldados() {
        return setSoldados;
    }
    
    public void setListaSoldados(SortedSet<Soldado> listaSoldados) {
        this.setSoldados = listaSoldados;
    }
    
}
