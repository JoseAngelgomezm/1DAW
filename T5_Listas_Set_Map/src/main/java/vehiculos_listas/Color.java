/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vehiculos_listas;

import java.util.Random;

/**
 *
 * @author joseangel
 */
public enum Color {
    ROJO, NEGRO, AMARILLO, VERDE, AZUL, BLANCO;
    
    public static Color colorAleatorio(){
        var numeroAleatorio = new Random();
        Color [] colorAleatorio = Color.values();
        int posicionValida = numeroAleatorio.nextInt(0, colorAleatorio.length);
        return colorAleatorio[posicionValida];
    }
    
    
    
}
