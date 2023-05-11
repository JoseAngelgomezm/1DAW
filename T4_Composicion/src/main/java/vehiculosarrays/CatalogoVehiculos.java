/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosarrays;

import java.util.Arrays;

/**
 *
 * @author joseangel
 */
public class CatalogoVehiculos {

    private int numeroVehiculos;
    private Vehiculo[] listaVehiculos;

    // El constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamañoCatalogo) {
        tamañoCatalogo = Math.abs(tamañoCatalogo);
        this.numeroVehiculos = tamañoCatalogo;
        // crear estructura de datos vacias
        this.listaVehiculos = new Vehiculo[tamañoCatalogo];
        // rellenar el array de vehiculos con vehiculos creados aleatoriamente
        for (int i = 0; i < listaVehiculos.length; i++) {
            this.listaVehiculos[i] = new Vehiculo();
        }
    }

    // metodo que muestra el catalogo de vehiculos
//    public void mostrarCatalogo() {
//        for (int i = 0; i < listaVehiculos.length; i++) {
//            System.out.println(listaVehiculos[i]);
//        }
//    }
    //metodo que borra un vehiculo
    public boolean borrarVehiculo(Vehiculo vehiculoABorrar) {
        int posicion = buscarVehiculo(vehiculoABorrar);
        if (posicion >= 0) {
            this.listaVehiculos[posicion] = null;
            this.numeroVehiculos--;
            return true;
        }
        return false;
    }

    //metodo que busca un vehiculo
    private int buscarVehiculo(Vehiculo cualquierVehiculo) {
        // busqueda secuencial
        // recorre toda la lista de vehiculos
        for (int i = 0; i < this.listaVehiculos.length; i++) {
            // si el vehiculo que recibe es igual al que esta en la posicion y
            // el vehiculo que estamos comparando es distinto de null devuelve 
            // la posicion actual que estamos mirando
            if (cualquierVehiculo.equals(this.listaVehiculos[i]) && this.listaVehiculos[i] != null) {
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
        // si el numero es mayor que 0 devuelve el cliente de esa posicion
        return (posicion >= 0) ? this.listaVehiculos[posicion] : null;
    }

    // metodo que añade un vehiculo
    public void anadirVehiculo(Vehiculo VehiculoAñadir) {
        // si hay un hueco vacio se añade el vehiculo en esa posicion
        if (this.numeroVehiculos < this.listaVehiculos.length) {
            // se recorre el array de vehiculos
            for (int i = 0; i < listaVehiculos.length; i++) {
                // si la posicion que esta mirando es null se añade el vehiculo
                if (this.listaVehiculos[i] == null) {
                    this.listaVehiculos[i] = VehiculoAñadir;
                    // aumentar en 1 el numero de vehiculos
                    this.numeroVehiculos++;
                    // salir del bucle para no seguir recorriendo
                    break;
                }

            }
            // caso en el que el array esta lleno
        } else {
            // sobrescribe el array listaVehiculos con una copia de listaVehiculos añadiendo el
            this.listaVehiculos = copiarArray(this.listaVehiculos);
            // una vez copiado, en la ultima posicion añadir el nuevo vehiculo
            this.listaVehiculos[this.numeroVehiculos] = VehiculoAñadir;
            // añadir uno a numero vehiculos
            this.numeroVehiculos++;
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
        for (Vehiculo v : listaVehiculos) {
            // si el vehiculo no es null lo añade al tmp
            if (v != null) {
                tmp += v.toString() + "\n";
            }

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

    public void setListaVehiculos(Vehiculo[] listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }

}
