/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class factorial {

    public static void main(String[] args) {
        int numeroIntroducido = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero mayor que 1 para saber el factorial: ");
            try {
                numeroIntroducido = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero");
                teclado.nextLine();
            }
        } while (numeroIntroducido < 0);

        System.out.println(factorialIterativo(numeroIntroducido));
        System.out.println(factorialRecursivo(numeroIntroducido));

    }

    public static int factorialIterativo(int numero) {
        int resultadoFactorial = 1;// inicializar a 1 para que no multiplique
        // por 0 en la primera iteracion

        // si el numero es 0 o 1 el factorial siempre es 1
        if (numero == 1 || numero == 0) {
            resultadoFactorial = 1;
            // si el numero es cualquier otro
        } else {
            // multiplicar el resultadoFactorial por el siguiente numero
            // que sera la i incrementando en cada iteracion y guardando el 
            // resultado
            for (int i = 1; i <= numero; i++) {
                resultadoFactorial *= i;
            }
        }

        return resultadoFactorial;
    }

    public static int factorialRecursivo(int numero) {

        // caso base
        // si el numero es 0 o 1 el factorial es 1
        if (numero == 0 || numero == 1) {
            return 1;
            // si es un numero mayor que 1 o 0
        } else {
            // devolver el resultado de: numeroIntroducido * numeroIntroducido -1
            return numero * factorialRecursivo(numero - 1);
            // si el numero es 5 se ira llamando
            // hasta que se devuelva 1
        }

    }
}
