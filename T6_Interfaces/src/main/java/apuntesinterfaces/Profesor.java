/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesinterfaces;

import java.util.Objects;

/**
 *
 * @author joseangel
 */
public abstract class Profesor extends Persona {

    private String especializacion;

    public Profesor(String especializacion, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.especializacion = especializacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor{");
        sb.append("especializacion=").append(especializacion);
        sb.append('}');
        return sb.toString();
    }

    // este metodo se implementa en la clase abstracta profesor
    // ya que en todas las clases hijas tendra el mismo comportamiento,
    // los titulares e interinos al ejecutar identificate imprimiran que son
    // profesores, por lo tanto, sera un metodo final, para que las hijas
    // no puedan sobreescribirlo
    @Override
    public final void identificate() {
        System.out.println("Profesor");
    }
    
    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

}
