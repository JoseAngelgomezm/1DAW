/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Jose Angel
 */
public class Trabajador {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private LocalDate fechaMaxima = LocalDate.now().minusYears(16); // fecha en la que alguien ya no                         
    private CategoriaEmpleado CategoriaEmpleado;
    
    
    // constructor parametrizado
    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado CategoriaEmpleado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        // sacamos el año de la fecha de nacimiento, si al sumarle 16 años
        // es mayor que el año actual, es que no tiene los 16 años
        if (fechaNacimiento.isAfter(fechaMaxima) ) {
           
            throw new IllegalArgumentException("no puede tener menos de 16 años");
        }else{
            // si los tiene
            this.fechaNacimiento = fechaNacimiento;
        }
        this.CategoriaEmpleado = CategoriaEmpleado;
    }
    
    // constructor copia
    public Trabajador(Trabajador trabajadorCopiar) {
         this.nombre = trabajadorCopiar.getNombre();
        this.apellidos = trabajadorCopiar.getApellidos();
        // sacamos el año de la fecha de nacimiento, si al sumarle 16 años
        // es mayor que el año actual, es que no tiene los 16 años
        if (trabajadorCopiar.fechaNacimiento.isAfter(trabajadorCopiar.fechaMaxima) ) {
            
            throw new IllegalArgumentException("No puede tener menos de 16 años");
        }else{
            // si los tiene
            this.fechaNacimiento = trabajadorCopiar.getFechaNacimiento();
        }
        this.CategoriaEmpleado = trabajadorCopiar.getCategoriaEmpleado();
    }
    
    // meotodo que calcula el sueldo
    public double calcularSueldo(){
        double sueldoBaseComun = 1707;
        
        double sueldoTotal = this.CategoriaEmpleado.getComplementoEuros() + sueldoBaseComun;
        
        return sueldoTotal;
    }
    
    // metodo que devuelve la fecha de jubilacion
    public LocalDate fechaJubilacion(Trabajador trabajador){
        LocalDate fecha = this.fechaNacimiento.plusYears(66);
        
        return fecha;
    }
    
    // ToString Modificado
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(apellidos);
        sb.append(", ");
        sb.append(nombre);
        sb.append("     F.nac: ").append(fechaNacimiento + "\n");
        sb.append("Categoria: ").append(CategoriaEmpleado + "\n");
        sb.append("Fecha Jubilacion : ").append(fechaJubilacion(this).getDayOfWeek()).append(" ").append(fechaJubilacion(this).getDayOfMonth()).append(" de ").append(fechaJubilacion(this).getMonth()).append(" de ").append(fechaJubilacion(this).getYear() + "\n");
        sb.append("Sueldo Actual: " + calcularSueldo() + "\n");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellidos);
        hash = 79 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 79 * hash + Objects.hashCode(this.CategoriaEmpleado);
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
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return this.CategoriaEmpleado == other.CategoriaEmpleado;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaMaxima() {
        return fechaMaxima;
    }

    public void setFechaMaxima(LocalDate fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }

    public CategoriaEmpleado getCategoriaEmpleado() {
        return CategoriaEmpleado;
    }

    public void setCategoriaEmpleado(CategoriaEmpleado CategoriaEmpleado) {
        this.CategoriaEmpleado = CategoriaEmpleado;
    }
    
    
    
    
    
    
    
}
