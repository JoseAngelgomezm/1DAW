/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casa;

/**
 *
 * @author joseangel
 */
public class Abatible extends Ventana {

    public Abatible(boolean estaAbierta) {
        super(estaAbierta) ;
    }
    
    
    
    @Override
    public void abrir() {
        super.setEstaAbierta(true);
        System.out.println("Abierta abatible");
    }
    
    @Override
    public void cerrar() {
        super.setEstaAbierta(false);
        System.out.println("Cerrada abatible");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Abatible{");
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
