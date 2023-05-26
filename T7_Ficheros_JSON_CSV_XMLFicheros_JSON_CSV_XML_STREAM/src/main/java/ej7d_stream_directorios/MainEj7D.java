/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7d_stream_directorios;

import ej7b_vehiculos.Deportivo;
import ej7b_vehiculos.Furgoneta;
import ej7b_vehiculos.Turismo;
import ej7b_vehiculos.Factura;
import herenciacatalogos.Colores;
import herenciacatalogos.Modelo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class MainEj7D {

    public static void main(String[] args) {
        // crear el directorio
        crearDirectorio("Copia");

        // copiar los archivos al nuevo directorio creado
        copiarFicheros("Deportivos.txt", "Copia/Deportivos.txt");
        copiarFicheros("Turismos.txt", "Copia/Turismos.txt");
        copiarFicheros("Furgonetas.txt", "Copia/Furgonetas.txt");
        copiarFicheros("vehiculos.txt", "Copia/vehiculos.txt");

        // listar los ficheros del directorio copia
        listarDirectorio("Copia");

        System.out.println("");

        System.out.println("Leer fichero y crear una lista de vehiculos: ");
        System.out.println("");

        // leer ficheros de Copia y guardar los objetos en una lista
        List<Factura> listaVehiculos = new ArrayList<>();
        leerFichero("Copia/Deportivos.txt", listaVehiculos);
        leerFichero("Copia/Turismos.txt", listaVehiculos);
        leerFichero("Copia/vehiculos.txt", listaVehiculos);

        // imprimir la lista
        for (Factura v : listaVehiculos) {
            System.out.println(v);
        }

        // ordenar la lista por bastidor
        System.out.println("");
        System.out.println("Lista ordenada por bastidor:");
        Comparator<Factura> criterioBastidor = (v1, v2) -> v1.getBastidor().compareToIgnoreCase(v2.getBastidor());
        listaVehiculos.sort(criterioBastidor);
        // imprimir la lista
        for (Factura v : listaVehiculos) {
            System.out.println(v);
        }

        System.out.println("");
        System.out.println("Borrado de los archivos originales");
        // borrar los ficheros originales
        borrarElemento("Deportivos.txt");
        borrarElemento("Turismos.txt");
        borrarElemento("Furgonetas.txt");

        System.out.println("");
        System.out.println("Ficheros del directorio donde estaban los archivos originales");
        // mostrar contenido del directorio donde estaban los ficheros originales
        // listar los ficheros del directorio copia
        listarDirectorio("./");

        // Imprime por pantalla todas las matrículas ordenadas alfabéticamente de todos  los coches grises distintos
        System.out.println("");
        System.out.println("Uso de stream: ");
        System.out.println("Matriculas de los coches amarillos ordenadas");
        Comparator<Factura> criterioMatricula = (v1, v2) -> v1.getMatricula().compareToIgnoreCase(v2.getMatricula());
        listaVehiculos.stream().filter((v) -> v.getColor().equals(Colores.AMARILLO))
                               .sorted(criterioMatricula)
                               .forEach((v) -> System.out.println(v.getMatricula()));

        // Imprime por pantalla todas las marcas de coches distintas de aquellos coches que estén disponibles.
        // en mi caso están todos disponibles porque se crean disponibles por defecto
        System.out.println("");
        System.out.println("Marcas de coches que están disponibles");
        listaVehiculos.stream().filter((v) -> v.isDisponible())
                               .forEach((v) -> System.out.println(v.getModelo().getMarca()));

        // Saber la cantidad de vehículos Seat.
        System.out.println("");
        System.out.println("Cuantos seat hay? :");
        long numeroSeat = listaVehiculos.stream().filter((v) -> v.getModelo().getMarca().equalsIgnoreCase("seat"))
                                                 .count();
        System.out.println(numeroSeat);

        // Comprobar si hay algún Seat negro disponible en la lista.
        System.out.println("");
        System.out.println("Hay algun seat negro disponible?:");
        long seatNegrosDisponibles = listaVehiculos.stream().filter((v) -> v.getModelo().getMarca().equalsIgnoreCase("seat"))
                                                            .filter((v) -> v.getColor().equals(Colores.NEGRO))
                                                            .filter((v) -> v.isDisponible())
                                                            .count();
        System.out.println(seatNegrosDisponibles);

        // Crear lista de las tarifas distintas de los vehiculos que estan disponibles
        System.out.println("");
        System.out.println("Lista de las tarifas distintas de vehiculos disponibles: ");
        List<Double> listaTarifas = listaVehiculos.stream().map((v) -> v.getTarifa())
                .distinct()
                .toList();

        for (Double d : listaTarifas) {
            System.out.println(d);
        }

    }

    public static void borrarElemento(String ruta) {
        // crear la ruta
        Path file = Paths.get(ruta);

        // control expcepciones para borrados
        try {
            Files.delete(file);
        } catch (NoSuchFileException nsfe) {
            System.out.println("No se puede borrar " + ruta + " porque no existe");
        } catch (DirectoryNotEmptyException dnee) {
            System.out.println("No se puede borrar el directorio porque no está vacío");
        } catch (IOException e) {
            System.out.println("Problema borrando el elemento " + ruta);
        }
    }

    // lee un fichero y añade los vehiculos de ese fichero a una lista
    public static void leerFichero(String nombrefichero, List<Factura> listaVehiculos) {

        String linea;
        String[] dividirNumero;
        String[] dividirFrase;

        // bloque try catch para lectura del fichero
        try ( Scanner datosFichero = new Scanner(new File(nombrefichero), "UTF-8")) {
            // leer mientras tengamos una linea disponible en el fichero
            while (datosFichero.hasNextLine()) {
                // obtener datos de cada linea
                linea = datosFichero.nextLine();
                // dividir cada linea por el guion para obtener el numero
                dividirNumero = linea.split("-");

                // en la posicion 0 de dividirNumero obtenemos el numero
                // para difenrenciar entre turismo furgoneta o deportivo
                switch (dividirNumero[0]) {
                    case "0 " -> {
                        // dividimos de nuevo la posicion 1 de dividir 1 que
                        // contiene los datos de los vehiculos
                        dividirFrase = dividirNumero[1].split(":");

                        // obtenemos el color
                        Colores color;
                        switch (dividirFrase[2]) {
                            case "AMARILLO" -> {
                                color = Colores.AMARILLO;
                            }
                            case "ROJO" -> {
                                color = Colores.ROJO;
                            }
                            case "VERDE" -> {
                                color = Colores.VERDE;
                            }
                            case "AZUL" -> {
                                color = Colores.AZUL;
                            }
                            case "BLANCO" -> {
                                color = Colores.BLANCO;
                            }
                            case "NEGRO" -> {
                                color = Colores.NEGRO;
                            }
                            default ->
                                throw new AssertionError();
                        }

                        // obtenemos el modelo
                        Modelo modelo;
                        switch (dividirFrase[3]) {
                            case "Seat" -> {
                                if (dividirFrase[4].equalsIgnoreCase("panda")) {
                                    modelo = Modelo.SEAT_PANDA;
                                } else {
                                    modelo = Modelo.SEAT_CUPRA;
                                }
                                modelo = Modelo.SEAT_CUPRA;
                            }
                            case "Ford" -> {
                                modelo = Modelo.FOR_KUGA;
                            }

                            default ->
                                throw new AssertionError();
                        }

                        // añadimos a la lista el turismo
                        listaVehiculos.add(new Turismo(Integer.parseInt(dividirFrase[8]), dividirFrase[0], dividirFrase[1], color, modelo, Double.parseDouble(dividirFrase[7])));

                    }
                    case "1 " -> {
                        // dividimos de nuevo la posicion 1 de dividir 1 que
                        // contiene los datos de los vehiculos
                        dividirFrase = dividirNumero[1].split(":");

                        // obtenemos el color
                        Colores color;
                        switch (dividirFrase[2]) {
                            case "AMARILLO" -> {
                                color = Colores.AMARILLO;
                            }
                            case "ROJO" -> {
                                color = Colores.ROJO;
                            }
                            case "VERDE" -> {
                                color = Colores.VERDE;
                            }
                            case "AZUL" -> {
                                color = Colores.AZUL;
                            }
                            case "BLANCO" -> {
                                color = Colores.BLANCO;
                            }
                            case "NEGRO" -> {
                                color = Colores.NEGRO;
                            }
                            default ->
                                throw new AssertionError();
                        }

                        // obtenemos el modelo
                        Modelo modelo;
                        switch (dividirFrase[3]) {
                            case "Seat" -> {
                                if (dividirFrase[4].equalsIgnoreCase("panda")) {
                                    modelo = Modelo.SEAT_PANDA;
                                } else {
                                    modelo = Modelo.SEAT_CUPRA;
                                }
                                modelo = Modelo.SEAT_CUPRA;
                            }
                            case "Ford" -> {
                                modelo = Modelo.FOR_KUGA;
                            }
                            default ->
                                throw new AssertionError();
                        }

                        // añadimos a la lista el deportivo
                        listaVehiculos.add(new Deportivo(Integer.parseInt(dividirFrase[8]), dividirFrase[0], dividirFrase[1], color, modelo, Double.parseDouble(dividirFrase[7])));

                    }
                    case "2 " -> {
                        // dividimos de nuevo la posicion 1 de dividir 1 que
                        // contiene los datos de los vehiculos
                        dividirFrase = dividirNumero[1].split(":");

                        // obtenemos el color
                        Colores color;
                        switch (dividirFrase[2]) {
                            case "AMARILLO" -> {
                                color = Colores.AMARILLO;
                            }
                            case "ROJO" -> {
                                color = Colores.ROJO;
                            }
                            case "VERDE" -> {
                                color = Colores.VERDE;
                            }
                            case "AZUL" -> {
                                color = Colores.AZUL;
                            }
                            case "BLANCO" -> {
                                color = Colores.BLANCO;
                            }
                            case "NEGRO" -> {
                                color = Colores.NEGRO;
                            }
                            default ->
                                throw new AssertionError();
                        }

                        // obtenemos el modelo
                        Modelo modelo;
                        switch (dividirFrase[3]) {
                            case "Seat" -> {
                                if (dividirFrase[4].equalsIgnoreCase("panda")) {
                                    modelo = Modelo.SEAT_PANDA;
                                } else {
                                    modelo = Modelo.SEAT_CUPRA;
                                }
                                modelo = Modelo.SEAT_CUPRA;
                            }
                            case "Ford" -> {
                                modelo = Modelo.FOR_KUGA;
                            }

                            default ->
                                throw new AssertionError();
                        }

                        // añadimos a la lista la furgoneta
                        listaVehiculos.add(new Furgoneta(Integer.parseInt(dividirFrase[8]), dividirFrase[0], dividirFrase[1], color, modelo, Double.parseDouble(dividirFrase[7])));

                    }
                    default ->
                        throw new AssertionError();
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    // listar archivos de un directorio
    public static void listarDirectorio(String ruta) {
        // crear el objeto file con la ruta que pasamos por entrada
        File f = new File(ruta);
        // si existe la ruta
        if (f.exists()) {
            // Obtiene los ficheros y directorios dentro de f(ruta) y los 
            // devuelve en un array
            File[] ficheros = f.listFiles();
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }

    // Copiado de ficheros
    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {
        // crear los paths con las ruta de origen y destino
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);

        try {
            Files.copy(origen, destino);
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        }
    }

    public static void crearDirectorio(String ruta) {
        // crear el objeto path
        Path directory = Paths.get(ruta);

        // control expecciones
        try {
            Files.createDirectory(directory);
        } catch (FileAlreadyExistsException faee) {
            System.out.println("No se puede crear " + ruta + " porque ya existe");
        } catch (AccessDeniedException ade) {
            System.out.println("No tiene permisos para crear " + ruta);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio " + ruta);
            System.out.println("Seguramente la ruta está mal escrita o no existe");
        }

    }
}
