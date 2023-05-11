/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package PaquetesVico;

/**
 *
 * @author  jfervic933@maralboran.es
 */
public class ASwitchClasico {

    public static void main(String[] args) {

        int numero = 4;
        // la expresión dentro del switch () y los datos de los case
        // deben coincidir en tipo
        // En los case no se pueden poner variables, solo constantes y literales
        
        // En el siguiente ejemplo los tipos son int
        // Se deben incluir los break en cada case
        switch (numero) {
            case 1:
                System.out.println("Uno");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            default:
                System.out.println("Ni idea");
        }

        // En este ejemplo los tipos son char
        // No puede haber case duplicados
        char letra = 'a';
        switch (letra) {
            case 'b':
                System.out.println("Letra b");
                break;
//            case 'b':                     // Error, case b duplicado
//                System.out.println("Letra b");
//                break;
            case 'a':
                System.out.println("Letra a");
                break;
            default:
                System.out.println("Ni idea");
        }

        // En este ejemplo los tipos son String
        String texto = "Viernes";
        // Es sensible a mayúsculas y minúsculas
        switch (texto) {
            // No son necesarias las llaves egipcias cuando un bloque tiene
            // varias sentencias en su interior
            case "Lunes":
                System.out.println("No me gustan los lunes");
                System.out.println("....");
                break;
            case "Viernes":
                System.out.println("Me encantan los viernes");
                break;
            default:
                System.out.println("Indiferente");
        }

        // Si existen case con el mismo código, se pueden apilar
        switch (texto) {
            case "Lunes":
            case "Martes":
                System.out.println("No me gustan estos días");
                break;
            case "Viernes":
                System.out.println("Me encantan los viernes");
                break;
            default:
                System.out.println("Indiferente");
        }

        // El case default es opcional
        // El siguiente ejemplo es igual que el anterior, pero usando comas
        // en el primer case y sin claúsula default
        switch (texto) {
            case "Lunes","Martes":
                System.out.println("No me gustan estos días");
                break;
            case "Viernes":
                System.out.println("Me encantan los viernes");
                break;

        }

        
        // La sentencia break es opcional pero no incluirla podría
        // suponer errores en el programa. En este caso imprime
        // por pantalla "cuatro" y "Ni idea" que no es un resultado correcto
        numero = 4;
        switch (numero) {
            case 1:
                System.out.println("Uno");
                break;
            case 4:
                System.out.println("Cuatro");
            default:
                System.out.println("Ni idea");
        }

        // Se pueden usar expresiones aritméticas dentro del switch.
        // La expresión debe devolver el mismo tipo de dato que los datos 
        // que tengan los case
        switch (numero + 1) {
            case 1:
                System.out.println("Uno");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            default:
                System.out.println("Ni idea");
        }
        
    }
}
