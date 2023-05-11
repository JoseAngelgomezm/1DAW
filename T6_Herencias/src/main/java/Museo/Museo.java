/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Museo {

    private String nombre;
    private String direccion;
    private List<Empleado> listaEmpleados;
    private List<Sala> listaSalas;

    public Museo(String nombre, String direccion, List<Empleado> listaEmpleados, List<Sala> listaSalas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaEmpleados = listaEmpleados;
        this.listaSalas = listaSalas;
    }

    public void contratar(Empleado empleadoAñadir) {
        if (!this.listaEmpleados.contains(empleadoAñadir)) {
            this.listaEmpleados.add(empleadoAñadir);
        } else {
            System.out.println("El empleado" + empleadoAñadir.getNif() + "YA existe en la lista");
        }
    }

    public void despedir(Empleado empleadoDespedir) {
        if (this.listaEmpleados.contains(empleadoDespedir)) {
            this.listaEmpleados.remove(empleadoDespedir);
            System.out.println("Se ha despedido ha " + empleadoDespedir.getNif());
        } else {
            System.out.println("El empleado " +  empleadoDespedir.getNif() + "NO existe en la lista");
        }

    }

    public void añadirSala(Sala salaAñadir) {
        if (!this.listaSalas.contains(salaAñadir)) {
            this.listaSalas.add(salaAñadir);
            System.out.println("Se ha añadido la sala " + salaAñadir.getIdSala());
        } else {
            System.out.println("La sala " + salaAñadir.getIdSala() + " Ya existe en la lista");
        }
    }

    public void quitarSala(Sala salaQuitar) {
        if (this.listaSalas.contains(salaQuitar)) {
            this.listaSalas.remove(salaQuitar);
        } else {
            System.out.println("La sala " + salaQuitar.getIdSala() + " NO existe en la lista");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", listaEmpleados=").append(listaEmpleados);
        sb.append(", listaSalas=").append(listaSalas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.direccion);
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
        final Museo other = (Museo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
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

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(List<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }

}
