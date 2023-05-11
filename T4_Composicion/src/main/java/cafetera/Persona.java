/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera;

/**
 *
 * @author Jose Angel
 */
public class Persona {
    // atributos de la persona
    private int edad;
    private String nombre;
    
    
    // metodo que hace cafe
    public void hacerCafe(Cafetera c){
        c.llenarCafetera();
    }
    // metodo que disminuye la cantidad de cafe
    public void beberCafe(Cafetera c,  int cantidad){
        // si la cantidad que pasamos es mayor a la cantidad actual que tiene
        // la cafetera de la que queremos beber
        if (cantidad > c.getCantidadActual()) {
            //poner la cantidad de la cafetera a 0 (se bebe lo que habia)
            c.setCantidadActual(0);
            System.out.println("Se ha intentado beber mas de lo que habia");
        }else {
             c.setCantidadActual(c.getCantidadActual() - cantidad);
        }
       
    }
    // constructor parametrizado
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    // constructor por defecto
    public Persona() {
    }
    
    // metodo toString
    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    // metodos getter y setter
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
