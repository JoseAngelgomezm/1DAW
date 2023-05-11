/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03personaempleadoprogramador;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jose Angel
 */
public class MainPersonaEmpleadoProgramador {

    public static void main(String[] args) {
        Set<Persona> personas = new HashSet<>();
        
        Set<Jardinero> jardineros = new HashSet<>();
        
        Persona persona1 = new Persona("Elias", "43278JKS", 42);
        Persona persona2 = new Persona("Josele", "12378ASB", 24);
        Persona persona3 = new Persona("Pepe", "23374ASB", 24);

        Empleado empleado1 = new Empleado(1340, "Pepe", "7386421Q", 33);
        Empleado empleado2 = new Empleado(2345, "Juan", "3123821D", 23);

        Programador programador1 = new Programador(Especializacion.ANALISTA, 3435, "Hector", "8753345D", 36);
        Programador programador2 = new Programador(Especializacion.SENIOR, 4435, "Naomi", "5313424Z", 45);
        
        Jardinero jardinero1 = new Jardinero(3, 1200, "Rafael", "989898D", 23);
        Jardinero jardinero2 = new Jardinero(4, 1200, "Pepe", "6576763D", 26);
        Jardinero jardinero3 = new Jardinero(2, 1200, "Kiko", "876253S", 24);
        
        System.out.println("PERSONAS");
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        for (Persona p : personas) {
            System.out.println(p);
        }
        
        System.out.println("");
        
        System.out.println("Jardineros");
        jardineros.add(jardinero1);
        jardineros.add(jardinero2);
        jardineros.add(jardinero3);
        for (Jardinero j : jardineros) {
            System.out.println(j);
        }

        System.out.println("");
        System.out.println("EMPLEADO 1 SIN SUBIR EL SUELDO");
        System.out.println(empleado1);

        System.out.println("");
        System.out.println("EMPLEADO 1 CON AUMENTO DE 50 EN EL SUELDO");
        empleado1.aumentarSalario(50);
        System.out.println(empleado1);
        
        System.out.println("");
        System.out.println("PROGRAMADOR 1 SIN AUMENTO DE SUELDO");
        System.out.println(programador1);
        
        System.out.println("");
        System.out.println("PROGRAMADOR 1 CON AUMENTO DE 100 EN EL SUELDO");
        programador1.aumentarSalario(100);
        System.out.println(programador1);
        
        // añadir un tipo de empleado jardinero con atributo antiguedad
        // añadir comparable con el atributo antguedad
        
    }
}
