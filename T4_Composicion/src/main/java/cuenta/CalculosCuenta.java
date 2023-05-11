/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author joseangel
 */
public class CalculosCuenta {
    // metodo que aumenta el dinero de la cuenta segun el interes
    public static void ingresarIntereses(Cuenta cuenta){
        // determinar el nuevo saldo
        // poner al saldo actual el valor del nuevo saldo
        cuenta.setSaldoActual(cuenta.getSaldoActual() + 
                cuenta.getSaldoActual() * cuenta.getInteres());
    }
    
    // metdodo para ingresar dinero
    public static void ingresarSaldo (Cuenta cuenta, double cantidad){
        // Pasarla a valor positivo por si acaso
        cantidad = Math.abs(cantidad);
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        
    }
    
    // metodo para sacar dinero
    public static boolean retirarSaldo (Cuenta cuenta, double cantidad){
        // si el saldo actual - la cantidad que vamos a sacar es menor que 0
        // no se podra sacar el dinero
        if (cuenta.getSaldoActual() - cantidad < 0){
            // devolver false para saber que no se ha realizado la operacion
            return false;
        }
        else{
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        }
        // devolver true para saber que se ha realizado la operacion
        return true;
    }
}
