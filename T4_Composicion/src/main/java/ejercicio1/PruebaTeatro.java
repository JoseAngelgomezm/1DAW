/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Jose Angel
 */
public class PruebaTeatro {

    public static void main(String[] args) {

        Teatro teatro1 = new Teatro();
        
        teatro1.reservarAsiento(1, 1);
        teatro1.reservarAsiento(1, 0);
        teatro1.reservarAsiento(1, 1);
        teatro1.cancelarReserva(1, 1);
        teatro1.reservarAsiento(1, 2);
        // imprimir el teatro
        for (int i = 0; i < teatro1.getAsientos().length; i++) {

            for (int j = 0; j < teatro1.getAsientos()[i].length; j++) {
                System.out.printf(teatro1.getAsientos()[i][j] + " ");

            }
            System.out.println("");
        }
    }

}
