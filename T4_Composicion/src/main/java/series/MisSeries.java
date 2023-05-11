/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package series;

/**
 *
 * @author joseangel
 */
public class MisSeries {

    public static void main(String[] args) {
        // Creacion de una serie
        Serie simpson = new Serie("Los Simpson", "Comedia",
                "...", 1000);
        
        //mostrar resultados con to string
        System.out.println(simpson.toString());
        
        // crear serie con constructor vacio y mostrar resultado
        Serie house = new Serie ();
        System.out.println(house.toString());
        
        // crear serie con constuctor que contiene likes
        Serie prisonBreak = new Serie("Prison Break", "Accion", "...",
                8, 877000);
        System.out.println(prisonBreak.toString());
        
        // crear serie con metodo servicio serie
        //Serie peakeBlinders = ServicioSerie.leerSeriePorTeclado();
        //System.out.println(peakeBlinders);
        
        ServicioSerie.darLike(simpson);
        System.out.println(simpson);
    }
}
