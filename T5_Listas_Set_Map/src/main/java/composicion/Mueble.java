/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

import java.util.Objects;

/**
 *
 * @author Jose Angel
 */
public abstract class Mueble {

    private String referenciaMueble;
    private String color;
    private int alto;
    private int largo;
    private int ancho;

    public abstract void cambiarColor(String nuevoColor);

    public Mueble(String referenciaMueble, String color, int alto, int largo, int ancho) {
        this.referenciaMueble = referenciaMueble;
        this.color = color;
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
    }

    public Mueble() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.referenciaMueble);
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
        final Mueble other = (Mueble) obj;
        return Objects.equals(this.referenciaMueble, other.referenciaMueble);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mueble{");
        sb.append("referenciaMueble=").append(referenciaMueble);
        sb.append(", color=").append(color);
        sb.append(", alto=").append(alto);
        sb.append(", largo=").append(largo);
        sb.append(", ancho=").append(ancho);
        sb.append('}');
        return sb.toString();
    }

    public String getReferenciaMueble() {
        return referenciaMueble;
    }

    public void setReferenciaMueble(String referenciaMueble) {
        this.referenciaMueble = referenciaMueble;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

}
