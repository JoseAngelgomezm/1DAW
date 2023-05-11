/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosarrays;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author joseangel
 */
public class Clientes {
    private String nombre;
    private String apellidos;
    private String NIF;
    private static int contador = 0; // contador para incrementar el nif
    // (para que sepamos que hay un nif 1, otro nif 2 , etc, para pruebas en el main)
    
    // Constructor parametrizado con nif autoincrementando
    public Clientes(String nombre, String apellidos, String NIF) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
    }
    
    // Constructor por defecto con nif autoincrementando
    public Clientes() {
        this.NIF = String.valueOf(++contador);
    }
    
    // to String
    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + '}';
    }
    
    // hash code
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.apellidos);
        hash = 53 * hash + Objects.hashCode(this.NIF);
        return hash;
    }
    
    // Equals
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
        final Clientes other = (Clientes) obj;
        return Objects.equals(this.NIF, other.NIF);
    }
    
    // Getter y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    
    
}
