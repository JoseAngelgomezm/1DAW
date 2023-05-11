/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenes;

/**
 *
 * @author Jose Angel
 */
public class Tren {
    private int IDTren;
    private int vagones;
    private int pasajerosTotales;

    public Tren(int IDTren, int vagones, int pasajerosTotales) {
        this.IDTren = IDTren;
        this.vagones = vagones;
        this.pasajerosTotales = pasajerosTotales;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.IDTren;
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
        final Tren other = (Tren) obj;
        return this.IDTren == other.IDTren;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tren{");
        sb.append("IDTren=").append(IDTren);
        sb.append(", vagones=").append(vagones);
        sb.append(", pasajerosTotales=").append(pasajerosTotales);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    public int getPasajerosTotales() {
        return pasajerosTotales;
    }

    public void setPasajerosTotales(int pasajerosTotales) {
        this.pasajerosTotales = pasajerosTotales;
    }

    public int getIDTren() {
        return IDTren;
    }

    public void setIDTren(int IDTren) {
        this.IDTren = IDTren;
    }

    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }
    
    
}
