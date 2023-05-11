/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class Ej05 {
    public static void main(String[] args) {
        // Declaracion de variables.
        int numeroGrupos;
        double numeroHorasProfesor;
        double numeroProfesores;
        final int NUMEROHORASEMANA = 30;
        
        // Pedir los datos por teclado.
        String horas = JOptionPane.showInputDialog("Introduce la cantidad de horas que "
                + "imparte el profesor: ");
        numeroHorasProfesor = Integer.parseInt(horas);
        
        String grupos = JOptionPane.showInputDialog("Introduce la cantidad de grupos que "
                + "se desean cubrir: ");
        numeroGrupos = Integer.parseInt(grupos);
        
        // Determinar cuantos profesores se necesitan.
        numeroProfesores = (NUMEROHORASEMANA * numeroGrupos) / numeroHorasProfesor;
        // Redondear hacia arriba por si sobran horas por cubrir, 
        // se necesitara otro profesor mas.
        numeroProfesores =  Math.ceil(numeroProfesores);
        
        // Mostrar resultados por pantalla
        JOptionPane.showMessageDialog(null, "Se necesitan un total de: "
                + numeroProfesores + " profesores");
    }
}
