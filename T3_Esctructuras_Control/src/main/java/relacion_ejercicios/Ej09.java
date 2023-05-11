/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_ejercicios;

/**
 *
 * @author Jose Angel
 */
public class Ej09 {
    public static void main(String[] args) {
        int variable = 3, variable2;
        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
            case 4:
                variable2 = 10;
            default:
                variable2 = 100;
                break;
        }
       
        // En este caso variable2 vale 100 porque al evaluar variable entra en 
        // el caso 3 y le da el valor 30 ya que variable = 3, 
        // pero al no haber break pasa al caso 4 y le da el valor de 10
        // y al no haber break nuevamente pasa a el caso default que finalmente
        // le da el valor de 100
    }
}
