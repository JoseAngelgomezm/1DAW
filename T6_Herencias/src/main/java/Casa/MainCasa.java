/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class MainCasa {

    public static void main(String[] args) {
        // crear la puerta
        Puerta puertaCasa1 = new Puerta();


        // crear la lista de ventanas y añadir las ventanas y las persianas
        // (las que lleven persianas)
        List ventanasCasa1 = new ArrayList();
        ventanasCasa1.add(new Corredera(new Persiana(), true));
        ventanasCasa1.add(new Abatible(false));

        // crear la lista de calefactores y añadir los calefactores
        List calefactoresCasa1 = new ArrayList();
        calefactoresCasa1.add(new Calefactor());
        calefactoresCasa1.add(new Calefactor());
        calefactoresCasa1.add(new Calefactor());
        
        // crear la casa
        Casa casa1 = new Casa(puertaCasa1, ventanasCasa1, 
                calefactoresCasa1);
        
        System.out.println(casa1);
    }
}
