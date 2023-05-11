/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import ejercicio3.ServiciosFicherosEj3;
import ejercicio3.TrabajadorEj3;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class MainEjercicio4 {
    public static void main(String[] args) {
        
        List<TrabajadorEj3> listaTrabajadores = ServiciosFicherosEj3.leerFichero("RelEmpCenAus.csv");
        
        System.out.println("Puestos de trabajos disintos: ");
        System.out.println(listaTrabajadores.stream());
        
        System.out.println("");
        System.out.println("Numero de trabajadores en el centro: ");
        System.out.println(listaTrabajadores.stream().distinct().count());
        
        System.out.println("");
        System.out.println("DNI diferentes de trabajores que no estan en activo: ");
        
        System.out.println("");
        System.out.println("");
        
    }
}
