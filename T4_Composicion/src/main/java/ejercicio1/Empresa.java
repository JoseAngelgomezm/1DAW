/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jose Angel
 */
public class Empresa {

    private List<Trabajador> listaTrabajadores;
    private String nombreEmpresa;
    private String CIF;

    public Empresa(String nombreEmpresa, String CIF) {
        this.listaTrabajadores = new ArrayList<>();
        this.nombreEmpresa = nombreEmpresa;
        this.CIF = CIF;
    }

    // imprimir empresa
    public void imprimirEmpresa() {
        System.out.println(this.nombreEmpresa + " " + this.CIF);

        for (Trabajador cadaTrabajador : this.listaTrabajadores) {
            System.out.println(cadaTrabajador);
        }
    }

    // contratar trabajador
    public void contratarTrabajador(Trabajador t) {
        this.listaTrabajadores.add(t);
    }

    // metodo que despide al trabajador
    public boolean despedirTrabajador(Trabajador t) {

        boolean seHaDespedido = false;
        int posicion;
        // quedarnos con la posicion del trabajador
        // busqueda secuencial 
        for (int i = 0; i < listaTrabajadores.size(); i++) {
            // si el trabajador de la posicion actual es igual 
            // que el trabajador que recibimos 
            if (this.listaTrabajadores.get(i).equals(t)) {
                // obtener su posicion
                posicion = i;
                // borrar por posicion
                this.listaTrabajadores.remove(i);
                // poner el boolean a true
                seHaDespedido = true;
            }

        }
        return seHaDespedido;
    }

    // metodo que busca un trabajdor y muestra la posicion en la que se encuentra
    public int[] buscarTodosNombre(String nombre) {
        int contadorNombre = 0;
        // recorrer la lista para contar cuantos nombres iguales hay
        for (int i = 0; i < this.listaTrabajadores.size(); i++) {
            // si el trabajador que miramos tiene el nombre que pasamos por parametro
            if (this.listaTrabajadores.get(i).getNombre().equals(nombre)) {
                // contar lo trabajadores que tienen el mismo nombre
                contadorNombre++;
            }
        }
        // crear al array con el tamaño de la cantidad de nombres iguales
        int[] posiciones = new int[contadorNombre];

        // crear un contador para poner en cada posicion el nombre
        int posicionNombre = 0;

        // recorrer la lista para quedarnos con la posicion
        for (int i = 0; i < this.listaTrabajadores.size(); i++) {
            // si el trabajador que miramos tiene el nombre que pasamos por parametro
            if (this.listaTrabajadores.get(i).getNombre().equals(nombre)) {
                posiciones[posicionNombre] = i;
                posicionNombre++;
            }
        }
        return posiciones;
    }

    public void ordenarNombre() {
        Comparator<Trabajador> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
        Collections.sort(this.listaTrabajadores, criterioNombre);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(listaTrabajadores);
        sb.append("nombreEmpresa= ").append(nombreEmpresa);
        sb.append(" CIF= ").append(CIF);

        return sb.toString();
    }

}
