/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package animal;

/**
 *
 * @author joseangel
 */
public enum tipoAnimal {
    GATO("gato"),PERRO("perro"),LARGARTO("lagarto"),
    COBAYA("cobaya"),PERIQUITO("periquito");
    
    // atributos
    String tipo;
    
    // Contructor
    private tipoAnimal (String tipo){
        this.tipo = tipo;
    }
    
    
}
