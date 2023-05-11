/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author joseangel
 */
public class Cuenta {
    // Atributos: n1 cuenta 20 digitos, nif cliente, nombre cliente, saldo actual, interes %(0.1-3)
    // metodos: constructor defecto nº cuenta aleatorio, constructor parametrizado, 
    // nº cuenta aleatorio, getter  setter, no hay set para numero cuenta, tostring
    // clase calculos cuentas: metodos: ingresarIntereses (Cuenta cuenta). 
    // Aumenta el saldo = saldo + saldo * interes
    // ingresarDinero (Cuenta cuenta, double cantidad)
    // retirarEfectivo (Cuenta cuenta, double cantidad) hay que tener en cuenta que no se puede
    // retirar mas del saldo actual
    // clase main
    // creamos un par de objetos y probamos los metodos
    
    private final String numeroCuenta;
    private String nifCliente;
    private String nombreCliente;
    private double saldoActual;
    private double interes;
    
    
    // CONSTRUCTOR PARAMETRIZADO
    public Cuenta(String nifCliente, String nombreCliente, double saldoActual, double interes) {    
        this.numeroCuenta = generarNumeroCuenta();
        this.nifCliente = nifCliente;
        this.nombreCliente = nombreCliente;
        this.saldoActual = saldoActual;
        if (interes >= 0.1 && interes <= 3.0 ) {
                this.interes = interes;
            }
        else{
            this.interes = 0.1;
        }
    }

    // CONSTRUCTOR VACIO
    public Cuenta() {
        this.numeroCuenta = generarNumeroCuenta();
    }
    
    // METDODO TOSTRING

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", nifCliente=" + nifCliente + ", nombreCliente=" + nombreCliente + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
    
    // METODO QUE GENERA UN NUMERO DE CUENTA ALEATORIO
    private String generarNumeroCuenta(){
        String numeroCuenta = RandomStringUtils.randomNumeric(20);
        return numeroCuenta;
    }
    
    // GETTER Y SETTER

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
}
