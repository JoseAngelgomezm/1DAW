/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class EjerciciosClase1 {
    public static void main(String[] args) {
        // Leer por teclado nombre y apellido1, edad, peso y estatura
        // Si hay que leer textos y numeros con scanner primero se leen los textos
        // y al final los numeros, si esto no es posible, hay que limpiar el buffer
        // con (teclado.nextline())
        //Declaracion de variables
        String nombre;
        String apellido;
        int edad;
        double peso;
        double estatura;
        boolean resultadoA;
        boolean resultadoB;
        boolean resultadoC;
        boolean resultadoD;
        boolean resultadoE;
        boolean resultadoF;
        boolean resultadoG;
        boolean resultadoH;
        boolean resultadoI;
        
        // Creacion objeto scanner
        Scanner teclado = new Scanner (System.in);
        
        // Pedir datos por teclado
        System.out.println("Introduce tu nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Introduce tu apellido: ");
        apellido = teclado.nextLine();
        
        System.out.println("Introduce tu edad: ");
        edad = teclado.nextInt();
        
        System.out.println("Introduce tu peso: ");
        peso = teclado.nextDouble();
        
        System.out.println("Introduce tu estatura: ");
        estatura = teclado.nextDouble();
        
        // la edad esta comprendida entre 25 y 35 años incluido
        resultadoA = edad >=25 && edad <=35;
        // Imprime el resultado:
        System.out.println("La edad esta comprendida entre 25 y 35 años incluido: " + resultadoA);
        
        // B) el peso es mayor de 50kg o menor o igual de 100
        resultadoB = peso > 50 || peso <= 100;
        // Imprime el resultado:
        System.out.println("El peso es mayor de 50kg o menos o igual de 100: " + resultadoB);
        
        // C) no mide 175cm
        resultadoC = estatura < 175.0; 
        // Imprime el resultado:
        System.out.println("No mide 175cm: " + resultadoC);
        
        // D) la estatura esta entre 100 y 180 cm , excluidos
        resultadoD = estatura > 100 && estatura < 180;
        // Imprime el resultado:
        System.out.println("La estatura esta entre 100 y 180 cm , excluidos: " + resultadoD);
        
        // E) la edad mas 10 años no supera los 60años
        resultadoE = (edad + 10) < 60;
        // Imprime el resultado:
        System.out.println("La edad mas 10 años no supera los 60 años: " + resultadoE);
        
        // F) el nombre es igual a "Pablo" ignorando mayusculas y minusculas. equalsIgnorecase
        resultadoF = nombre.equalsIgnoreCase("pablo");
        // Imprime el resultado:
        System.out.println("El nombre es igual a \"Pablo\" ignorando mayusculas"
                + " y minusculas: " + resultadoF);
        
        // G) el apellido contiene la letra "j" . usar contains
        resultadoG = apellido.contains("j") || apellido.contains("J");
        // Imprime el resultado:
        System.out.println("El apellido contiene la letra \"j\": " + resultadoG);
        
        // H) el apellido termina en "diez" endsWith
        resultadoH = apellido.endsWith("diez") || apellido.endsWith("DIEZ") ;
        // Imprime el resultado:
        System.out.println("El apellido termina en \"diez\": " + resultadoH);
        
        // I) La edad no esta entre 40 y 50 años
        resultadoI = !(edad > 40 && edad < 50);
        // Imprime el resultado:
        System.out.println("La edad no esta entre 40 y 50 años: " + resultadoI);
    }
}
