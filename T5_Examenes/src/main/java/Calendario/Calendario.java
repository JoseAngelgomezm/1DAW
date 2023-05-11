/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calendario;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Calendario {

    private int[][] matrizEnteros;
    private Month mes;
    private int año;
    private LocalDate fecha;

    // constructor parametrizado
    public Calendario(Month mes, int año) {
        final int DIAUNO = 1;
        this.matrizEnteros = new int[6][7];
        this.mes = mes;
        this.año = año;
        this.fecha = LocalDate.of(año, mes, DIAUNO);

        // quedarnos con el dia del mes
        int diaDelMes = fecha.getDayOfMonth();
        // saber el nombre del dia del mes que empieza
        DayOfWeek diaQueEmpieza = fecha.getDayOfWeek();
        // contador para ir sumando casilla en la que empieza
        int contadorParaEmpezar;
        // segun el numero de dia empieza en una casilla
        switch (diaQueEmpieza) {
            case MONDAY ->
                contadorParaEmpezar = 0;
            case TUESDAY ->
                contadorParaEmpezar = 1;
            case WEDNESDAY ->
                contadorParaEmpezar = 2;
            case THURSDAY ->
                contadorParaEmpezar = 3;
            case FRIDAY ->
                contadorParaEmpezar = 4;
            case SATURDAY ->
                contadorParaEmpezar = 5;
            case SUNDAY ->
                contadorParaEmpezar = 6;
            default ->
                throw new AssertionError();
        }
        // rellenar la matriz

        // empezar a rellenar la columna 0
        for (int i = contadorParaEmpezar; i < matrizEnteros[0].length; i++) {
            matrizEnteros[0][i] = diaDelMes;
            diaDelMes++;

        }
        
        // rellenar el resto de semanas empezando por la semana 1
        for (int i = 1; i < this.matrizEnteros.length; i++) {

            for (int j = 0; j < this.matrizEnteros[i].length; j++) {
                // rellenar los dias del mes que quedan
                if (diaDelMes <= fecha.lengthOfMonth()) {
                    matrizEnteros[i][j] = diaDelMes;
                    diaDelMes++;
                }

            }
        }
    }
    
    public String  diaSemana (int diaMesSaberDiaSemana, Calendario calendario){
        
        String diaSemana = "";
        
        if (diaMesSaberDiaSemana <= 0 || diaMesSaberDiaSemana >= 32) {
            diaSemana = "El dia no es valido";
        }else{
           LocalDate fecha = LocalDate.of(calendario.getAño(), calendario.getMes(), diaMesSaberDiaSemana);
           diaSemana = fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
           
        }
        
        return diaSemana;
    }
    
    
    // metodo que recibe un año y devuelve un array con el calendario anual
    // de ese año
    public static Calendario[] calendarioAnual(int año){
        Calendario[] calendarioAnual = new Calendario[12];
        
        for (int i = 0; i < 12; i++) {
            
            calendarioAnual[i] = new Calendario(Month.JANUARY.plus(i), año);
        }
        
        return calendarioAnual;
    } 
    

    public Calendario() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Arrays.deepHashCode(this.matrizEnteros);
        hash = 23 * hash + Objects.hashCode(this.mes);
        hash = 23 * hash + this.año;
        hash = 23 * hash + Objects.hashCode(this.fecha);
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
        final Calendario other = (Calendario) obj;
        if (this.año != other.año) {
            return false;
        }
        if (!Arrays.deepEquals(this.matrizEnteros, other.matrizEnteros)) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("L\tM\tX\tJ\tV\tS\tD");
        sb.append("\n");
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {
                if (matrizEnteros[i][j] == 0) {
                    sb.append("\t");
                } else {
                    sb.append(matrizEnteros[i][j]).append("\t");
                }

            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public int[][] getMatrizEnteros() {
        return matrizEnteros;
    }

    public void setMatrizEnteros(int[][] matrizEnteros) {
        this.matrizEnteros = matrizEnteros;
    }

    public Month getMes() {
        return mes;
    }

    public void setMes(Month mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public LocalDate getDiaMes() {
        return fecha;
    }

    public void setDiaMes(LocalDate diaMes) {
        this.fecha = diaMes;
    }

}
