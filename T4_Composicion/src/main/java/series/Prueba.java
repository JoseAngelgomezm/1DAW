/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package series;

/**
 *
 * @author Jose Angel
 */
public class Prueba {
    public static void main(String[] args) {
        // crear persona1 por teclado
        Persona persona1 = ServicioPersona.crearPersonaPorTeclado();
        // crear persona2 con el constructos vacio que tiene parametros por defecto
        Persona persona2 = new Persona();
        
        // mostrar los datos de persona1 con to string
        System.out.println(persona1.toString());
        // mostrar los datos de persona2 con to string
        System.out.println(persona2.toString());
        
        // preguntar si persona1 es mayor de edad
        System.out.println("Es mayor de edad " + persona1.getNombre() + 
                ": " + persona1.esMayorEdad());
        // preguntar si persona2 es mayor de edad
        System.out.println("Es mayor de edad " + persona2.getNombre() + 
                ": " + persona2.esMayorEdad());
        
        // calcular el imc de la persona1 y decir en que rango de peso esta
        System.out.println("El IMC de " + persona1.getNombre() +
                " es: " + persona1.calcularIMC() + " y tiene " + 
                persona1.comprobarIMC(persona1.calcularIMC()));
        
        // calcular el imc de la persona2 y decir en que rango de peso esta
        System.out.println("Es IMC de " + persona2.getNombre() + 
                " es: " + persona2.calcularIMC() + " y tiene " + 
                persona2.comprobarIMC(persona2.calcularIMC()));
      
        // crear una serie con el constructor parametrizado
        Serie serie1 = new Serie("La serie del año", "Accion", "Un pedazo de serie", 1, 0);
        // mostrar los datos de la serie1
        System.out.println(serie1);
        // preguntar a la persona1 si le ha gustado la serie y darle un like
        System.out.printf(persona1.getNombre() + " ");
        persona1.darLike(serie1);
        // volver a mostrar los datos para comprobar que se ha añadadio el like
        System.out.println(serie1);
    }
    
    
}

