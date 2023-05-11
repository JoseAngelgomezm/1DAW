/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7b_vehiculos;

import herenciacatalogos.Colores;
import herenciacatalogos.Modelo;

/**
 *
 * @author Jose Angel
 */
public class Furgoneta extends Factura {

    private int cargaMaxima;

    public Furgoneta(int cargaMaxima, String bastidor, String matricula, Colores color, Modelo modelo, double tarifa) {
        super(bastidor, matricula, color, modelo, tarifa);
        this.cargaMaxima = cargaMaxima;
    }

    public Furgoneta() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(cargaMaxima).append(":");
        return sb.toString();
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

}
