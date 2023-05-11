/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16robots;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jose Angel
 */
public class MainRobot {

    public static void main(String[] args) {
        List<Robot> listaRobot = new ArrayList<>();
        java.util.Random generador = new java.util.Random();
        int numeroSerieAleatorio = 0;
        
        // contador para crear tantos robots como queremos
        int contadorRobots = 0;
        
        // bucle para cambiar el numero de serie por cada robot aleatorio
        do {
            listaRobot.add(new Robot(numeroSerieAleatorio));
            numeroSerieAleatorio = generador.nextInt(1, 1000);
            contadorRobots++;
        } while (contadorRobots < 20);
        
        System.out.println("Lista Sin orden");
        for (int i = 0; i < listaRobot.size(); i++) {
            System.out.println(listaRobot.get(i));
        }
        
        System.out.println("");
        
        System.out.println("Lista ordenada por porcentaje de vida");
        Comparator<Robot> vida = (p1, p2) -> Long.compare(p1.getPorcentajeVida(), p2.getPorcentajeVida());
        Collections.sort(listaRobot, vida);
        for (int i = 0; i < listaRobot.size(); i++) {
            System.out.println(listaRobot.get(i));
        }
        
        System.out.println("");
        
        System.out.println("Robots con 50% o mas de vida");
        for (int i = 0; i < listaRobot.size(); i++) {
            if (listaRobot.get(i).getPorcentajeVida() > 50) {
                System.out.println(listaRobot.get(i));
            }
        }
        
        System.out.println("");
        
        System.out.println("los 3 robots con mayor porcentaje de vida");
        Collections.sort(listaRobot, vida);
        for (int i = listaRobot.size() -3; i < listaRobot.size() ; i++) {
            System.out.println(listaRobot.get(i));
        }
        
        System.out.println("");
        
        System.out.println("Lista ordenada por numero de serie");
        Comparator<Robot> numeroSerie = (r1, r2) -> Integer.compare(r1.getNumeroSerie(), r2.getNumeroSerie());
        Collections.sort(listaRobot, numeroSerie);
        for (int i = 0; i < listaRobot.size(); i++) {
            if (listaRobot.get(i).getPorcentajeVida() > 50) {
                System.out.println(listaRobot.get(i));
            }
        }
        
        System.out.println("");
        
        System.out.println("Busqueda binaria del robot 33333");
        // añadir un robot con un numero de serie concreto
        Robot r1 = new Robot(333);
        listaRobot.add(r1);
        // ordenar la lista por numero de serie, sino el resultado es inesperado
        Collections.sort(listaRobot, numeroSerie);
        // imprimir la lista con el robot nuevo añadido
        for (int i = 0; i < listaRobot.size(); i++) {
            System.out.println(listaRobot.get(i));
        }
        // realizar e imprimir la posicion de la busqueda
        int posicionRobot = Collections.binarySearch(listaRobot, r1, numeroSerie);
        System.out.println(posicionRobot);
        
        
    }
}
