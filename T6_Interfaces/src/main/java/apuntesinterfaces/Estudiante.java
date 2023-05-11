/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntesinterfaces;

/**
 *
 * @author joseangel
 */
public class Estudiante extends Persona {

    private int idEstudiante;

    public Estudiante(int idEstudiante, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("idEstudiante=").append(idEstudiante);
        sb.append('}');
        return sb.toString();
    }

    // metodo de la interfaz Identificable, que posee la clase persona
    // al ser estudiante una clase hija de persona, hay que sobreescribirlo
    @Override
    public void identificate() {
        System.out.println("Estudiante");
    }
    
    public void estudiarPoco(){
        System.out.println("estudio pero poco");
    }

}
