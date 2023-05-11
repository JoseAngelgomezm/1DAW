/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProdcutosLibrosMusica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class MiTienda {

    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Pantalon("XS", "Gucci", 1, 230, 14, "Pantalon chandal gucci to flama"));
        listaProductos.add(new Musica("Camela", 2, 10, 14, "Disco de oro de camela"));
        listaProductos.add(new LibroDigital(450, "9912ARNS", 3, 23.50, 14, "Libro Matilda"));
        listaProductos.add(new LibroPapel(890, "8213ASDFFF", 4, 89, 14, "Trilogia Juegos Del Hambre"));

        System.out.println("");
        System.out.println("Informacion de productos: ");
        for (Producto p : listaProductos) {
            System.out.println(p);
        }

        System.out.println("");
        System.out.println("Ordenar por precio: ");
        Comparator<Producto> criterioPrecio = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
        Collections.sort(listaProductos, criterioPrecio);
        for (Producto p : listaProductos) {
            System.out.println(p);
        }

        System.out.println("");
        System.out.println("Ordenar por codigo: ");
        Comparator<Producto> criterioCodigo = (p1, p2) -> Integer.compare(p1.getCodigo(), p2.getCodigo());
        Collections.sort(listaProductos, criterioCodigo);
        for (Producto p : listaProductos) {
            System.out.println(p);
        }

        System.out.println("");
        System.out.println("Busqueda Binaria: ");
        Producto pantalonBuscar = new Pantalon("", "", 1, 0, 0, "");
        Producto libroBuscar = new LibroDigital(0, "", 10, 0, 0, "");
        int posicion = Collections.binarySearch(listaProductos, pantalonBuscar, criterioCodigo);
        System.out.println("El pantalon Gucci esta en la posicion " + posicion);
        posicion = Collections.binarySearch(listaProductos, libroBuscar, criterioCodigo);
        System.out.println("El libro (que no existe) esta en la posicion: " + posicion);

        System.out.println("");
        System.out.println("Lista de libros: ");
        List<Libro> listaLibros = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p instanceof Libro) {
                listaLibros.add((Libro) p);
            }
        }
        for (Libro l : listaLibros) {
            System.out.println(l);
        }

        System.out.println("");
        System.out.println("Mostrar datos de libros con iterator: ");
        for (Iterator<Libro> iterator = listaLibros.iterator(); iterator.hasNext();) {
            Libro next = iterator.next();
            System.out.println(next);

        }

        System.out.println("");
        System.out.println("Ordenar los libros por ISBN: ");
        Collections.sort(listaLibros);
        for (Libro l : listaLibros) {
            System.out.println(l);
        }

        System.out.println("");
        System.out.println("Ejecutar enviar y descargar");
        for (Libro l : listaLibros) {
            if (l instanceof LibroDigital) {
                ((LibroDigital) l).descargar();// conversion explicita
            }

            if (l instanceof LibroPapel) {
                ((LibroPapel) l).enviar("Calle los naranjos");// conversion explicita
            }
        }

        System.out.println("");
        System.out.println("Contiene el libro ISBN: 9912ARNS? ");
        Libro libro1 = new LibroDigital(0, "9912ARNS", 0, 0, 0, "");
        System.out.println(listaLibros.contains(libro1));
        System.out.println("Contiene el libro ISBN: 000ASDF? ");
        Libro libro2 = new LibroDigital(0, "000ASDF", 0, 0, 0, "");
        System.out.println(listaLibros.contains(libro2));

        System.out.println("");
        System.out.println("Prodcutos que se envian: ");
        List<Producto> listaEnvian = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p instanceof SeEnvia) {
                listaEnvian.add(p);
            }
        }
        for (Producto p : listaEnvian) {
            System.out.println(p);
        }

        System.out.println("");
        System.out.println("Metodo de SeEnvian: ");
        for (Producto p : listaEnvian) {
            ((SeEnvia) p).enviar("a casa");// conversion explicita
        }
        
        System.out.println("");
        System.out.println("Eliminar paginas: ");
        for (Libro l : listaLibros) {
            if (l instanceof LibroDigital) {
                l.eliminarPagina(7);
            }
            if (l instanceof LibroPapel) {
                l.eliminarPagina(90);
            }
        }
    }
}
