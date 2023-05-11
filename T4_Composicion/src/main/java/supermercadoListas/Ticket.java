/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercadoListas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Angel
 */
public class Ticket {
    private LocalDate fecha;
    private LocalTime hora;
    private List<Productos> listaProductos;
    
    // usar localDate time para fechas y hora
    
    // CONSTRUCTOR
    public Ticket(List<Productos> listaProductos) {
        this.fecha = LocalDate.now();
        this.listaProductos = listaProductos;
        this.hora = LocalTime.now();
    }
    
    
    
    // TOSTRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------------------------------------------------------\n");
        sb.append("Supermercado: ").append("Coviran").append("\n");
        sb.append("Fecha: ").append(this.fecha).append("    Hora: ").append(this.hora.getHour()).append(":").append(this.hora.getMinute()).append("\n");
        sb.append("-------------------------------------------------------------------------------------------\n");
        sb.append("   Producto    ").append("   Precio    ").append("Cantidad    ").append("IVA    ").append("Precio sin IVA").append("\n");
        sb.append("-------------------------------------------------------------------------------------------\n");
        // mostrar todos los productos
        for (int i = 0; i < listaProductos.size(); i++) {
            // mostrar los datos de cada prodcuto
            sb.append(this.listaProductos.get(i).nombre()).append("   ")
            .append(this.listaProductos.get(i).precio()).append("         ")
            .append(this.listaProductos.get(i).cantidad()).append("        ")
            .append(this.listaProductos.get(i).tipoDeIva().getNumero()).append("%").append("       ")
             // precio total , precio * por cantidad
             // formatear para obtener solo 2 decimales
            .append(String.format("%.2f", this.listaProductos.get(i).precio()*this.listaProductos.get(i).cantidad())).append("  ")
            .append("\n");
        }
        // tipos de IVA
         // crear las variables para cada tipo de iva
        int cantidad4=0;
        int cantidad10=0;
        int cantidad21=0;
        double precioSinIva4=0;
        double precioSinIva10=0;
        double precioSinIva21=0;
        double precioConIva4=0;
        double precioConIva10=0;
        double precioConIva21=0;
        final double IVA_4=1.04;
        final double IVA_10=1.10;
        final double IVA_21=1.21;
        // modularizar pasando calculos a otro metodo
        // ó
        // pasar el if a un switch
        
        // recorrer la lista para determinar su tipo de iva
        for (int i = 0; i < listaProductos.size(); i++) {
            // si el tipo de iva del producto que se esta mirando es 4
            switch (this.listaProductos.get(i).tipoDeIva().getNumero()) {
                case 4 -> {
                    // contar las cantidades de cada prodcuto de 4
                    cantidad4 += this.listaProductos.get(i).cantidad();
                    // sumar los precios totales de los prodcutos de 4
                    precioSinIva4 +=  (this.listaProductos.get(i).precio() * this.listaProductos.get(i).cantidad());
                    //
                    precioConIva4 = precioSinIva4 * IVA_4;
                    // si el tipo de iva del producto que se esta mirando es 10
                }
                case 10 -> {
                    // contar las cantidades de cada prodcuto de 10
                    cantidad10 += this.listaProductos.get(i).cantidad();
                    // sumar los precios totales de los prodcutos de 10
                    precioSinIva10 += (this.listaProductos.get(i).precio() * this.listaProductos.get(i).cantidad());
                    //
                    precioConIva10 = precioSinIva10 * IVA_10;
                    // si el tipo de iva del producto que se esta mirando es 21
                }
                case 21 -> {
                    // contar las cantidades de cada prodcuto de 21
                    cantidad21 +=  this.listaProductos.get(i).cantidad();
                    // sumar los precios totales de los prodcutos de 21
                    precioSinIva21 += (this.listaProductos.get(i).precio() * this.listaProductos.get(i).cantidad());
                    //
                    precioConIva21 = precioSinIva21 * IVA_21;
                }
                default -> {
                }
            }
        }
        
        // precio final con iva
        double totalAPagar = precioConIva4 + precioConIva10 + precioConIva21;
        
        // formatear numeros para obtener solo 2 decimales
        sb.append("-------------------------------------------------------------------------------------------\n");
        sb.append("N prod. iva 4%:  ").append(cantidad4).append("    Precio sin IVA: ").append(String.format("%.2f", precioSinIva4)).append("    Precio con IVA: ").append(String.format("%.2f", precioConIva4)).append("\n");
        sb.append("N prod. iva 10%: ").append(cantidad10).append("    Precio sin IVA: ").append(String.format("%.2f", precioSinIva10)).append("    Precio con IVA: ").append(String.format("%.2f", precioConIva10)).append("\n");
        sb.append("N prod. iva 21%: ").append(cantidad21).append("    Precio sin IVA: ").append(String.format("%.2f", precioSinIva21)).append("    Precio con IVA: ").append(String.format("%.2f", precioConIva21)).append("\n");
        sb.append("-------------------------------------------------------------------------------------------\n");
        sb.append("Total a pagar: ").append(String.format("%.2f", totalAPagar)).append(" -- Gracias por su visita\n");
        sb.append("-------------------------------------------------------------------------------------------\n");
               
        
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
