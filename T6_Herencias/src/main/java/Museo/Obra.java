/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author joseangel
 */
public abstract class Obra {

    private int idObra;
    private String autor;

    public Obra(int idObra, String autor) {
        this.idObra = idObra;
        this.autor = autor;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.idObra;
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
        final Obra other = (Obra) obj;
        return this.idObra == other.idObra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Obra{");
        sb.append("idObra=").append(idObra);
        sb.append(", autor=").append(autor);
        sb.append('}');
        return sb.toString();
    }

}
