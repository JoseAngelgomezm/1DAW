/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p52JoseAngelGomezMorillo;

import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Casilla {

    private final int fila;
    private final int columna;
    private final TipoCasilla tipoCasilla;

    public Casilla(int fila, int columna, TipoCasilla tipoCasilla) {
        this.fila = fila;
        this.columna = columna;
        this.tipoCasilla = tipoCasilla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.fila;
        hash = 83 * hash + this.columna;
        hash = 83 * hash + Objects.hashCode(this.tipoCasilla);
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
        final Casilla other = (Casilla) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return this.tipoCasilla == other.tipoCasilla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tipoCasilla);
        return sb.toString();
    }

    public TipoCasilla getTipoCasilla() {
        return tipoCasilla;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

}
