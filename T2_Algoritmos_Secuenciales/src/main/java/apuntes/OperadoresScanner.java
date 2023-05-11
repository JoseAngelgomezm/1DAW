/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class OperadoresScanner {
    public static void main(String[] args) {
         //OPERADORES
        
        //LECTURA DE DATOS POR TECLADO
        // solicitud de los minutos que corre forrest gump,
        // el programa devuelve la distancia recorrida suponiendo 
        // que corre a 8km/h
        
        // variables y constantes
        final int VELOCIDAD = 8; //km/h
        final double TIEMPO_MINUTOS = 60;
        int minutosCorriendo;
        double distanciaRecorrida;
        
        // Creacion del objeto scanner 
        Scanner teclado = new Scanner(System.in);
        
        // solicitud de un datos por teclado
        System.out.println("Introduce los minutos que está corriendo: ");
        
        // Usando el teclado y el metodo nextInt leemos el numero entero
        // y lo asignamos a la variable minutosCorriendo declarada anteriormente
        minutosCorriendo = teclado.nextInt();
        //Comprobacion de la variable
        System.out.println("Has introducido: " + minutosCorriendo);
        
        // operaciones
        distanciaRecorrida = (minutosCorriendo / TIEMPO_MINUTOS) * VELOCIDAD ;
        
        // mostrar los resultados
        System.out.println("En " + minutosCorriendo + " minutos ha recorrido : " 
                + distanciaRecorrida + " Km");
    }
}
