/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03personaempleadoprogramador;

/**
 *
 * @author Jose Angel
 */
public class Empleado extends Persona {

    private double salario;

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public Empleado() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append(super.toString());
        sb.append("salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

    // metodo que aumenta el salario con la cantidad que se pasa por parametro
    public void aumentarSalario(double cantidad) {
        this.salario += cantidad;
    }
}
