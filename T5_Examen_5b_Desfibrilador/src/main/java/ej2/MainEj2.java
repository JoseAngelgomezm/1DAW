/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import daw.Desfibrilador;
import daw.UtilesDesfibrilador;
import java.util.List;
import java.util.Map;

/**
 *
 * @author joseangel
 */
public class MainEj2 {

    public static void main(String[] args) {
        Desfibrilador[] arrayDesfribilador = UtilesDesfibrilador.getDesfibriladores();

        // prueba constructores mapDesfibrilador ordenado y sin orden
        MapDesfribilador map1 = new MapDesfribilador(arrayDesfribilador, true);
        MapDesfribilador map2 = new MapDesfribilador(arrayDesfribilador, false);
        System.out.println("Map 1");
        System.out.println(map1);
        System.out.println("Map 2");
        System.out.println(map2);

        // prueba contiene desfibrilador
        Desfibrilador d1 = new Desfibrilador("8309", "DEA_250", "Camino Colmenar, 46", "registro@emasa.es", "683770062");
        System.out.println("Esta el desfibrilador 8309?: " + map1.estaEnEstructura(d1));

        Desfibrilador d2 = new Desfibrilador("009", "DEA_250", "Camino Colmenar, 46", "registro@emasa.es", "683770062");
        System.out.println("Esta el desfibrilador 009?: " + map1.estaEnEstructura(d2));

        System.out.println("");
        // prueba obtencion lista de desfibriladores
        List<Desfibrilador> listaDesfibriladores = map1.obtenerListaDesfibriladores();
        for (int i = 0; i < listaDesfibriladores.size(); i++) {
            System.out.println(listaDesfibriladores.get(i));

        }
        
        // obtener la cantidad de desfibriladores asociados a un correo
        System.out.println("");
        System.out.println("Desfibriladores por cada correo");
        Map<String,Integer> mapConteo = map1.obtenerDesfibriladoresCorreo();
        
        // imprimir map del conteo
        for (Map.Entry<String, Integer> entry : mapConteo.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("Correo: " + key + " Numero Desfibriladores: " + val);
        }
    }
}
