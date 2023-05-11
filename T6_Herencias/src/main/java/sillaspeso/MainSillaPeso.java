/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sillaspeso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author joseangel
 */
public class MainSillaPeso {

    public static void main(String[] args) {
        // crear map sin orden
        Map<Silla, Integer> mapSillaPeso = new HashMap<>();

        // añadir sillas al map
        mapSillaPeso.put(new Silla("Nogal", 21), 21);
        mapSillaPeso.put(new Silla("Roble", 21), 21);
        mapSillaPeso.put(new Silla("Perona", 23), 23);
        mapSillaPeso.put(new Silla("Klad", 24), 24);
        mapSillaPeso.put(new Silla("Kme", 21), 21);
        mapSillaPeso.put(new Silla("Junco", 25), 25);
        mapSillaPeso.put(new Silla("Castaño", 19), 19);

        // imprimir map
        System.out.println("MAP SILLAS SIN ORDEN: ");
        for (Map.Entry<Silla, Integer> entry : mapSillaPeso.entrySet()) {
            Silla key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("Nombre Silla: " + key + " Valor Peso: " + val);
        }

        // crear map ordenado
        Map<Silla, Integer> mapSillaPesoOrdenado = new TreeMap<>();
        // añadir sillas al map
        mapSillaPesoOrdenado.put(new Silla("Nogal", 21), 21);
        mapSillaPesoOrdenado.put(new Silla("Roble", 21), 21);
        mapSillaPesoOrdenado.put(new Silla("Perona", 23), 23);
        mapSillaPesoOrdenado.put(new Silla("Klad", 24), 24);
        mapSillaPesoOrdenado.put(new Silla("Kme", 21), 21);
        mapSillaPesoOrdenado.put(new Silla("Junco", 25), 25);
        mapSillaPesoOrdenado.put(new Silla("Castaño", 19), 19);

        System.out.println("");

        // imprimir map ordenado
        System.out.println("MAP SILLAS ORDENADO: ");
        for (Map.Entry<Silla, Integer> entry : mapSillaPesoOrdenado.entrySet()) {
            Silla key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("Nombre Silla: " + key + " Valor Peso: " + val);
        }
        
        System.out.println("");
        
        // crear lista de sillas
        List<Silla> listaSillas = new ArrayList<>();
        // añadir sillas a la lista
        listaSillas.add(new Silla("Nogal", 21));
        listaSillas.add(new Silla("Roble", 21));
        listaSillas.add(new Silla("Perona", 23));
        listaSillas.add(new Silla("Klad", 24));
        listaSillas.add(new Silla("Kme", 21));
        listaSillas.add(new Silla("Junco", 25));
        listaSillas.add(new Silla("Castaño", 19));
        
        System.out.println("Lista de sillas segun orden de insercion");
        listaSillas.forEach(s -> System.out.println("Nombre: " + s.getNombre()));
        
        System.out.println("");
        
        System.out.println("Lista de sillas segun orden natural");
        Collections.sort(listaSillas);
        listaSillas.forEach(s -> System.out.println("Nombre: " + s.getNombre()));
        
        System.out.println("");
        
        System.out.println("Lista de sillas segun peso");
        CriterioPeso criterio = new CriterioPeso();
        // la variable criterio es de tipo Ciretrio peso, que es de tipo comparator a su vez
        Collections.sort(listaSillas,criterio);
        listaSillas.forEach(System.out::println);
        
        System.out.println("");
        
        System.out.println("Lista de sillas segun peso implementando clase interna");
        // se le puede pasar el criterio creando un objeto criterio peso 
        // en el propio sort creando el objeto criterio y modificando su 
        // codigo abstracto (clase interna, implementa una clase en un metodo
        // en este caso el main)
        Collections.sort(listaSillas,new Comparator<Silla>() {
            @Override
            public int compare(Silla o1, Silla o2) {
                return Double.compare(o1.getPeso(),o2.getPeso());
            }
        });
        
        listaSillas.forEach(System.out::println);
        
        System.out.println("");
        
        System.out.println("Lista de sillas segun peso implementando expresion lambda");
        
        Collections.sort(listaSillas, (s1,s2) -> Double.compare(s1.getPeso(), s2.getPeso()));
        
        listaSillas.forEach(System.out::println);
    }
}
