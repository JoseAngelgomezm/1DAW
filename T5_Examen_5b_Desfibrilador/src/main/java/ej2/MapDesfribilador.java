/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author joseangel
 */
import daw.Desfibrilador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class MapDesfribilador {
    
    private final Map<String, Desfibrilador> mapDesfibrilador;

    // constructor
    public MapDesfribilador(Desfibrilador[] arrayDesfibrilador, boolean control) {
        // si el boolean es true hacer un treeMap 
        if (control) {
            this.mapDesfibrilador = new TreeMap<>();

            // sino crear un hashMap
        } else {
            this.mapDesfibrilador = new HashMap<>();
            
        }
        // añadir los objetos
        for (Desfibrilador d : arrayDesfibrilador) {
            this.mapDesfibrilador.put(d.getId(), d);
        }
    }

    // saber si el desfibrilador que se pasa por parametro esta la estrcutura
    public boolean estaEnEstructura(Desfibrilador desfibrilador) {
        return this.getMapDesfibrilador().containsKey(desfibrilador.getId());
    }

    // obtener lista de desfibriladores a partir del map
    public List<Desfibrilador> obtenerListaDesfibriladores() {
        List<Desfibrilador> lista = new ArrayList<>(this.getMapDesfibrilador().values());
        return lista;
    }

    // obtener numero desfibriladores asociados a un correo
    public Map<String, Integer> obtenerDesfibriladoresCorreo() {
        
        Map<String, Integer> nuevoMap = new HashMap<>();

        // recorrer el map de este objeto
        for (Map.Entry<String, Desfibrilador> entry : this.mapDesfibrilador.entrySet()) {
            String key = entry.getKey();
            Desfibrilador val = entry.getValue();

            // si el nuevo map ya contiene el email
            if (nuevoMap.containsKey(val.getEmail())) {

                // añadir de nuevo la key sumando el contador
                nuevoMap.put(val.getEmail(), nuevoMap.get(val.getEmail() + 1));
            } else {
                // sino añadir el nuevo email con el contador a 1
                nuevoMap.put(val.getEmail(), 1);
            }
            
        }
        
        return nuevoMap;
    }
    
    public Map<String, Desfibrilador> getMapDesfibrilador() {
        return mapDesfibrilador;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.mapDesfibrilador);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MapDesfribilador other = (MapDesfribilador) obj;
        return Objects.equals(this.mapDesfibrilador, other.mapDesfibrilador);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // obtener conjunto de claves
        Set<String> setClaves = this.mapDesfibrilador.keySet();

        // recorrer el set para obtener valores
        for (String s : setClaves) {
            sb.append(s).append(" -> ")
                    .append(this.mapDesfibrilador.get(s).getNombre()).append(" ")
                    .append(this.mapDesfibrilador.get(s).getEmail()).append("\n");
        }
        
        return sb.toString();
    }
    
}
