/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package cafetera;

/**
 *
 * @author joseangel
 */
public record PersonaR(String nombre, int edad) {
// metodo que hace cafe

    public void hacerCafe(Cafetera c) {
        c.llenarCafetera();
    }

    // metodo que disminuye la cantidad de cafe
    public void beberCafe(Cafetera c, int cantidad) {
        // si la cantidad que pasamos es mayor a la cantidad actual que tiene
        // la cafetera de la que queremos beber
        if (cantidad > c.getCantidadActual()) {
            //poner la cantidad de la cafetera a 0 (se bebe lo que habia)
            c.setCantidadActual(0);
            System.out.println("Se ha intentado beber mas de lo que habia");
        } else {
            c.setCantidadActual(c.getCantidadActual() - cantidad);
        }

    }
}
