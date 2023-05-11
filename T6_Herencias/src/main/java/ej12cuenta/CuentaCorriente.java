/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12cuenta;

/**
 *
 * @author Jose Angel
 */
public class CuentaCorriente extends Cuenta {

    private final double interes;
    private double saldoMin;

    public CuentaCorriente(Cliente persona, double saldoMin) {
        super(persona);
        this.interes = 1.5;
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("CuentaCorriente{");
        sb.append("interes=").append(interes);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void actualizarSaldo() {
        if (getSaldo() > 1000) {
            setSaldo(super.getSaldo() + (this.saldoMin * this.interes));
        } else {
            setSaldo(super.getSaldo() + (super.getSaldo() + this.interes));
        }

    }

    @Override
    public void retirar(double saldoARetirar) {
        // si el saldo se puede retirar
        if ((super.getSaldo() - saldoARetirar) > this.saldoMin) {
            setSaldo(super.getSaldo() - saldoARetirar);
        } else {
            System.out.println("No se puede retirar la cantidad indicada");
        }
    }

    public double getInteres() {
        return interes;
    }

}
