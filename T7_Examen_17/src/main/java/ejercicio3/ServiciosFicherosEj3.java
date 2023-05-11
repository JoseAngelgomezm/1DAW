/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import ejercicio1.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class ServiciosFicherosEj3 {

    // metodo que lee un archivo txt y devuelve una lista de trabajadores
    public static List<TrabajadorEj3> leerFichero(String nombreArchivo) {
        List<TrabajadorEj3> listaTrabajadores = new ArrayList<>();
        String linea;
        String[] tokens;
        boolean horarioPersonalizado = false;
        LocalDate fechaAlta;
        LocalDate fechaBaja;
        int horasIniciales, minutosIniciales;
        int horasTotales, minutosTotales;
        String[] horasMinutosIniciales;
        String[] horasMinutosTotales;
        boolean siActivo = false;
        // leer el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombreArchivo), "ISO_8859_1")) {
            // saltar la primera linea

            datosFichero.nextLine();

            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero
                tokens = linea.split(",");

                // quitar las comillas de cada linea
                for (int i = 0; i < tokens.length; i++) {
                    tokens[i] = tokens[i].replaceAll("\"", "");

                }

                // obtener el horario
                if (tokens[5].equalsIgnoreCase("si")) {
                    horarioPersonalizado = true;
                }

                // obtener las fechas, alta y baja
                DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                fechaAlta = LocalDate.parse(tokens[6], formatterFecha);

                if (tokens[7].equals("")) {
                    fechaBaja = LocalDate.MIN;
                } else {
                    fechaBaja = LocalDate.parse(tokens[7], formatterFecha);
                }

                // obtener las horas iniciales y finales
                horasMinutosIniciales = tokens[8].split(":");
                horasIniciales = Integer.parseInt(horasMinutosIniciales[0]);
                minutosIniciales = Integer.parseInt(horasMinutosIniciales[1]);

                horasMinutosTotales = tokens[9].split(":");
                horasTotales = Integer.parseInt(horasMinutosTotales[0]);
                minutosTotales = Integer.parseInt(horasMinutosTotales[1]);

                // obtener si esta activo o no
                if (tokens[10].equalsIgnoreCase("s")) {
                    siActivo = true;
                }

                // crear un objeto trabajador por cada linea
                listaTrabajadores.add(
                        new TrabajadorEj3(tokens[0].concat(" ").concat(tokens[1]), tokens[2], tokens[3],
                                tokens[4], horarioPersonalizado, fechaAlta,
                                fechaBaja, horasIniciales, minutosIniciales,
                                horasTotales, minutosTotales, siActivo));

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaTrabajadores;
    }
}
