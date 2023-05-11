/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7g_clase;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class LineaAutobus {

    private String IDlinea;
    private String origenDestino;
    private List<LocalTime> listaHoras;

    public LineaAutobus(String IDlinea, String origenDestino, List<LocalTime> listaHoras) {
        this.IDlinea = IDlinea;
        this.origenDestino = origenDestino;
        this.listaHoras = listaHoras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LineaAutobus{");
        sb.append("IDlinea=").append(IDlinea);
        sb.append(", origenDestino=").append(origenDestino);
        sb.append(", listaHoras=").append(listaHoras);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.IDlinea);
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
        final LineaAutobus other = (LineaAutobus) obj;
        return Objects.equals(this.IDlinea, other.IDlinea);
    }

    public String getIDlinea() {
        return IDlinea;
    }

    public void setIDlinea(String IDlinea) {
        this.IDlinea = IDlinea;
    }

    public String getOrigenDestino() {
        return origenDestino;
    }

    public void setOrigenDestino(String origenDestino) {
        this.origenDestino = origenDestino;
    }

    public List<LocalTime> getListaHoras() {
        return listaHoras;
    }

    public void setListaHoras(List<LocalTime> listaHoras) {
        this.listaHoras = listaHoras;
    }

}
