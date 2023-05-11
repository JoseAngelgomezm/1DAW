/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author joseangel
 */
public class Traductor {

    private SortedMap<PalabraExtranjera, PalabraEspañol> estructuraPalabras;

    // metodo que agrega palabras a la esctructura
    public void agregarPalabra(String palabraExtranjeraAñadir, String palabraEspañolAñadir) {
        // crear 2 palabras una extranjera y otra en español con los valores que recibimos
        PalabraExtranjera palabraAñadirExtranjera = new PalabraExtranjera(palabraExtranjeraAñadir);
        PalabraEspañol palabraAñadirEspañol = new PalabraEspañol(palabraEspañolAñadir);

        // añadir las palabras a la estructura de datos
        this.estructuraPalabras.put(palabraAñadirExtranjera, palabraAñadirEspañol);
    }

    // imprimir la estrcutura de datos
    public void imprimirDatos() {
        for (Map.Entry<PalabraExtranjera, PalabraEspañol> entry : this.estructuraPalabras.entrySet()) {
            String key = entry.getKey().getValorExtranjera();
            String val = entry.getValue().getValorEspañol();
            System.out.println("Key: " + key + " Value: " + val);
        }
    }

    // borrar entradas
    public void borrarPalabra(String palabraExtranjera) {
        // crear una palabra con el valor que pasa por la llamada
        PalabraExtranjera palabraBorrar = new PalabraExtranjera(palabraExtranjera);

        // borrar por la key que es la palabraExtranjera
        this.estructuraPalabras.remove(palabraBorrar);
    }

    // modificar una entrada
    public void modificarPalabra(String palabraExtranjeraModificar, String palabraEspañolModificar) {
        // crear una palabra extranjera (key) para comprobar que existe 
        PalabraExtranjera palabraAñadirExtranjera = new PalabraExtranjera(palabraExtranjeraModificar);

        // si la estrcutura contiene la palabra
        if (this.estructuraPalabras.containsKey(palabraAñadirExtranjera)) {
            // la vuelve a agregar ya que al volver a agregar se queda 
            // añadidad la mas reciente
            agregarPalabra(palabraExtranjeraModificar, palabraEspañolModificar);
        } else {
            System.out.println("La palabra lo existe");
        }

    }

    // realizar una traduccion
    public void traducirPalabra(String palabraExtranjero) {
        // crear una palabra en extranjero (key)  
        PalabraExtranjera palabraTraducir = new PalabraExtranjera(palabraExtranjero);

        // si la estrcutura contiene la palabra
        if (this.estructuraPalabras.containsKey(palabraTraducir)) {
            // imprimir el value de esta palabra
            System.out.println(this.estructuraPalabras.get(palabraTraducir).getValorEspañol());
        } else {
            System.out.println("La palabra lo existe");
        }

    }
    
    // obtener una lista de palabras extranjeras
    public List<PalabraExtranjera> obtenerListaExtranjeras(){
        List<PalabraExtranjera> lista = new ArrayList(this.estructuraPalabras.keySet());
        
        return lista;
    }
    
    // obtener una lista de palabras extranjeras
    public List<PalabraEspañol> obtenerListaEspañolas(){
        List<PalabraEspañol> lista = new ArrayList(this.estructuraPalabras.values());
        
        return lista;
    }

    public Traductor() {
    }

    public Traductor(SortedMap<PalabraExtranjera, PalabraEspañol> estructuraPalabras) {
        this.estructuraPalabras = estructuraPalabras;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.estructuraPalabras);
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
        final Traductor other = (Traductor) obj;
        return Objects.equals(this.estructuraPalabras, other.estructuraPalabras);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traductor{");
        sb.append("estructuraPalabras=").append(estructuraPalabras);
        sb.append('}');
        return sb.toString();
    }

    public SortedMap<PalabraExtranjera, PalabraEspañol> getEstructuraPalabras() {
        return estructuraPalabras;
    }

    public void setEstructuraPalabras(SortedMap<PalabraExtranjera, PalabraEspañol> estructuraPalabras) {
        this.estructuraPalabras = estructuraPalabras;
    }

}
