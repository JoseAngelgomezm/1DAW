/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package animal;

/**
 *
 * @author joseangel
 */
public enum estadoAnimal {
    // objetos que vamos a crear en el enum
    COMIENDO("comiendo"),DURMIENDO("durmiendo"),
    DESPIERTO("despierto"),JUGANDO("jugando");
    
    // atributos
    private String estado;
    
    // CONSTRUCTOR
    private estadoAnimal(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
