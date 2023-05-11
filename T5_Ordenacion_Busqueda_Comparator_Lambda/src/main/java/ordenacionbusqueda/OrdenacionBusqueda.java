/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ordenacionbusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class OrdenacionBusqueda {

    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();

        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 24_500, "Euro"));
        paises.add(new Pais("EEUU", 46, 1_505_400, "Dolar"));

        paises.forEach(System.out::println);

        System.out.println("--ordenar por moneda (comparable) se ordena por orden natural---");

        // ordenar por moneda (comparable) se ordena por orden natural
        // (requiere que la clase pais implemente comparable)
        Collections.sort(paises);
        // mostrar lista ordenada
        paises.forEach(System.out::println);

        System.out.println("---ordenar por moneda (comparator)----");

        // ordenar por moneda (comparator)
        // se proporciona el criterio por lambda
        // se crea el objeto comparator para decirle por que parametros vamos a ordenar
        // en este caso se compara p1 y p2 obteniendo la superficie del pais
        Comparator<Pais> criterioSuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());

        // en este caso se compara p1 y p2 obteniendo la poblacion
        Comparator<Pais> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());

        // al llamar a sort, que es el que ordena, se la pasa la lista y el objeto de criterio
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);

        System.out.println("-llamada a sort que ordena por 2 criterios, primero por superficie y luego por nombre--");

        // en este caso se crear el objeto comparator con los parametros
        // para comparar p1 y p2 por nombre
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());

        // llamada a sort que ordena por 2 criterios, primero por superficie y luego por nombre
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));
        paises.forEach(System.out::println);

        System.out.println("-ordena la lista de paises por superficie y luego por poblacion---");
        // ordena la lista de paises por superficie y luego por poblacion
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioPoblacion));
        paises.forEach(System.out::println);

        // busqueda binary search
        // se busca por el mismo criterio que se ha ordenado anteriormente
        // lista, key(objeto del tipo de la lista), criterio
        // busqueda por orden natural (nombre) comparable (implementacion)
        // ordenar previamente por criterio natural que es el nombre
        System.out.println("----------------------------------");
        System.out.println("BUSQUEDA BINARIA (COMPARABLE)");
        // ordenar por nombre , orden natural
        Collections.sort(paises);
        paises.forEach(System.out::println);
        // crear un objeto pais con el nombre que queremos buscar
        // (constructor por defecto)
        Pais objetoBuscar = new Pais();
        // poner el nombre del objeto que vamos a pasar para buscar 
        objetoBuscar.setNombre("españa");
        // crear variable para guardar posicion
        int posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println("Posicion de la lista en la que esta portugal: " + posicion);

        // si se intenta buscar en la lista algo que no es nombre se puede obtener
        // una posicion erronea
        // si se ordena la lista por un criterio y se busca por otro el resultado
        // es inesperado-------------------------------
        // ordenacion y busqueda por poblacion (orden no natural) uso de comparator
        System.out.println("-ordenacion y busqueda por poblacion (orden no natural) uso de comparator--");
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        objetoBuscar = new Pais();
        objetoBuscar.setPoblacion(46);
        // se le pasa la lista, el objeto a buscar con la poblacion que queremos buscar,
        // y el criterio por el cual esta ordenada la lista
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        System.out.println(posicion);
        

    }
}
