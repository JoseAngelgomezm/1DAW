/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listareproduccionListas;

import java.util.Objects;

/**
 *
 * @author Jose Angel
 */
public class Cancion {
    private String nombre;
    private String duracion;
    private int año;
    private String cantante;

    // constructor paramtrizado
    public Cancion(String nombre, String duracion, int año, String cantante) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.año = año;
        this.cantante = cantante;
    }
    
    // to String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cancion{");
        sb.append("nombre=").append(nombre);
        sb.append(", duracion=").append(duracion);
        sb.append(", a\u00f1o=").append(año);
        sb.append(", cantante=").append(cantante);
        sb.append('}');
        return sb.toString();
    }
    
    
    // hashcode 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nombre);
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
        final Cancion other = (Cancion) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    // getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
    
    
}
