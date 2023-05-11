/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listareproduccionListas;

import listareproduccionListas.ListaReproduccion;
import java.util.ArrayList;
import listareproduccionListas.Cancion;

/**
 *
 * @author Jose Angel
 */
public class Ej24 {
    public static void main(String[] args) {
        // crear las canciones
        Cancion cancion1 = new Cancion("te estaba buscando", "3.4", 2019, "Fonsi");
        
        // crear la lista de canciones
        ArrayList<Cancion> misCanciones = new ArrayList<>();
        
        // crear una lista de reproduccion con la lista de la canciones
        ListaReproduccion miLista = new ListaReproduccion(4);
        
        
        System.out.println(miLista.numeroCanciones());
        System.out.println(miLista.estaVacia());
        
        misCanciones.add(cancion1);
        
        miLista.setCanciones(misCanciones);
        
        System.out.println(misCanciones);
        
        System.out.println(miLista.numeroCanciones());
        
        System.out.println(miLista.estaVacia());
        
        System.out.println(miLista.escucharCancion(0));
    }
}
