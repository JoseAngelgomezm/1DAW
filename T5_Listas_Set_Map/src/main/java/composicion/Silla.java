/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author Jose Angel
 */
public class Silla extends Mueble {

    private String tipoMadera;

    public Silla(String tipoMadera, String referenciaMueble, String color, int alto, int largo, int ancho) {
        super(referenciaMueble, color, alto, largo, ancho);
        this.tipoMadera = tipoMadera;
    }

    public Silla() {
    }

    public void cambiarTipoMadera(String nuevoTipoMadera) {
        setTipoMadera(nuevoTipoMadera);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Silla{");
        sb.append("tipoMadera=").append(tipoMadera);
        sb.append('}');
        return sb.toString();
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    @Override
    public void cambiarColor(String nuevoColor) {
        setColor(nuevoColor);
    }

}
