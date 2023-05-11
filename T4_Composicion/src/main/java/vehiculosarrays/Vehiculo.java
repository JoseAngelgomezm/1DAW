/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosarrays;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author joseangel
 */
public class Vehiculo {
    
    private String bastidor;
    private String matricula;
    private Color color;
    private Modelo modelo;
    private boolean disponible;
    private double tarifa;
    private static int contador = 0;
    
    // constructor parametrizado con bastidor autoincrementando
    public Vehiculo(String bastidor,String matricula, Color color, Modelo modelo, double tarifa) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.disponible = true;
        this.tarifa = tarifa;
    }
    
    // constructor por defecto que crea el bastidor autoincrementando el numero
    // matricula, color y modelo aleatorio
    public Vehiculo(){
        this.bastidor = String.valueOf(++contador);
        this.matricula = RandomStringUtils.randomAlphabetic(3).toUpperCase() +
                RandomStringUtils.randomNumeric(4);
        this.color = Color.colorAleatorio();
        this.modelo = Modelo.modeloAleatorio();
        this.disponible = true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.bastidor);
        hash = 59 * hash + Objects.hashCode(this.matricula);
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + Objects.hashCode(this.modelo);
        hash = 59 * hash + (this.disponible ? 1 : 0);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
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
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.bastidor, other.bastidor);
    }
    
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + ", disponible=" + disponible + ", tarifa=" + tarifa + '}';
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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