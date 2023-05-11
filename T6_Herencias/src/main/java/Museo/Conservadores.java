/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author Jose Angel
 */
public abstract class Conservadores extends Empleado implements Restaurador{

    private int idConservador;

    public Conservadores(int idConservador, String nif, String nombre) {
        super(nif, nombre);
        this.idConservador = idConservador;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Conservadores{");
        sb.append("idConservador=").append(idConservador);
        sb.append('}');
        return sb.toString();
    }

    public int getIdConservador() {
        return idConservador;
    }

    public void setIdConservador(int idConservador) {
        this.idConservador = idConservador;
    }

}
