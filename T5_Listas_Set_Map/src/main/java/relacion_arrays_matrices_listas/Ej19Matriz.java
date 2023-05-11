/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Ej19Matriz {

    public static void main(String[] args) {
        int opcion;
        // objeto scanner
        Scanner teclado = new Scanner(System.in);
        // constantes que determinan la fila y los asientos
        final int FILA_ASIENTOS = 25;
        final int CANTIDAD_ASIENTOS = 4;
        
        // crear la lista de reservas y la lista de anulaciones
        ArrayList listaAsientosOcupados = new ArrayList();
        ArrayList ListaAsientosLibres = new ArrayList();
        
        // rellenar la lista de asientos libres con todos los asientos
        for (int i = 1; i < FILA_ASIENTOS * CANTIDAD_ASIENTOS +1; i++) {
            // pasar a string
            ListaAsientosLibres.add(Integer.toString(i));
        }
        
        // crear la matriz para los asientos del avion
        String[][] asientosAvion = new String[FILA_ASIENTOS][CANTIDAD_ASIENTOS];
        // rellenar la matriz con los asientos del avion
        rellenarMatrizAleatorios(asientosAvion);
        System.out.println("------------------------------------------------");
        System.out.println("ASIENTOS DEL AVION\n");
        // mostrar la matriz con los asientos
        imprimirMatrizEneteros(asientosAvion);
        System.out.println("------------------------------------------------");
        // preguntar lo que desea hacer el usuario hasta que presione salir
        do {
            opcion = mostrarMenu();
            // segun la opcion del menu que seleccionamos hacemos lo deseado
            switch (opcion) {
                // la opcion reserva un asiento 
                case 1 -> {
                    // pedir al usuario el numero de asiento que quiere reservar
                    System.out.println("¿Que asiento quiere reservar?");
                    String asientoUsuario = teclado.nextLine();

                    // obtener el elemento para comprobar si existe el asiento
                    String elemento = ObtenerElementoDeUnaMatrizString
                    (asientosAvion, asientoUsuario);

                    // si el asiento que introduce el usuario existe
                    if (!elemento.isEmpty()) {
                        // si el asiento termina en R es que ya esta reservado

                        // el asiento esta libre, obtener fila y columna
                        int fila = obtenerFilaDelElementoString
                        (asientosAvion, asientoUsuario);
                        
                        int columna = obtenerColumnaDelEmentoString
                        (asientosAvion, asientoUsuario);

                        // reservar el asiento añadiendo R en el asiento
                        asientosAvion[fila][columna] = asientosAvion[fila][columna] + "R";
                        System.out.println("El asiento " + elemento + " se ha reservado");
                        
                        // añadir el asiento a la lista de ocupados
                        añadirElementos(listaAsientosOcupados, elemento);
                        
                        // quitar el asiento de la lista de asientos libres
                        borrarElementos(ListaAsientosLibres, elemento);
                       
                    } else {
                        System.out.println("El asiento no existe o ya esta reservado.");
                    }

                    imprimirMatrizEneteros(asientosAvion);

                }

                case 2 -> {
                    // preguntar que asiento quiere cancelarse
                    System.out.println("¿Que asiento quieres cancelar la reserva?");
                    String asientoUsuario = teclado.nextLine();
                    // quedarnos con el asiento que ha introducido el usuario
                    asientoUsuario = asientoUsuario;
                    // añadirle la R para que busque el asiento
                    String asientoUsuarioReservado = asientoUsuario + "R";
                    // obtener el elemento para comprobar si existe el asiento
                    // o si esta reservado
                    String elemento = ObtenerElementoDeUnaMatrizString
                    (asientosAvion, asientoUsuarioReservado);
                    
                    // si el asiento introducido existe
                    if (!elemento.isEmpty()) {
                        // comprobar que esta reservado
                        if (elemento.contains("R")) {
                            // si esta reservado
                            // obtener fila
                            int fila = obtenerFilaDelElementoString
                            (asientosAvion, elemento);
                            // obtener columna
                            int columna = obtenerColumnaDelEmentoString
                            (asientosAvion, elemento);
                            asientosAvion[fila][columna] = asientoUsuario;
                            
                            System.out.println("La reserva del asiento " + asientoUsuario + " se ha anulado");
                            
                            // al anular la reserva, poner el asiento en la lista de asientos libres
                            añadirElementos(ListaAsientosLibres, asientoUsuario);
                            
                            // al anular la reserva quitar elemento de asientos ocupados
                            borrarElementos(listaAsientosOcupados, asientoUsuario);
                        }
                    }else{
                        System.out.println("El asiento no existe.");
                    }
                    
                     imprimirMatrizEneteros(asientosAvion);
                }
                case 3 -> {
                    // ordenar la lista de asientos
                    Collections.sort(listaAsientosOcupados);
                    // mostrar la lista de asientos ocupados
                    for (int i = 0; i < listaAsientosOcupados.size(); i++) {
                        System.out.println(listaAsientosOcupados.get(i));
                    }
                }
                case 4 -> {
                    // ordenar la lista de asientos
                    Collections.sort(ListaAsientosLibres);
                    // mostrar la lista de asientos libres
                     for (int i = 0; i < ListaAsientosLibres.size(); i++) {
                        System.out.printf(ListaAsientosLibres.get(i) + " ");
                    }
                     System.out.println("");
                }
            }
        } while (opcion != 5);

    }
    
    // metodo que añade a una lista las reservas de asientos
    public static void añadirElementos(ArrayList listaReservas, String elementoAñadir){
        //comprobar que el elemento no este en la lista
        if (!listaReservas.contains(elementoAñadir)) {
             listaReservas.add(elementoAñadir);
        }
    }
    
    // metodo que elimina un elemento de las reservas de asientos
    public static void borrarElementos(ArrayList listaReservas, String elementoBorrar){
        //comprobar que el elemento este en la lista
        if (listaReservas.contains(elementoBorrar)) {
             listaReservas.remove(elementoBorrar);
        }
    }
    
    // metodo que obtiene la fila de un elemento de una matriz , devuelve -1 
    // si no encuentra el elemento
    private static int obtenerFilaDelElementoString(String[][] matrizDeString, String elementoQueBusca) {
        int fila = -1;

        // recorrer la matriz 
        for (int i = 0; i < matrizDeString.length; i++) {
            for (int j = 0; j < matrizDeString[i].length; j++) {
                // si el elemento actual es igual al que buscamos
                if (matrizDeString[i][j].equals(elementoQueBusca)) {
                    fila = i;
                }

            }

        }

        return fila;
    }

    // metodo que obtiene la columna de un elemento de una matriz , devuelve -1 
    // si no encuentra el elemento
    private static int obtenerColumnaDelEmentoString(String[][] matrizDeString, String elementoQueBusca) {
        int columna = -1;

        // recorrer la matriz 
        for (int i = 0; i < matrizDeString.length; i++) {
            for (int j = 0; j < matrizDeString[i].length; j++) {
                // si el elemento actual es igual al que buscamos
                if (matrizDeString[i][j].equals(elementoQueBusca)) {
                    columna = j;
                }

            }

        }

        return columna;
    }

    // metodo que devuelve el elemento de una matriz devuelve la cadena vacia si
    // si no enceuntra el elemento
    private static String ObtenerElementoDeUnaMatrizString(String[][] matrizDeString, String elementoQueBusca) {
        String elemento = "";

        // recorrer la matriz 
        for (int i = 0; i < matrizDeString.length; i++) {
            for (int j = 0; j < matrizDeString[i].length; j++) {
                // si el elemento actual es igual al que buscamos
                if (matrizDeString[i][j].equals(elementoQueBusca)) {
                    elemento = matrizDeString[i][j];
                }

            }

        }

        return elemento;
    }

    // metodo que muestra el menu y recoge una opcion
    private static int mostrarMenu() {
        int opcion = 0;
        String menu;
        Scanner teclado = new Scanner(System.in);
        do {
            menu = """
                   1- Reservar asiento
                   2- Cancelar reserva
                   3- Mostrar asientos ocupados
                   4- Mostrar asientos libre
                   5- Salir
                   """;

            System.out.println(menu);

            try {
                opcion = teclado.nextInt();

            } catch (Exception imeException) {
                System.out.println("Introduce una opcion valida.");
                // limpiar buffer
                teclado.nextLine();
            }
        } while (opcion < 1 || opcion > 5);

        return opcion;
    }

    // metodo que rellena la matriz con aleatorios entre 1 y 100
    private static void rellenarMatrizAleatorios(String[][] matrizARellenar) {
        int numero = 0;

        // recorrer la matriz
        for (int i = 0; i < matrizARellenar.length; i++) {
            for (int j = 0; j < matrizARellenar[i].length; j++) {
                // pasar el numero a un string
                String numeroString = ++numero + "";
                // añadir el numero a la matriz 
                matrizARellenar[i][j] = numeroString;
            }

        }
    }

    // metodo que imprime una matriz de enteros
    private static void imprimirMatrizEneteros(String[][] matrizAMostrar) {

        // recorrer la matriz
        for (int i = 0; i < matrizAMostrar.length; i++) {
            for (int j = 0; j < matrizAMostrar[i].length; j++) {
                // mostrar cada uno de los elementos
                System.out.print(matrizAMostrar[i][j] + " ");

            }
            // salto de linea para separar cada una de las filas
            System.out.println("\n");
        }
    }
}
