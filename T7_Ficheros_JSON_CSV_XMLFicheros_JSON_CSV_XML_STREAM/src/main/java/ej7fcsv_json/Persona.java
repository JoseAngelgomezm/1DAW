/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7fcsv_json;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Persona {

    private String nombreEmpleado;
    private String DNI;
    private String puesto;
    private LocalDate fechaTomaPosesion;
    private LocalDate fechaCese;
    private int telefono;
    private boolean evaluador;
    private boolean coordinador;

    public Persona() {
    }

    public Persona(String nombreEmpleado, String DNI, String puesto, LocalDate fechaTomaPosesion, LocalDate fechaCese, int telefono, boolean evaluador, boolean coordinador) {
        this.nombreEmpleado = nombreEmpleado;
        this.DNI = DNI;
        this.puesto = puesto;
        this.fechaTomaPosesion = fechaTomaPosesion;
        this.fechaCese = fechaCese;
        this.telefono = telefono;
        this.evaluador = evaluador;
        this.coordinador = coordinador;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.DNI);
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
        return Objects.equals(this.DNI, other.DNI);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombreEmpleado=").append(nombreEmpleado);
        sb.append(", DNI=").append(DNI);
        sb.append(", puesto=").append(puesto);
        sb.append(", fechaTomaPosesion=").append(fechaTomaPosesion);
        sb.append(", fechaCese=").append(fechaCese);
        sb.append(", telefono=").append(telefono);
        sb.append(", evaluador=").append(evaluador);
        sb.append(", coordinador=").append(coordinador);
        sb.append('}');
        return sb.toString();
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaTomaPosesion() {
        return fechaTomaPosesion;
    }

    public void setFechaTomaPosesion(LocalDate fechaTomaPosesion) {
        this.fechaTomaPosesion = fechaTomaPosesion;
    }

    public LocalDate getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(LocalDate fechaCese) {
        this.fechaCese = fechaCese;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEvaluador() {
        return evaluador;
    }

    public void setEvaluador(boolean evaluador) {
        this.evaluador = evaluador;
    }

    public boolean isCoordinador() {
        return coordinador;
    }

    public void setCoordinador(boolean coordinador) {
        this.coordinador = coordinador;
    }

}
