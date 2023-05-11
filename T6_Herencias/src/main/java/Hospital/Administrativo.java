/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author joseangel
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double Salario, NIF nifPersona, String nombre, String apellidos) {
        super(numeroSeguridadSocial, Salario, nifPersona, nombre, apellidos);
        this.grupo = grupo;
    }
    
    public void registrarDocumento(String nombreDoc){
        System.out.println(this.getNombre() + " " + this.getApellidos() + 
                " registra el documento " + nombreDoc + 
                " " + nombreDoc.hashCode());
    }

    @Override
    public double calcularIRPF() {

        switch (grupo) {
            case C -> {
                return this.getSalario() * Grupo.C.getIrpf() / 100;
            }
            case D -> {
                return this.getSalario() * Grupo.D.getIrpf() / 100;
            }
            case E -> {
                return this.getSalario() * Grupo.E.getIrpf() / 100;
            }
            default ->
                throw new AssertionError();
        }
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Administrativo{");
        sb.append("grupo=").append(grupo);
        sb.append('}');
        return sb.toString();
    }

}
