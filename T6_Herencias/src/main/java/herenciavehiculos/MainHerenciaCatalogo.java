/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciavehiculos;

import herenciacatalogos.Color;
import herenciacatalogos.Modelo;

/**
 *
 * @author joseangel
 */
public class MainHerenciaCatalogo {
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo("1233", "90098HGJ", Color.ROJO, Modelo.CUPRA, 23.9);
        
        Deportivo deportivo1 = new Deportivo(350, "123444", "8766BDF", Color.NEGRO, Modelo.SEAT_PANDA, 54);
        
        Furgoneta furgoneta1 = new Furgoneta(350, "33454", "23345GHB", Color.ROJO, Modelo.CUPRA, 23);
        
        Turismo turismo1 = new Turismo(240, "23124", "1237ASD", Color.ROJO, Modelo.CUPRA, 21);
        
        System.out.println(vehiculo1);
        System.out.println(deportivo1);
        System.out.println(furgoneta1);
        System.out.println(turismo1);
        
        System.out.println("");
        
        System.out.println("Matricula vehiculo: "+ vehiculo1.getMatricula());
        System.out.println("Cilindrada deportivo : "+deportivo1.getCilindrada());
        System.out.println("Carga Maxima furgoneta : "+furgoneta1.getCargaMaxima());
        System.out.println("Peso Turismo: "+turismo1.getPeso());
       
        
        
        
    }
}
