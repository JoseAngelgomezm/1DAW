/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesinterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class MainApuntes {

    public static void main(String[] args) {

        // crear una lista de personas
        List<Persona> lista = new ArrayList<>();

        // crear una lista de objetos identificables (los que implementan la
        // interfaz identificable)
        List<Identificable> listaIdentificable = new ArrayList<>();

        // añadir a la lista identificable un estudiante (es posible porque
        // estudiante implementa esa interfaz)
        listaIdentificable.add(new Estudiante(1, "pepito", "grillo",
                "34456784T",
                new Direccion("Los naranjos", "Malaga",
                        "223345", "España")));

        // añadir personas a lista
        lista.add(new Estudiante(1, "pepito", "grillo",
                "34456784T",
                new Direccion("Los naranjos", "Malaga",
                        "223345", "España")));

        lista.add(new Titular(LocalDate.now(), "Maestro Repostero",
                "Jaimito", "Pies verdes", "4556423K",
                new Direccion("Los petalos", "Jaen", "76393", "España")));

        lista.add(new Interino(LocalDate.MIN, LocalDate.MIN,
                "Matematicas", "Pepe", "Joaquin",
                "34553423j", new Direccion("Las petunias", "San Roque",
                        "11370", "España")));
        
        // imprimir la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
        
        System.out.println("");
        System.out.println("Acciones: ");
        
        for (Persona persona : lista) {
            // decirle a todas las personas de la lista que se identifiquen
            persona.identificate();

            // decirle a los interinos que muestren su fecha de inicio
            if (persona instanceof Interino) {
                var tmp = ((Interino) persona).getFechaInicio();
                System.out.println(tmp);
            }

            // decirle a los titulares que muestren la fecha de jublacion
            if (persona instanceof Titular) {
                var tmp = ((Titular) persona).getFechaJubilacion();
                System.out.println(tmp);
            }

            // decirle a los estudiantes que estudian poco
            if (persona instanceof Estudiante) {
                ((Estudiante) persona).estudiarPoco();
            }

            // decirle a las personas que implementan identificable que son
            // identificables
            if (persona instanceof Identificable) {
                System.out.println("Soy identificable");
            }
        }

    }

}
