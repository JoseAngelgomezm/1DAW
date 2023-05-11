/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_arrays_matrices_listas;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author joseangel
 */
public class LanzarMonedaComposicion {

    private boolean[] arrayBooleano;

    
    // constructor
    public LanzarMonedaComposicion() {
        this.arrayBooleano = rellenarArray();
    }
    
    // metodo que muestra el array con numero de lanzamiento y cara o cruz
    public void mostrarArray() {
        for (int i = 0; i < this.arrayBooleano.length; i++) {
            //si la posicion que estamos revisando es true
            if (this.arrayBooleano[i]) {
                // mostrar cara
                System.out.println((i + 1) + ": Cara");
            } else {
                // sino mostrar cruz
                System.out.println((i + 1) + ": Cruz");
            }
        }
    }

    // metodo que rellena el array
    private boolean[] rellenarArray() {
        // inicializar el array de la clase
        this.arrayBooleano = new boolean[1000];
        int numeroAleatorio;
        java.util.Random generador = new java.util.Random();
        // recorrer el array
        for (int i = 0; i < this.arrayBooleano.length; i++) {
            // generar un numero aleatorio entre 1 y 2
            numeroAleatorio = generador.nextInt(1, 3);
            // si el numero es 1 poner esa posicion a true
            if (numeroAleatorio == 1) {
                this.arrayBooleano[i] = true;
            } // si el numero es otro ponerlo a false
            else {
                this.arrayBooleano[i] = false;
            }
        }
        return this.arrayBooleano;
    }

    // metodo que cuenta las caras
    public int contarCaras() {
        int contadorCaras = 0;
        // recorrer el array
        for (int i = 0; i < this.arrayBooleano.length; i++) {
            if (this.arrayBooleano[i]) {
                contadorCaras++;
            }
        }
        return contadorCaras;
    }

    // metodo que cuenta las cruces
    public int contarCruces() {
        int contadorCruz = 0;
        // recorrer el array
        for (int i = 0; i < this.arrayBooleano.length; i++) {
            if (!this.arrayBooleano[i]) {
                contadorCruz++;
            }
        }
        return contadorCruz;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Arrays.hashCode(this.arrayBooleano);
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
        final LanzarMonedaComposicion other = (LanzarMonedaComposicion) obj;
        return Arrays.equals(this.arrayBooleano, other.arrayBooleano);
    }

    // toString de lanzarMoneda
    @Override
    public String toString() {
        String tmp = "";
        for (boolean v : arrayBooleano) {
            // si el lanzamiento no es null lo añade al tmp

            tmp += v + "\n";

        }
        return tmp;
    }

}
