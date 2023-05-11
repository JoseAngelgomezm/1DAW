/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

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
public class ServiciosFicheros {

    // metodo que lee un archivo txt y devuelve una lista de trabajadores
    public static List<Trabajador> leerFichero(String nombreArchivo) {
        List<Trabajador> listaTrabajadores = new ArrayList<>();
        String linea;
        String[] tokens;
        boolean horarioPersonalizado = false;
        LocalDate fechaAlta;
        LocalDate fechaBaja;
        int horasIniciales , minutosIniciales;
        int horasTotales, minutosTotales;
        int horasI;
        int horasF;
        String[] horasMinutosIniciales;
        String[] horasMinutosTotales;
        boolean siActivo = false;
        // leer el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombreArchivo), "ISO_8859_1")) {
            // saltar las primeras 8 lineas
            for (int i = 0; i < 8; i++) {
                datosFichero.nextLine();
            }
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero
                tokens = linea.split("\\|");

                // quitar los espacios al final de cada token
                for (int i = 0; i < tokens.length; i++) {
                    tokens[i] = tokens[i].trim();
                    System.out.println(i + " " + tokens[i]);
                }
                
                // obtener el horario
                if (tokens[4].equalsIgnoreCase("si")) {
                    horarioPersonalizado = true;
                }
                
                // obtener las fechas, alta y baja
                DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                fechaAlta = LocalDate.parse(tokens[5], formatterFecha);
                
                if (tokens[6].equals("")) {
                    fechaBaja = LocalDate.MIN;
                }else{
                    fechaBaja = LocalDate.parse(tokens[6], formatterFecha);
                }
                
                
                // obtener las horas iniciales y finales
                horasMinutosIniciales = tokens[7].split(":");
                horasIniciales = Integer.parseInt(horasMinutosIniciales[0]);
                minutosIniciales = Integer.parseInt(horasMinutosIniciales[1]);
                horasI = horasIniciales + minutosIniciales;
                
                horasMinutosTotales = tokens[8].split(":");
                horasTotales = Integer.parseInt(horasMinutosTotales[0]);
                minutosTotales = Integer.parseInt(horasMinutosTotales[1]);
                horasF = horasTotales + minutosTotales;
                
                // obtener si esta activo o no
                if (tokens[9].equalsIgnoreCase("s")) {
                    siActivo = true;
                }
                
                // crear un objeto trabajador por cada linea
                listaTrabajadores.add(
                        new Trabajador(tokens[0], tokens[1], tokens[2], 
                                tokens[3], horarioPersonalizado, fechaAlta, 
                                fechaBaja, horasIniciales,
                                minutosTotales,siActivo));
                
               
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaTrabajadores;
    }
}
