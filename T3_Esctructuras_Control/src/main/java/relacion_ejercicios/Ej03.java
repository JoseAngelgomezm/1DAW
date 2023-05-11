/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_ejercicios;

/**
 *
 * @author Jose Angel
 */
public class Ej03 {

    public static void main(String[] args) {
        // A
        boolean unaCondicion = true;
        String resultado;
        resultado = unaCondicion ? "valor1" : "valor2";
        // devuelve valor1 porque unaCondicion esta inicializado a true
        
        // B
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        // devuelve 100 porque x es mayor que 10 y devuelve la condicion 
        // verdadera
        
        // C
        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente"
                : (vendidas < aforo) ? "Aun no hemos vendido todo"
                        : "Esta todo vendido";
        // devuelve esta todo vendido porque publico no es menor que aforo
        // entonces comprueba la condicion del falso
        // si vendidas es menor que aforo que al ser falso
        // devuelve Esta todo vendido
        
    }
}
