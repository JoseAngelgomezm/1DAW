/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.List;

/**
 *
 * @author Jose Angel
 */
public class MainEj3 {

    public static void main(String[] args) {
        // crear el coro
        Coro c = new Coro();
        
        // imprimir el coro
        System.out.println(c);
        
        // obtener el numero de coros mixtos posibles
        System.out.println("Con estas voces se pueden montar: " + c.getNumeroCorosMixtos() + " Coros Mixtos");
        
        
    }
}
