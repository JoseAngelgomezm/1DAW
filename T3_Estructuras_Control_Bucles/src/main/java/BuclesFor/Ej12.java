/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesFor;

/**
 *
 * @author joseangel
 */
public class Ej12 {

    public static void main(String[] args) {
        // Decalaramos la variable con la letra a
        char letra = 'a';

        //1º Inicializacion variable control (int i=0)
        //2º Condicion del bucle (i<=26) 
        //4º SIEMPRE DENTRO DEL BUCLE HAY QUE ACTUALIZAR LA VARIABLE DE CONTROL (i++)
        for (int i = 1; i <= 26; i++) {
            // 3º Codigo que queramos que se repita
            // la letra a +1 durante 26 iteraciones: 
            // 27-1 porque la letra a la imprime la primera vez

            
            int valorNumerico = (int) letra;
            System.out.println(valorNumerico + ": es el valor numerico de " + letra);
            letra++;
        }
    }

}

