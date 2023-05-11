/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Jose Angel
 */
public class MainMuseo {

    public static void main(String[] args) {

        // crear lista empleados, lista de salas, y lista de obras
        List<Empleado> listaEmpleados = new ArrayList<>();
        List<Sala> listaSalas = new ArrayList<>();
        List<Obra> listaObrasTemporal1 = new ArrayList<>();
        List<Obra> listaObrasFija1 = new ArrayList<>();
        List<Obra> listaObrasFija2 = new ArrayList<>();

        // añadir las obras a la sala fija 1 y 2
        listaObrasFija1.add(new Pintura(LocalDate.of(1960, Month.MARCH, 1), 111, "Rodriguez Perez"));
        listaObrasFija2.add(new Escultura(127, 333, "Juan Garcia"));

        // crear el museo
        Museo museo1 = new Museo("Museo Picasso", "Calle los lirios 118", listaEmpleados, listaSalas);

        System.out.println("Museo sin datos:");
        System.out.println(museo1);

        System.out.println("");
        System.out.println("Añadir salas al museo:  2 fija y temporal");
        museo1.añadirSala(new Temporal(LocalDate.now(), LocalDate.now().plusMonths(3), 0, listaObrasTemporal1, new Humedad(15), new Temperatura(28)));
        museo1.añadirSala(new Fija(true, 1, listaObrasFija1, new Humedad(22), new Temperatura(12)));
        museo1.añadirSala(new Fija(true, 2, listaObrasFija2, new Humedad(22), new Temperatura(12)));
        System.out.println(museo1);

        // crear conjunto de obras unico de todo el museo
        // recorrer todas las salas
        System.out.println("");
        System.out.println("Conjunto de obras unico de todo el museo: ");
        Set<Obra> conjuntoObrasUnico = new HashSet<>();
        for (int i = 0; i < museo1.getListaSalas().size(); i++) {
            // por cada sala recorrer su lista de obras
            for (int j = 0; j < museo1.getListaSalas().get(i).getListaObras().size(); j++) {
                // añadir cada obra al set
                conjuntoObrasUnico.add(museo1.getListaSalas().get(i).getListaObras().get(j));
            }

        }
        for (Obra o : conjuntoObrasUnico) {
            System.out.println(o);
        }

        System.out.println("");
        System.out.println("Añadir empleados: monitor y vigilante");
        museo1.contratar(new Monitor("3333333F", "Joaquinin"));
        museo1.contratar(new Vigilante("01010101S", "Pepito"));
        System.out.println(museo1);

        System.out.println("");
        System.out.println("Añadir empleados conservadores: escultorico y pictorico");
        Empleado pictorico1 = new Pictorico(1, "54545454K", "Gallardo Tarragon");
        museo1.contratar(new Escultorico(0, "98989898S", "Hernandez Hernandez"));
        museo1.contratar(pictorico1);
        System.out.println(museo1);

        System.out.println("");
        System.out.println("Realizar restauraciones");
        // recorrer el set de obras
        for (Obra o : conjuntoObrasUnico) {
            // si la obra es una pintura
            if (o instanceof Pintura) {
                // conversion explicita del empleado a pictorico
                // y de la obra a pintura
                ((Pictorico) pictorico1).restaurarObra((Pintura) o);
            }

        }

        System.out.println("");
        System.out.println("Comprobar alarmas de las salas: ");
        museo1.getListaSalas().get(0).getSensorHumedad().alarma();
        museo1.getListaSalas().get(1).getSensorHumedad().alarma();

        System.out.println("");
        System.out.println("Despedir empleados: ");
        museo1.despedir(new Monitor("3333333F", "Joaquinin"));
        museo1.despedir(new Monitor("11111S", "pepe"));
        System.out.println(museo1);

    }

}
