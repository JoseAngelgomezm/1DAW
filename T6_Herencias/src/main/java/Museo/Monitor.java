/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author joseangel
 */
public final class Monitor extends Empleado {

    public Monitor(String nif, String nombre) {
        super(nif, nombre);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Monitor");
        sb.append('}');
        return sb.toString();
    }

}
