/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author joseangel
 */
public class MainPila {

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<Integer>(8);
        
        pila.apilarElemento(1);
        pila.apilarElemento(2);
        pila.apilarElemento(3);
        pila.apilarElemento(4);
        pila.apilarElemento(445);
        pila.apilarElemento(22);
        pila.apilarElemento(123);
       
        
        pila.desapilarElemento();
        pila.desapilarElemento();
        pila.desapilarElemento();
        
        pila.apilarElemento(1);
        pila.apilarElemento(2);
        pila.apilarElemento(1);
        pila.apilarElemento(2);
        
        pila.desapilarElemento();
        pila.desapilarElemento();
        
        pila.apilarElemento(22);
        pila.apilarElemento(123);
        
        pila.desapilarElemento();
        pila.desapilarElemento();
        pila.desapilarElemento();
        pila.desapilarElemento();
        pila.desapilarElemento();
        pila.desapilarElemento();
        pila.desapilarElemento();
        pila.desapilarElemento();
        
        pila.imprimirPila();
        
        System.out.println(pila.estaLlena());
        System.out.println(pila.cuantosElementosTiene());
       
    }

}
