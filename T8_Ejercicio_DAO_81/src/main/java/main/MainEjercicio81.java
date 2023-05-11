/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Factura;
import modelo.FacturaDAO;
import modelo.InterfazDao;

/**
 *
 * @author joseangel
 */
public class MainEjercicio81 {

    public static void main(String[] args) throws SQLException {

        // leer los datos del fichero de facturas y guardarlos en una lista
        List<Factura> listaFacturas = leerFicheroConFacturas("facturas.csv");

        // insertar la lista de facturas mediante el metodo de la interfazDAO
        InterfazDao facturasDAO1 = new FacturaDAO();

        System.out.println("Insertar datos del fichero Facturas.csv: ");
        System.out.println("Numero de filas insertadas: " +
                facturasDAO1.insertarListaFactura(listaFacturas));

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("Obtener todos los registros de la tabla facturas: ");
        List<Factura> registrosTabla = facturasDAO1.obtenerTodosRegistrosTabla();
        System.out.println("--------------------------------------------------------------------------------");
        for (Factura factura : registrosTabla) {
            System.out.println(factura);
        }

        System.out.println("");
        int codigoBorrar = 13;
        Factura facturaBorrar = new Factura();
        facturaBorrar.setCodigo(codigoBorrar);
        
        System.out.println("Borrar una factura pasando una factura con el mismo codigo : "
                + codigoBorrar + " se ha borrado: "
                + facturasDAO1.borrarFactura(facturaBorrar) + " factura");
        
        registrosTabla = facturasDAO1.obtenerTodosRegistrosTabla();
        System.out.println("--------------------------------------------------------------------------------");
        for (Factura factura : registrosTabla) {
            System.out.println(factura);
        }

        System.out.println("");

        Factura facturaInsertar = new Factura(99, LocalDate.now(),
                "factura de hoy", 209.99);

        System.out.println("Insertar una factura pasando una factura por entrada: "
                + facturaInsertar + " se han insertado "
                + facturasDAO1.insertarFactura(facturaInsertar) + " factura");

        registrosTabla = facturasDAO1.obtenerTodosRegistrosTabla();
        System.out.println("--------------------------------------------------------------------------------");
        for (Factura factura : registrosTabla) {
            System.out.println(factura);
        }

        System.out.println("");
        Factura facturaActualizar = new Factura();
        facturaActualizar.setCodigo(99);
        Factura facturaNueva = new Factura(101, LocalDate.now(), "factura de ayer", 309.99);

        System.out.println("Actualizar una factura pasando la pk de la factura que"
                + " queremos actualizar y la nueva factura con los nuevos datos "
                + facturasDAO1.actualizarFactura(facturaActualizar.getCodigo(),
                        facturaNueva));

        registrosTabla = facturasDAO1.obtenerTodosRegistrosTabla();
        System.out.println("--------------------------------------------------------------------------------");
        for (Factura factura : registrosTabla) {
            System.out.println(factura);
        }

        System.out.println("");
        int codigoBuscar = 6;
        System.out.println("Buscar por una Primary Key : " + codigoBuscar + " "
                + facturasDAO1.buscarPorPK(codigoBuscar));

//        System.out.println("");
//        System.out.println("Borrado de tabla: " + facturasDAO1.borrarTabla()
//                + " filas borradas");

    }

    private static List<Factura> leerFicheroConFacturas(String nombreFichero) {
        List<Factura> listaFacturas = new ArrayList<>();

        try ( Scanner datosFichero = new Scanner(new File(nombreFichero), "UTF-8")) {
            String linea;
            String[] tokens;
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // dividir la linea por el campo separador del csv
                tokens = linea.split(";");

                // crear una factura con los campos obtenidos en tokens al dividir
                listaFacturas.add(new Factura(Integer.parseInt(tokens[0]),
                        LocalDate.parse(tokens[1], DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                        tokens[2],
                        Double.parseDouble(tokens[3])));

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaFacturas;
    }
}
