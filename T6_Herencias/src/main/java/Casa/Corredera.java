/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casa;

/**
 *
 * @author joseangel
 */
public class Corredera extends Ventana{
    private Persiana persiana;

    public Corredera(Persiana persiana, boolean estaAbierta) {
        super(estaAbierta);
        this.persiana = persiana;
    }

    
    @Override
    public void abrir(){
        super.setEstaAbierta(true);
        System.out.println("Abierta corredera");
    }
    
    @Override
    public void cerrar(){
        super.setEstaAbierta(false);
        System.out.println("Cerrada corredera");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Corredera{");
        sb.append("persiana=").append(persiana);
        sb.append('}');
        return sb.toString();
    }

    
    

    
    
    
    
    
}
