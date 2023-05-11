/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author joseangel
 */
public class Medico extends Empleado {

    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double Salario, NIF nifPersona, String nombre, String apellidos) {
        super(numeroSeguridadSocial, Salario, nifPersona, nombre, apellidos);
        this.especialidad = especialidad;
    }
    
    public void tratar(Paciente paciente, String medicina){
        System.out.println("El medico " + this.getNombre() + " ha tradado a " +
                paciente.getNombre() + " con la medicina " + medicina);
    }
    
    @Override
    public double calcularIRPF() {
        final double PORCENTAJE_SALARIO_CIRUGIA = 0.25;
        final double PORCENTAJE_SALARIO = 0.235;
        if (this.especialidad.equalsIgnoreCase("cirugia")) {
            return this.getSalario() * PORCENTAJE_SALARIO_CIRUGIA;
        } else {
            return this.getSalario() * PORCENTAJE_SALARIO;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medico{");
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
