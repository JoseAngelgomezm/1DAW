/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Objects;

/**
 *
 * @author joseangel
 */
public abstract class Empleado extends Persona{

    private String numeroSeguridadSocial;
    private double Salario;

    public Empleado(String numeroSeguridadSocial, double Salario, NIF nifPersona, String nombre, String apellidos) {
        super(nifPersona, nombre, apellidos);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.Salario = Salario;
    }

    
    public abstract double calcularIRPF();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("numeroSeguridadSocial=").append(numeroSeguridadSocial);
        sb.append(", Salario=").append(Salario);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.numeroSeguridadSocial);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.numeroSeguridadSocial, other.numeroSeguridadSocial);
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
}
