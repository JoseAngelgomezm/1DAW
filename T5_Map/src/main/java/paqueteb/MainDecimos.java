/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Jose Angel
 */
public class MainDecimos {

    public static void main(String[] args) {
        // crear la estructura map
        SortedMap<Numeros, Premios> estructuraDecimos = new TreeMap<>();
        
        // rellenar 1000 valores
        for (int i = 0; i <= 999; i++) {
            // para obtener los ceros a la izquierda formateamos el string con el parametro "%05d" y le pasamos 
            // el argumento que queremos formatear que en este caso es la i
            estructuraDecimos.put(new Numeros(String.format("%05d", i)), new Premios());
        }
        
        // dar premio a boletos 00099, 00543 y 00823
        estructuraDecimos.put(new Numeros("00099"), new Premios(5_000));
        estructuraDecimos.put(new Numeros("00543"), new Premios(3_000));
        estructuraDecimos.put(new Numeros("00823"), new Premios(1_000));
        
        // imprimir la estructura
        for (Map.Entry<Numeros, Premios> entry : estructuraDecimos.entrySet()) {
            String key = entry.getKey().getNumero();
            Integer val = entry.getValue().getPremio();
            System.out.println("Numero: " + key + " Premio: " + val);
        }
      

        // pedir un decimo por teclado
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el numero de un decimo: ");
        String numero = teclado.nextLine();
        
        // llamar al metodo de consulta con el numero que ha introducido el usuario
        // y la estrcutura de decimos en la que queremos consultar
        consultarPremio(numero, estructuraDecimos);
        

    }
    
    private static void consultarPremio(String numeroDecimo , SortedMap<Numeros, Premios> decimos){
        // crear un numero con el vañpr que recibimos por parametro
        // pasando el entero que se introduce a entero
        Numeros numeroConsultar = new Numeros(numeroDecimo);
        // si el numero existe
        if (decimos.containsKey(numeroConsultar)) {
            // imprimir el value de ese boleto
            System.out.println("El decimo tiene premiado : " + decimos.get(numeroConsultar).getPremio() + "€");
        }else{
            System.out.println("El decimo no existe");
        }
        
    }
}
