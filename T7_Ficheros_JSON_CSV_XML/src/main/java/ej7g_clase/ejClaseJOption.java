package ej7g_clase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author joseangel
 */
public class ejClaseJOption {

    public static void main(String[] args) {
        String palabra = "";
        List<String> listaPalabras = new ArrayList<>();

        // pedir las palabras hasta introducir terminar
        do {
            palabra = JOptionPane.showInputDialog("Introduce palabras para guardarlas,"
                    + " para salir introduce la palabra \"terminar\"");

            // introducir cada palabra en una lista si no esta vacia
            if (!palabra.equals("")) {
                listaPalabras.add(palabra);
            }

        } while (!palabra.equalsIgnoreCase("terminar"));
        
        crearFichero(listaPalabras, "palabras.txt");

    }
    public static void crearFichero(List<String> listaPalabras , String nombreFichero){
         // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(nombreFichero))) {// crea el objeto bufferedWriter + fileWriter
            // recorrer la lista
            for (int i = 0; i < listaPalabras.size(); i++) {
                String palabra = listaPalabras.get(i);
                // mirar si la palabra es terminar y salir si lo es
                if (palabra.equalsIgnoreCase("terminar")) {
                    break;
                }
                // escribir cada string de la lista en el fichero
                flujo.write(palabra);
                // añadir salto linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
