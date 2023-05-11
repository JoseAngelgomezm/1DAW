/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Objects;
import java.util.Set;

/**
 *
 * @author joseangel
 */
public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamas;
    private Set<Persona> listaPacientes;
    private Set<Empleado> listaEmpleados;

    public Hospital(String nombre, String direccion, int numeroCamas, Set<Persona> listaPacientes, Set<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.listaPacientes = listaPacientes;
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hospital{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", numeroCamas=").append(numeroCamas);
        sb.append(", listaPacientes=").append(listaPacientes);
        sb.append(", listaEmpleados=").append(listaEmpleados);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.direccion);
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
        final Hospital other = (Hospital) obj;
        return Objects.equals(this.direccion, other.direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Set<Persona> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(Set<Persona> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public Set<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Set<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

}
