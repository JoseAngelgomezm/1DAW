/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vehiculosarrays;

import java.util.Random;

/**
 *
 * @author joseangel
 */
public enum Modelo {
    
    SEAT_PANDA("Seat","Panda","48CV"),
    FOR_KUGA("Ford","Kuga","120CV"),
    CUPRA("Seat","Cupra","95CV");
    
    String marca;
    String modelo;
    String cilindrada;

    private Modelo(String marca, String modelo, String cilindrada) {
        this.marca=marca;
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
        return "Modelo{" + "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + '}';
    }
    
    public static Modelo modeloAleatorio(){
        // crear array de modelos
        Modelo[] modelos = Modelo.values();
        // crear un numero random
        Random numAleatorio = new Random();
        int posicionValida = numAleatorio.nextInt(0, modelos.length);
        return modelos[posicionValida];
    }
    
    
}
