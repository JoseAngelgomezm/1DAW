/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morra;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class juegoMorra {

    public static void main(String[] args) {
        int opcion = 0;
        int prediccionJugador;
        int prediccionCpu;
        int mostrarDedosJugador;
        int mostrarDedosCpu;
        int dedosTotales;
        String ganador;
        final int OPCIONJUGAR = 1;
        final int OPCIONSALIR = 2;

        do {
            // mostrar el menu
            opcion = menu();
            // una vez se escoge jugar, inicializar a 0 los contadores
            int rondasGanadasJugador = 0;
            int rondasGanadasCpu = 0;
            int rondasEmpate = 0;
            int rondas = 1;
            // si la opcion es 1 (jugar)
            if (opcion == OPCIONJUGAR) {
                do {
                    // preguntar cuantos dedos mostrara el jugador
                    mostrarDedosJugador = dedosJugador();
                    // preguntar cuantos dedos mostrara la cpu
                    mostrarDedosCpu = dedosCpu();
                    // preguntar cuantos dedos cree que habra al jugador
                    prediccionJugador = predecirDedosJugador(mostrarDedosJugador);
                    // preguntar cuantos dedos cree que habra a la cpu
                    prediccionCpu = predecirDedosCpu(mostrarDedosCpu);
                    // contar los dedos totales que hay
                    dedosTotales = mostrarDedosJugador + mostrarDedosCpu;
                    // resumen de la partida
                    resumenPartida(prediccionJugador, mostrarDedosJugador,
                            prediccionCpu, mostrarDedosCpu, dedosTotales);
                    // metodo que determina el ganador
                    ganador = determinarGanador(prediccionJugador, prediccionCpu, dedosTotales);
                    // mostrar el ganador
                    System.out.println(ganador);
                    
                     // actualiza las rondas ganadas de cada uno
                     // si ganamos sumamos 1 a nuestro contador
                    if (ganador == "Ganas tu machote") {
                        rondasGanadasJugador++;
                        // si gana la CPU sumamos 1 a su contador
                    } else if (ganador == "Gana la maquina") {
                        rondasGanadasCpu++;
                        // si acertamos los 2 , un punto para cada uno
                    } else if (ganador == "Ha sido un empate en toda regla") {
                        rondasGanadasJugador++;
                        rondasGanadasCpu++;
                    }
                    // Mostrar el menu de las rondas
                    String mensaje = mostrarConteoRondas(rondas, rondasGanadasJugador,
                            rondasGanadasCpu);
                    System.out.println(mensaje);
                    // actualiza la variable de la ronda en la que estamos
                    rondas++;
                    // si nuestros puntos son 5 y ganamos por mas de 2 se para 
                    // si la cpu lleva 5 o mas puntos y gana por 2 o mas se para
                } while (
                        !(rondasGanadasJugador >= 5 && rondasGanadasJugador - rondasGanadasCpu >= 2)
                        &&
                        !(rondasGanadasCpu >= 5 && rondasGanadasCpu - rondasGanadasJugador >= 2)
                        );
            } // sino salir
            else {
                opcion = OPCIONSALIR;
            }

        } while (opcion != 2);
    }

    // Metodo que muestra el menu de jugar o salir
    // metodo que muestra el menu para elegir pares o nones
    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            String menu = """
                      |------------------------|
                      | Selecciona una opcion: |
                      | - 1 JUGAR MORRA        |
                      | - 2 SALIR              |
                      |------------------------|
                      """;
            System.out.printf(menu);
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero!!!!");
            }
            //limpiar buffer
            teclado.nextLine();
        } while (opcion < 1 || opcion > 2);

        return opcion;
    }

    // metodo que muestra el conteo de las rondas
    private static String mostrarConteoRondas(int rondas, int rondasGanadasJugador, int rondasGanadasCpu) {

        String mensaje = """
                        -------------------------------
                        Rondas ganadas del JUGADOR = %d
                        Rondas ganadas de la CPU   = %d
                        -------------------------------
                        Esta es la ronda %d
                        """.formatted(rondasGanadasJugador, rondasGanadasCpu, rondas);

        return mensaje;
    }

    // metodo que pregunta al jugador cuantos dedos sacará
    private static int dedosJugador() {
        Scanner teclado = new Scanner(System.in);
        int numeroDedos = 0;

        do {
            System.out.println("Introduce tu numero de dedos: (entre 0 y 5)");
            try {
                numeroDedos = teclado.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero.");
            }
            //limpiar buffer
            teclado.nextLine();

        } while (numeroDedos > 5 || numeroDedos < 0);
        // si numero de dedos es 0, se devuleve 1  sino se devuelve el numero
        // de dedos introducido
        return numeroDedos == 0 ? 1 : numeroDedos;

    }

    // metodo que pregunta al usuario cuantos dedos habra en total
    private static int predecirDedosJugador(int dedosJugador) {
        Scanner teclado = new Scanner(System.in);
        int numerodedos = 0;

        do {
            System.out.println("Introduce cuantos dedos crees que habrá: (Minimo 1 por encima de tu prediccion)");
            try {
                numerodedos = teclado.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero.");
            }
            //limpiar buffer
            teclado.nextLine();
        } while (numerodedos > 11 || numerodedos <= dedosJugador);

        return numerodedos;
    }

    // Metodo que saca los dedos de la cpu
    private static int dedosCpu() {
        java.util.Random generador = new java.util.Random();
        int numeroDedos = generador.nextInt(0, 6);
        // si numero de dedos es 0 se devuelve 1, sino se devuelven los dedos elegido
        return numeroDedos == 0 ? 1 : numeroDedos;
    }

    // Metodo que predice los dedos que habra de la cpu
    // se le pasa por parametro los dedos que ha sacado
    private static int predecirDedosCpu(int dedosCpu) {
        java.util.Random generador = new java.util.Random();
        // predice un numero almenos 1 por encima del que ha sacado
        int numeroDedos = generador.nextInt(dedosCpu +1, 11);
        return numeroDedos;
    }

    // Metodo que muestra como va la partida
    private static void resumenPartida(int prediccionJugador, int mostrarDedosJugador,
            int prediccionCpu, int mostrarDedosCpu, int dedosTotales) {
        String resumen = """
                         El jugador cree que habrá %d
                         ----------------------------
                         La CPU cree que habrá     %d
                         ----------------------------
                         El jugador muestra        %d
                         ----------------------------
                         La CPU muestra            %d
                         ----------------------------
                         En total hay              %d
                         ----------------------------
                         """.formatted(prediccionJugador, prediccionCpu,mostrarDedosJugador,
                 mostrarDedosCpu, dedosTotales);
        System.out.println(resumen);
    }

    // Metodo que determina el ganador
    public static String determinarGanador(int prediccionJugador,
            int prediccionCpu, int dedosTotales) {
        String ganador;
        if (prediccionJugador == dedosTotales && prediccionCpu == dedosTotales) {
            ganador = "Ha sido un empate en toda regla";
        } else if (prediccionJugador != dedosTotales && prediccionCpu != dedosTotales) {
            ganador = "No gana nadie, se sigue jugando";
        } else if (prediccionJugador == dedosTotales) {
            ganador = "Ganas tu machote";
        } else {
            ganador = "Gana la maquina";
        }

        return ganador;

    }

}
