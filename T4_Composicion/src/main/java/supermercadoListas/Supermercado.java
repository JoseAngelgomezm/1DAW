/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercadoListas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jose Angel
 */
public class Supermercado {
    private int ID;
    private String Nombre;
    
    // CONSTRUCTOR
    public Supermercado(int ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }
    
    // metodo generarTicket
    public Ticket generarTicketSupermercado(Caja cajaARecibir){
        // llamar a generar ticket de la caja
        Ticket nuevoTicket = cajaARecibir.generarTicket();
        return nuevoTicket;
    }
    
    
    // HASHCODE
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.ID;
        hash = 59 * hash + Objects.hashCode(this.Nombre);
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
        final Supermercado other = (Supermercado) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return Objects.equals(this.Nombre, other.Nombre);
    }
    
    //TOSTRING

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supermercado{");
        sb.append("ID=").append(ID);
        sb.append(", Nombre=").append(Nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    // GETTERS
    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }
    
    
}
