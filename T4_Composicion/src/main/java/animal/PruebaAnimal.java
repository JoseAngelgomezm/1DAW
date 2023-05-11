/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author Jose Angel
 */
public class PruebaAnimal {

    public static void main(String[] args) {
        // crear un objeto LocalDate para darle una fecha de nacimiento a a1
        LocalDate fechaNacimientoA1 = LocalDate.of(2007, 12, 3);
        // crear un objeto LocalDate para darle una fecha de nacimiento a a2
        LocalDate fechaNacimientoA2 = LocalDate.of(2003, 1, 9);

        // crear a1
        Animal a1 = new Animal(fechaNacimientoA1, "budy", tipoAnimal.GATO, 230, "descansando");

        // crear a2
        Animal a2 = new Animal(fechaNacimientoA2, "rufo", tipoAnimal.PERRO, 830, "descansando");

        // crear una persona p1
        Persona p1 = new Persona("Juan", 26);
        // crear una persona p2
        Persona p2 = new Persona("Pepe", 30);

        //imprimir valores de p1 y p2
        System.out.println("MOSTRAR DATOS DE p1 y p2");
        System.out.println("Animal p1: " + p1);
        System.out.println("Animal p2: " + p2);

        //clonar a2 en a3
        Animal a3 = a2.clonar(a2);
        // mostrar a2 y a3
        System.out.println("MOSTRAR DATOS DE a2 y a3 (clones)");
        System.out.println("Animal a2: " + a2);
        System.out.println("Animal a3: " + a3);

        // p1 llama para despertar a todos los animales
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);

        // mostrar datos de cada animal para comprobar que estan despiertos
        System.out.println("LLAMAR A TODOS LOS ANIMALES");
        System.out.println("Animal a1: " + a1);
        System.out.println("Animal a2: " + a2);
        System.out.println("Animal a3: " + a3);
        
        //p2 juega a2 durante 120min
        p2.jugar(a2, 120);
        System.out.println("Resultado despues de que p2 juege 120min con a2: ");
        System.out.println(a2);
        
        //p1 alimenta a a1 1000 gramos
        System.out.println("Añadir 1000 gramos de comida a a1:");
        p1.alimentar(a1, 1000);
        System.out.println("Nuevo peso de a1: " + a1.getPeso());
        
        //p1 juega con a1 200 minutos
        System.out.println("p1 juega con a1 200 minutos:");
        p1.jugar(a1, 200);
        System.out.println("nuevo peso de a1: " + a1.getPeso());
    }
}
