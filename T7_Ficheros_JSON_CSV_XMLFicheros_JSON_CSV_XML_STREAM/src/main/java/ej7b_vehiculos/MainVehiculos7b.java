/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7b_vehiculos;

import herenciacatalogos.Colores;
import herenciacatalogos.Modelo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author joseangel
 */
public class MainVehiculos7b {

    public static void main(String[] args) {
        // crear la lista para crear fichero
        List<Factura> listaVehiculos = new ArrayList<>();
        // crear la lista de vehiculos a partir del archivo
        List<Factura> listaVehiculosFichero = new ArrayList<>();

        // crear vehiculos aleatorios
        crearDeportivosAleatorios(listaVehiculos, 10);
        crearTurismosAleatorios(listaVehiculos, 10);
        crearFurgonetasAleatorios(listaVehiculos, 10);

        // crear el ficehro vehiculo.txt a partir de los datos de la lista de vehiculos anterior
        crearFicheroLista(listaVehiculos, "vehiculos.txt");

        // crear una lista de vehiculos a partir del fichero generado
        // que ademas a la vez que crea una lista con todos los vehiculos del
        // fichero, crea los ficheros turismos.txt, deportivos.txt, furgonetas.txt
        listaVehiculosFichero = leerFichero("vehiculos.txt");

        // ordenar la lista obtenida del fichero vehiculo.txt
        Comparator<Factura> criterioMarca = (v1, v2) -> v1.getModelo().getMarca().compareToIgnoreCase(v2.getModelo().getMarca());
        listaVehiculosFichero.sort(criterioMarca);

        // imprimir la lista 
        for (Factura vehiculo : listaVehiculosFichero) {
            System.out.println(vehiculo);
        }
    }

    // metodo que crea deportivos con datos aleatorios y los añade a una lista
    public static void crearDeportivosAleatorios(List<Factura> listaGuardarVehiculos, int numeroDeportivos) {
        java.util.Random generador = new java.util.Random();

        for (int i = 0; i < numeroDeportivos; i++) {
            listaGuardarVehiculos.add(new Deportivo(generador.nextInt(50, 100),
                    RandomStringUtils.randomAlphabetic(8),
                    RandomStringUtils.randomNumeric(4).concat(RandomStringUtils.randomAlphabetic(3)),
                    elegirColorAleatorio(),
                    elegirModeloAleatorio(), generador.nextDouble(60, 100)));
        }

    }

    // metodo que crea turismos con datos aleatorios y los añade a una lista
    public static void crearTurismosAleatorios(List<Factura> listaGuardarVehiculos, int numeroTurismos) {
        java.util.Random generador = new java.util.Random();

        for (int i = 0; i < numeroTurismos; i++) {
            listaGuardarVehiculos.add(new Turismo(generador.nextInt(1_000, 1_500),
                    RandomStringUtils.randomAlphabetic(8),
                    RandomStringUtils.randomNumeric(4).concat(RandomStringUtils.randomAlphabetic(3)),
                    elegirColorAleatorio(),
                    elegirModeloAleatorio(), generador.nextDouble(60, 100)));
        }

    }

    // metodo que crea turismos con datos aleatorios y los añade a una lista
    public static void crearFurgonetasAleatorios(List<Factura> listaGuardarVehiculos, int numeroFurgonetas) {
        java.util.Random generador = new java.util.Random();

        for (int i = 0; i < numeroFurgonetas; i++) {
            listaGuardarVehiculos.add(new Furgoneta(generador.nextInt(700, 1_000),
                    RandomStringUtils.randomAlphabetic(8),
                    RandomStringUtils.randomNumeric(4).concat(RandomStringUtils.randomAlphabetic(3)),
                    elegirColorAleatorio(),
                    elegirModeloAleatorio(), generador.nextDouble(60, 100)));
        }

    }

