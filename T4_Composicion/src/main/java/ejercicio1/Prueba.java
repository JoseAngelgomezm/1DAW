/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Jose Angel
 */
public class Prueba {

    public static void main(String[] args) {
        Empresa empresaA = new Empresa("Construcciones la", "9123783SSS");
        Empresa empresaB = new Empresa("Los kilosgramos", "2938432FF");

        Trabajador t1 = new Trabajador("pepe", "garcia", LocalDate.of(2006, 03, 14), CategoriaEmpleado.INICIAL);
        Trabajador t2 = new Trabajador("carlos", "franco", LocalDate.of(1998, 03, 14), CategoriaEmpleado.INICIAL);
        Trabajador t3 = new Trabajador("obi-wan", "sanchez", LocalDate.of(2000, 03, 14), CategoriaEmpleado.AVANZADA);
        Trabajador t4 = new Trabajador("joaquin", "garcia", LocalDate.of(2000, 03, 14), CategoriaEmpleado.MEDIA);
        Trabajador t5 = new Trabajador("joel", "rodriguez", LocalDate.of(2000, 03, 14), CategoriaEmpleado.MEDIA);
        Trabajador t6 = new Trabajador(t3);
        Trabajador t7 = new Trabajador("pepe", "garcia", LocalDate.of(2006, 03, 14), CategoriaEmpleado.INICIAL);
        
        empresaA.contratarTrabajador(t1);
        empresaA.contratarTrabajador(t2);
        empresaA.contratarTrabajador(t3);
        empresaA.contratarTrabajador(t7);
        empresaA.contratarTrabajador(t7);
        
        empresaB.contratarTrabajador(t4);
        empresaB.contratarTrabajador(t5);
        empresaB.contratarTrabajador(t6);
        System.out.println("Imprimir empresa A");
        empresaA.imprimirEmpresa();

        System.out.println("");
        
        System.out.println("Posiciones donde se encuentra pepe");
        int[] arrayPosiciones = empresaA.buscarTodosNombre("pepe");
        for (int i = 0; i < arrayPosiciones.length; i++) {
            System.out.println(arrayPosiciones[i]);
            
        }
        System.out.println("");
        
        System.out.println("Despedir y contratar trabajador");
        System.out.println(empresaA.despedirTrabajador(t5));
        empresaB.contratarTrabajador(t5);
        
        System.out.println("");
        
        System.out.println("Imprimir Empresa A ordenada");
        empresaA.ordenarNombre();
        empresaA.imprimirEmpresa();
        
        System.out.println("");
        
        
        System.out.println("Imprimir Empresa B ordenada");
        empresaB.ordenarNombre();
        empresaB.imprimirEmpresa();
        
    }

}
