/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casa;

/**
 *
 * @author joseangel
 */
public class Puerta {
    private boolean estaAbierta;
    
    // constructor que por defecto crea la puerta cerrada
    public Puerta() {
        this.estaAbierta = false;
    }
    
    
    // metodo que abre la puerta
    public void abrirPuerta(){
        this.estaAbierta = true;
    }
    
    // metodo que cierra la puerta
    public void cerrarPuerta(){
        this.estaAbierta = false;
    }

    public boolean isEstaAbierta() {
        return estaAbierta;
    }

    public void setEstaAbierta(boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Puerta{");
        sb.append("estaAbierta=").append(estaAbierta);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
