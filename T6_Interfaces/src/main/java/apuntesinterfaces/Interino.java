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
public final class Interino extends Profesor implements Comparable<Interino>{
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Interino(LocalDate fechaInicio, LocalDate fechaFin, String especializacion, String nombre, String apellidos, String nif, Direccion direccion) {
        super(especializacion, nombre, apellidos, nif, direccion);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Interino{");
        sb.append("fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append('}');
        return sb.toString();
    }
    
    
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    // implementacion del metodo abstracto de la interfaz comparable

    @Override
    public int compareTo(Interino i) {
        return this.fechaInicio.compareTo(i.getFechaInicio());
    }
    
}
