/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciacatalogos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jose Angel
 */
public class Empresa {

    private String cif;
    private String nombre;
    private CatalogoVehiculos catalogoVehiculo;
    private CatalogoClientes catalogoClientes;
    private CatalogoAlquiler catalogoAlquiler;

    // constructor parametrizado
    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.catalogoVehiculo = new CatalogoVehiculos(1);
        this.catalogoClientes = new CatalogoClientes(1);
        this.catalogoAlquiler = new CatalogoAlquiler(1);
    }

    // Constructor por defecto
    public Empresa() {
        this.catalogoVehiculo = new CatalogoVehiculos(0);
        this.catalogoClientes = new CatalogoClientes(0);
        this.catalogoAlquiler = new CatalogoAlquiler(0);
    }

    // metodo que registra un cliente que pasamos por entrada
    public void añadirCliente(Clientes clienteAñadir) {
        this.catalogoClientes.añadirElemento(clienteAñadir);
    }

    // metodo que registra un vehiculo que pasamos por entrada
    public void añadirVehiculo(Vehiculo vehiculoAñadir) {
        this.catalogoVehiculo.añadirElemento(vehiculoAñadir);
    }

    //metodo que busca un cliente
    public Clientes buscarCliente(String nif) {
        Clientes clienteEncontrado = this.catalogoClientes.buscarCliente(nif);
        return clienteEncontrado;
    }

    //metodo que busca un vehiculo
    public Vehiculo buscarVehiculo(String bastidor) {
        Vehiculo vehiculoEncontrado = this.catalogoVehiculo.buscarVehiculo(bastidor);
        return vehiculoEncontrado;
    }

    // registrar un alquiler
    // metodo que recibe un alquiler, comprueba si el vehiculo y el cliente
    // existen en la empresa, si es asi, se comprueba la disponibilidad del 
    // vehiculo si todo es correcto se hace el alquiler
    public void registrarAlquiler(Alquiler AlquilerAñadir) {
        // comprobar si el existe el cliente
        if (this.catalogoClientes.buscarCliente(AlquilerAñadir.getClientes().getNIF()) != null) {
            // si el cliente existe, comprobar que existe el vehiculo
            if (this.catalogoVehiculo.buscarVehiculo(AlquilerAñadir.getVehiculo().getBastidor()) != null) {
                // si ambos existen, comprobar disponibilidad del vehiculo
                if (AlquilerAñadir.getVehiculo().isDisponible() == true) {
                    // si todo esta correcto, añadir el alquiler a la lista de alquileres
                    this.catalogoAlquiler.añadirElemento(AlquilerAñadir);
                    // poner disponibilidad del vehiculo a false
                    AlquilerAñadir.getVehiculo().setDisponible(false);
                } else {
                    System.out.println("El vehiculo no esta disponible");
                }
            } else {
                System.out.println("El vehiculo no existe");
            }
        } else {
            System.out.println("El cliente no existe");
        }
    }

    // recibir un Alquiler(recibe un alquiler, si esta en la lista de alquileres
    // pone el vehiculo de ese alquiler en disponible)
    public void recibirAlquiler(Alquiler AlquilerARecibir) {
        // sacar el codigo de alquiler
        int codigoAlquiler = AlquilerARecibir.getAlquilerID();
        // crear objeto auxiliar alquiler para guardar el alquiler si existe
        Alquiler aux = this.catalogoAlquiler.buscarAlquiler(codigoAlquiler);
        // si el alquiler existe
        if (aux != null) {
            // poner el vehiculo de alquilerArecibir en false
            AlquilerARecibir.getVehiculo().setDisponible(true);
        }
    }

    // metodo que devuelve una lista con todos Alquileres de un cliente, usando su NIF.
    public ArrayList<Alquiler> alquileresDeUnCliente(String nif) {
        // crear el arrayList donde iremos añadiendo todos los alquileres de ese cliente
        ArrayList listaAlquileres = new ArrayList<>();
        // creamos un cliente con ese nif
        Clientes aux = new Clientes();
        aux.setNIF(nif);
        // recorrer la lista de catalogoAlquiler
        for (int i = 0; i < this.catalogoAlquiler.lista.size(); i++) {
            // si el elemento actual del catalogo es igual al cliente que tiene
            // el alquiler
            if (this.catalogoAlquiler.lista.get(i).getClientes().equals(aux)) {
                // se añade a la nueva lista, el objeto del catalogo alquiler
                listaAlquileres.add(catalogoAlquiler.lista.get(i));
            }

        }

        return listaAlquileres;
    }

    // metodo que devuelve una lista con todos Alquileres de un vehiculo, usando su bastidor.
    public ArrayList<Alquiler> alquileresDeUnVehiculo(String bastidor) {
        // crear el arrayList donde iremos añadiendo todos los alquileres de ese cliente
        ArrayList listaAlquileres = new ArrayList<>();
        // creamos un vehiculo con ese bastidor
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        // recorrer la lista de catalogoVehiculo
        for (int i = 0; i < this.catalogoVehiculo.lista.size(); i++) {
            // si el elemento actual del catalogo es igual al vehiculo que tiene
            // el alquiler
            if (this.catalogoAlquiler.lista.get(i).getVehiculo().equals(aux)) {
                // se añade a la nueva lista, el objeto del catalogo alquiler
                // que es el alquiler con todos los datos
                listaAlquileres.add(catalogoAlquiler.lista.get(i));
            }

        }

        return listaAlquileres;
    }

    // metodo que borra un cliente del catalogo si no tiene alquileres
    public void borrarClienteSinAlquiler(String nif) {
        // crear un cliente auxiliar con el nif que pasamos por parametro
        Clientes aux = new Clientes();
        aux.setNIF(nif);
        // recorrer la lista de alquileres
        for (int i = 0; i < this.catalogoAlquiler.lista.size(); i++) {
            // si el cliente no esta en algun alquiler
            if (!this.catalogoAlquiler.lista.get(i).getClientes().equals(aux)) {
                // borrarlo
                // borrarElemento ya comprueba que el cliente existe en la lista
                this.catalogoClientes.borrarElemento(aux);
            }else{
                System.out.println("El cliente tiene un alquiler");
            }

        }

    }

    // metodo que borra un vehiculo del catalogo si no tiene alquileres
    public void borrarVehiculoSinAlquiler(String bastidor) {
        // crear un cliente auxiliar con el nif que pasamos por parametro
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        // recorrer la lista de alquileres
        for (int i = 0; i < this.catalogoAlquiler.lista.size(); i++) {
            // si el vehiculo que hemos creado no es igual a ninguno de los que
            // que contienen los alquileres
            if (!this.catalogoAlquiler.lista.get(i).getVehiculo().equals(aux)) {
                // borrarlo
                // borrarElemento ya comprueba que el vehiculo existe en la lista
                this.catalogoVehiculo.borrarElemento(aux);
            }

        }

    }

    // metodo que devuleve una lista de los vehiculos que tienen que ser devueltos
    // antes de la fecha que hemos proporcionado por teclado
    public ArrayList<Vehiculo> vehiculosQueDebenSerEntregados(LocalDate fechaLimite) {
        ArrayList vehiculos = new ArrayList<>();
        // recorrer la lista de alquileres
        for (int i = 0; i < this.catalogoAlquiler.lista.size(); i++) {
           // si la fecha del alquiler que estamos viendo es menor a la fechaLimite
           // que hemos pasado por parametro
            if (this.catalogoAlquiler.lista.get(i).getFechaEntrega().equals(fechaLimite)) {
                // añadir a la lista de vehiculos ese vehiculo
                vehiculos.add(this.catalogoAlquiler.lista.get(i).getVehiculo());
            }

        }
        return vehiculos;
    }

    public void borrarAlquilerID(Alquiler alquilerABorrar) {
        // borrar elemento ya controla que el alquiler tenga que estar en la lista
        this.catalogoAlquiler.borrarElemento(alquilerABorrar);
    }

    // hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.cif);
        return hash;
    }

    // equals
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cif, other.cif);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("cif=").append(cif);
        sb.append(", nombre=").append(nombre);
        sb.append(", catalogoVehiculo=").append(catalogoVehiculo);
        sb.append(", catalogoClientes=").append(catalogoClientes);
        sb.append(", catalogoAlquiler=").append(catalogoAlquiler);
        sb.append('}');
        return sb.toString();
    }

    // getter y setter
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CatalogoVehiculos getCatalogoVehiculo() {
        return catalogoVehiculo;
    }

    public void setCatalogoVehiculo(CatalogoVehiculos catalogoVehiculo) {
        this.catalogoVehiculo = catalogoVehiculo;
    }

    public CatalogoClientes getCatalogoClientes() {
        return catalogoClientes;
    }

    public void setCatalogoClientes(CatalogoClientes catalogoClientes) {
        this.catalogoClientes = catalogoClientes;
    }

    public CatalogoAlquiler getCatalogoAlquiler() {
        return catalogoAlquiler;
    }

    public void setCatalogoAlquiler(CatalogoAlquiler catalogoAlquiler) {
        this.catalogoAlquiler = catalogoAlquiler;
    }

}
