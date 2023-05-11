/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casa;

/**
 *
 * @author joseangel
 */
public class Calefactor {
    private int temperatura;
    private boolean estaEncendido;

    // constructor que por defecto crea el calefactor apagado
    // y a temperatura 0
    public Calefactor() {
        this.temperatura = 0;
        this.estaEncendido = false;
    }
    
    public void encender(){
        this.estaEncendido = true;
    }
    
    public void apagar(){
        this.estaEncendido = false;
    }
    
    public void fijarTemperatura(int temperaturaPoner){
        this.temperatura = temperaturaPoner;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }
    
    // el set en estos casos, deberia de ser quitado
    // ya que con encender y apagar no lo necesitamos
//    public void setEstaEncendido(boolean estaEncendido) {
//        this.estaEncendido = estaEncendido;
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calefactor{");
        sb.append("temperatura=").append(temperatura);
        sb.append(", estaEncendido=").append(estaEncendido);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
