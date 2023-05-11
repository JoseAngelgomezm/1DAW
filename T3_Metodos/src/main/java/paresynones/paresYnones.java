/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paresynones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class paresYnones {

    public static void main(String[] args) {
        int opcion;
        int paresNones;
        int dedosJugador;
        int dedosCpu;
        int dedosTotales;
        String ganador;
        do {
            // Mostrar el menu y recoger opcion
            opcion = menu();
            // si la opcion es 1 jugar
            if (opcion == 1) {
                // preguntar al jugador a que va si a pares o nones
                paresNones = menuParesNones();
                // preguntar al jugador cuantos dedos sacará
                dedosJugador = numeroJugador();
                // la cpu saca sus dedos
                dedosCpu = numeroCpu();
                // resumen del enfrentamiento
                System.out.println("Tú sacas: " + dedosJugador + " la cpu saca: " + dedosCpu);
                // suma de los dedos para determinar el ganador
                dedosTotales = dedosCpu + dedosJugador;
                // Resumen de la partida
                System.out.println("La suma es: " + dedosTotales + " Y tu has elegido: " 
                        + determinarPosicion(paresNones));
                // determinar ganador
                ganador = determinarGanador(paresNones, dedosTotales);
                // mostrar ganador
                System.out.println(ganador);
                
            }
        } while (opcion != 2);

    }

    // metodo que muestra el menu y recoge una opcion
    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            String menu = """
                      |------------------------|
                      | Selecciona una opcion: |
                      | - 1 JUGAR PARES Y NONES|
                      | - 2 SALIR              |
                      |------------------------|
                      """;
            System.out.printf(menu);
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero");
            }
            //limpiar buffer
            teclado.nextLine();
        } while (opcion < 1 || opcion > 2);

        return opcion;
    }

    // metodo que muestra el menu para elegir pares o nones
    private static int menuParesNones() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            String menu = """
                      |------------------------|
                      | ELIGE PARES O NONES:   |
                      | - 1 NONES              |
                      | - 2 PARES              |
                      |-------------------------
                      """;
            System.out.printf(menu);
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero");
            }

            //limpiar buffer
            teclado.nextLine();
        } while (opcion < 1 || opcion > 2);

        return opcion;
    }

    // metodo que pregunta al jugador cuantos dedos sacará
    private static int numeroJugador() {
        Scanner teclado = new Scanner(System.in);
        int numerodedos = 0;

        do {
            System.out.println("Introduce tu numero de dedos: ");
            try {
                numerodedos = teclado.nextInt();
                
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero.");
            }
            //limpiar buffer
            teclado.nextLine();
        } while (numerodedos > 5 || numerodedos < 0);

        return numerodedos;
    }
    
    // metodo que saca un numero del 0 al 5 para la cpu
    private static int numeroCpu() {
        java.util.Random generador = new java.util.Random();
        int numeroDedos = generador.nextInt(0, 6);
        return numeroDedos;
    }
    
    // metodo que determina que has elegido
    private static String determinarPosicion (int paresNones){
        String posicion;
        final int NONES = 1;
        // si paresNones es 1 hemos elegido nones
        if (paresNones == NONES) {
            posicion = "NONES";
        }
        // si hemos elegido 2 es pares
        else{
            posicion = "PARES";
        }
        return posicion;
    }
    
    // metodo que determina el ganador
    private static String determinarGanador(int paresNones, int dedosTotales){
        String ganador ="";
        final int NONES = 1;
        final int PARES = 2;
        
        // si hemos elegido nones y el resto es 1 hemos ganado
        if (paresNones == NONES && dedosTotales % 2 == 1) {
            ganador = "HAS GANADO CAMPEON :P";
        }
        // si hemos elegido pares y el resto 0 hemos ganado
        else if (paresNones == PARES && dedosTotales % 2 == 0) {
            ganador = "HAS GANADO CAMPEON :P";
        }
        // en cualquier otro caso hemos perdido
        else {
            ganador = "HAS PERDIDO BROU :P";
        }
    
        return ganador;
    }
    
    
        
}
