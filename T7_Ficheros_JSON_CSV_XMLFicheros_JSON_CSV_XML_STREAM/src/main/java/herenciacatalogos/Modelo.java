/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package herenciacatalogos;

import java.util.Random;

/**
 *
 * @author joseangel
 */
public enum Modelo {

    SEAT_PANDA("Seat", "Panda", "48CV"),
    FOR_KUGA("Ford", "Kuga", "120CV"),
    SEAT_CUPRA("Seat", "Cupra", "95CV");

    String marca;
    String modelo;
    String cilindrada;

    private Modelo(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(marca).append(":");
        sb.append(modelo).append(":");
        sb.append(cilindrada);
        return sb.toString();
    }

    public static Modelo modeloAleatorio() {
        // crear array de modelos
        Modelo[] modelos = Modelo.values();
        // crear un numero random
        Random numAleatorio = new Random();
        int posicionValida = numAleatorio.nextInt(0, modelos.length);
        return modelos[posicionValida];
    }

}
