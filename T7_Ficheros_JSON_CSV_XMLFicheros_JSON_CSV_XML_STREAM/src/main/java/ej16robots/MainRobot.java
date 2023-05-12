/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16robots;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jose Angel
 */
public class MainRobot {

    public static void main(String[] args) {

        List<Robot> listaRobot = new ArrayList<>();

        int numeroSerie = 0; // contador para ir generando numeros de serie
        int contadorRobots = 10;// contador para crear tantos robots como queremos
        int vidaAleatoria;

        java.util.Random generador = new java.util.Random();

        // crear tantos robots en la lista como queramos
        for (int i = 0; i < contadorRobots; i++) {
            listaRobot.add(new Robot(numeroSerie, generador.nextInt(0, 101)));
            // aumentar el contador de numero de serie
            numeroSerie++;
        }

        // imprimir la lista de robots
        System.out.println("Lista de robots generada: ");
        for (int i = 0; i < listaRobot.size(); i++) {
            System.out.println(listaRobot.get(i));
        }

        // crear fichero con la lista de robots con bufferedWriter + fileWriter
        String nombreFichero = "Robots.txt";// variable para el nombre del archivo

        // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(nombreFichero))) {// crea el objeto bufferedWriter + fileWriter
            // recorrer la lista
            for (int i = 0; i < listaRobot.size(); i++) {
                // obtener cada robot
                Robot robotTmp = listaRobot.get(i);
                // escribir cada robot en el buffer
                flujo.write("Robot:" + robotTmp.getNumeroSerie() + "-Vida:" + robotTmp.getPorcentajeVida());
                // añadir un salto de linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("");

        // lectura del fichero creado con bufferedReader + fileReader
        System.out.println("Lectura del fichero creado");
        String linea;
        String[] partesLinea;
        List<Robot> listaRobotFichero = new ArrayList<>();
        int vida;
        int id;
        // crear el patron con un string
        final String patron1 = "Robot:(\\d{1,3})-Vida:(\\d{1,3})";

        // crear el pattern y pasarle el patron
        final Pattern pattern1 = Pattern.compile(patron1, Pattern.MULTILINE);

        // captura de excepcion al leer el fichero
        try ( Scanner datosFichero = new Scanner(new File(nombreFichero), "UTF-8")) {
            // leer mientras tengamos una linea disponible en el fichero
            while (datosFichero.hasNextLine()) {
                // obtener datos de cada linea
                linea = datosFichero.nextLine();
                // crear el matcher pasandole el texto a comprobar
                Matcher matcher1 = pattern1.matcher(linea);
                // cuando haga match, imprime los grupos
                while (matcher1.find()) {
                    String grupo1 = matcher1.group(1);
                    String grupo2 = matcher1.group(2);
                    System.out.println(grupo1);
                    System.out.println(grupo2);

                    // crear un robot con el grupo1 que seria id robot
                    // y el grupo 2 la vida
                    id = Integer.parseInt(grupo1);
                    vida = Integer.parseInt(grupo2);
                    listaRobotFichero.add(new Robot(id, vida));
                }
            }
            System.out.println("");
            System.out.println("Lista de robot a prtir del fichero");
            // imprimir la nueva lista
            for (int i = 0; i < listaRobotFichero.size(); i++) {
                System.out.println(listaRobotFichero.get(i));

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
