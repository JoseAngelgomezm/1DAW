/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package hospital;

/**
 *
 * @author joseangel
 */
public enum Grupo {
    C(17.5),
    D(18),
    E(18.5);
    
    private final double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }
    
    
}
