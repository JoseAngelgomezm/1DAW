/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jose Angel
 */
public class MainComposicion {

    public static void main(String[] args) {
        // crear lista de tipo mueble
        List<Mueble> muebles = new ArrayList();

        muebles.add(new Mesa(2, "M1", "Blanco", 55, 100, 60));
        muebles.add(new Mesa(4, "M2", "Negro", 60, 150, 55));
        muebles.add(new Mesa(4, "M3", "Negro", 58, 180, 67));
        muebles.add(new Silla("fresno", "S1", "Gris", 44, 33, 40));
        muebles.add(new Silla("Abeto", "S2", "Blanco", 54, 43, 43));
        muebles.add(new Silla("Roble", "S3", "Negro", 45, 44, 43));

        // imprimir lista
        System.out.println("LISTA ORIGINAL");
        for (int i = 0; i < muebles.size(); i++) {
            System.out.println(muebles.get(i));
        }

        System.out.println("");

        // ejecutar metodos propio de cada clase
        for (Mueble m : muebles) {
            if (m instanceof Silla) {
                ((Silla) m).cambiarTipoMadera("Fresno");
            }
            if (m instanceof Mesa) {
                ((Mesa) m).cambiarNumeroPatas(6);

            }
        }

        System.out.println("LISTA CON CAMBIOS A FRESNO Y 6 PATAS");
        // imprimir lista despues de los cambios
        for (int i = 0; i < muebles.size(); i++) {
            System.out.println(muebles.get(i));
        }
        
        
        System.out.println("");
        System.out.println("LISTA ORDENADA");
        // crear criterio por altura
        Comparator<Mueble> crterioAlto = (p1, p2) -> Long.compare(p1.getAlto(), p2.getAlto());
        // llamda a collection sort para ordenar
        Collections.sort(muebles, crterioAlto);
        // imprimir lista ordenada
        muebles.forEach(System.out::println);

        // busqueda binaria
        // crear un mueble que sea una silla
        Silla objetoBuscarSilla = new Silla();
        Mesa ObjetoBuscarMesa = new Mesa();
        // poner el alto que queremos buscar
        objetoBuscarSilla.setAlto(54);
        ObjetoBuscarMesa.setAlto(58);
        // guaradar posicion de la silla
        int posicion = Collections.binarySearch(muebles, objetoBuscarSilla, crterioAlto);
        // imprimir posicion 
        System.out.println("Posicion de la silla: " + posicion);
        // guardar posicion de la mesa
        posicion = Collections.binarySearch(muebles, ObjetoBuscarMesa,crterioAlto);
        System.out.println("Posiicon de la mesa: " + posicion);
        
    }

}
