/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class EjemploSwitchRandom {
    public static void main(String[] args) {
        // Si el usuario introduce A,B o C se debe guardar un aleatorio entre
        // 1 y 10
        // Si introduce D, guardar aleatorio entre 11 y 25
        // Si introduce E aleatorio entre 26 y 33
        // En otro caso, aleatorio entre 34 y 100
        
        int numeroAleatorio;
        // Crear objeto scanner y objeto random
        Scanner teclado = new Scanner (System.in);
        java.util.Random generador = new java.util.Random();
        
        System.out.println("Introduce una letra: A,B,C,D,E");
        String letra = teclado.nextLine();
        
        switch (letra) {
            case "A" , "B", "C":
                //Guardar entre 1 y 10
                // La formula quedaria (Mayor - menor + 1) + Minimo que queremos
                numeroAleatorio = generador.nextInt(10-1+1)+1;
                break;
            case "D" :
                numeroAleatorio = generador.nextInt(25-11+1)+11;
                break;           
            case "E":
                numeroAleatorio = generador.nextInt(33-26+1)+26;
                break;
            default:
                numeroAleatorio = generador.nextInt(100-34+1)+34;
        }
        
        System.out.println("El resultado del numero es: " + numeroAleatorio);
        
        // El switch anterior pasa a esta modificacion, mucho mas comodo y facil de entender
        // Al numero aleatorio se le guarda el resultado de evaluar el switch
        // Y devuelve el resultado que queramos, solo 1
       
        
        numeroAleatorio = switch (letra) {
            case "A", "B", "C" -> {
                //Podemos introducir texto de por medio para cambiar el mensaje
                //Segun el caso
                System.out.printf("El resultado de introducir A B o C: ");
                yield generador.nextInt(10-1+1)+1;
            }
            case "D" -> generador.nextInt(25-11+1)+11;
            case "E" -> generador.nextInt(33-26+1)+26;
            default -> generador.nextInt(100-34+1)+34;
        }; //Guardar entre 1 y 10
        // La formula quedaria (Mayor - menor + 1) + Minimo que queremos
        
        System.out.println( numeroAleatorio);
        
        
       
    }
}
