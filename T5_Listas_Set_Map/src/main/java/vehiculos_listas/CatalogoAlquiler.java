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
public class CatalogoAlquiler {

    int numeroAlquileres;
    private List<Alquiler> listaAlquileres;

    // constructor para crear un catalogo de lista de alquileres con alquilerID
    // autoincrementado
    // El constructor recibe el tamaño de alquileres e inicializa la estructura
    // de datos con alquileres vacios
    public CatalogoAlquiler(int numeroAlquiler) {
        // el numero de alquiler es igual al que recibe por parametros
        this.numeroAlquileres = 0;
        // se crea un array con el tamaño del numero de alquiler que hemos pasado
        this.listaAlquileres = new ArrayList<>(numeroAlquiler);
        // la estructura de datos ya esta creada, ahora hay que rellenarla
    }

    // metodo que añade un alquiler
    public void añadirAlquiler(Alquiler AlquilerAñadir) {
        if (!this.listaAlquileres.contains(AlquilerAñadir)) {
            this.listaAlquileres.add(AlquilerAñadir);
        }
    }

    //metodo que busca un alquiler y devuelve la posicion en la que esta
    private int buscarAlquiler(Alquiler cualquierAlquiler) {
        // busqueda secuencial (recorre todo el array)
        // recorre toda la lista de clientes
        for (int i = 0; i < this.listaAlquileres.size(); i++) {
            // si el alquiler que recibe es igual al que esta en la posicion y
            // el cliente que estamos comparando es distinto de null devuelve 
            // la posicion actual que estamos mirando
            if (this.listaAlquileres.contains(cualquierAlquiler)) {
                //devuelve esa posicion
                return i;
            }
        }
        // devuelve -1 en caso de no encontrarlo
        return -1;
    }

    // metodo que devuelve un cliente completo pasandole un nif
    public Alquiler buscarAlquiler(int codigoAlquiler) {
        // crear un alquiler con el coigoAlquiler que se ha pasado por parametro
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(codigoAlquiler);
        // llamada al metodo buscar alquiler pasando el alquiler aux con 
        // codigo de alquiler puesto pasado por parametro
        int posicion = buscarAlquiler(aux);
        // si el numero es mayor que 0 devuelve el cliente de esa posicion
        return (posicion >= 0) ? this.listaAlquileres.get(posicion) : null;

    }

    //metodo que borra un alquiler
    public void borrarAlquiler(Alquiler alquilerABorrar) {
        if (this.listaAlquileres.contains(alquilerABorrar)) {
            this.listaAlquileres.remove(alquilerABorrar);
        }
    }
        // toString del catalogo
        @Override
        public String toString
        
            () {
        String tmp = "";
            for (Alquiler v : listaAlquileres) {

                tmp += v.toString() + "\n";

            }
            return tmp;
        }
        // getters y setters
    public int getNumeroClientes() {
        return numeroAlquileres;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroAlquileres = numeroClientes;
    }

}
