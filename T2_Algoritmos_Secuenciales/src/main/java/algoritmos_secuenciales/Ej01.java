/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos_secuenciales;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Ej01 {
    public static void main(String[] args) {
        //Creacion variables
        double gradosCentigrados; //introducida por el usuario
        double resultado; // almacen del resultado
        final int gradosFahrenheit = 32; // equivalente a 0 grados centigrados
        // Creacion objeto Scanner
        Scanner teclado = new Scanner(System.in);
        
        // Pide los datos por teclado de los grados que queremos convertir
       System.out.println("Introduce los Grados Centigrados: ");
       
       // Obtenemos el resultado introducido
       gradosCentigrados = teclado.nextDouble();
       
       // Operacion para la conversion de grados centigrados a fahrenheit (0 °C × 9 / 5) + 32 = 32 °F
       resultado = (gradosCentigrados*9/5)+gradosFahrenheit;
       
       // Muestra de los resultados
        System.out.println(gradosCentigrados + "°C equivalen a " + resultado + "°F");
    }
}
