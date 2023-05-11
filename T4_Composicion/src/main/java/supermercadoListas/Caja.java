/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercadoListas;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Jose Angel
 */
public class Caja {
    private int identificador;
    private Cinta cintaTransportadora;
    
    // No necesita supermercado
    
    // metodo que genera un ticket
    public Ticket generarTicket(){
        Ticket nuevoTicket = new Ticket(this.cintaTransportadora.getListaProductos());
        
        return nuevoTicket;
    }
    
    // CONSTRUCTOR
    public Caja(int identificador, Cinta cintaTransportadora) {
        this.identificador = identificador;
        this.cintaTransportadora = cintaTransportadora;
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.identificador;
        return hash;
    }
    
    // EQUALS
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
        final Caja other = (Caja) obj;
        return this.identificador == other.identificador;
    }
    
    // TOSTRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caja{");
        sb.append("identificador=").append(identificador);
        sb.append(", cintaTransportadora=").append(cintaTransportadora);
        sb.append('}');
        return sb.toString();
    }
    
    
    // GETTER Y SETTER
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Cinta getCintaTransportadora() {
        return cintaTransportadora;
    }

    public void setCintaTransportadora(Cinta cintaTransportadora) {
        this.cintaTransportadora = cintaTransportadora;
    }
    
    
}
