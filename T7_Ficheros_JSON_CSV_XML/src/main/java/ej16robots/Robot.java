/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16robots;

/**
 *
 * @author Jose Angel
 */
public class Robot{

    private int numeroSerie;
    private int porcentajeVida;

    public Robot(int numeroSerie, int porcentajeVida) {
        this.numeroSerie = numeroSerie;
        
        this.porcentajeVida = porcentajeVida;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.numeroSerie;
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
        final Robot other = (Robot) obj;
        return this.numeroSerie == other.numeroSerie;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Robot{");
        sb.append("numeroSerie=").append(numeroSerie);
        sb.append(", porcentajeVida=").append(porcentajeVida);
        sb.append('}');
        return sb.toString();
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    

}
