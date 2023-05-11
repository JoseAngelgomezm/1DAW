/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos_listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class CatalogoVehiculos {

    private int numeroVehiculos;
    private List<Vehiculo> listaVehiculos;

    // El constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamañoCatalogo) {
        tamañoCatalogo = Math.abs(tamañoCatalogo);
        this.numeroVehiculos = tamañoCatalogo;
        // crear estructura de datos vacias
        this.listaVehiculos = new ArrayList<Vehiculo>(tamañoCatalogo);
        // rellenar el array de vehiculos con vehiculos creados aleatoriamente
        for (int i = 0; i < tamañoCatalogo; i++) {
            this.listaVehiculos.add(new Vehiculo());
        }
    }

    //metodo que borra un vehiculo
    public void borrarVehiculo(Vehiculo vehiculoABorrar) {
        // si el vehiculo existe en la lista
        if (this.listaVehiculos.contains(vehiculoABorrar)) {
            // borrarlo
            this.listaVehiculos.remove(vehiculoABorrar);
        }
    }

    //metodo que busca un vehiculo
    private int buscarVehiculo(Vehiculo cualquierVehiculo) {
        // busqueda secuencial
        // recorre toda la lista de vehiculos
        for (int i = 0; i < this.listaVehiculos.size(); i++) {
            // si el vehiculo que recibe es igual al que esta en la posicion y
            // el vehiculo que estamos comparando es distinto de null devuelve 
            // la posicion actual que estamos mirando
            if (this.listaVehiculos.contains(cualquierVehiculo)) {
                return i;
            }

        }
        // devuelve -1 en caso de no encontrarlo
        return -1;
    }

    //metodo que devuelve un vehiculo completo pasandole un bastidor
    public Vehiculo buscarVehiculo(String bastidor) {
        // crear un vehiculo con el bastidor que se ha pasado por parametro
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        // llamada al metodo buscar vehiculo con el vehiculo creado
        int posicion = buscarVehiculo(aux);
        // si el numero es mayor que 0 devuelve el vehiculo de esa posicion
        return (posicion >= 0) ? this.listaVehiculos.get(posicion) : null;
    }

    // metodo que añade un vehiculo
    public void anadirVehiculo(Vehiculo VehiculoAñadir) {
        // si el vehiculo no existe
        if (this.listaVehiculos.contains(VehiculoAñadir)) {
            this.listaVehiculos.add(VehiculoAñadir);
        }
    }

    // metodo copiar privado que recibe un array de vehiculos
    private Vehiculo[] copiarArray(Vehiculo[] ArrayVehiculosACopiar) {
        // crear un array nuevo con el doble de tamaño que el array recibido
        Vehiculo[] nuevo = new Vehiculo[ArrayVehiculosACopiar.length * 2];
        // recorrer el array antiguo y copiarlo al nuevo
        for (int i = 0; i < ArrayVehiculosACopiar.length; i++) {
            // copiar del array antiguo al nuevo
            nuevo[i] = ArrayVehiculosACopiar[i];
        }
        return nuevo;
    }

    // to string (muestra todo el catalogo)
    @Override
    public String toString() {
        String tmp = "";
        for (Vehiculo vehiculo : this.listaVehiculos) {   
                tmp += vehiculo.toString() + "\n";
        }
        return tmp;
    }

    // devuelve el numero de vehiculos no el tamaño del array 
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public void setNumeroVehiculos(int numeroVehiculos) {
        this.numeroVehiculos = numeroVehiculos;
    }


}
