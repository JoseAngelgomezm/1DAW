/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej08DadoMoneda;

/**
 *
 * @author Jose Angel
 */
public class Moneda extends Azar {

    public Moneda() {
    }
    
    @Override
    public int lanzar() {
        java.util.Random generador = new java.util.Random();
        int numeroAleatorio = generador.nextInt(1, 3);
        return numeroAleatorio;
    }

}
