/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Jose Angel
 */
public class Animal {
    private LocalDate fechaNacimiento;
    private String nombre;
    private tipoAnimal tipo;
    private double peso;
    private String estado;
    
    
    // Constructor por defecto
    public Animal() {
    }
    
    // Constructor paramtrizado

    public Animal(LocalDate fechaNacimiento, String nombre, tipoAnimal tipo, double peso, String estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }
    
    
    // ToString
    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }
    
    
    // metodo que aumenta el peso del animal al darle de comer
    public void comer (double cantidadGramos){
       double cantidadPositiva =  Math.abs(cantidadGramos);
       
       this.peso = this.peso + cantidadGramos;
    }
    
    //metodo que pone el animal a dormir
    public void dormir (){
        this.estado = "dormir";
    }
    
    //metodo que despierta al animal
    public void despertar (){
        this.estado = "despierto";
    }
    
     //metodo que pone el animal a descansar
    public void descansar (){
        this.estado = "descansando";
    }
    
    // metodo que pone al animal a jugar y baja el peso segun el tiempo
    public void jugar (int cantidadMinutos){
        // pasar la cantidad a positva
        Math.abs(cantidadMinutos);
        // lanzar expcecion si el tiempo excede los 180 minutos
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException("No puede pasar de 180 minutos");
        }
        // poner el estado del animal a jugando
        this.estado = "jugando";
        // por menos de 30 minutos
        if (cantidadMinutos < 30) {
            // bajar 10 al peso
            this.peso = this.peso - 10;
        // entre 30 y 59 minutos baja 20 al peso
        }else if (cantidadMinutos >= 30 && cantidadMinutos < 60){
            this.peso = this.peso - 20;
        // entre 60 y 79 minutos baja 40 al peso
        }else if (cantidadMinutos >= 60 && cantidadMinutos < 80){
            this.peso= this.peso - 40;
        // entre 80 y 119 minutos baja 60 al peso
        }else if (cantidadMinutos >= 80 && cantidadMinutos < 120){
            this.peso= this.peso - 60;
        // entre 120 y 179 minutos baja 80 al peso
        }else if (cantidadMinutos >= 120 && cantidadMinutos < 180){
            this.peso= this.peso - 80;
        // si son 180 baja 120 al peso
        }else {
            this.peso = this.peso - 120;
        }
        // refactorizar dividiendo la cantidad de minutos entre 30 y multiplicando por 20
    }
    // clonar
    public Animal clonar (Animal pet){
        Animal animalAux = new Animal(pet.getFechaNacimiento(), pet.getNombre(),getTipo(), pet.getPeso(), pet.getEstado());
        return animalAux ;
    }
    // Getter y Setter
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(tipoAnimal tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
