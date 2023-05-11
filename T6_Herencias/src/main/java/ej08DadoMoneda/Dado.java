/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej08DadoMoneda;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Jose Angel
 */
public class Dado extends Azar {

    public Dado() {
    }
    
    @Override
    public int lanzar() {
        java.util.Random generador = new java.util.Random();
        int numeroAleatorio = generador.nextInt(1, 7);
        return numeroAleatorio;
    }

}
