/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProdcutosLibrosMusica;

import java.util.Objects;

/**
 *
 * @author joseangel
 */
public abstract class Libro extends Producto implements Comparable<Libro> {

    private String isbn;

    public Libro(String isbn, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public abstract void eliminarPagina(int numeroPagina);
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Libro{");
        sb.append("isbn=").append(isbn);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Libro o) {
        return this.getIsbn().compareToIgnoreCase(o.getIsbn());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.isbn);
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
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }
    
    
    
}
