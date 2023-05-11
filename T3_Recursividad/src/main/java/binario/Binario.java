/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class Binario {

    public static void main(String[] args) {
        List listaBinarioIterativo = new ArrayList<>();
        List listaBinarioRecursivo = new ArrayList<>();

        System.out.println("BINARIO ITERATIVO");
        listaBinarioIterativo = binarioIterativo(6);

        for (int i = 0; i < listaBinarioIterativo.size(); i++) {
            System.out.print(listaBinarioIterativo.get(i));

        }

        System.out.println();

        System.out.println("BINARIO RECURSIVO");
        listaBinarioRecursivo = binarioRecursivo(listaBinarioRecursivo, 6);

        for (int i = 0; i < listaBinarioRecursivo.size(); i++) {
            System.out.print(listaBinarioRecursivo.get(i));
        }

    }

    // binario iterativo
    public static List binarioIterativo(int numero) {
        ArrayList listaNumeros = new ArrayList();
        // igualar el numero numeroBucle para saber cuantas veces
        // tiene que iterar el bucle
        int numeroBucle = numero;
        // variables para guardar el cociente y el resto
        int restoDivision;
        int cocienteDivision;

        for (int i = 0; i < numeroBucle; i++) {
            // variables para guardar el cociente y el resto
            cocienteDivision = numero / 2;
            restoDivision = numero % 2;

            // si el resto de la division es 0 añadirlo
            if (restoDivision == 0) {
                listaNumeros.add(0);
            }

            // si el resto de la division es 1 añadirlo
            if (restoDivision == 1) {
                listaNumeros.add(1);
            }

            // si cociente es divisible entre 2
            if (cocienteDivision >= 2) {
                // igualar el numero al cociente de la division en cada
                // iteracion para que lo divida de nuevo entre 2
                numero = cocienteDivision;
            } else {
                // si no lo es añadir el cociente a la lista y parar la ejecucion
                listaNumeros.add(cocienteDivision);
                break;
            }

        }
        // invertir la lista y devolverla
        Collections.reverse(listaNumeros);
        return listaNumeros;
    }

    public static List binarioRecursivo(List<Integer> lista, int numero) {

        // variables para guardar el cociente y el resto
        int cocienteDivision = numero / 2;
        int restoDivision = numero % 2;

        // si el resto de la division es 0 añadirlo
        if (restoDivision == 0) {
            lista.add(0);

        }
        // si el resto de la division es 1 añadirlo
        if (restoDivision == 1) {
            lista.add(1);

        }
        // si el cociente de la division no es divisible entre 2
        if (cocienteDivision < 2) {
            // añadir el cociente de la division
            lista.add(cocienteDivision);

            // si el cociente es divisible entre 2, llamar al metodo con el cociente
        } else {
            return binarioRecursivo(lista, cocienteDivision);
        }
        // invertir lista y devolver
        Collections.reverse(lista);
        return lista;

    }

}
