/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casa;

/**
 *
 * @author joseangel
 */
public abstract class Ventana {

    private boolean estaAbierta;

    public Ventana(boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }

    // abrir y cerrar la ventana abstractos
    public abstract void abrir();

    public abstract void cerrar();

    public boolean isEstaAbierta() {
        return estaAbierta;
    }
    
     
    public void setEstaAbierta(boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ventana{");
        sb.append("estaAbierta=").append(estaAbierta);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
