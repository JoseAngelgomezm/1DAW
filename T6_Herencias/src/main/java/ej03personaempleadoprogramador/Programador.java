/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03personaempleadoprogramador;

/**
 *
 * @author Jose Angel
 */
public class Programador extends Empleado {

    private Especializacion Categoria;

    public Programador(Especializacion Categoria, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.Categoria = Categoria;
    }

    public Programador() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Programador{");
        sb.append(super.toString());
        sb.append("Categoria=").append(Categoria);
        sb.append('}');
        return sb.toString();
    }

    public Especializacion getCategoria() {
        return Categoria;
    }

    public void setCategoria(Especializacion Categoria) {
        this.Categoria = Categoria;
    }

}
