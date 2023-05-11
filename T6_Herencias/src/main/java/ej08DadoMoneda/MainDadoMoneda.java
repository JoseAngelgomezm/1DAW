/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej08DadoMoneda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Angel
 */
public class MainDadoMoneda {

    public static void main(String[] args) {
        List<Azar> objetosAzar = new ArrayList<>();

        // añadir una moneda y un dado a la lista de objetos de azar
        // no pueden ser tipo azar por ser abstracta
        objetosAzar.add(new Moneda());
        objetosAzar.add(new Dado());
        
        // por cada objeto de la lista
        for (Azar a : objetosAzar) {
            // imprimir un lanzamiento
            System.out.println("Lanzamiento: " + a.lanzar());
            
            // si el objeto de la lista azar es un dado
            if (a instanceof Dado) {
                
            }
            
        }
    }

}
