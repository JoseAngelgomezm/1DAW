/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesinterfaces;

import java.time.LocalDate;

/**
 *
 * @author joseangel
 */

// se crea Interino y Titular como final porque es la ultima clase de la 
// jerarquia y no habra mas herencia
public final class Titular extends Profesor{
    private LocalDate fechaJubilacion;

    public Titular(LocalDate fechaJubilacion, String especializacion, String nombre, String apellidos, String nif, Direccion direccion) {
        super(especializacion, nombre, apellidos, nif, direccion);
        this.fechaJubilacion = fechaJubilacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titular{");
        sb.append("fechaJubilacion=").append(fechaJubilacion);
        sb.append('}');
        return sb.toString();
    }
    
    
    public LocalDate getFechaJubilacion() {
        return fechaJubilacion;
    }

    public void setFechaJubilacion(LocalDate fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }
    
    
}
