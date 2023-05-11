/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author joseangel
 */
public final class Temporal extends Sala {

    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;

    public Temporal(LocalDate fechaInicio, LocalDate fechaFinalizacion, int idSala, List<Obra> listaObras, Humedad sensorHumedad, Temperatura sensorTemperatura) {
        super(idSala, listaObras, sensorHumedad, sensorTemperatura);
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Temporal{");
        sb.append("fechaInicio=").append(fechaInicio);
        sb.append(", fechaFinalizacion=").append(fechaFinalizacion);
        sb.append('}');
        return sb.toString();
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}
