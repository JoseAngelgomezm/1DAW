/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author joseangel
 */
public class MisVehiculos {

    public static void main(String[] args) {
        // este programa crea un objeto de la clase vehiculo y
        // muestra sus atributos

        // instanciación del objeto vehiculo1
        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco",
                100.0);

        // invocación de métodos para mostrar los datos del objeto vehiculo1
        System.out.println("Datos del vehículo :"
                + vehiculo1.getMatricula() + "," + vehiculo1.getMarca());

        // EJERCICIO 3
        Vehiculo miCacharro = new Vehiculo("70799 JKL", "BMW", "M2", "Verde",
                160);
        // EJERCICIO 4
        miCacharro.matricula = "8734 KJS";
        System.out.println("Matricula modificada con atributo: " + miCacharro.matricula);
        miCacharro.setMatricula("5683 HGJ");
        System.out.println("Matricula modificada con set: " + miCacharro.matricula);

        // EJERCICIO 5
        System.out.println("Mostrar datos con toString: " + miCacharro.toString());

        // EJERCICIO 6 
        // Si atendemos al principio de ocultamiento de la información, ¿es recomendable que los atributos de un objeto sean públicos y accesibles desde cualquier clase?
        // no es recomendable, ya que los atributos de un objeto solo deben ser accesibles desde los metodos set y get
       
        miCacharro.setDisponible(false);
        System.out.println(miCacharro.disponible);
        recibirVehiculo(miCacharro);
        System.out.println(miCacharro.disponible);
        
        // Ejercicio16 hoja2
        Vehiculo miCacharroCopia = new Vehiculo(miCacharro);
        System.out.println(miCacharroCopia);
        
    }
     // Ejercicio 15 hoja2
    public static void recibirVehiculo(Vehiculo aux) {
        aux.setDisponible(true);
    }
    
    
    
}
