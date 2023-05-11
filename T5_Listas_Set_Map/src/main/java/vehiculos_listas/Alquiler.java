/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos_listas;

import java.time.LocalDate;

/**
 *
 * @author joseangel
 */
public class Alquiler {

    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }
    
    private int alquilerID;
    private Clientes clientes;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private int duracionDias;
    
    private static int contador;

    // constructor paramtetrizado
    public Alquiler(Clientes clientes, Vehiculo vehiculo, LocalDate fechaInicio) {
        this.clientes = clientes;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.duracionDias = 4;
        // el contador incrementa cada vez que se llama
        this.alquilerID = contador ++;
    }

    // constructor por defecto
    public Alquiler() {
    }
    
    
    
    //to String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("alquilerID=").append(alquilerID);
        // en el cliente solo obtener el nif
        sb.append(", clientes=").append(clientes.getNIF());
        // del vehiculo solo obtener el bastidor
        sb.append(", vehiculo=").append(vehiculo.getBastidor());
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", duracionDias=").append(duracionDias);
        sb.append('}');
        return sb.toString();
    }
    
    // hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.alquilerID;
        return hash;
    }
    
    // metodo equals
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
        final Alquiler other = (Alquiler) obj;
        return this.alquilerID == other.alquilerID;
    }
    
    
    // getter y setter

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public int getAlquilerID() {
        return alquilerID;
    }

    public void setAlquilerID(int alquilerID) {
        this.alquilerID = alquilerID;
    }
    
    
    
}
