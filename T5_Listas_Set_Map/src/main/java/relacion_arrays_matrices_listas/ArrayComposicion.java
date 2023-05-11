/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

/**
 *
 * @author joseangel
 */
public class ArrayComposicion {

    public static void main(String[] args) {

        // crear un lanzador 
        LanzarMonedaComposicion lanzador1 = new LanzarMonedaComposicion();

        // mostrar lanzamientos
        lanzador1.mostrarArray();
        
        // mostrar caras
        System.out.println("Caras: " + lanzador1.contarCaras());
        
        // mostrar cruces
        System.out.println("Cruces: " + lanzador1.contarCruces());
    }

}
