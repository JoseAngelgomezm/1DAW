/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p52JoseAngelGomezMorillo;

/**
 *
 * @author joseangel
 */
public class MainLaberinto {

    public static void main(String[] args) {
        final int TAMAÑO_MATRIZ = 6;
        char[][] laberinto = new char[TAMAÑO_MATRIZ][TAMAÑO_MATRIZ];
        
        // controlar la excepcion illegaArgument
        try {
            laberinto = UtilesLaberinto.generarLaberinto(TAMAÑO_MATRIZ);
        } catch (IllegalArgumentException iae) {
            System.out.println("Tamaño erroneo de la matriz (3-10)");
        }
        
        // imprimir el laberinto con b o c
        System.out.println("LABERINTO CHAR:");
        System.out.println("");
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                System.out.print(laberinto[i][j] + " ");
                
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        // crear laberinto de casillas
        Casilla[][] laberintoCasillas = UtilesLaberinto.generadorLaberintoCasilla(laberinto);
        
        // imprimir el laberinto de objetos casillas
        System.out.println("LABERINTO CASILLAS:");
        System.out.println("");
        for (int i = 0; i < laberintoCasillas.length; i++) {
            for (int j = 0; j < laberintoCasillas[i].length; j++) {
                System.out.print(laberintoCasillas[i][j] + "\t");
                
            }
            System.out.println("");
        }
        
        
        
    }
}
