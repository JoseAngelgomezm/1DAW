/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apuntes;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */

// Todo .java contiene una clase, en este caso se llama Apuntes, que hace llamada
// al metodo main, sin metodo main no hay programa
public class Variables {
    
    public static void main(String[] args) {
        // DECLARACION E INICIALIZACION DE VARIABLES
        // Declarando variables e inicializando, toda instruccion acaba con ;
        // 25,35 y 40 son literales enteros 
        int edad = 25;
        int edad2 = 35;
        int edad3 = 40;
        // delcaracion e inicialiacion de un char con el literal 'f'
        char letra = 'f';
        
        //declaracion e inicializacion de un double
        double factura1 = 125.3;
        double factura2 = 34.5;
        
        // Suma de dos variables, guardandola en una tercera variable nueva
        // e imprimiendola por pantalla con println y printf
        double sumaImportes = factura1 + factura2;
        System.out.println("Esto es la suma de las 2 facturas: " + sumaImportes);
        
        // Uso del printf para formatear texto
        // los float van con f alfinal y los long con l
        float numero5 = 5.8776f;
        double numero6 = 98.7998;
        // Primero se pasa el formato y luego se pasan las variables, una por cada simbolo %
        System.out.printf("float 2 decimales: %.2f %ndouble 2 decimales: %.2f "
                ,numero5, numero6);
        
       
        // Uso de un textblock
        boolean verdadero = true;
        int numero7 = 2;
        double numero8 = 5.876;
        String resultado = """
                             int %d 
                             double %f
                             boolean : %b
                           """.formatted(numero7,numero8,verdadero);
        
      // Muestra el resultado por pantalla
        System.out.println(""+resultado);
        
       
    }
}
