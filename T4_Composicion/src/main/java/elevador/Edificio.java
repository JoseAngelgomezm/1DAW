/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

import java.time.LocalDate;

/**
 *
 * @author joseangel
 */
public class Edificio {

    public static void main(String[] args) {
        // crear elevador 1 con datos correctos
        Elevador elevador1 = new Elevador("Elevadores Pepe", 7, 508);
        System.out.println(elevador1);
        // crear elevador2 con datos incorrectos
        Elevador elevador2 = new Elevador ("Elevadores Miguel", 11, 900);
        System.out.println(elevador2);
        
        // pruebas de elevador 
        System.out.println("PRUEBAS DE VIAJE");
        System.out.println("VIAJES NO VALIDOS");
        // 2 parametros mal
        elevador1.viajar(11, 890, 0);
        // peso total mal
        elevador1.viajar(5, 890, 0);
        // numero viajeros mal
        elevador1.viajar(11, 700, 0);
        // planta igual
        elevador1.viajar(7, 670, 0);
        System.out.println("VIAJES VALIDOS");
        //planta de destino mayor
        elevador1.viajar(3, 420, 3);
        System.out.println(elevador1);
        //planta de destino menor
        elevador1.viajar(3, 120, 1);
        System.out.println(elevador1);
        // fecha proxima revision
        LocalDate proximaRevision = proximaRevision(elevador1);
        System.out.println(proximaRevision);
    }
    
    //metodo que devuelve la fecha de la siguiente revision
    private static LocalDate proximaRevision (Elevador elevador1){
        // asginamos la fecha de la ultima revision del elevador1 a un
        // objeto tipo localdate
        LocalDate fechaAscensor = elevador1.getFechaUltimaRevision();
        // añadimos 6 meses a la fecha
        LocalDate fechaProximaRevision = fechaAscensor.plusMonths(6);
        // devolvemos la fecha con los 6 meses añadidos
        return fechaProximaRevision;
    }

}
