/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7a_localizaciones;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jose Angel
 */
public class MainLocalizaciones {

    public static void main(String[] args) {
        List<String> listaObtenidaFichero = new ArrayList<>();
        List<String> listaFiltrada = new ArrayList<>();
        Map<String, Integer> mapConteoLocalizaciones = new HashMap<>();
        int contadorLocalizacionN = 0;
        int contadorLocalizacionS = 0;
        int contadorLocalizacionE = 0;
        int contadorLocalizacionO = 0;

        // obtener una lista a partir de un fichero
        listaObtenidaFichero = ServiciosFicheros.leerFichero("localizaciones.txt");

        // filtrar la lista de localizaciones
        listaFiltrada = filtrarLista(listaObtenidaFichero);

        // imprimir la lista de localizaciones filtrada
        System.out.println("Lista de localizaciones solo con letra");
        for (int i = 0; i < listaFiltrada.size(); i++) {
            System.out.printf(listaFiltrada.get(i) + " ");
        }

        // recorrer la lista filtrada para contar cada letra y añadirla al map
        for (int i = 0; i < listaFiltrada.size(); i++) {

            // contar cada letra
            switch (listaFiltrada.get(i)) {
                case "N" -> {
                    contadorLocalizacionN++;
                }
                case "S" -> {
                    contadorLocalizacionS++;
                }
                case "E" -> {
                    contadorLocalizacionE++;
                }
                case "O" -> {
                    contadorLocalizacionO++;
                }
                default ->
                    throw new AssertionError();
            }

        }
        // añadir al map cada localizacion y el numero de veces que aparece
        mapConteoLocalizaciones.put("N", contadorLocalizacionN);
        mapConteoLocalizaciones.put("S", contadorLocalizacionS);
        mapConteoLocalizaciones.put("E", contadorLocalizacionE);
        mapConteoLocalizaciones.put("O", contadorLocalizacionO);

        System.out.println("");

        System.out.println("Map conteo");
        // recorrer el map para obtener key y values
        for (Map.Entry<String, Integer> filaMap : mapConteoLocalizaciones.entrySet()) {
            String key = filaMap.getKey(); // obtiene la key y la guarda a un string
            Integer val = filaMap.getValue();// obtiene el value y lo guarda en un integer
            // imprimir las entradas con key y value
            System.out.println(key + " - " + val);
        }
        
        // guardar el fichero con el resultado del map
        ServiciosFicheros.crearFichero(mapConteoLocalizaciones, "contadorLocalizaciones.txt");

    }

    public static List<String> filtrarLista(List<String> listaOrgien) {
        List<String> listaFiltrada = new ArrayList<>();
        // crear el patron con un string
        final String patron1 = "[NSEO]";
        // crear el pattern y pasarle el patron
        final Pattern pattern1 = Pattern.compile(patron1, Pattern.MULTILINE);
        // recorrer la lista de origen
        for (int i = 0; i < listaOrgien.size(); i++) {
            // crear el matcher pasandole cada string de la lista
            Matcher matcher1 = pattern1.matcher(listaOrgien.get(i));
            // cuando haga match, añade la localizacion a una nueva lista
            while (matcher1.find()) {
                String localizacion = matcher1.group(0);
                listaFiltrada.add(localizacion);
            }
        }
        return listaFiltrada;
    }
}
