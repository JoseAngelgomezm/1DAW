/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProdcutosLibrosMusica;

/**
 *
 * @author joseangel
 */
public class LibroDigital extends Libro implements SeDescarga {

    private double numKBytes;

    public LibroDigital(double numKBytes, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    public double getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(double numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("LibroDigital{");
        sb.append("numKBytes=").append(numKBytes);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descargar() {
        System.out.println("http://JoseAngelGomezMorillo.daw/" + this.hashCode());
    }

    @Override
    public void eliminarPagina(int numeroPagina) {
        System.out.println("Se ha eliminado la pagina " + numeroPagina + " de los servidores");
    }

}
