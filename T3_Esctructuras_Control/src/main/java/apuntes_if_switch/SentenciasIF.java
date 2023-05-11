/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes_if_switch;


import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class SentenciasIF {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Pedimos un nombre
        System.out.println("¿Cual es tu nombre?: ");
        String nombre = teclado.nextLine();
        
        //Introducimos la letra a buscar en el nombre
        System.out.println("Introduce la letra a buscar: ");
        String letraBuscar = teclado.nextLine();
        
        // Si la letra esta contenida en el nombre
        // mostrar el numero de caracteres que tiene el nombre y la posicion
        // donde esta la letra
        // en otro caso, mostrar si el numero de letras del nombre es par o impar
        
        // Comprobar si el nombre contiene la letra a buscar introducida
        // Guardamos en una variable el resultado
        // boolean letraContenida = nombre.contains(letraBuscar);
        
        // Realmente se valora la condicion directamente en el if
        if (nombre.contains(letraBuscar)){ // si contiene la letra
            // Parte del true
            // Mostrar el tamaño del string
            System.out.println("El numero de caracteres es: " + nombre.length());
            
            // Posicion de la letra a buscar
            // Una variable que se crea dentro de un if solo se usan dentro el if
            // lo recomendable seria crear la variable fuera del if e inicializar a 0
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posicion de la letra es la nº: " + posicion);

        } else if (nombre.length() % 2 == 0) { // si el tamaño del string es par
            System.out.println("El numero de caracteres es par");
        } else{ // si no lo es
            System.out.println("El numero de caracteres es impar");
            
           // String textoResultado = (nombre.length() % 2 == 0) ? "Es par" : 
           //       "Es impar";
            
            //System.out.println(textoResultado);
            // esta condicion con operador ternario
            // puede sustituir el ultimo else if 
        }
        
        
    }
}