/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import ejercicio1.ServiciosFicheros;
import ejercicio1.Trabajador;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;

import java.util.Comparator;

/**
 *
 * @author joseangel
 */
public class MainEj2 {

    public static void main(String[] args) {
        List<Trabajador> listaTrabajadores = ServiciosFicheros.leerFichero("RelEmpCenAus.txt");

        Map<String, Double> mapGenerador = generarMap(listaTrabajadores);
    }

    private static Map<String, Double> generarMap(List<Trabajador> listaTrabajadores) {
        Map<String, Double> mapDniHoras = new HashMap<>();

        // ordenar la lista por dni
        Comparator<Trabajador> criterioDni = (t1, t2) -> t1.getDNI().compareToIgnoreCase(t2.getDNI());
        listaTrabajadores.sort(criterioDni);

        // recorrer la lista de trabajadores que pasamos por entrada
        for (int i = 0; i < listaTrabajadores.size(); i++) {

        }

        return mapDniHoras;
    }

    private static void crearJsonDesdeMap(Map<String, Double> estructuraMap) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();

        // Permite a mapeador usar fechas según java time
        mapeador.registerModule(new JavaTimeModule());

        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON el map
        mapeador.writeValue(new File("totalhorasPorTrabajador.json"), estructuraMap);
    }
}
