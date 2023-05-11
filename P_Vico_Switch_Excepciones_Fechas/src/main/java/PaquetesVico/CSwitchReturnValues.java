/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetesVico;

/**
 *
 * @author jfervic933@maralboran.es
 */

public class CSwitchReturnValues {

    public static void main(String[] args) {

        String texto = "Viernes";
        // Es sensible a mayúsculas y minúsculas
        // Switch clásico
        switch (texto) {
            case "Lunes":
                System.out.println("No me gustan los lunes");
                break;
            case "Viernes":
                System.out.println("Me encantan los viernes");
                break;
            default:
                System.out.println("Indiferente");
        }

        // Con yield se permite devolver valores desde un switch a una
        // variable
        // No es lo mismo que return, que termina la ejecución del método
        // donde esté el switch
        String resultado = switch (texto) {
            case "Lunes":
                yield "Me encantan los lunes";
            case "Viernes":
                yield "Odio los viernes";
            default:
                yield "Indiferente";
        };

        System.out.println("El resultado es " + resultado);

        // A continuación se ejecuta el método obtenerResultado que recibe
        // un objeto String (texto) y devuelve otro String con el resultado
        // de la ejecución y se guarda en resultado2
        String resultado2 = obtenerResultado(texto);
        System.out.println("Resultado 2 es " + resultado2);

    }

    // Este método recibe un String y devuelve otro en función de la ejecución
    // del Switch.
    // Lo que hay entre paréntesis (String texto) se conoce como parámetros del
    // método o función y el tipo de dato que hay a la izquierda del nombre del
    // método es el tipo que devuelve, en este caso un String
    public static String obtenerResultado(String texto) {
        // En bloques de código sencillos
        // se puede utilizar 'var' en lugar del tipo de dato explícito
        // El compilador asocia el tipo de dato en función de lo que 
        // devuelva el switch. Esto se conoce como inferencia de tipos
        var resultado = switch (texto) {
            case "Lunes":
                yield "Me encantan los lunes";
            case "Viernes":
                yield "Odio los viernes";
            default:
                yield "Indiferente";
        };

        return resultado;
    }
}

// El switch puede devolver tipos diferentes y se pueden guardar en
// variables sin tipo predefinido "var"
// El siguiente código funciona pero no es recomendable por legibilidad
// y mantenimiento del código

//  var resultado = switch (texto) {
//            case "Lunes":
//                yield "Me encantan los lunes"; // Aquí devolvería String
//            case "Viernes":
//                yield 3;                      // Aquí devolvería int
//            default:
//                yield "Indiferente";          // Aquí devolvería String
//        };
