/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;


import java.util.Map;

/**
 *
 * @author joseangel
 */
import daw.UtilesDesfibrilador;
import daw.Desfibrilador;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ej1 {

    public static void main(String[] args) {
        // crear el array de desfribiladores obteniendo los valores con el metodo get
        // de la clase utiles
        Desfibrilador[] arrayDesfribilador = UtilesDesfibrilador.getDesfibriladores();
        
        System.out.println("Set Desfribiladores");
        // obtener el set ordenado por id con la llamada al metodo y mostrarlo
        Set<Desfibrilador> listaDesfribiladoresOrdenadosID = desfribiladoresOrdenadosID(arrayDesfribilador);
        for (Desfibrilador d : listaDesfribiladoresOrdenadosID) {
            System.out.println(d);
        }
        
        System.out.println("");
        System.out.println("Map Desfibriladores");
        // obtener el map de desfribiladores con la llamada al metodo
        Map<String,Desfibrilador> mapDesfibrilador = mapDesfribiladores(listaDesfribiladoresOrdenadosID);
        for (Map.Entry<String, Desfibrilador> entry : mapDesfibrilador.entrySet()) {
            String key = entry.getKey();
            Desfibrilador val = entry.getValue();
            System.out.println("Key : " + key + " Value(Objeto Desfibrilador): " + val);
            
        }
    }

    private static Set<Desfibrilador> desfribiladoresOrdenadosID(Desfibrilador[] arrayDesfribilador) {
        // crear un set ordenado, pasandole el array de desfibriladores
        Set<Desfibrilador> listaDesfibriladores = new TreeSet<>(Arrays.asList(arrayDesfribilador));
        // devolver set ordenado
        return listaDesfibriladores;
    }

    private static Map<String, Desfibrilador> mapDesfribiladores(Set<Desfibrilador> desfribiladoresUnicos) {
        Map<String, Desfibrilador> mapDesfibrilador = new HashMap<>();
        
        // utilizando iterator
        for (Iterator<Desfibrilador> iterator = desfribiladoresUnicos.iterator(); iterator.hasNext();) {
            Desfibrilador next = iterator.next();
            mapDesfibrilador.put(next.getId(), next);
        }
        
        // recorrer el set
//        for (Desfibrilador d : desfribiladoresUnicos) {
            // añadir al map el id y el propio objeto
//            mapDesfibrilador.put(d.getId(), d);
//        }

        return mapDesfibrilador;
    }
}
