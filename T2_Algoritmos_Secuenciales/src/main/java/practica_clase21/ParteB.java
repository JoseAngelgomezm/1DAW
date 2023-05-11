/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package practica_clase21;

import javax.swing.JOptionPane;


/**
 *
 * @author joseangel
 */
public class ParteB {

    public static void main(String[] args) {
        // Declaracion de variables
        float totalDineroLunes;
        float totalDineroMartes;
        float totalDineroMiercoles;
        float totalDineroJueves;
        float totalDineroViernes;
        double precioReparacionLunes;
        double precioReparacionMartes;
        double precioReparacionMiercoles;
        double precioReparacionJueves;
        double precioReparacionViernes;
        int numeroReparacionesLunes;
        int numeroReparacionesMartes;
        int numeroReparacionesMiercoles;
        int numeroReparacionesJueves;
        int numeroReparacionesViernes;
        float totalDineroSemana;
        boolean masDeMilEuros;
        final double TOPE = 1000;
        
        
        
        // Pedir datos de reparacion por dia de la semana
        numeroReparacionesLunes = Integer.parseInt
        (JOptionPane.showInputDialog("Introduce "
                + "el NUMERO de REPARACIONES para el Lunes: "));
        // Pedir datos del coste de cada reparacion por cada dia de la semana
        precioReparacionLunes = Double.parseDouble
        (JOptionPane.showInputDialog("Introduce "
                + "el PRECIO de reparacion para el Lunes: "));
        
        numeroReparacionesMartes = Integer.parseInt
        (JOptionPane.showInputDialog("Introduce el NUMERO de"
                + " REPARACIONES para el Martes: "));
        
        precioReparacionMartes = Double.parseDouble
        (JOptionPane.showInputDialog("Introduce "
                + "el PRECIO de reparacion para el Martes: "));
        
        numeroReparacionesMiercoles = Integer.parseInt
        (JOptionPane.showInputDialog("Introduce "
                + "el NUMERO de REPARACIONES para el Miercoles: "));
        
        precioReparacionMiercoles = Double.parseDouble
        (JOptionPane.showInputDialog("Introduce "
                + "el PRECIO de reparacion para el Miercoles: "));
        
        numeroReparacionesJueves = Integer.parseInt
        (JOptionPane.showInputDialog("Introduce "
                + "el NUMERO de REPARACIONES para el Jueves: "));
        
        precioReparacionJueves = Double.parseDouble
        (JOptionPane.showInputDialog("Introduce "
                + "el PRECIO de reparacion para el Jueves: "));
        
        numeroReparacionesViernes = Integer.parseInt
        (JOptionPane.showInputDialog("Introduce "
                + "el NUMERO de REPARACIONES para el Viernes: "));
        
        precioReparacionViernes = Double.parseDouble
        (JOptionPane.showInputDialog("Introduce "
                + "el PRECIO de reparacion para el Viernes: "));
        
        
        // Determinar la cantidad de dinero total de cada dia
        totalDineroLunes =  (float) (numeroReparacionesLunes * 
                precioReparacionLunes);
        
        totalDineroMartes = (float) (numeroReparacionesMartes * 
                precioReparacionMartes);
        
        totalDineroMiercoles = (float) (numeroReparacionesMiercoles * 
                precioReparacionMiercoles);
        
        totalDineroJueves = (float) (numeroReparacionesJueves * 
                precioReparacionJueves);
        
        totalDineroViernes = (float) (numeroReparacionesViernes * 
                precioReparacionViernes);
        
        // Mostrar los resultados de la cantidad generada al dia
        String datosSalida = """
                             Cantidad total Lunes : %.1f
                             Cantidad total Martes : %.1f
                             Cantidad total Miercoles : %.1f
                             Cantidad total Jueves : %.1f
                             Cantidad total Viernes : %.1f
                             """.formatted(totalDineroLunes,
                                     totalDineroMartes,
                                     totalDineroMiercoles,
                                     totalDineroJueves, 
                                     totalDineroViernes);
        
        JOptionPane.showMessageDialog(null, datosSalida);
        
       
        // Determinar la cantidad generada en la semana
        totalDineroSemana = totalDineroLunes + totalDineroMartes + 
                totalDineroMiercoles + totalDineroJueves
                            +totalDineroViernes; 
        
        
        // Determinar si se han cobrado mas de 1.000€ semanales
        masDeMilEuros = totalDineroSemana > TOPE;
        
       
        // Mostrar los resultados de la cantidad generada a la semana
        String datosSalida2 = """
                              El total de la semana es de : %.1f
                              ¿Son mas de 1.000€? : %b
                              """.formatted(totalDineroSemana,
                                      masDeMilEuros);
        
         // Mostrar resultado de si se ha cobrado mas de mil euros
        JOptionPane.showMessageDialog(null, datosSalida2);
    }
}
