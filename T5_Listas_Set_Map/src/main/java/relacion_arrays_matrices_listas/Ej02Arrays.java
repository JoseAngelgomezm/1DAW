/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Ej02Arrays {

    public static void main(String[] args) {
        int numeroPersonas = 0;
        double sumaAlturas = 0;
        int personasPorEncimaMedia = 0;
        int personasPorDebajoMedia = 0;
        // leer por teclado la altura de las personas
        // crear el objeto scanner
        Scanner teclado = new Scanner(System.in);

        //Pedir de cuantas personas queremos pedir las alturas > 1
        do {
            System.out.println("Introduce la cantidad de personas (Nº) ");
            try {
                numeroPersonas = teclado.nextInt();
            } catch (Exception InputMissException) {
                System.out.println("Introduce un numero");
                teclado.nextLine();
            }
            
            
        } while (numeroPersonas < 1);

        // crear un array del tamaño introducido anteriormente
        double[] alturasPersonas = new double[numeroPersonas];

        // pedir tantas veces la altura como cantidad de personas
        for (int i = 0; i < alturasPersonas.length; i++) {
            System.out.println("Introduce la altura(cm) de la persona numero " + (i+1));
            // guardar la altura introducida en cada uno de los indices del array
            alturasPersonas[i] = Math.abs(teclado.nextDouble());
            // una vez intoducimos la altura sumar cada una a una variable
            sumaAlturas += alturasPersonas[i];
        }
        // Calcular la media
        double media = sumaAlturas / numeroPersonas;
        // Mostrar la media
        System.out.println("Media de alturas: " + (media));
        
        // Contar cuantas personas estan por encima de la media 
        // recorrer el array de nuevo
        for (int i = 0; i < alturasPersonas.length; i++) {
            // si esta por encima
            if (alturasPersonas[i] > media) {
                personasPorEncimaMedia ++;
            }else{
                personasPorDebajoMedia ++;
            }
        }
        
        // Mostrar las personas por debajo de la media
        System.out.println("Personas por debajo de la media: " + personasPorDebajoMedia);
        
        // Mostrar las personas por encima de la media
        System.out.println("Personas por encima de la media: 4"
                + "" + personasPorEncimaMedia);
    }
}
