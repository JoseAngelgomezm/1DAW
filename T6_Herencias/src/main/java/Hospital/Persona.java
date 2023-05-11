/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author joseangel
 */
public abstract class Persona {
    
    private NIF nifPersona;
    private String nombre;
    private String apellidos;
    
    public Persona(NIF nifPersona, String nombre, String apellidos) {
        this.nifPersona = nifPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public void renovarNIF(LocalDate fechaSolicitud) {
        this.nifPersona.setFechaCaducidad(fechaSolicitud.plusYears(10));
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nifPersona);
        return hash;
    }

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
        final Persona other = (Persona) obj;
        return Objects.equals(this.nifPersona, other.nifPersona);
    }
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nifPersona=").append(nifPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append('}');
        return sb.toString();
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public NIF getNifPersona() {
        return nifPersona;
    }
    
    public void setNifPersona(NIF nifPersona) {
        this.nifPersona = nifPersona;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
