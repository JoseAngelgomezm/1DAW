/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasosetmaplistherencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author joseangel
 */
public class MainRepasoSetMapListHerencia {

    public static void main(String[] args) {
        // crear lista de vuelos
        List<Vuelo> listaVuelos = new ArrayList<>();

        // crear listas de pasajeros para cada vuelo
        List<Pasajeros> listaPasajerosMadridBarcelona = new ArrayList<>();
        List<Pasajeros> listaPasajerosMadridMalaga = new ArrayList<>();
        List<Pasajeros> listaPasajerosMadridLondres = new ArrayList<>();
        List<Pasajeros> listaPasajerosMadridBarcelona2 = new ArrayList<>();
        List<Pasajeros> listaPasajerosMadridMalaga2 = new ArrayList<>();

        // añadir pasajeros a lista MADRID-BARCELONA
        listaPasajerosMadridBarcelona.add(new Pasajeros("Pepe",
                "Villalta", "23678903T",
                TipoPasajero.Prioridad));
        listaPasajerosMadridBarcelona.add(new Pasajeros("Juan",
                "Garcia", "45668934K",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridBarcelona.add(new Pasajeros("Killian",
                "Os", "9876235D",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridBarcelona.add(new Pasajeros("Lola",
                "Fernandez", "76234598Q",
                TipoPasajero.Prioridad));

        // añadir pasajeros a lista MADRID-MALAGA
        listaPasajerosMadridMalaga.add(new Pasajeros("Julio",
                "Salazar", "872634512A",
                TipoPasajero.Prioridad));
        listaPasajerosMadridMalaga.add(new Pasajeros("Jose",
                "Hernandez", "834334352X",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridMalaga.add(new Pasajeros("Yomata",
                "Han", "21932142D",
                TipoPasajero.NoPrioridad));

        // añadir pasajeros a lista MADRID-LONDRES
        listaPasajerosMadridLondres.add(new Pasajeros("Julio",
                "Salazar", "872634512A",
                TipoPasajero.Prioridad));
        listaPasajerosMadridLondres.add(new Pasajeros("Jose",
                "Hernandez", "834334352X",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridLondres.add(new Pasajeros("Yomata",
                "Han", "21932142D",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridLondres.add(new Pasajeros("Pepe",
                "Villalta", "23678903T",
                TipoPasajero.Prioridad));
        listaPasajerosMadridLondres.add(new Pasajeros("Juan",
                "Garcia", "45668934K",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridLondres.add(new Pasajeros("Killian",
                "Os", "9876235D",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridLondres.add(new Pasajeros("Lola",
                "Fernandez", "76234598Q",
                TipoPasajero.Prioridad));

        // añadir pasajeros a lista MADRID-BARCELONA 2
        listaPasajerosMadridBarcelona2.add(new Pasajeros("Julio",
                "Salazar", "872634512A",
                TipoPasajero.Prioridad));
        listaPasajerosMadridBarcelona2.add(new Pasajeros("Jose",
                "Hernandez", "834334352X",
                TipoPasajero.NoPrioridad));

        // añadir pasajeros a lista MADRID-MALAGA 2
        listaPasajerosMadridMalaga2.add(new Pasajeros("Julio",
                "Salazar", "872634512A",
                TipoPasajero.Prioridad));
        listaPasajerosMadridMalaga2.add(new Pasajeros("Jose",
                "Hernandez", "834334352X",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridMalaga2.add(new Pasajeros("Julio",
                "Salazar", "872634512A",
                TipoPasajero.Prioridad));
        listaPasajerosMadridMalaga2.add(new Pasajeros("Jose",
                "Hernandez", "834334352X",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridMalaga2.add(new Pasajeros("Yomata",
                "Han", "21932142D",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridMalaga2.add(new Pasajeros("Pepe",
                "Villalta", "23678903T",
                TipoPasajero.Prioridad));
        listaPasajerosMadridMalaga2.add(new Pasajeros("Juan",
                "Garcia", "45668934K",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridMalaga2.add(new Pasajeros("Killian",
                "Os", "9876235D",
                TipoPasajero.NoPrioridad));
        listaPasajerosMadridMalaga2.add(new Pasajeros("Lola",
                "Fernandez", "76234598Q",
                TipoPasajero.Prioridad));

        // añadir vuelos a la lista
        listaVuelos.add(new Vuelo(0, "Madrid", "Barcelona", "MB", listaPasajerosMadridBarcelona));
        listaVuelos.add(new Vuelo(1, "Madrid", "Malaga", "MM", listaPasajerosMadridMalaga));
        listaVuelos.add(new Vuelo(2, "Madrid", "Londres", "ML", listaPasajerosMadridLondres));
        listaVuelos.add(new Vuelo(3, "Madrid", "Barcelona", "MB", listaPasajerosMadridBarcelona2));
        listaVuelos.add(new Vuelo(4, "Madrid", "Malaga", "MM", listaPasajerosMadridMalaga2));

        // crear map para DESTINO-NUMERO PASAJEROS
        Map<String, Integer> mapDestinoPasajeros = numeroDePasajerosPorVuelo(listaVuelos);

        // imprimir map
        for (Map.Entry<String, Integer> entry : mapDestinoPasajeros.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("Destino: " + key + " Pasajeros: " + val);
        }

        // crear el map para CODIGO-SET PASAJEROS
        Map<Integer, Set<Pasajeros>> mapSetPasajeros = codigoVueloPasajeros(listaVuelos);

        // imprimir map
        for (Map.Entry<Integer, Set<Pasajeros>> entry : mapSetPasajeros.entrySet()) {
            Integer key = entry.getKey();
            Set<Pasajeros> val = entry.getValue();
            System.out.println("Codigo: " + key + " Pasajeros: " + val);
        }
        
        // orden natural -- comparable
        
    }

    private static Map<String, Integer> numeroDePasajerosPorVuelo(List<Vuelo> listaDeVuelos) {
        // crear el map ordenado
        Map<String, Integer> mapDestinoPasajeros = new TreeMap<>();

        // recorrer la lista 
        for (int i = 0; i < listaDeVuelos.size(); i++) {
            // obtener el vuelo actual
            String DestinoActual = listaDeVuelos.get(i).getDestino();
            // si el map contiene el destino
            if (mapDestinoPasajeros.containsKey(DestinoActual)) {
                // obtener el numero de pasajeros que ya hay en el map
                int numeroPasajerosYaEnMap = mapDestinoPasajeros.get(DestinoActual);
                // añadir la entrada con el size de la lista actual + el numero de pasajeros
                // que ya hay en el map
                mapDestinoPasajeros.put(listaDeVuelos.get(i).getDestino(),
                        listaDeVuelos.get(i).getListaPasajeros().size() + numeroPasajerosYaEnMap);

                // sino añadir la entrada con la key que no existe al map
            } else {
                mapDestinoPasajeros.put(listaDeVuelos.get(i).getDestino(),
                        listaDeVuelos.get(i).getListaPasajeros().size());
            }

        }

        return mapDestinoPasajeros;
    }

    ;
    
    private static Map<Integer, Set<Pasajeros>> codigoVueloPasajeros(List<Vuelo> listaDeVuelos) {

        // crear el map
        Map<Integer, Set<Pasajeros>> mapVueloPasajeros = new HashMap<>();
        // crear lista para recorrer los pasajeros
        List<Pasajeros> listaPasajeros = new ArrayList<>();

        // recorrer la lista de vuelos para obtener la lista de pasajeros
        for (int i = 0; i < listaDeVuelos.size(); i++) {
            
            // crear el set de pasajeros con la lista de pasajeros de cada vuelo
            // (obtener un set a partir de una lista)
            Set<Pasajeros> setPasajeros = new HashSet<>
            (listaDeVuelos.get(i).getListaPasajeros());

            // una vez tenemos la lista de pasajeros de cada vuelo
            // añadir los datos al map
            mapVueloPasajeros.put(listaDeVuelos.get(i).getCodigo(), setPasajeros);
        }

        return mapVueloPasajeros;
    }
;

}
