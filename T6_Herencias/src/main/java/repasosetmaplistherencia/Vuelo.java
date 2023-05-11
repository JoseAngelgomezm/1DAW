/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasosetmaplistherencia;

import java.util.List;

/**
 *
 * @author joseangel
 */
public class Vuelo {

    private int codigo;
    private String origen;
    private String destino;
    private String duracion;
    private List<Pasajeros> listaPasajeros;

    public Vuelo(int codigo, String origen, String destino, String duracion, List<Pasajeros> listaPasajeros) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.listaPasajeros = listaPasajeros;
    }

    public Vuelo() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.codigo;
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
        final Vuelo other = (Vuelo) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelo{");
        sb.append("codigo=").append(codigo);
        sb.append(", origen=").append(origen);
        sb.append(", destino=").append(destino);
        sb.append(", duracion=").append(duracion);
        sb.append(", listaPasajeros=").append(listaPasajeros);
        sb.append('}');
        return sb.toString();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public List<Pasajeros> getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(List<Pasajeros> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

}
