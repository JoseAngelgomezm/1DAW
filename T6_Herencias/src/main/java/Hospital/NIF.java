/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joseangel
 */
public class NIF {

    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(long numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.letra = calcularLetra();
        this.fechaCaducidad = fechaCaducidad;
    }

    private char calcularLetra() {
        char letra;
        int modulo = (int) this.numero % 23;
        Map<Integer, Character> mapValores = new HashMap<>();
        mapValores.put(0, 'T');
        mapValores.put(1, 'R');
        mapValores.put(2, 'W');
        mapValores.put(3, 'A');
        mapValores.put(4, 'G');
        mapValores.put(5, 'M');
        mapValores.put(6, 'Y');
        mapValores.put(7, 'F');
        mapValores.put(8, 'P');
        mapValores.put(9, 'D');
        mapValores.put(10, 'X');
        mapValores.put(11, 'B');
        mapValores.put(12, 'N');
        mapValores.put(13, 'J');
        mapValores.put(14, 'Z');
        mapValores.put(15, 'S');
        mapValores.put(16, 'Q');
        mapValores.put(17, 'V');
        mapValores.put(18, 'H');
        mapValores.put(19, 'L');
        mapValores.put(20, 'C');
        mapValores.put(21, 'K');
        mapValores.put(22, 'E');

        letra = mapValores.get(modulo);

        return letra;
    }

    public final void renovar(LocalDate fechaSolicitudRenovacion) {
        setFechaCaducidad(fechaSolicitudRenovacion.plusYears(10));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF{");
        sb.append("numero=").append(numero);
        sb.append(", letra=").append(letra);
        sb.append(", fechaCaducidad=").append(fechaCaducidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.numero ^ (this.numero >>> 32));
        hash = 37 * hash + this.letra;
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
        final NIF other = (NIF) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

}
