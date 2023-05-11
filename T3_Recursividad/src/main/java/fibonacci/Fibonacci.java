/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

/**
 *
 * @author joseangel
 */
public class Fibonacci {

    public static void main(String[] args) {
        final int NUMERO_FIBONACCI = 17;

        System.out.println(fibonacciTterativo(NUMERO_FIBONACCI));
        System.out.println(fibonacciRecursivo(NUMERO_FIBONACCI));

    }

    // iterativa
    private static int fibonacciTterativo(int numero) {
        int resultadoFibonacci = 0;
        int numero1 = 0;
        int numero2 = 1;

        // bucle para calcular el fibonacci 
        for (int i = 0; i < numero; i++) {
            // el resultado sera la suma de los 2 numeros anteriores
            resultadoFibonacci = numero1 + numero2;
            // numero 2 sera numero 1 para la proxima iteracion
            numero2 = numero1;
            // numero 1 sera el resultado, para sumar numero 2 con lo que 
            // tenemos en el resultado
            numero1 = resultadoFibonacci;
        }

        return resultadoFibonacci;
    }

    // recursiva
    private static int fibonacciRecursivo(int numero) {
        int numeroAnterior = numero - 1;
        int numeroAnteriorAnterior = numero - 2;

        // casos base
        if (numero == 0) {
            return 0;

        }
        if (numero == 1) {
            return 1;

            // si no es uno ni 0 
            // sumar fibonacci de los dos numeros anteriores
        } else {
            return fibonacciRecursivo(numeroAnterior)
                    + fibonacciRecursivo(numeroAnteriorAnterior);
        }

    }
}
