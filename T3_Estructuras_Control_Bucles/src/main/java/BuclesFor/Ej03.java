/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesFor;

/**
 *
 * @author joseangel
 */
public class Ej03 {
    public static void main(String[] args) {
        int numeroVeces = 25;
        int numeroInicial = 15;
        //1º Inicializacion variable control (int i=1)
        //2º Condicion del bucle (desde 1 hasta 25) numeroVeces>=i
        //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL (i++)
        
        for (int i=1; numeroVeces >= i; i++){
             // 3º Codigo que queramos que se repita
             // Primera iteracion imprimimos el numero
            System.out.println(numeroInicial);
            // Se multiplica por 2
            numeroInicial = numeroInicial * 2 ;
        }
    }
}
