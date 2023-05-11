/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14Electrodomestico;

/**
 *
 * @author Jose Angel
 */
public class Frigorifico extends Electrodomestico implements Silencioso {

    private double litros;

    public Frigorifico(double litros, double consumo, String modelo) {
        super(consumo, modelo);
        this.litros = litros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Frigorifico{");
        sb.append("litros=").append(litros);
        sb.append('}');
        return sb.toString();
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public void silencio() {
        System.out.println("El electrodomestico " + super.getModelo() + " emite 50DB");
    }
    
    
    
}
