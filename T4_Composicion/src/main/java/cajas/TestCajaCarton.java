/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajas;

/**
 *
 * @author joseangel
 */
public class TestCajaCarton {
    // EJERCICIO 8
    public static void main(String[] args) {
        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);
        CajaCarton cajaChica = new CajaCarton(25, 30, 15, 17);
        
        // Mostrar resultados con getter
        String resutlados ="""
                           CAJA CHICA:
                           ANCHO:   %.2f
                           ALTO:    %.2f
                           LARGO:   %.2f
                           PESO:    %.2f
                           ------------
                           CAJA GRANDE:
                           ANCHO:   %.2f
                           ALTO:    %.2f
                           LARGO:   %.2f
                           PESO:    %.2f
                           """.formatted(cajaChica.getAncho(),
                                   cajaChica.getAlto(),
                                   cajaChica.getLargo(),
                                   cajaChica.getPeso(),
                                   cajaGrande.getAncho(),
                                   cajaGrande.getAlto(),
                                   cajaGrande.getLargo(),
                                   cajaGrande.getPeso());
        
        System.out.println(resutlados);
        
        // Mostrar resultados con to string (EJ 9)
        String datosCajaChica = cajaChica.toString();
        System.out.println(datosCajaChica);
        
        String datosCajaGrande = cajaGrande.toString();
        System.out.println(datosCajaGrande);
        
        // EJERCICIO 10 : ¿Qué pasa si objeto se declara pero no se instancia?
        // Da un error nullpointer exception porque no tiene reservado espacio
        // en memoria y no apunta a ningun sitio
    }

}
