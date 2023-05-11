/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Jose Angel
 */
public class MainCalculadora {

    public static void main(String[] args) {
        // crear la calculadora
        JFrame frame = new JFrame("Calculadora");
        // dar tamaño
        frame.setBounds(250, 250, 0, 0);
        // agregar el panel principal que contiene los botones
        frame.add(new PanelPrincipal());
        
        // hacer panel visible
        frame.setVisible(true);
        // establecer el exit al pulsar el boton salir
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }

}
