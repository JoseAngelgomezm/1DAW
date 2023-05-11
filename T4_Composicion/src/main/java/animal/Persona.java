/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Jose Angel
 */
public class Persona {
    //atributos de la clase persona
    private String nombre;
    private int edad;
    
    //metodo llamar que despierta al animal en cuestion
    public void llamar (Animal pet){
        pet.despertar();
    }
    
    //metodo alimentar
    public void alimentar (Animal pet, double cantidadComida){
        pet.comer(cantidadComida);
    }
    
    //metodo jugar
    public void jugar(Animal pet, int cantidadMinutos){
        try {
            pet.jugar(cantidadMinutos);
        } catch (Exception IllegalArgumentException) {
            System.out.println("No puedes jugar con el animal mas de 180min se define el tiempo a 180min");
            pet.jugar(180);
        }
    }
    
    // constructor por defecto
    public Persona() {
    }
    
    // constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // metodo toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    // getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
