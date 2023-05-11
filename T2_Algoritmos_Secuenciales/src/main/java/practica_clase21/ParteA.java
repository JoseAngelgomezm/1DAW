 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package practica_clase21;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class ParteA {

    public static void main(String[] args) {
        // Declaracion de variables
        float totalDineroLunes;
        float totalDineroMartes;
        float totalDineroMiercoles;
        float totalDineroJueves;
        float totalDineroViernes;
        int numeroReparacionesLunes;
        int numeroReparacionesMartes;
        int numeroReparacionesMiercoles;
        int numeroReparacionesJueves;
        int numeroReparacionesViernes;
        float totalDineroSemana; 
        final double PRECIOREPARACION = 36.2;
        
        // Crear objeto Scanner
        Scanner teclado = new Scanner(System.in);
        
        // Pedir datos de reparacion por dia de la semana
        System.out.println("Introduce el numero de reparaciones"
                + " para el Lunes: ");
        // Almacenar reparaciones del dia de la semana
        numeroReparacionesLunes = teclado.nextInt();
        
        System.out.println("Introduce el numero de reparaciones para"
                + " el Martes: ");
        numeroReparacionesMartes = teclado.nextInt();
        
        System.out.println("Introduce el numero de reparaciones para"
                + " el Miercoles: ");
        numeroReparacionesMiercoles = teclado.nextInt();
       
        System.out.println("Introduce el numero de reparaciones para"
                + " el Jueves: ");
        numeroReparacionesJueves = teclado.nextInt();
        
        System.out.println("Introduce el numero de reparaciones para"
                + " el Viernes: ");
        numeroReparacionesViernes = teclado.nextInt();
        
        
        
        // Determinar la cantidad de dinero total de cada dia
        totalDineroLunes = (float) (numeroReparacionesLunes *
                PRECIOREPARACION);
        
        totalDineroMartes = (float) (numeroReparacionesMartes *
                PRECIOREPARACION);
        
        totalDineroMiercoles = (float) (numeroReparacionesMiercoles * 
                PRECIOREPARACION);
        
        totalDineroJueves = (float) (numeroReparacionesJueves *
                PRECIOREPARACION);
        
        totalDineroViernes = (float) (numeroReparacionesViernes * 
                PRECIOREPARACION);
        
        // Mostrar los resultados de la cantidad generada al dia
        System.out.printf("La cantidad total del Lunes es: %.3f %n"
                        + "La cantidad total del Martes es: %.3f %n"
                        + "La cantidad total del Miercoles es: %.3f %n" 
                        + "La cantidad total del Jueves es: %.3f %n"
                        + "La cantidad total del Viernes es: %.3f %n", 
                        totalDineroLunes, 
                        totalDineroMartes,totalDineroMiercoles, 
                        totalDineroJueves, totalDineroViernes);
        
       
        // Determinar la cantidad generada en la semana
        totalDineroSemana = totalDineroLunes + totalDineroMartes + 
                totalDineroMiercoles + totalDineroJueves
                +totalDineroViernes; 
        
        // Mostrar los resultados de la cantidad generada a la semana
        System.out.printf("La cantidad total generada en la SEMANA"
                + "1 es de : %.3f"
                ,totalDineroSemana);
        
        
    }
}
