/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuntes;

/**
 *
 * @author JCarlos F.Vico <jfervic933@maralboran.es>
 */
public class ClaseMath {

    public static void main(String[] args) {

        // Atributos de la clase Math (Static)
        System.out.println("Valor de PI: " + Math.PI);
        System.out.println("Valor de E: " + Math.E);

        // Todos los métodos de la clase Math son estáticos (static)
        // y por lo tanto no es necesario crear objetos de la clase para usarlos
        System.out.println("\nMétodos básicos:\nMáximo de dos números: " + Math.max(3, 4.5));
        System.out.println("Mínimo de dos números: " + Math.min(3.5, 4));
        System.out.println("Valor absoluto de -3: " + Math.abs(-3));
        System.out.println("Redondeo del número 3.5: " + Math.round(3.5));
        System.out.println("Redondeo hacia arriba de 3.4: " + Math.ceil(3.4));
        System.out.println("Redondeo hacia abajo de 3.6: " + Math.floor(3.6));
        System.out.println("Número al azar entre 0 y 1: " + Math.random());

        System.out.println("\nPotenciación:\nPotencia de base 25 y exponente 0.5 (raiz cuadrada de 25): " + Math.pow(25, 0.5f));
        System.out.println("Raiz cuadrada de 9: " + Math.sqrt(9));
        System.out.println("Raiz cúbica de 27: " + Math.cbrt(27));
        System.out.println("Potencia del número E con exponente 10: " + Math.exp(10));
        System.out.println("Hipotenusa de un triángulo rectángulo, dados dos de los catetos del mismo: " + Math.hypot(3, 4));
        System.out.println("Logaritmos:\nLogaritmo en base 10 del número 100: " + Math.log10(100));
        System.out.println("Logaritmo en base E de la potencia de base E y exponente 2: " + Math.log(Math.pow(Math.E, 2)));
    }

}
