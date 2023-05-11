/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciacatalogos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseangel
 */

// clase generica, sirve para cualquier tipo de objeto
public class Catalogo<T> {
    protected List<T> lista;

    

        // El constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public Catalogo(int tamañoCatalogo) {
        
        this.lista = new ArrayList<>(tamañoCatalogo);
    }

    // metodo que muestra el catalogo de vehiculos
//    public void mostrarCatalogo() {
//        for (int i = 0; i < listaVehiculos.length; i++) {
//            System.out.println(listaVehiculos[i]);
//        }
//    }
    
    //metodo que borra un elemento
    public boolean borrarElemento(T elemento) {
        // busca el elemento y guarda la posicion
        int posicion = buscarElemento(elemento);
        // si la posicion es mayor que 1 significa que existe
        if (posicion >= 0) {
            // por lo tanto elimina el elemento de esta posicion y devuelve true
            this.lista.remove(posicion);
            return true;
        }
        // si no existe devulve false
        return false;
    }

    //metodo que busca un vehiculo
    public int buscarElemento(T elemento) {
        // busqueda secuencial
        // recorre toda la lista de vehiculos
        for (int i = 0; i < this.lista.size(); i++) {
            // si el elemento de la posicion de la lista que estamos mirando
            // es igual al elemento que pasamos por parametro
            // devuelve la posicion
            if (this.lista.get(i).equals(elemento)) {
                return i;
            }
        }
        // devuelve -1 en caso de no encontrarlo
        return -1;
    }

   

    // metodo que añade un vehiculo
    public void añadirElemento(T elemento) {
        // si la lista no contiene el elemento añadirlo
        if (!this.lista.contains(elemento)) {
            this.lista.add(elemento);
        }
        
    }

    // to string (muestra todo el catalogo)
    @Override
    public String toString() {
        String tmp = "";
        for (T objeto : this.lista) {

            tmp += objeto.toString() + "\n";
        }
        return tmp;
    }
    
    
}
