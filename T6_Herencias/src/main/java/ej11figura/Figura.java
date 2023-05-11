/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11figura;

/**
 *
 * @author joseangel
 */
public abstract class Figura {

    private int base;
    private int altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura() {
    }

    public abstract String calcularArea();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.base;
        hash = 53 * hash + this.altura;
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
        final Figura other = (Figura) obj;
        if (this.base != other.base) {
            return false;
        }
        return this.altura == other.altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
