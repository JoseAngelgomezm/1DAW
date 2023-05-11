/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Trabajador {

    private String nombre;
    private String DNI;
    private String tipoPersonal;
    private String puestoTrabajo;
    private boolean horarioPersonalizado;
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
    private int horasIniciales;
    private int horasTotales;
    private boolean activo;

    public Trabajador(String nombre, String DNI, String tipoPersonal, String puestoTrabajo, boolean horarioPersonalizado, LocalDate fechaAlta, LocalDate fechaBaja, int horasIniciales, int horasTotales, boolean activo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.tipoPersonal = tipoPersonal;
        this.puestoTrabajo = puestoTrabajo;
        this.horarioPersonalizado = horarioPersonalizado;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.horasIniciales = horasIniciales;
        this.horasTotales = horasTotales;
        this.activo = activo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trabajador{");
        sb.append("nombre=").append(nombre);
        sb.append(", DNI=").append(DNI);
        sb.append(", tipoPersonal=").append(tipoPersonal);
        sb.append(", puestoTrabajo=").append(puestoTrabajo);
        sb.append(", horarioPersonalizado=").append(horarioPersonalizado);
        sb.append(", fechaAlta=").append(fechaAlta);
        sb.append(", fechaBaja=").append(fechaBaja);
        sb.append(", horasIniciales=").append(horasIniciales);
        sb.append(", horasTotales=").append(horasTotales);
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.DNI);
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
        final Trabajador other = (Trabajador) obj;
        return Objects.equals(this.DNI, other.DNI);
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public boolean isHorarioPersonalizado() {
        return horarioPersonalizado;
    }

    public void setHorarioPersonalizado(boolean horarioPersonalizado) {
        this.horarioPersonalizado = horarioPersonalizado;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public int getHorasIniciales() {
        return horasIniciales;
    }

    public void setHorasIniciales(int horasIniciales) {
        this.horasIniciales = horasIniciales;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    

}
