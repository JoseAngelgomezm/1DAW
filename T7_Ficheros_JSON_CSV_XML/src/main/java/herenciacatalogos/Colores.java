/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package herenciacatalogos;

import java.util.Random;

/**
 *
 * @author joseangel
 */
public enum Colores {
    ROJO, NEGRO, AMARILLO, VERDE, AZUL, BLANCO;
    
    public static Colores colorAleatorio(){
        var numeroAleatorio = new Random();
        Colores [] colorAleatorio = Colores.values();
        int posicionValida = numeroAleatorio.nextInt(0, colorAleatorio.length);
        return colorAleatorio[posicionValida];
    }
    
    
    
}
