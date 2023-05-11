/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos_secuenciales;

import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class Ej02 {
    public static void main(String[] args) {
        // declaracion de variables
        double radio; // radio que introduce el usuario por teclado
        double longitud; // resultado de la longitud
        double area; // resultado del area
        double volumen; // resultado del volumen
        
        // creacion del objeto scanner
        Scanner teclado = new Scanner(System.in);
        // Pide los datos por teclado
        System.out.println("Introduce el radio de la circunferencia: ");
        // almacenamiento de los datos en una variable previamente declarada
        radio = teclado.nextDouble();
        // operaciones
        longitud = (2*radio) * Math.PI ;
        area = Math.PI * (Math.pow(radio, 2));
        volumen = Math.pow(radio, 3)* Math.PI  * 4.0/3.0 ;
        // Muestra los resultados
        System.out.println("Resultado de la longitud: " + longitud);
        System.out.println("Resultado del area: " + area);
        System.out.println("Resultado del volumen: " + volumen);
    }
}
