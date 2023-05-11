/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12cuenta;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author joseangel
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Cliente persona;

    public Cuenta(Cliente cliente) {
        this.persona = cliente;
        this.saldo = 0;
        this.numeroCuenta = obtenerNumeroCuenta();
    }
    
    // asignar numero de cuenta
    private String obtenerNumeroCuenta(){
        String numeroCuenta = "ES ";
        
        return numeroCuenta;
        
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double saldoARetirar);

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.numeroCuenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.numeroCuenta, other.numeroCuenta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", cliente=").append(persona);
        sb.append('}');
        return sb.toString();
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getPersona() {
        return persona;
    }

    public void setPersona(Cliente persona) {
        this.persona = persona;
    }

    
    
}
