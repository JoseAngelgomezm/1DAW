/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casa;

/**
 *
 * @author joseangel
 */
public class Persiana {
    private boolean estaAbierta;

    // constructor que por defecto crea la persiana cerrada
    public Persiana() {
        this.estaAbierta = false;
    }
    
    public void subir(){
        this.estaAbierta = true;
    }
    
    public void bajar(){
        this.estaAbierta = false;
    }

    public boolean isEstaAbierta() {
        return estaAbierta;
    }
    
    // el set en estos casos, deberia de ser quitado
    // ya que con abrir y cerrar se abre y cierra la persiana
    //    public void setEstaAbierta(boolean estaAbierta) {
    //        this.estaAbierta = estaAbierta;
    //    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persiana{");
        sb.append("estaAbierta=").append(estaAbierta);
        sb.append('}');
        return sb.toString();
    }
    
    
}
