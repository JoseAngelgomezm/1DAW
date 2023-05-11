/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11figura;

/**
 *
 * @author joseangel
 */
public class Triangulo extends Figura {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public String calcularArea() {
        return "del Triangulo = " + (getBase() * getAltura()) / 2 + "cm2" ;
    }

}
