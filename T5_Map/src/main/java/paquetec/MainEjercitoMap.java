/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jose Angel
 */
public class MainEjercitoMap {

    public static void main(String[] args) {
        // crear estructura map
        HashMap<Integer, Ejercito> estructuraEjercitos = new HashMap<>();

        // crear listas de soldados 
        Set<Soldado> listaSoldadosEjercito1 = new HashSet<>();
        Set<Soldado> listaSoldadosEjercito2 = new HashSet<>();

        // crear los ejercitos con las listas de los soldados
        Ejercito ejercito1 = new Ejercito(listaSoldadosEjercito1);
        Ejercito ejercito2 = new Ejercito(listaSoldadosEjercito2);

        // añadir 3 soldados al set del ejercito 1
        ejercito1.alistarSoldado(new Soldado("123456", "Pepe",
                "Rodriguez", "Perez", 23));
        ejercito1.alistarSoldado(new Soldado("654321", "Juan",
                "Garcia", "Sanchez", 26));
        ejercito1.alistarSoldado(new Soldado("543232", "Lian",
                "Kanto", "Klim", 25));

        // añadir 6 soldados a la lista del ejercito 2
        ejercito2.alistarSoldado(new Soldado("123456", "Pepe",
                "Rodriguez", "Perez", 23));
        ejercito2.alistarSoldado(new Soldado("654321", "Juan",
                "Garcia", "Sanchez", 26));
        ejercito2.alistarSoldado(new Soldado("543232", "Lian",
                "Kanto", "Klim", 25));
        ejercito2.alistarSoldado(new Soldado("223344A", "kasante",
                "Rodriguez", "Perez", 23));
        ejercito2.alistarSoldado(new Soldado("2144553V", "killo",
                "Garcia", "Sanchez", 26));
        ejercito2.alistarSoldado(new Soldado("12355334C", "joselito",
                "Kanto", "Klim", 25));

        // añadir los 2 ejercitos a la estructura map con su lista de soldados
        guardarEjercito(0, ejercito1, estructuraEjercitos);
        guardarEjercito(1, ejercito2, estructuraEjercitos);

        // imprimir el ejercito 1
        System.out.println("Imprimir Ejercito1");
        imprimirEjercito(0, estructuraEjercitos);
        imprimirEjercito(4, estructuraEjercitos);
        
        // imprimir todos los ejercitos
        System.out.println("Imprimir todos los ejercitos");
        imprimirTodosLosejercitos(estructuraEjercitos);
        
    }

    public static void guardarEjercito(int codigoEjercido, Ejercito ejercitoAGuardar, HashMap<Integer, Ejercito> estructuraParaGuardar) {
        // si no contiene el ejercito lo guarda
        if (!estructuraParaGuardar.containsKey(codigoEjercido)) {
            estructuraParaGuardar.put(codigoEjercido, ejercitoAGuardar);
        } else {
            // sino decir que el ejercito ya existe
            System.out.println("El ejercito ya existe");
        }

    }
    
    public static void imprimirEjercito(int codigoEjercito, HashMap<Integer, Ejercito> estructuraParaImprimir){
        // si la estructura contiene el ejercito
        if (estructuraParaImprimir.containsKey(codigoEjercito)) {
            // imprimirlo
            System.out.println(estructuraParaImprimir.get(codigoEjercito));
            
        }else{
            // avisar de que no existe
            System.out.println("El ejercito no existe");
        }
        
    }
    
    public static void imprimirTodosLosejercitos(HashMap<Integer, Ejercito> estructuraParaImprimir){
        for (Map.Entry<Integer, Ejercito> entry : estructuraParaImprimir.entrySet()) {
            Integer key = entry.getKey();
            Ejercito val = entry.getValue();
            System.out.println("Key : " + key + " " + val);
        }
        
        
    }

}
