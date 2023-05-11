/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

import java.util.List;

/**
 *
 * @author joseangel
 */
public final class Fija extends Sala {

    private boolean estadoActivaInactiva;

    public Fija(boolean estadoActivaInactiva, int idSala, List<Obra> listaObras, Humedad sensorHumedad, Temperatura sensorTemperatura) {
        super(idSala, listaObras, sensorHumedad, sensorTemperatura);
        this.estadoActivaInactiva = estadoActivaInactiva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Fija{");
        sb.append("estadoActivaInactiva=").append(estadoActivaInactiva);
        sb.append('}');
        return sb.toString();
    }

    public boolean isEstadoActivaInactiva() {
        return estadoActivaInactiva;
    }

    public void setEstadoActivaInactiva(boolean estadoActivaInactiva) {
        this.estadoActivaInactiva = estadoActivaInactiva;
    }

}
