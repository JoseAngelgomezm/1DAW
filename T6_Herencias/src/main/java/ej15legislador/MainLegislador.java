/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15legislador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class MainLegislador {

    public static void main(String[] args) {

        // crear lista de legsiladores
        List<Legislador> listaLegisladores = new ArrayList<>();

        listaLegisladores.add(new Diputado(3, "Sevilla",
                "VOX", "Pepe", "Ordoñez"));
        
        listaLegisladores.add(new Diputado(4, "Jaen",
                "PP", "Juan", "Galindo"));
        
        listaLegisladores.add(new Diputado(5, "Sevilla",
                "PSOE", "Kabuto", "Perez"));
        
        listaLegisladores.add(new Senador(298, "Cadiz",
                "PP", "Santiago", "Fernandez"));
        
        listaLegisladores.add(new Senador(333, "Almeria",
                "PP", "Julio", "Fernandez"));
        
        System.out.println("Donde trabaja cada legislador: ");
        for (Legislador legislador : listaLegisladores) {
            System.out.println(legislador.getNombre() + " " + legislador.getCamaraEnQueTrabaja());
        }
        
        System.out.println("");
        
        System.out.println("Datos de cada legislador: ");
        for (Legislador legislador : listaLegisladores) {
            System.out.println(legislador.toString());
        }
    }

}
