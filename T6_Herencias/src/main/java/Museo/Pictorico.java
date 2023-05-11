/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author Jose Angel
 */
public class Pictorico extends Conservadores{

    public Pictorico(int idConservador, String nif, String nombre) {
        super(idConservador, nif, nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Pictorico{");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void restaurarObra(Obra obraRestaurar) {
        System.out.println("El pictorico " + this.getNombre() + " Ha restaurado la pintura " + obraRestaurar);
    }
    
    
}
