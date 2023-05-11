/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author Jose Angel
 */
public final class Escultura extends Obra {

    private double tamaño;

    public Escultura(double tamaño, int idObra, String autor) {
        super(idObra, autor);
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Escultura{");
        sb.append("tama\u00f1o=").append(tamaño);
        sb.append('}');
        return sb.toString();
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

}
