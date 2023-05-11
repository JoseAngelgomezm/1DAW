/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15legislador;

/**
 *
 * @author joseangel
 */
public class Diputado extends Legislador{
    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diputado{");
        sb.append("numeroAsiento=").append(numeroAsiento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Soy Diputado";
    }
    
    
}
