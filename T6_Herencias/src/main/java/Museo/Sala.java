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
public abstract class Sala {

    private int idSala;
    private List<Obra> listaObras;
    private Humedad sensorHumedad;
    private Temperatura sensorTemperatura;

    public Sala(int idSala, List<Obra> listaObras, Humedad sensorHumedad, Temperatura sensorTemperatura) {
        this.idSala = idSala;
        this.listaObras = listaObras;
        this.sensorHumedad = sensorHumedad;
        this.sensorTemperatura = sensorTemperatura;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idSala;
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
        final Sala other = (Sala) obj;
        return this.idSala == other.idSala;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala{");
        sb.append("idSala=").append(idSala);
        sb.append(", listaObras=").append(listaObras);
        sb.append(", sensorHumedad=").append(sensorHumedad);
        sb.append(", sensorTemperatura=").append(sensorTemperatura);
        sb.append('}');
        return sb.toString();
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public List<Obra> getListaObras() {
        return listaObras;
    }

    public void setListaObras(List<Obra> listaObras) {
        this.listaObras = listaObras;
    }

    public Humedad getSensorHumedad() {
        return sensorHumedad;
    }

    public void setSensorHumedad(Humedad sensorHumedad) {
        this.sensorHumedad = sensorHumedad;
    }

    public Temperatura getSensorTemperatura() {
        return sensorTemperatura;
    }

    public void setSensorTemperatura(Temperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

}
