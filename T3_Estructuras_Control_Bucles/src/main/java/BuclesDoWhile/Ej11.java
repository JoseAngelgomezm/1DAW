/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesDoWhile;

/**
 *
 * @author joseangel
 */
public class Ej11 {
    public static void main(String[] args) {
        char letra = 'A';
        //1º Inicializacion variable control
        int i = 1;
        
        do {
            // 3º Codigo que queramos que se repita
            // la letra
            System.out.println(letra);
            // aumentar el valor de la letra en 1
            letra++;
            //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL
            i++;
        } while (i <= 26);// 2º Condicion del bucle: 27-1 porque ya imprime la a
                            // en la primera iteracion
        
    }
}
