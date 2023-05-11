/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7g_clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class ejAutobuses {

    public static void main(String[] args) {
        
        List<LineaAutobus> lineaAtuobuses = leerFichero("autobuses.txt");

        for (int i = 0; i < lineaAtuobuses.size(); i++) {
            LineaAutobus get = lineaAtuobuses.get(i);
            System.out.println(get);
        }
    }
    
    // metodo que leer un archivo y devuelve una lista de lineas de autobuses
    public static List<LineaAutobus> leerFichero(String nombreArchivo) {
        List<LineaAutobus> listaLineasAutobuses = new ArrayList<>();
        String linea;
        String[] tokens;

        // leer el archivo
        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombreArchivo), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split("\" ");

                // quitar las comillas de los tokens
                for (int i = 0; i < tokens.length; i++) {
                    tokens[i] = tokens[i].replace("\"", "");
                }

                // añadir las horas a la lista de horas
                // dividir las horas para quedarnos con cada una de las horas
                String[] todasHoras = tokens[2].split(" ");

                // por cada hora que tenemos, crear un objeto hora y añadirlo a la lista
                String[] horaPartida;
                int hora;
                int minutos;
                List<LocalTime> listaHoras = new ArrayList<>();
                
                // recorrer el array con todas las horas de cada linea
                for (int i = 0; i < todasHoras.length; i++) {
                    // obtener la hora y los minutos por separado
                    horaPartida = todasHoras[i].split(":");
                    hora = Integer.parseInt(horaPartida[0]);
                    minutos = Integer.parseInt(horaPartida[1]);
                    // añadir a la lista de horas un localTime con la hora y minutos
                    listaHoras.add(LocalTime.of(hora, minutos));
                }
                
                // añadir a la lista de lineas de autobuses cada una de las lineas
                listaLineasAutobuses.add(new LineaAutobus(tokens[0], tokens[1], listaHoras));
                
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaLineasAutobuses;
    }
}
