/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProdcutosLibrosMusica;

/**
 *
 * @author joseangel
 */
public final class LibroPapel extends Libro implements SeEnvia {

    private int numPaginas;

    public LibroPapel(int numPaginas, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("LibroPapel{");
        sb.append("numPaginas=").append(numPaginas);
        sb.append('}');
        return sb.toString();
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void enviar(String direccion) {
        System.out.println(this.toString() + " se envia a " + direccion);
    }

    @Override
    public void eliminarPagina(int numeroPagina) {
        System.out.println("Se ha arrancado la pagina " + numeroPagina + " del libro");
    }

}
