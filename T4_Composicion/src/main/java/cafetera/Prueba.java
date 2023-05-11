/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera;

/**
 *
 * @author Jose Angel
 */
public class Prueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona(18, "pepe");
        Cafetera miCafetera = new Cafetera(100, 50);
        Cafetera miCafetera2 = new Cafetera(400, 10);
        System.out.println("------- DATOS DE LAS CAFETERAS RECIEN CREADAS -------");
        System.out.println(miCafetera);
        System.out.println(miCafetera2);
        
        System.out.println("------- VACIAR LAS CAFETERAS -------");
        miCafetera.vaciarCafetera();
        miCafetera2.vaciarCafetera();
        System.out.println(miCafetera);
        System.out.println(miCafetera2);
        
        System.out.println("------- LLENAR LAS CAFETERAS -------");
        miCafetera.llenarCafetera();
        miCafetera2.llenarCafetera();
        System.out.println(miCafetera);
        System.out.println(miCafetera2);
        
        System.out.println("------- SERVIR TAZAS -------");
        miCafetera.servirTaza(10);
        System.out.println(miCafetera);
        miCafetera.servirTaza(200);
        System.out.println(miCafetera);
        
        System.out.println("------- AGREGAR CAFE -------");
        miCafetera.agregarCafe(50);
        System.out.println(miCafetera);
        miCafetera.agregarCafe(220);
        System.out.println(miCafetera);
        
        System.out.println("------- PERSONA BEBE CAFE -------");
        persona1.beberCafe(miCafetera, 30);
        System.out.println(miCafetera);
        persona1.beberCafe(miCafetera, 200);
        System.out.println(miCafetera);
        
        System.out.println("------- PERSONA HACE CAFE -------");
        persona1.hacerCafe(miCafetera);
        System.out.println(miCafetera);
        
        PersonaR persona2 = new PersonaR("joselito", 34);
        
       
    }
}
