/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package series;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class ServicioPersona {

    private static Scanner teclado = new Scanner(System.in);

    // lee por teclado los datos de una persona y devuelve el objeto de tipo persona
    public static Persona crearPersonaPorTeclado() {
        // Creamos el objeto de tipo persona (declarar)
        Persona persona;
        // creamos variables locales del metodo
        int edadPersona;
        double pesoPersona;
        double alturaPersona;
        // Leer por teclado e instanciar
        // pedir la edad por teclado controlando excepcion hasta que
        // se introduzca un dato valido
        do {
            System.out.println("Edad de la persona: ");
            try {
                edadPersona = teclado.nextInt();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduce una edad valida");
            }
            // Limpiar buffer
            teclado.nextLine();
        } while (true);

        do {
            System.out.println("Peso de la persona (KG): ");
            try {
                pesoPersona = teclado.nextDouble();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un peso valido");
            }
            // Limpiar buffer
            teclado.nextLine();
        } while (true);
        
        do {            
            System.out.println("altura de la persona (M): ");
            try {
                alturaPersona = teclado.nextDouble();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduce una altura valida");
            }
            // Limpiar buffer
            teclado.nextLine();
        } while (true);
        
        // Limpiar buffer , si arrastra datos el objeto teclado 
        // esta vacio e intenta 
        // coger el de la posicion 0 y al no tener da index out of bound
        teclado.nextLine();
        System.out.println("Introduce Sexo de persona: ");
        String aux = teclado.nextLine();
        // para obtener el char, guardamos lo introducido por teclado en un
        // string auxiliar y lo pasamos a mayusucla
        aux = aux.toUpperCase();
        // luego asignar el primer char del string a sexo persona
        char sexoPersona = aux.charAt(0);

        System.out.println("Nombre de la persona: ");
        String nombrePersona = teclado.nextLine();

        // crear el objeto persona y devolverlo
        persona = new Persona(nombrePersona, edadPersona,
                sexoPersona, pesoPersona,
                alturaPersona);

        // devolvemos el tipo persona
        return persona;
    }

}
