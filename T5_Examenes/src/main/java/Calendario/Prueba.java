/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calendario;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Prueba {

    public static void main(String[] args) {
        int año = 1900;
        int mes = 0;
        Scanner teclado = new Scanner(System.in);

        // pedir el año filtrado
        do {
            System.out.println("Introduce un año 2000 - 2050");
            try {
                año = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Año incorrecto");
                teclado.nextLine();
            }

        } while (año > 2050 || año < 1950);

        // pedir el mes filtrado
        do {
            System.out.println("Introduce un mes 1 - 12");
            try {
                mes = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Año incorrecto");
                teclado.nextLine();
            }
        } while (mes >= 12 || año <= 1);

        // obtener el mes del año
        Month mesDelAño = Month.of(mes);

        // crear el calendario
        Calendario calendario1 = new Calendario(mesDelAño, año);

        // imprimirlo
        System.out.println(calendario1);
        
        Calendario[] calendarioAnual = new Calendario[12];
        
        calendarioAnual = calendario1.calendarioAnual(2023);
        
        for (int i = 0; i < calendarioAnual.length; i++) {
            System.out.println(Month.JANUARY.plus(i).getDisplayName(TextStyle.FULL, Locale.getDefault()));
            System.out.println(calendarioAnual[i]);
            
        }
        
        System.out.println(calendario1.diaSemana(22, calendario1));

    }
}
