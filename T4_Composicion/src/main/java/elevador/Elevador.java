/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author joseangel
 */
public class Elevador {

    // atributos del elevador
    private final String numeroDeSerie = numeroSerieAleatorio();
    private final String fabricante;
    private final int capacidadPersonas;
    private final int pesoMaximo;
    private final LocalDate fechaFabricacion = LocalDate.now();
    private LocalDate fechaUltimaRevision = LocalDate.now();
    private int plantaActual = 0;
    private Estado estado;

    // constructor
    public Elevador(String fabricante, int capacidadPersonas, int pesoMaximo) {
        this.fabricante = fabricante;
        this.capacidadPersonas = establecerMaximoPersonas(capacidadPersonas);
        this.pesoMaximo = establecerPesoMaximo(pesoMaximo);
    }

    // metodo que crea el numero de serie del elevador
    private String numeroSerieAleatorio() {
        String aleatorio8digitos = RandomStringUtils.randomNumeric(8);
        return aleatorio8digitos;
    }

    //metodo para establecer el maximo de personas
    private int establecerMaximoPersonas(int capacidadPersonas) {
        // si la capacidad de personas es menor que 1 o mayor que 10
        if (capacidadPersonas < 1 || capacidadPersonas > 10) {
            // devolver valor por defecto de int
            return 0;
            // si la capacidad es valida devolver el la capacidad
        } else {
            return capacidadPersonas;
        }
    }

    //metodo para establecer el peso maximo total
    private int establecerPesoMaximo(int pesoMaximo) {
        // si la capacidad es mayor que 800 o menor que 1
        if (pesoMaximo > 800 || pesoMaximo < 1) {
            // devolver valor por defecto de int
            return 0;
            // si el valor es correcto devolver el peso maximo
        } else {
            return pesoMaximo;
        }
    }

    // metodo viajar que si mover es verdadero, mueve a la planta indicada
    public void viajar(int numeroViajeros, double pesoTotal,
            int plantaDestino) {
        
        boolean sePuedeViajar = mover(numeroViajeros, pesoTotal,
                plantaDestino);
        // si se puede viajar
        if (sePuedeViajar == true) {
            // tenemos el cuenta si la plantaDestino es mayor que la actual
            // para cambiar el estado a subiendo
            if (plantaDestino > this.plantaActual) {
                this.estado = estado.SUBIENDO;
            // si la planta destino es menor que la actual cambiar el estado 
            // a bajando
            }else if (plantaDestino < this.plantaActual) {
               this.estado = estado.BAJANDO;
            }
            
            // una vez cambiado el estado, tenemos que establecer la planta 
            // acual como la planta de destino
            this.plantaActual = plantaDestino;
        }
        else{
            System.out.println("No se puede viajar");
        }
    }

    //metodo mover que comprueba si se puede realizar o no el viaje
    private boolean mover(int numeroViajeros, double pesoTotal,
            int plantaDestino) {
        // si el numero de viajeros no esta en el rango o el peso no esta en el rango 
        // el numero de planta es el mismo al que se dirige devuelve falso
        if ((numeroViajeros < 1 || numeroViajeros > this.capacidadPersonas)
                || (pesoTotal < 1 || pesoTotal > this.pesoMaximo)
                || (this.plantaActual == plantaDestino) || this.estado.equals(estado.AVERIADO)) {
            return false;
        }
        // sino devolvera verdadero
        return true;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Elevador{" + "numeroDeSerie=" + numeroDeSerie + ", fabricante=" + fabricante + ", capacidadPersonas=" + capacidadPersonas + ", pesoMaximo=" + pesoMaximo + ", fechaFabricacion=" + fechaFabricacion + ", fechaUltimaRevision=" + fechaUltimaRevision + ", plantaActual=" + plantaActual + ", estado=" + estado + '}';
    }

    //metodos getter y setter (solo tiene setter de fechaUltimaRevision)
    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public LocalDate getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    public void setFechaUltimaRevision(LocalDate fechaUltimaRevision) {
        this.fechaUltimaRevision = fechaUltimaRevision;
    }

    public int getPlantaActual() {
        return plantaActual;
    }

    public Estado getEstado() {
        return estado;
    }
    

}
