/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author Jose Angel
 */
public class Mesa extends Mueble {

    private int numeroPatas;

    public Mesa(int numeroPatas, String referenciaMueble, String color, int alto, int largo, int ancho) {
        super(referenciaMueble, color, alto, largo, ancho);
        this.numeroPatas = numeroPatas;
    }

    public Mesa() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Mesa{");
        sb.append("numeroPatas=").append(numeroPatas);
        sb.append('}');
        return sb.toString();
    }

    // metodo propio para cambiar el numero de patas
    public void cambiarNumeroPatas(int nuevoNumeroPatas) {
        setNumeroPatas(nuevoNumeroPatas);
    }

    // metodo sobrescrito para cambiar el color
    @Override
    public void cambiarColor(String nuevoColor) {
        setColor(nuevoColor);
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

}
