/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package repasosetmaplistherencia;

import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Pasajeros{

   private String nombre;
   private String apellidos;
   private String NIF;
   private TipoPasajero tipoPasajero;

    public Pasajeros(String nombre, String apellidos, String NIF, TipoPasajero tipoPasajero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.tipoPasajero = tipoPasajero;
    }

    public Pasajeros() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.NIF);
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
        final Pasajeros other = (Pasajeros) obj;
        return Objects.equals(this.NIF, other.NIF);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pasajeros{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", NIF=").append(NIF);
        sb.append(", tipoPasajero=").append(tipoPasajero);
        sb.append('}');
        return sb.toString();
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

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public TipoPasajero getTipoPasajero() {
        return tipoPasajero;
    }

    public void setTipoPasajero(TipoPasajero tipoPasajero) {
        this.tipoPasajero = tipoPasajero;
    }
   
   
   
}
