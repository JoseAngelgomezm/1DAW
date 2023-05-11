/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosarrays;

import java.time.LocalDate;
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

    // crear metodos
    // registrar cliente
    // registrar Vehiculo
    // buscar cliente (nif)
    // buscar vehiculo (bastidor)
    // getter
    // setter
    // toString tocho
    // hascode
    // equals
    
    // metodo que registra un cliente que pasamos por entrada
    public void añadirCliente(Clientes clienteAñadir) {
        this.catalogoClientes.añadirCliente(clienteAñadir);
    }

    // metodo que registra un vehiculo que pasamos por entrada
    public void añadirVehiculo(Vehiculo vehiculoAñadir) {
        this.catalogoVehiculo.anadirVehiculo(vehiculoAñadir);
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
    // metodo que recibe un alquiler y lo añade a la lista de alquileres
    // vehiculo y si esta disponible registra el alquiler a nombre del cliente pasado
    // por parametro y pone la disponibilidad del coche a false
    public void registrarAlquiler(Alquiler AlquilerAñadir){
       // comprobar que el vehiculo esta en la lista de vehiculos
       // si el vehiculo esta en la lista 
        if ( this.catalogoVehiculo.buscarVehiculo(AlquilerAñadir.getVehiculo().getBastidor()) != null) {
            // comprobar que el cliente este en la lista de clientes
            // si el cliente esta en la lista de clientes
            if (catalogoClientes.buscarCliente(AlquilerAñadir.getClientes().getNIF()) != null) {
                // añadir el alquiler al catalogo de alquileres
                this.catalogoAlquiler.añadirAlquiler(AlquilerAñadir);
                // poner la disponibilidad del coche a false
                AlquilerAñadir.getVehiculo().setDisponible(false);
            }
            
        }
    }
    
    // recibir un Alquiler(recibe un alquiler, si esta en la lista de alquileres
    // pone el vehiculo de ese alquiler en disponible)
    public void recibirAlquiler(Alquiler AlquilerARecibir){
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
