/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresbooleanos;

/**
 *
 * @author Jose Angel
 */
public class Ej05 {
    public static void main(String[] args) {
        // Declaracion de variables
        boolean verdadero = true;
        boolean falso = false;
        boolean verdaderoYverdadero = verdadero && verdadero;
        boolean verdaderoYfalso = verdadero && falso;
        boolean falsoYverdadero = falso && verdadero;
        boolean falsoYfalso = falso && falso;
        boolean verdaderoOverdadero = verdadero || verdadero;
        boolean verdaderoOfalso = verdadero || falso;
        boolean falsoOverdadero = falso || verdadero;
        boolean falsoOfalso = falso || falso;
        // Almacenar los resultados en un textoblock
        String resultado = """
                             verdadero && verdadero: %b
                             verdadero && falso: %b
                             falso && verdadero: %b
                             falso && falso: %b
                             verdadero || verdadero: %b
                             verdadero || falso: %b
                             falso || verdadero: %b
                             falso || falso: %b
              
                           """.formatted(verdaderoYverdadero,verdaderoYfalso,falsoYverdadero,
                                   falsoYfalso,verdaderoOverdadero,verdaderoOfalso,
                                   falsoOverdadero,falsoOfalso
                           );
        
      // Muestra el resultado por pantalla
        System.out.println(""+resultado);
    }
}
