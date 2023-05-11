/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12cuenta;

/**
 *
 * @author joseangel
 */
public class MainCuenta {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("pepe", "sanchez", "123455534L");
        
        Cuenta cuenta1 = new CuentaAhorro(3, 100, cliente1);
        Cuenta cuenta2 = new CuentaCorriente(cliente1, 200);
        
        cuenta1.setSaldo(1222);
        cuenta2.setSaldo(4319);
        
        System.out.println("Estado inicial de las cuentas:");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
        System.out.println("");
        
        System.out.println("Actulizar el saldo de las cuentas: ");
        cuenta1.actualizarSaldo();
        cuenta2.actualizarSaldo();
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
        System.out.println("");
        
        System.out.println("Intento de retirada no valido: ");
        cuenta1.retirar(5000);
        cuenta2.retirar(5000);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
        System.out.println("");
        
        System.out.println("Intento de retirada valido: -2000 ");
        cuenta1.retirar(2000);
        cuenta2.retirar(2000);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
        
        
        
        
    }
}
