/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author joseangel
 */
public class PruebaCuentas {
    public static void main(String[] args) {
        // crear una cuenta
        Cuenta cuenta1 = new Cuenta("76543219L", "Juanito golondrina",
                1200, 3);
        // mostrar los datos de la cuenta
        System.out.println("Datos iniciales " + cuenta1);
        // ingresar interes a cuenta
        CalculosCuenta.ingresarIntereses(cuenta1);
        // mostrar resultado para comprobar el aumento del saldo por interes
        System.out.println("Aumento del saldo por interes" + cuenta1);
        // retirar saldo de la cuenta mayor al que tiene disponible
        boolean resultadoOperacion = CalculosCuenta.retirarSaldo(cuenta1, 4801);
        if ( resultadoOperacion == true) {
            System.out.println("Operacion correcta");
        }
            else{
            System.out.println("error en la operacion, saldo insuficiente");
        }
        // mostrar los datos de la cuenta para comprobar que no se ha retirado nada
        System.out.println(cuenta1);
        // retirar cantidad igual a la disponible
        resultadoOperacion = CalculosCuenta.retirarSaldo(cuenta1, 4800);
         if ( resultadoOperacion == true) {
            System.out.println("Operacion correcta");
        }
            else{
            System.out.println("error en la operacion, saldo insuficiente");
        }
        // mostrar datos de la cuenta para ver que se ha quedado a 0
        System.out.println("Vaciar cuenta a 0 " + cuenta1);
        // aumentar saldo de la cuenta
        CalculosCuenta.ingresarSaldo(cuenta1, 1200);
        // mostrar datos para comprobar ingreso
        System.out.println("Ingreso en cuenta " + cuenta1);
    }
}
