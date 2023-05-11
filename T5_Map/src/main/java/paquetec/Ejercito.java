/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author joseangel
 */
public class Ejercito {

    private Set<Soldado> setSoldados;

    // metodo que imprime el set de soldados del ejercito
    public void imprimirSetSoldados() {
        for (Soldado soldadoImprimir : this.setSoldados) {
            System.out.println(soldadoImprimir);
        }
    }

    // metodo que imprime el array de soldados del ejercito
    public void imprimirArray(ArrayList<Soldado> arrayImprimir) {
        for (int i = 0; i < arrayImprimir.size(); i++) {
            System.out.println(arrayImprimir.get(i));
        }
    }

    // metodo que devuelve el numero de soldados que hay
    public int contarSoldados(Set<Soldado> setRecibe) {
        int numeroSoldados;
        return numeroSoldados = setRecibe.size();
    }

    // metodo que alista un soldado
    public void alistarSoldado(Soldado soldadoAlistar) {
        this.setSoldados.add(soldadoAlistar);
    }

    // metodo que devuelve si la lista esta vacia
    public boolean saberSiHaySoldados(Set<Soldado> setRecibe) {
        boolean siVacia = setSoldados.isEmpty();
        return siVacia;
    }

    // metodo que devuelve true o false si el soldado esta en la lista
    public boolean estaElSoldado(Soldado soldadoQueEsta) {
        boolean estaElSoldado = this.setSoldados.contains(soldadoQueEsta);
        return estaElSoldado;

    }

    // metodo que devuelve un arraylist de todos los soldados
    public ArrayList<Soldado> obtenerListaArraySoldados() {
        // metodo ArrayList Collections que al pasarle una coleccion de 
        // datos los convierte a arraylist
        return new ArrayList(this.setSoldados);
    }

    // metodo que elimina un soldado del set
    public void eliminarSoldado(Soldado soldadoEliminar) {
        if (this.setSoldados.contains(soldadoEliminar)) {
            this.setSoldados.remove(soldadoEliminar);
        } else {
            System.out.println("El soldado con nif: " + soldadoEliminar.getNif() + " no existe");
        }

    }

    public Ejercito() {
    }

    
    
    public Ejercito(Set<Soldado> Soldados) {
        this.setSoldados = Soldados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ejercito{");
        sb.append("setSoldados=").append(setSoldados);
        sb.append('}');
        return sb.toString();
    }

    public Set<Soldado> getSetSoldados() {
        return setSoldados;
    }

    public void setSetSoldados(Set<Soldado> setSoldados) {
        this.setSoldados = setSoldados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.setSoldados);
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
        final Ejercito other = (Ejercito) obj;
        return Objects.equals(this.setSoldados, other.setSoldados);
    }

}
