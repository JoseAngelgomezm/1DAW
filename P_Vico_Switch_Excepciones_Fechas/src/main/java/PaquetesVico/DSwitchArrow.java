/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetesVico;

/**
 *
 * @author jfervic933@maralboran.es
 */
public class DSwitchArrow {

    public static void main(String[] args) {

        // Switch que devuelve datos con yield
        String texto = "Viernes";
        String resultado = switch (texto) {
            case "Lunes":
                yield "Me encantan los lunes";
            case "Viernes":
                yield "Odio los viernes";
            default:
                yield "Indiferente";
        };

        System.out.println("El resultado es " + resultado);

        // El switch anterior se puede resumir como sigue
        // Se usa el operador flecha para devolver valores, no es necesario
        // usar yield, ni break y se pueden poner varios case con comas
        // Este tipo de Switch requieren siempre el default, para cubrir todas
        // las posibilidades de los case
        resultado = switch (texto) {
            case "Lunes", "Martes" ->
                "No me gustan estos días";
            case "Viernes" ->
                "Me encantan los viernes";
            default ->
                "Indiferente";
        };

        System.out.println("El resultado es " + resultado);

        // Si hay que incluir código dentro de un case, se abren llaves y se 
        // devuelve con yield
        texto = "Jueves";
        String valor = switch (texto) {
            case "Jueves" -> {
                System.out.println("hola");
                int a = 8;
                System.out.println(a);
                yield "Es jueves";
            }
            default ->
                "Es otro día";
        };
        
        // También es posible no devolver valores
        texto = "";
        switch (texto) {
            case "Jueves" -> {
                System.out.println("Es jueves");
                int a = 8;
                System.out.println(a);

            }
            default ->
                System.out.println("¿Qué día es?");
            
        }
    }

}
