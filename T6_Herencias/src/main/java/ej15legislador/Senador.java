/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15legislador;

/**
 *
 * @author joseangel
 */
public class Senador extends Legislador {

    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Senador{");
        sb.append("complemento=").append(complemento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Soy Senador";
    }

}
