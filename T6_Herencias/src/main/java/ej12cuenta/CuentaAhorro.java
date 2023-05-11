/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12cuenta;

/**
 *
 * @author Jose Angel
 */
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual, Cliente persona) {
        super(persona);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("CuentaAhorro{");
        sb.append("interes=").append(interes);
        sb.append(", comisionAnual=").append(comisionAnual);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void actualizarSaldo() {
        setSaldo(super.getSaldo() + (super.getSaldo() * this.interes) - this.comisionAnual);
    }

    @Override
    public void retirar(double saldoARetirar) {
        // si el saldo que tenemos menos lo que vamos a retirar es menor que 1
        if ((super.getSaldo() - saldoARetirar) < 1) {
            System.out.println("Saldo no disponible");
        }else{
            setSaldo(super.getSaldo()-saldoARetirar);
        }
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

}
