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
public class PalabraEspañol {
    private String valorEspañol;

    public PalabraEspañol() {
    }

    public PalabraEspañol(String valorEspañol) {
        this.valorEspañol = valorEspañol;
    }

    public String getValorEspañol() {
        return valorEspañol;
    }

    public void setValorEspañol(String valorEspañol) {
        this.valorEspañol = valorEspañol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.valorEspañol);
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
        final PalabraEspañol other = (PalabraEspañol) obj;
        return Objects.equals(this.valorEspañol, other.valorEspañol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PalabraEspa\u00f1ol{");
        sb.append("valorEspa\u00f1ol=").append(valorEspañol);
        sb.append('}');
        return sb.toString();
    }
    
}
