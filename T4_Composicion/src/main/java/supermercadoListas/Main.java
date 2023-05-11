/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercadoListas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Angel
 */
public class Main {
    public static void main(String[] args) {
        // crear productos
        Productos producto1 = new Productos("leche           ", 1, 0.90, TipoIva.DIEZ);
        Productos producto2 = new Productos("Cacao           ", 1, 0.50, TipoIva.VIENTIUNO);
        Productos producto3 = new Productos("Cereales        ", 1, 2.10, TipoIva.CUATRO);
        Productos producto4 = new Productos("Agua            ", 1, 1, TipoIva.DIEZ);
        Productos producto5 = new Productos("Coca Cola       ", 1, 1.50, TipoIva.VIENTIUNO);
        Productos producto6 = new Productos("Mix Frutos Secos", 1, 3.30, TipoIva.VIENTIUNO);
        
        // crear el supermercado
        Supermercado supermercado1 = new Supermercado(1, "Coviran");
        
        // crear la lista de prodcutos
        // la lista no es necesaria crearla porque ya la cinta crear una lista vacia
        //ArrayList listaProductos = new ArrayList();
        
        // crear cinta 
        Cinta cinta1 = new Cinta();
        
        // crear caja
        Caja caja1 = new Caja(0, cinta1);
        
        // añadir los productos a la cinta
        caja1.getCintaTransportadora().añadirProducto(producto1);
        caja1.getCintaTransportadora().añadirProducto(producto2);
        caja1.getCintaTransportadora().añadirProducto(producto3);
        caja1.getCintaTransportadora().añadirProducto(producto4);
        caja1.getCintaTransportadora().añadirProducto(producto5);
        caja1.getCintaTransportadora().añadirProducto(producto6);
        
        Ticket ticket1 = supermercado1.generarTicketSupermercado(caja1);
        System.out.println(ticket1);
        
        caja1.getCintaTransportadora().añadirProducto(producto1);
        caja1.getCintaTransportadora().añadirProducto(producto5);

        Ticket ticket2 = supermercado1.generarTicketSupermercado(caja1);
        System.out.println(ticket2);
        
        
        caja1.getCintaTransportadora().quitarProducto("leche");
        caja1.getCintaTransportadora().quitarProducto("Coca Cola");
        
        
        Ticket ticket3 = supermercado1.generarTicketSupermercado(caja1);
        System.out.println(ticket3);
    }
            
}
