/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

/**
 *
 * @author joseangel
 */
public class Random {
    public static void main(String[] args) {
        // Crear variable para guardar el numero
        int numeroAleatorio;
        
        // Crear un objeto de tipo Random llamado generador con el constructor
        // de la calse random
        java.util.Random generador = new java.util.Random();
        
        // Guardar el numero aleatorio dentro del rango de enteros
        numeroAleatorio = generador.nextInt();
        System.out.println("Numero generado : " + numeroAleatorio);
        
        // Generar un numero entre 0 y 9
        numeroAleatorio = generador.nextInt(10);
        // Se pone 10 en el nextInt porque nunca saldrá
        System.out.println("Numero generado : " + numeroAleatorio);
        
        
        // Generar numero aleatorio entre 1 y 19
        // El numero del nextin nunca sale, por lo tanto ponemos hasta 20
        // Pero como queremos de 1 a 19 sumamos 1 fuera del next in y restamos
        // uno al numero dentro del next in quedando 19 + 1
        numeroAleatorio = generador.nextInt(19)+1;
        System.out.println("Numero generado : " + numeroAleatorio);
        
        // Generar un numero aleatorio entre 12 y 18
        // La formula quedaria (Mayor - menor + 1) + Minimo que queremos
        numeroAleatorio = generador.nextInt(18-12+1)+12;
        System.out.println("Numero generado : " + numeroAleatorio);
    }
}
