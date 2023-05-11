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
public class CatalogoClientes {
    int numeroClientes;
    private List<Clientes> listaClientes;
    
    
    // constructor para crear un catalogo de lista de clientes con 
    // nombre y apellidos a null y un NIF aleatorio
    // El constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con clientes aleatorios
    public CatalogoClientes(int numeroClientes) {
        // el numero de clientes es igual al que recibe por parametros
        this.numeroClientes = numeroClientes;
        // se crea un array con el tamaño del numero de clientes que hemos pasado
        this.listaClientes = new ArrayList<>(numeroClientes);
        // la estructura de datos ya esta creada, ahora hay que rellenarla
        for (int i = 0; i < this.numeroClientes; i++) {
            // en cada posicion llamar al constructor por defecto de clientes
            // que crea los clientes con nif aleatorio
            this.listaClientes.add(new Clientes());
        }
        
    }
    
    // metodo que añade un cliente
     public void añadirCliente(Clientes clienteAñadir){
         // si el cliente no existe en la lista
         if (!this.listaClientes.contains(clienteAñadir)) {
             // lo añade
             this.listaClientes.add(clienteAñadir);
         }
    }
     
    
    //metodo que busca un cliente y devuelve la posicion en la que esta
    private int buscarCliente(Clientes cualquierCliente) {
        // busqueda secuencial (recorre todo el array)
        // recorre toda la lista de clientes
        for (int i = 0; i < this.listaClientes.size(); i++) {
            // si el cliente que recibe es igual al que esta en la posicion y
            // el cliente que estamos comparando es distinto de null devuelve 
            // la posicion actual que estamos mirando
            if (cualquierCliente.equals(this.listaClientes.contains(cualquierCliente))) {
                //devuelve esa posicion
                return i;
            }
        }
        // devuelve -1 en caso de no encontrarlo
        return -1;
    }
    
    // metodo que devuelve un cliente completo pasandole un nif
    public Clientes buscarCliente(String nif){
        // crear un cliente con el nif que se ha pasado por parametro
        Clientes aux = new Clientes("", "", nif);
        // llamada al metodo buscar clientes
        int posicion = buscarCliente(aux);
        // si el numero es mayor que 0 devuelve el cliente de esa posicion
        return (posicion>=0)?this.listaClientes.get(posicion):null;
        
    }
    
    //metodo que borra un cliente
    public void borrarCliente(Clientes clienteABorrar) {
        if (clienteABorrar.equals(this.listaClientes.contains(clienteABorrar))) {
            this.listaClientes.remove(clienteABorrar); 
        }
        
        
    }
     
    // toString del catalogo
     @Override
    public String toString() {
        String tmp = "";
        for (Clientes v : listaClientes) {
            // si el vehiculo no es null lo añade al tmp
            if ( v != null) {
                tmp += v.toString() + "\n";
            }
        }
        return tmp;
    }
    
    // getters y setters
    public int getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }
    
    
    
}
