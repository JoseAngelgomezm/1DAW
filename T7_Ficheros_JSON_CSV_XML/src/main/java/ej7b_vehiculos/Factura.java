/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7b_vehiculos;

import herenciacatalogos.*;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author joseangel
 */
public class Factura {

    private String bastidor;
    private String matricula;
    private Colores color;
    private Modelo modelo;
    private boolean disponible;
    private double tarifa;
    private static int contador = 0;

    // constructor parametrizado con bastidor autoincrementando
    public Factura(String bastidor, String matricula, Colores color, Modelo modelo, double tarifa) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.disponible = true;
        this.tarifa = tarifa;
    }

    // constructor por defecto que crea el bastidor autoincrementando el numero
    // matricula, color y modelo aleatorio
    public Factura() {
        this.bastidor = String.valueOf(++contador);
        this.matricula = RandomStringUtils.randomAlphabetic(3).toUpperCase()
                + RandomStringUtils.randomNumeric(4);
        this.color = Colores.colorAleatorio();
        this.modelo = Modelo.modeloAleatorio();
        this.disponible = true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.bastidor);
        hash = 37 * hash + Objects.hashCode(this.matricula);
        hash = 37 * hash + Objects.hashCode(this.color);
        hash = 37 * hash + Objects.hashCode(this.modelo);
        hash = 37 * hash + (this.disponible ? 1 : 0);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
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
        final Factura other = (Factura) obj;
        if (this.disponible != other.disponible) {
            return false;
        }
        if (Double.doubleToLongBits(this.tarifa) != Double.doubleToLongBits(other.tarifa)) {
            return false;
        }
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        return this.modelo == other.modelo;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bastidor).append(":");
        sb.append(matricula).append(":");
        sb.append(color).append(":");
        sb.append(modelo).append(":");
        sb.append(disponible).append(":");
        sb.append(tarifa).append(":");
        return sb.toString();
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

}
