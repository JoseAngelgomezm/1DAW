/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7e_xml_csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Jose Angel
 */
public class MainEj7E_xml_csv {

    public static void main(String[] args) throws JAXBException {

        ArrayList<Factura> listadoDeFacturas = new ArrayList<>();

        System.out.println("Lista de facturas: ");
        for (int i = 0; i < 50; i++) {
            listadoDeFacturas.add(new Factura());
            System.out.println(listadoDeFacturas.get(i));
        }

        System.out.println("");
        System.out.println("Creacion de directorios: ");
        crearDirectorio("csv");
        crearDirectorio("xml");

        System.out.println("");
        System.out.println("Guardar la lista de facturas como un archivo en csv: ");
        crearFicheroLista(listadoDeFacturas, "csv/facturas.csv");

        System.out.println("Guardar la lista de facturas como un archivo en xml: ");
        // Crea el contexto JAXB. Se encarga de definir los objetos 
        // que vamos a guardar. En nuestro caso sólo el tipo CatalogoMuebles
        JAXBContext contexto = JAXBContext.newInstance(ListaFacturas.class);

        // El contexto JAXB permite crear un objeto Marshaller, que sirve para
        // generar la estructura del fichero XML 
        // El proceso de pasar objetos Java (CatalogoMuebles) a ficheros XML 
        // se conoce como "marshalling" o "serialización"
        Marshaller serializador = contexto.createMarshaller();

        // Especificamos que la propiedad del formato de salida
        // del serializador sea true, lo que implica que el formato se 
        // realiza con indentación y saltos de línea
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Serialización y salida por consola
        ListaFacturas facturas = new ListaFacturas();
        facturas.setLista(listadoDeFacturas);
        serializador.marshal(facturas, System.out);

        // Volcado al fichero xml
        serializador.marshal(facturas, new File("xml/facturas.xml"));
        
        // crear el directorio facturascsv
        crearDirectorio("facturascsv");
        
        // crear un fichero por cada factura
        for (int i = 0; i < listadoDeFacturas.size(); i++) {
            // obtener el nombre del fichero
            String nombreFichero = listadoDeFacturas.get(i).getCodigoUnico().concat(".csv");
            // captura de expcepcion al crear el fichero
            try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("facturascsv/".concat(nombreFichero)))) {// crea el objeto bufferedWriter + fileWriter
                Factura tmp = listadoDeFacturas.get(i);
                flujo.write(tmp.toString());
                // añadir un salto de linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

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

    public static void crearFicheroLista(List<Factura> factura, String nombreFichero) {
        // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(nombreFichero))) {// crea el objeto bufferedWriter + fileWriter
            // recorrer la lista para obtener facturas
            for (int i = 0; i < factura.size(); i++) {
                Factura tmp = factura.get(i);
                flujo.write(tmp.toString());
                // añadir un salto de linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
