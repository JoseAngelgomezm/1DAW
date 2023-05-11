/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03personaempleadoprogramador;

/**
 *
 * @author Jose Angel
 */
public class Jardinero extends Empleado{
    
    private int añosAntiguedad;

    public Jardinero(int añosAntiguedad, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.añosAntiguedad = añosAntiguedad;
    }

    public Jardinero() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jardinero{");
        sb.append(super.toString());
        sb.append("a\u00f1osAntiguedad=").append(añosAntiguedad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Persona p) {
        return super.compareTo(p); 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.añosAntiguedad;
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
        final Jardinero other = (Jardinero) obj;
        return this.añosAntiguedad == other.añosAntiguedad;
    }

    
   
    
    
    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }
    
    
}
