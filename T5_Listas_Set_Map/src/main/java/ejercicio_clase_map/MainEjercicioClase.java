/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author joseangel
 */
public class MainEjercicioClase {

    public static void main(String[] args) {
        // crear el map
        Map<String, Integer> nombreEdades = new HashMap<>();

        // si intentamos añadir 2 entradas con la misma clave, se sustituye
        // la anterior y se añade la nueva
        nombreEdades.put("Jose", 23);
        nombreEdades.put("Jose", 24);

        // añadir otra entrada
        nombreEdades.put("Pepe", 43);

        // ver numero de elementos
        System.out.println("Nº de elementos: " + nombreEdades.size());

        // recorrer el map para obtener key y values
        for (Map.Entry<String, Integer> filaMap : nombreEdades.entrySet()) {
            String key = filaMap.getKey(); // obtiene la key y la guarda a un string
            Integer val = filaMap.getValue();// obtiene el value y lo guarda en un integer
            // imprimir las entradas con key y value
            System.out.println("Key: " + key + " Value: " + val);
            
        }

        // recorrer map para obtener solo las claves
        System.out.println("Conjunto de claves");
        for (String key : nombreEdades.keySet()) { // cada keyset se guarda en el string key
            System.out.println(key); // imprimir cada key
        }

        // recorrer el map para obtener solo el value
        // recoger los valores a una coleccion de Integer
        Collection<Integer> coleccionValues = nombreEdades.values();
        // recorrer la coleccion
        System.out.println("Coleccion de claves");
        for (Integer edad : coleccionValues) {
            System.out.println(edad);
        }

        // obtener una lista de edades a partir del value
        List<Integer> listaEdades = new ArrayList<>(nombreEdades.values());
        // imprimir la lista
        System.out.println("Lista de values");
        for (int i = 0; i < listaEdades.size(); i++) {
            System.out.println(listaEdades.get(i));
            
        }
        
        
    }
}
