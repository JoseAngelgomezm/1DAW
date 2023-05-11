/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Numeros implements Comparable<Numeros> {

    private String numero;

    public Numeros() {
    }

    public Numeros(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.numero);
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
        final Numeros other = (Numeros) obj;
        return Objects.equals(this.numero, other.numero);
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero{");
        sb.append("numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Numeros o) {
        return this.numero.compareToIgnoreCase(o.getNumero());
    }

}
