/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class PalabraExtranjera implements Comparable<PalabraExtranjera>{
    private String valorExtranjera;

    public PalabraExtranjera(String valorExtranjera) {
        this.valorExtranjera = valorExtranjera;
    }

    public PalabraExtranjera() {
    }

    public String getValorExtranjera() {
        return valorExtranjera;
    }

    public void setValorExtranjera(String valorExtranjera) {
        this.valorExtranjera = valorExtranjera;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PalabraExtranjera{");
        sb.append("valorExtranjera=").append(valorExtranjera);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.valorExtranjera);
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
        final PalabraExtranjera other = (PalabraExtranjera) obj;
        return Objects.equals(this.valorExtranjera, other.valorExtranjera);
    }

    @Override
    public int compareTo(PalabraExtranjera o) {
       return this.valorExtranjera.compareToIgnoreCase(o.getValorExtranjera());
    }
    
    
}
