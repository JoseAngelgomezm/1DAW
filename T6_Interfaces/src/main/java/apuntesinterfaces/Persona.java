/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesinterfaces;

/**
 *
 * @author joseangel
 */

// una clase abstracta no esta obligada a implementar los metodos abstractos
// de la interfaz identificable, ya que se implementa en las hijas de la clase
// persona , pero si se identifica que el comportamiento de la interfaz
// identificable es el mismo en todas las clases hijas de persona, se puede
// implementar aqui, en la clase padre para que todas las hijas hereden 
// ese comportamiento
public abstract class Persona implements Identificable{
    private String nombre;
    private String apellidos;
    private String nif;
    private Direccion direccion;

    public Persona(String nombre, String apellidos, String nif, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = direccion;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", nif=").append(nif);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
