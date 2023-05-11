/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7fcsv_json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Mainej7f_cvs_json {

    public static void main(String[] args) throws IOException {
        List<Persona> listaPersonasFichero = new ArrayList<>();

        listaPersonasFichero = leerFichero("RelPerCen.csv");

        for (int i = 0; i < listaPersonasFichero.size(); i++) {

            System.out.println(listaPersonasFichero.get(i));
        }

        List<Persona> listaPersonasFiltrada = new ArrayList<>();
        for (int i = 0; i < listaPersonasFichero.size(); i++) {
            // si lleva mas de 10 años
            // si la fecha que empezo mas 10 años es menor a la fecha de hoy
            if (listaPersonasFichero.get(i).getFechaTomaPosesion().plus(Period.ofYears(10)).isBefore(LocalDate.now())
                    && // si la fecha que empezo mas 15 años es mayor a la fecha de hoy
                    listaPersonasFichero.get(i).getFechaTomaPosesion().plus(Period.ofYears(15)).isAfter(LocalDate.now())) {

                // añadir esa persona a la nueva lista filtrada
                listaPersonasFiltrada.add(listaPersonasFichero.get(i));
            }

        }

        // mostrar la lista de personas filtrada
        System.out.println("");
        System.out.println("Lista personas filtrada");
        for (int i = 0; i < listaPersonasFiltrada.size(); i++) {
            Persona get = listaPersonasFiltrada.get(i);
            System.out.println(get);
        }

        // crear el fichero JSON con la nueva lista
        crearFicheroJSON(listaPersonasFiltrada);

        // conteos A)
        int contadorProfesoresTecnologia = 0;
        boolean informaticoCoordinador = false;
        boolean existeJhon = false;

        for (int i = 0; i < listaPersonasFichero.size(); i++) {
            // contar profesores
            if (listaPersonasFichero.get(i).getPuesto().equalsIgnoreCase("Tecnología P.E.S.")) {
                contadorProfesoresTecnologia++;
            }
            if (listaPersonasFichero.get(i).getPuesto().equalsIgnoreCase("Informática P.E.S.")
                    && listaPersonasFichero.get(i).isCoordinador()) {
                informaticoCoordinador = true;
            }
            if (listaPersonasFichero.get(i).getNombreEmpleado().contains("Jhon")) {
                existeJhon = true;
            }

        }

        System.out.println("");
        System.out.println("Numero de profesores de tecnologia:");
        System.out.println(contadorProfesoresTecnologia);

        System.out.println("");
        System.out.println("Algun profesor de informatica es tambien coordinador:");
        System.out.println(informaticoCoordinador);

        System.out.println("");
        System.out.println("Existe alguna persona llamada Jhon?");
        System.out.println(existeJhon);

        System.out.println("");
        System.out.println("Lista personas ordenada con J en DNI:");
        Comparator<Persona> citerioNombre = (p1, p2) -> p1.getNombreEmpleado().compareToIgnoreCase(p2.getNombreEmpleado());
        listaPersonasFichero.sort(citerioNombre);
        List<Persona> listaPersonaConJDNI = new ArrayList<>();
        for (int i = 0; i < listaPersonasFichero.size(); i++) {
            if (listaPersonasFichero.get(i).getDNI().contains("J")) {
                listaPersonaConJDNI.add(listaPersonasFichero.get(i));
            }
        }
        for (int i = 0; i < listaPersonaConJDNI.size(); i++) {
            Persona get = listaPersonaConJDNI.get(i);
            System.out.println(get);
        }

        System.out.println("");
        System.out.println("API STREAM");
        System.out.println("-----------------------------");

        Long numeroProfesoresTecnologiaStream
                = listaPersonasFichero.stream().filter((p) -> p.getPuesto().equalsIgnoreCase("Tecnología P.E.S."))
                        .count();
        System.out.println("Numero de profesores de tecnologia:");
        System.out.println(numeroProfesoresTecnologiaStream);
        
        System.out.println("");
        System.out.println("Algun profesor de informatica es tambien coordinador:");
        
        listaPersonasFichero.stream().filter((p) -> p.getPuesto().equalsIgnoreCase("Informática P.E.S."))
                                     .filter((p) -> p.isCoordinador())
                                     .forEach(System.out::println);
        
        
        System.out.println("");
        System.out.println("Lista personas ordenada con J en DNI:");
        listaPersonasFichero.stream().filter((p) -> p.getDNI().contains("J"))
                                     .sorted(citerioNombre)
                                         .forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Existe alguna persona llamada Jhon?");
         listaPersonasFichero.stream().filter((p) -> p.getNombreEmpleado().contains("Jhon"))
                                     
                                         .forEach(System.out::println);
                      
    }

    // metodo que lee un fichero y devuelve una lista de personas
    public static List<Persona> leerFichero(String nombreFichero) {
        List<Persona> listaPersonas = new ArrayList<>();
        String linea;
        String[] tokens;
        String[] fechaAdmisionDividida;
        String[] fechaCeseDividida;
        boolean evaluador = false;
        boolean coordinador = false;

        // Inicialización del flujo "datosFichero" en función del archivo llamado "nombreFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombreFichero), "ISO-8859-1")) {
            // saltar la primera linea antes del bucle para saltar la cabecera
            datosFichero.nextLine();
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                // quitar los caracteres "
                linea = linea.replaceAll("\"", "");
                // dividir la linea
                tokens = linea.split(",");
                // crear una persona y añadirla a la lista segun el campo del split

                // dividir las fechas
                // fecha admision
                fechaAdmisionDividida = tokens[4].split("/");
                Month mesAdmision = Month.of(Integer.parseInt(fechaAdmisionDividida[1]));
                int diaAdmision = Integer.parseInt(fechaAdmisionDividida[0]);
                int añoAdmision = Integer.parseInt(fechaAdmisionDividida[2]);
                LocalDate fechaAdmision = LocalDate.of(añoAdmision, mesAdmision, diaAdmision);

                // fecha cese
                LocalDate fechaCese;
                if (tokens[5].equals("")) {
                    fechaCese = LocalDate.MIN;
                } else {
                    fechaCeseDividida = tokens[5].split("/");
                    Month mesCese = Month.of(Integer.parseInt(fechaCeseDividida[1]));
                    int diaCese = Integer.parseInt(fechaCeseDividida[0]);
                    int añoCese = Integer.parseInt(fechaCeseDividida[2]);
                    fechaCese = LocalDate.of(añoCese, mesCese, diaCese);
                }

                // evaluador
                if (tokens[7].equalsIgnoreCase("sí")) {
                    evaluador = true;
                }

                // coordinador
                if (tokens[8].equalsIgnoreCase("sí")) {
                    coordinador = true;
                }

                // telefono
                if (tokens[6].equals("")) {
                    tokens[6] = "0";
                }

                listaPersonas.add(new Persona(tokens[0].concat(tokens[1]),
                        tokens[2], tokens[3],
                        fechaAdmision, fechaCese,
                        Integer.parseInt(tokens[6]),
                        evaluador, coordinador));

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaPersonas;
    }

    // metodo que genera un fichero json a partir de una lista
    public static void crearFicheroJSON(List<Persona> lista) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();

        // Permite a mapeador usar fechas según java time
        mapeador.registerModule(new JavaTimeModule());

        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON la lista de personas
        mapeador.writeValue(new File("listadoPersonas.json"), lista);

    }
}
