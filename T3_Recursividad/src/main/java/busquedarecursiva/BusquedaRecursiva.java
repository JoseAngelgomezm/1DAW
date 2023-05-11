/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedarecursiva;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class BusquedaRecursiva {

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();

        lista1.add(10);
        lista1.add(8);
        lista1.add(43);
        lista1.add(221);
        lista1.add(12);
        lista1.add(11);
        lista1.add(8);
        
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
            
        }
        
        System.out.println("");
        
        System.out.println("El numero 8 está en la posicion: " + 
                busquedaRecrusiva(lista1, 0, 8));
        
        System.out.println("Empezando desde la posicion 2 el numero 8 está en la posicion: " + 
                busquedaRecrusiva(lista1, 2, 8));
        
        System.out.println("El numero 0 está en la posicion: " + 
                busquedaRecrusiva(lista1, 0, 0));
        

    }

    // metodo recursivo que recorre la lista de enteros y devuelve la posicion
    // del numero que se quiere buscar
    private static int busquedaRecrusiva(List<Integer> listaEnteros, int posicionEmpezar, int numeroBuscar) {
        // variable que guarda la posicion del numero que buscamos
        // si no lo encuentra devuelve -1
        int posicionDelNumero = -1;
        
        // caso base que encuentre el numero
        if (numeroBuscar == listaEnteros.get(posicionEmpezar)) {
            posicionDelNumero = posicionEmpezar;
            return posicionDelNumero;
            
        // si no lo encuentra buscamos en la siguiente posicion    
        } else {
            posicionEmpezar++;
            // si se intenta buscar en la lista con una posicion mayor
            if (posicionEmpezar >= listaEnteros.size()) {
                // se devuelve -1 (no encontrado)
                return posicionDelNumero;
                // si la posicion esta en el rango de la lista llamar al metodo 
                // y buscar en la siguiente posicion
            }else{
                return busquedaRecrusiva(listaEnteros, posicionEmpezar, numeroBuscar);
            }
            
        }

    }
}
