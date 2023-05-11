/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14Electrodomestico;

/**
 *
 * @author Jose Angel
 */
public class Microondas extends Electrodomestico implements Silencioso {

    private int potenciaMaxima;

    public Microondas(int potenciaMaxima, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMaxima = potenciaMaxima;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Microondas{");
        sb.append("potenciaMaxima=").append(potenciaMaxima);
        sb.append('}');
        return sb.toString();
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    @Override
    public void silencio() {
        System.out.println("El microondas" + super.getModelo() + " de consumo " + this.getPotenciaMaxima() + " emite 40DB");

    }
}
