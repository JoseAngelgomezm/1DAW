/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Arrays;

/**
 *
 * @author Jose Angel
 */
public class Teatro {

    private String asientos[][] = new String[4][7];

    public Teatro() {
        // crear los asientos por numeros
        for (int i = 0; i < this.asientos.length; i++) {
            for (int j = 0; j < this.asientos[i].length; j++) {
                // si la columna es par
                if (i % 2 == 0) {
                    // ocuparla entera
                    this.asientos[i][j] = "X";

                } else {
                    // sino dejarla libre
                    this.asientos[i][j] = "L";
                }

                // ocupar todos los asientos pares
                if (j % 2 == 0) {
                    this.asientos[i][j] = "X";
                }
            }
        }
    }

    public void reservarAsiento(int fila, int columna) {
        if (this.asientos[fila][columna].equals("X")) {
            System.out.println("El asiento esta bloqueado");
        } else if (this.asientos[fila][columna].equals("L")) {
            this.asientos[fila][columna] = "R";
        } else if (this.asientos[fila][columna].equals("R")) {
            System.out.println("El asiento esta reservado");
        }
    }

    public void cancelarReserva(int fila, int columna) {
        if (this.asientos[fila][columna].equals("X")) {
            System.out.println("El asiento esta bloqueado");
        } else if (this.asientos[fila][columna].equals("R")) {
            this.asientos[fila][columna] = "L";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teatro{");
        sb.append("asientos=").append(asientos);
        sb.append('}');
        return sb.toString();
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Arrays.deepHashCode(this.asientos);
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
        final Teatro other = (Teatro) obj;
        return Arrays.deepEquals(this.asientos, other.asientos);
    }

}
