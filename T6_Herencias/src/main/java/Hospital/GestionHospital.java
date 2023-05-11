/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author joseangel
 */
public class GestionHospital {

    public static void main(String[] args) {
        Set<Persona> listaPacientes = new HashSet<>();
        Set<Empleado> listaEmpleados = new HashSet<>();
        
        Hospital h1 = new Hospital("Hospital 1", 
                "Calle naranjo", 
                266, 
                listaPacientes,
                listaEmpleados);
        
        h1.getListaEmpleados().add(crearMedico());
        h1.getListaEmpleados().add(crearMedico());
        
        h1.getListaEmpleados().add(crearPersonalPAS());
        h1.getListaEmpleados().add(crearPersonalPAS());
        h1.getListaEmpleados().add(crearPersonalPAS());
        
        h1.getListaPacientes().add(crearPaciente());
        h1.getListaPacientes().add(crearPaciente());
        h1.getListaPacientes().add(crearPaciente());
        h1.getListaPacientes().add(crearPaciente());
        h1.getListaPacientes().add(crearPaciente());
        
        System.out.println("Empleados: ");
        for (Empleado e : h1.getListaEmpleados()) {
            System.out.println(e);
        }
        
        System.out.println("");
        System.out.println("Pacientes: ");
        for (Persona p : h1.getListaPacientes()) {
            System.out.println(p);
        }
        
        System.out.println("");
        System.out.println("Tratamientos: ");
        Paciente p1 = crearPaciente();
        for (Empleado e : listaEmpleados) {
            if (e instanceof Medico) {
                ((Medico) e).tratar(p1, "Paracetamol :)");
            }
        }
        
        System.out.println("");
        System.out.println("Calculo de IRPF por empleado: ");
        for (Empleado e : listaEmpleados) {
            System.out.println(e.calcularIRPF());
        }
        
        System.out.println("");
        System.out.println("Renovacion DNI desde 2026 a 2036: ");
        LocalDate fecha = LocalDate.of(2026, Month.MARCH, 1);
        p1.renovarNIF(fecha);
        System.out.println(p1.getNifPersona().getFechaCaducidad());
         
    }

    public static Paciente crearPaciente() {
        Random generador = new Random();
        int selectorNombre = generador.nextInt(1, 6);
        int selectorApellido = generador.nextInt(1, 6);
        String nombre;
        String apellido;

        // seleccionar el nombre del paciente
        switch (selectorNombre) {
            case 1 -> {
                nombre = "Juan";
            }
            case 2 -> {
                nombre = "Pepe";
            }
            case 3 -> {
                nombre = "Jose";
            }
            case 4 -> {
                nombre = "Luis";
            }
            case 5 -> {
                nombre = "Fernando";
            }

            default ->
                throw new AssertionError();
        }

        // seleccionar el apellido del paciente
        switch (selectorApellido) {
            case 1 -> {
                apellido = "Sanchez";
            }
            case 2 -> {
                apellido = "Martinez";
            }
            case 3 -> {
                apellido = "Gomez";
            }
            case 4 -> {
                apellido = "Sierra";
            }
            case 5 -> {
                apellido = "Jimenez";
            }

            default ->
                throw new AssertionError();
        }

        // crear el paciente
        Paciente p1 = new Paciente(
                RandomStringUtils.randomNumeric(10),
                new NIF(generador.nextLong(10000000, 99999999), LocalDate.now()),
                nombre,
                apellido);

        return p1;
    }

    public static Medico crearMedico() {
        Random generador = new Random();
        int selectorNombre = generador.nextInt(1, 6);
        int selectorApellido = generador.nextInt(1, 6);
        int selectorEspecialidad = generador.nextInt(1, 6);
        String nombre;
        String apellido;
        String especialidad;

        // seleccionar el nombre del medico
        switch (selectorNombre) {
            case 1 -> {
                nombre = "Ramirez";
            }
            case 2 -> {
                nombre = "Santos";
            }
            case 3 -> {
                nombre = "Joaquin";
            }
            case 4 -> {
                nombre = "German";
            }
            case 5 -> {
                nombre = "Raul";
            }

            default ->
                throw new AssertionError();
        }

        // seleccionar el apellido del medico
        switch (selectorApellido) {
            case 1 -> {
                apellido = "Rodriguez";
            }
            case 2 -> {
                apellido = "Gonzalez";
            }
            case 3 -> {
                apellido = "Garcia";
            }
            case 4 -> {
                apellido = "Nuñez";
            }
            case 5 -> {
                apellido = "Lobaton";
            }

            default ->
                throw new AssertionError();
        }

        // seleccionar el nombre del medico
        switch (selectorEspecialidad) {
            case 1 -> {
                especialidad = "Cirugia";
            }
            case 2 -> {
                especialidad = "Pediatria";
            }
            case 3 -> {
                especialidad = "Cardiologia";
            }
            case 4 -> {
                especialidad = "Neurologia";
            }
            case 5 -> {
                especialidad = "Hematologia";
            }

            default ->
                throw new AssertionError();
        }

        // crear el medico
        Medico m1 = new Medico(
                especialidad,
                RandomStringUtils.randomNumeric(15),
                generador.nextDouble(1200, 1500),
                new NIF(generador.nextLong(10000000, 99999999), LocalDate.now()),
                nombre, apellido);

        return m1;
    }

    public static Administrativo crearPersonalPAS() {
        Random generador = new Random();
        int selectorNombre = generador.nextInt(1, 6);
        int selectorApellido = generador.nextInt(1, 6);
        int selectorGrupo = generador.nextInt(1, 4);
        String nombre;
        String apellido;
        Grupo grupo;

        // seleccionar el nombre del paciente
        switch (selectorNombre) {
            case 1 -> {
                nombre = "Juan";
            }
            case 2 -> {
                nombre = "Pepe";
            }
            case 3 -> {
                nombre = "Jose";
            }
            case 4 -> {
                nombre = "Luis";
            }
            case 5 -> {
                nombre = "Fernando";
            }

            default ->
                throw new AssertionError();
        }

        // seleccionar el apellido del paciente
        switch (selectorApellido) {
            case 1 -> {
                apellido = "Sanchez";
            }
            case 2 -> {
                apellido = "Martinez";
            }
            case 3 -> {
                apellido = "Gomez";
            }
            case 4 -> {
                apellido = "Sierra";
            }
            case 5 -> {
                apellido = "Jimenez";
            }

            default ->
                throw new AssertionError();
        }

        // seleccionar el grupo
        switch (selectorGrupo) {
            case 1 -> {
                grupo = Grupo.C;
            }
            case 2 -> {
                grupo = Grupo.D;
            }
            case 3 -> {
                grupo = Grupo.E;
            }

            default ->
                throw new AssertionError();
        }
        // crear el paciente
        Administrativo a1 = new Administrativo(grupo,
                RandomStringUtils.randomNumeric(15),
                generador.nextDouble(1200, 1500),
                new NIF(generador.nextLong(10000000, 99999999), LocalDate.now()),
                nombre, apellido);

        return a1;
    }
}
