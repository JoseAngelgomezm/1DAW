/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetesVico;

/**
 *
 * @author jfervic933@maralboran.es
 */

public class BSwitchEnum {
    
    // Los Enum son clases espciales que permiten crear objetos sólo en 
    // el rango que se indique. En este caso, hay tres objetos que son
    // MAÑANA, TARDE Y NOCHE. Esto permite limitar la creación de objetos con
    // otros valores no deseados (p.ej. MEDIODIA)
    enum PartesDia {
        MAÑANA, TARDE, NOCHE;
    }
    
    
    public static void main(String[] args) {
        // Se crea un objeto llamado 'mañana' de tipo PartesDia con el valor
        // MAÑANA
        PartesDia mañana = PartesDia.MAÑANA;
        
        // También se permiten tipos de datos Enum
        // En este ejemplo no hay claúsula default
        switch (mañana){
            case MAÑANA:
                System.out.println("A trabajar/estudiar....");
                break;
            case TARDE:
                System.out.println("A hacer deporte");
                break;
            case NOCHE:
                System.out.println("A dormir...");
                break;
        }
    }
}
