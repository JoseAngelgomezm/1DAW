/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProdcutosLibrosMusica;

/**
 *
 * @author joseangel
 */
public final class Pantalon extends Ropa {

    private String talla;

    public Pantalon(String talla, String marca, int codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Pantalon{");
        sb.append("talla=").append(talla);
        sb.append('}');
        return sb.toString();
    }

}
