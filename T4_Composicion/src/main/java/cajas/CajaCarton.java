/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajas;

/**
 *
 * @author joseangel
 */
public class CajaCarton {
    // EJERCICIO 7
    private double ancho, alto, largo, peso;

    public CajaCarton() {
    }
    
    // EJERCICIO 9
    @Override
    public String toString() {
        return "CajaCarton{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + ", peso=" + peso + '}';
    }

    public CajaCarton(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }

    public void abrir() {

    }

    public void cerrar() {

    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
