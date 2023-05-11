/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author joseangel
 */
public final class Vigilante extends Empleado {

    public Vigilante(String nif, String nombre) {
        super(nif, nombre);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Vigilante{");
        sb.append('}');
        return sb.toString();
    }

}
