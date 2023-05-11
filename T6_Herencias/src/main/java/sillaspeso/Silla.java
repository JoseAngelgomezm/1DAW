/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sillaspeso;

import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Silla implements Comparable<Silla>{
    private String nombre;
    private double peso;

    public Silla(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombre);
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
        final Silla other = (Silla) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Silla{");
        sb.append("nombre=").append(nombre);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    @Override
    public int compareTo(Silla o) {
        return this.nombre.compareToIgnoreCase(o.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
