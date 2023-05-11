/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author joseangel
 */
public class Fechas {
    public static void main(String[] args) {
        
        // Clase que guarda fechas
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Año: " + fechaHoy.getYear());
        System.out.println("Mes: " + fechaHoy.getMonthValue());
        
        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month: " + mesActual);
        
        // fechas concretas
        LocalDate fecha1 = LocalDate.of(1998, 9, 16);
        System.out.println(fecha1);
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 10);
        System.out.println(fecha2);
        
        // es igual fecha1 y fecha2
        if(fecha1.equals(fecha2)){
            System.out.println("Son iguales");
            
        }else{
            System.out.println("Son distintas");
        }
        
        // anterior y posterior
        if (fecha1.isBefore(fecha2)) {
            System.out.println("fecha1 anterior a fecha2");
        }
        
        if (fecha1.isAfter(fecha2)) {
            System.out.println("fecha1 posterior a fecha2");
        }
        
        // clase para guardar mes y dia
        MonthDay nocheVieja = MonthDay.of(12, 31);
        System.out.println(nocheVieja);
        // clase para guardar año y mes
        YearMonth añoMes = YearMonth.of(2027, 5);
        System.out.println(añoMes);
        
        // operacion con fechas
        // sumas
        LocalDate sumarDia = fechaHoy.plusDays(100);
        System.out.println(sumarDia);
        LocalDate sumarMes = fechaHoy.plusMonths(12);
        System.out.println(sumarMes);
        // restas
        LocalDate restarDia = fechaHoy.minusDays(100);
        System.out.println(restarDia);
        
        // Sumar 2 decadas
        fechaHoy.plus(2, ChronoUnit.DECADES);
        
        // diferencia de fechas
        long diferenciaDias = ChronoUnit.DAYS.between
                                (fecha1, fecha2);
        System.out.println(diferenciaDias);
        
        long diferenciaMes = ChronoUnit.MONTHS.between
                                (fecha1, fecha2);
        System.out.println(diferenciaMes);
        
        long diferenciaAños = ChronoUnit.YEARS.between
                                (fecha1, fecha2);
        System.out.println(diferenciaAños);
        
        // saber si es bisiesto
        boolean esBisisesto = fechaHoy.isLeapYear();
        System.out.println(esBisisesto);
        
        // cuantos dias tiene el mes actual
        System.out.println(fechaHoy.lengthOfMonth());
        // cuantos dias tiene el año actual
        System.out.println(fechaHoy.lengthOfYear());
        
        // poner un dia en español
        Locale configLocal = Locale.getDefault();
        System.out.println(fechaHoy.getDayOfWeek().getDisplayName(TextStyle.FULL, configLocal));
        System.out.println(fechaHoy.getDayOfWeek().getDisplayName(TextStyle.SHORT, configLocal));
        System.out.println(fechaHoy.getDayOfWeek().getDisplayName(TextStyle.NARROW, configLocal));
        // poner un mes en español
        System.out.println(mesActual.getDisplayName(TextStyle.FULL, configLocal));
        
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy", configLocal);
        String fechaFormateada = fechaHoy.format(formatoFechas);
        System.out.println(fechaFormateada);
    }
    
}
