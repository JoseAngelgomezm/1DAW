/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7a_localizaciones;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Jose Angel
 */
public class ServiciosFicheros {

    public static List<String> leerFichero(String nombrefichero) {

        List<String> listaLineas = new ArrayList<>();
        String linea;

        // bloque try catch para lectura del fichero
        try ( Scanner datosFichero = new Scanner(new File(nombrefichero), "UTF-8")) {
            // leer mientras tengamos una linea disponible en el fichero
            while (datosFichero.hasNextLine()) {
                // obtener datos de cada linea
                linea = datosFichero.nextLine();
                // añadir cada linea a la lista de string
                listaLineas.add(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaLineas;
    }

    public static void crearFichero(Map<String, Integer> mapOrigen, String nombreFichero) {

        // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(nombreFichero))) {// crea el objeto bufferedWriter + fileWriter
            // escribir cabecera del archivo
            flujo.write("------------ Fichero contadorLocalizaciones ------------");
            flujo.newLine();
            flujo.flush();
            // recorrer el map para obtener key y values
            for (Map.Entry<String, Integer> filaMap : mapOrigen.entrySet()) {
                String key = filaMap.getKey(); // obtiene la key y la guarda a un string
                Integer val = filaMap.getValue();// obtiene el value y lo guarda en un integer
                // escribir cada key y valor en el buffer
                flujo.write(key + " - " + val);
                // añadir un salto de linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();
            }
            // escribir pie del archivo
            flujo.write("--------------------------------------------------------");
            
            flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