    public static void crearFicheroLista(List<Factura> listaVehiculo, String nombreFichero) {
        // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(nombreFichero))) {// crea el objeto bufferedWriter + fileWriter
            // recorrer la lista para obtener los vehiculos
            for (int i = 0; i < listaVehiculo.size(); i++) {
                Factura tmp = listaVehiculo.get(i);
                // segun el tipo de vehiculo, añadir un numero u otro
                if (tmp instanceof Turismo) {
                    flujo.write("0" + " - " + tmp.toString());
                    // añadir un salto de linea
                    flujo.newLine();
                } else if (tmp instanceof Deportivo) {
                    flujo.write("1" + " - " + tmp.toString());
                    // añadir un salto de linea
                    flujo.newLine();
                } else if (tmp instanceof Furgoneta) {
                    flujo.write("2" + " - " + tmp.toString());
                    // añadir un salto de linea
                    flujo.newLine();
                }

                // guardar cambios en disco
                flujo.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // metodo que establece un modelo aleatorio para crear los vehiculos
    private static Modelo elegirModeloAleatorio() {
        java.util.Random generador = new java.util.Random();
        int numero = generador.nextInt(1, 4);
        switch (numero) {
            case 1 -> {
                return Modelo.SEAT_CUPRA;
            }
            case 2 -> {
                return Modelo.FOR_KUGA;
            }
            case 3 -> {
                return Modelo.SEAT_PANDA;
            }
            default ->
                throw new AssertionError();
        }
    }

    // metodo que establece un modelo aleatorio para crear los vehiculos
    private static Colores elegirColorAleatorio() {
        java.util.Random generador = new java.util.Random();
        int numero = generador.nextInt(1, 7);
        switch (numero) {
            case 1 -> {
                return Colores.NEGRO;
            }
            case 2 -> {
                return Colores.VERDE;
            }
            case 3 -> {
                return Colores.ROJO;
            }
            case 4 -> {
                return Colores.BLANCO;
            }
            case 5 -> {
                return Colores.AZUL;
            }
            case 6 -> {
                return Colores.AMARILLO;
            }

            default ->
                throw new AssertionError();
        }
    }

    // metodo que lee un fichero y crea 3 ficheros al leer su contenido
    // un fichero de turismos 
    // un fichero de furgonetas 
    // un fichero de deportivos 
    public static List<Factura> leerFichero(String nombrefichero) {
        List<Factura> listaDeportivo = new ArrayList<>();
        List<Factura> listaTurismo = new ArrayList<>();
        List<Factura> listaFurgoneta = new ArrayList<>();
        List<Factura> listaVehiculos = new ArrayList<>();
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
                        Colores color = elegirColorAleatorio();

                        // obtenemos el modelo
                        Modelo modelo = elegirModeloAleatorio();

                        // añadimos a la lista el turismo
                        listaVehiculos.add(new Turismo(Integer.parseInt(dividirFrase[8]), dividirFrase[0], dividirFrase[1], color, modelo, Double.parseDouble(dividirFrase[7])));
                        // añadimos el turismo a su lista solitaria
                        listaTurismo.add(new Turismo(Integer.parseInt(dividirFrase[8]), dividirFrase[0], dividirFrase[1], color, modelo, Double.parseDouble(dividirFrase[7])));
                    }
                    case "1 " -> {
                        // dividimos de nuevo la posicion 1 de dividir 1 que
                        // contiene los datos de los vehiculos
                        dividirFrase = dividirNumero[1].split(":");

                        // obtenemos el color
                        Colores color = elegirColorAleatorio();

                        // obtenemos el modelo
                        Modelo modelo = elegirModeloAleatorio();

                        // añadimos a la lista el deportivo
                        listaVehiculos.add(new Deportivo(Integer.parseInt(dividirFrase[8]), dividirFrase[0], dividirFrase[1], color, modelo, Double.parseDouble(dividirFrase[7])));
                        // añadimos el deportivo a su lista solitaria
                        listaDeportivo.add(new Deportivo(Integer.parseInt(dividirFrase[8]), dividirFrase[0], dividirFrase[1], color, modelo, Double.parseDouble(dividirFrase[7])));
                    }
                    case "2 " -> {
                        // dividimos de nuevo la posicion 1 de dividir 1 que
                        // contiene los datos de los vehiculos
                        dividirFrase = dividirNumero[1].split(":");

                        // obtenemos el color
                        Colores color = elegirColorAleatorio();

                        // obtenemos el modelo
                        Modelo modelo = elegirModeloAleatorio();
                        
                        // añadimos a la lista la furgoneta
                        listaVehiculos.add(new Furgoneta(Integer.parseInt(dividirFrase[8]), dividirFrase[0], dividirFrase[1], color, modelo, Double.parseDouble(dividirFrase[7])));
                        // añadimos la furgoneta a su lista solitaria
                        listaFurgoneta.add(new Furgoneta(Integer.parseInt(dividirFrase[8]), dividirFrase[0], dividirFrase[1], color, modelo, Double.parseDouble(dividirFrase[7])));
                    }
                    default ->
                        throw new AssertionError();
                }

                // crear los ficheros una vez esten las listas creadas
                crearFicheroLista(listaTurismo, "Turismos.txt");
                crearFicheroLista(listaDeportivo, "Deportivos.txt");
                crearFicheroLista(listaFurgoneta, "Furgonetas.txt");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaVehiculos;
    }

}
