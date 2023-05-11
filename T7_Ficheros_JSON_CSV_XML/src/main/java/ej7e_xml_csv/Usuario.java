/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7e_xml_csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class Usuario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Esta es la lista de facturas: ");
        listarDirectorio("facturascsv");
        System.out.println("Introduce el nombre de una factura para leer su contenido");
        String nombreFactura = teclado.nextLine();
        leerFichero("facturascsv/".concat(nombreFactura));
        
        System.out.println("");
        System.out.println("Factura creada desde el archivo: ");
        Factura facturaArchivo = crearFacturaDesdeArchivo(nombreFactura);
        System.out.println(facturaArchivo);
        
        System.out.println("");
        System.out.println("Listado de los ficheros: ");
        borrarFichero("facturascsv/".concat(nombreFactura));
        listarDirectorio("facturascsv");
        
        System.out.println("se ha eliminado el fichero " + nombreFactura);
        
    }
    
    // Este método borra ficheros y directorios de la ruta especificada
    // Si el directorio no está vacío no se borra
    public static void borrarFichero(String ruta) {
        Path file = Paths.get(ruta);
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
    
    public static void leerFichero(String nombreFichero) {
        String linea;
        String[] tokens;
        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(nombreFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");
                for (String string : tokens) {
                    System.out.print(string + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Factura crearFacturaDesdeArchivo(String nombreFichero) {
        String[] tokens;
        String linea;
        Factura factura = new Factura();
        try ( Scanner datosFichero = new Scanner(new File("facturascsv/".concat(nombreFichero)), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");

                // separamos la fecha
                String[] fechaSeparada = tokens[1].split("-");
                int año = Integer.parseInt(fechaSeparada[0]);
                int mesNumerico = Integer.parseInt(fechaSeparada[1]);
                Month mes = Month.of(mesNumerico);
                int dia = Integer.parseInt(fechaSeparada[2]);
                LocalDate fecha = LocalDate.of(año, mes, dia);

                double importe = Double.parseDouble(tokens[3]);

                factura.setCodigoUnico(tokens[0]);
                factura.setDescripcion(tokens[2]);
                factura.setFechaEmision(fecha);
                factura.setTotalImporteFactura(importe);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return factura;
    }

    public static void listarDirectorio(String ruta) {

        File f = new File(ruta);
        if (f.exists()) {
            // Obtiene los ficheros y directorios dentro de f y los 
            // devuelve en un array
            File[] ficheros = f.listFiles();
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }
}
