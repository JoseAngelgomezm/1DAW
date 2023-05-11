/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apunteslambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author joseangel
 */
public class MainLambda {

    public static void main(String[] args) {

        List<Robot> listaRobot = getListaRobot(20);

        // ordenar por vida mediante lambda
        // se le pasa a collections en el criterio Comparator mediante lambda
        //(r1,r2) -> Integer.compare(r1.vida(), r2.vida());
        System.out.println("Lista Robots ordenada por vida: ");
        Collections.sort(listaRobot, (r1, r2) -> Integer.compare(r1.vida(), r2.vida()));
        for (int i = 0; i < listaRobot.size(); i++) {
            System.out.println(listaRobot.get(i));
        }

        System.out.println("");
        System.out.println("Lista ordenada de mayor a menor porcentaje vida: ");
        // se puede crear un objeto comparator con la lambda anterior
        // en este caso ordenamos de menor a mayor pero con reverse se puede
        // invertir el orden y ordenar de mayor a menor
        Comparator<Robot> menorMayor = (r1, r2) -> Integer.compare(r1.vida(), r2.vida());
        // ordenamos la lista de menor a mayor
        Collections.sort(listaRobot, menorMayor.reversed());
        for (int i = 0; i < listaRobot.size(); i++) {
            System.out.println(listaRobot.get(i));

        }

        // robots con el 50% o mas de vida
        System.out.println("");
        System.out.println("Robots con 50% o mas de vida");
        for (int i = 0; i < listaRobot.size(); i++) {
            if (listaRobot.get(i).vida() > 50) {
                System.out.println(listaRobot.get(i));
            }
        }

        // esto mismo se puede realizar mediante un filtro pasando un predicado
        // si se cumple ese predicado, una vez filtrada la lista, devuelve otro
        // stream con los datos que cumplen el filtro
        // el filtro se pasa mediante lambda
        // si queremos contar los objetos , hay que hacerlo al final 
        // no se puede contar y luego volver a hacerle una operacion
        // porque el count devuelve un long y no otro stream
        System.out.println("");
        System.out.println("Robots con 50% o mas de vida API STREAM (stream.filter)");
        listaRobot.stream()
                .filter(r -> r.vida() >= 50)
                //No se puede hacer aqui .count();
                .forEach(r -> System.out.println(r));
        
        System.out.println("");
        System.out.println("Lista robots con los 3 mayores porcentajes de vida");
        listaRobot.stream()
                .limit(3)
                .forEach(r -> System.out.println(r));
        
    }

    // metodo que crea una lista de robots con numero de serie y vida aleatoria
    public static List<Robot> getListaRobot(int num) {
        var listaRobots = new ArrayList<Robot>();
        Random generadorRandom = new Random();

        if (num <= 0) {
            throw new IllegalArgumentException("El numero de robots a crear no"
                    + " es valido");
        }

        for (int i = 0; i < num; i++) {
            listaRobots.add(new Robot(generadorRandom.nextInt(1, 10_001), generadorRandom.nextInt(1, 101)));
        }

        return listaRobots;
    }
}
