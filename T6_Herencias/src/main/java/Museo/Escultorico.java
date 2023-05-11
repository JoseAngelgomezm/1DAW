/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author Jose Angel
 */
public class Escultorico extends Conservadores {

    public Escultorico(int idConservador, String nif, String nombre) {
        super(idConservador, nif, nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        super.toString();
        sb.append("Escultorico{");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void restaurarObra(Obra obraRestaurar) {
        System.out.println("El escultorico " + this.getNombre() + " Ha restaurado la escultura " + obraRestaurar);
    }

}
