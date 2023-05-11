/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejbasicos;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author joseangel
 */
public class testMiPanel {

    public static void main(String[] args) {

        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Aplicación");

        // Establecemos tamaño y posición
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);
        
        // no redimensionable
        ventanaPrincipal.setResizable(false);
        
        // Añadimos un objeto MiPanel al JFrame
        // ventanaPrincipal.add(new MiPanel(Color.CYAN));

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout
        // primero quitar el primer panel que añadimos al JFrame
        
        // crear los paneles
        MiPanel panel1 = new MiPanel(Color.BLACK);
        MiPanel panel2 = new MiPanel(Color.BLUE);
        MiPanel panel3 = new MiPanel(Color.MAGENTA);
        MiPanel panel4 = new MiPanel(Color.PINK);
        MiPanel panel5 = new MiPanel(Color.RED);
        
        // cambiar el color del texto de los paneles
        panel1.getEtiqueta().setText("Color negro");
        panel2.getEtiqueta().setText("Color azul");
        panel3.getEtiqueta().setText("Color magenta");
        panel4.getEtiqueta().setText("Color rosa");
        panel5.getEtiqueta().setText("Color rojo");
        
        // Añadir panel amarillo en la posición superior (NORTH)
        ventanaPrincipal.add(panel1, BorderLayout.NORTH);

	// Añadir panel rojo en la posición inferior (SOUTH)
    	ventanaPrincipal.add(panel2, BorderLayout.SOUTH);

        // Añadir panel gris en la posición central (CENTER)
    	ventanaPrincipal.add(panel3, BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
    	ventanaPrincipal.add(panel4, BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
    	ventanaPrincipal.add(panel5, BorderLayout.EAST);
        
        
        
        
    }
    
    

}
