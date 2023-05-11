/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejbasicos;

/**
 *
 * @author joseangel
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

// Se implementa la interfaz
public class Saludo extends JPanel implements ActionListener {

    // Componentes gráficos: un botón y un área de texto
    private JButton botonNombre;
    private JButton botonApellido;
    private JButton botonAleatorio;
    private JLabel textoAleatorio;
    private JTextArea texto;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(new TitledBorder("Borde del panel"));

        // Creamos el botón, con un texto a mostrar
        botonNombre = new JButton("Nombre");

        // crear el boton despedir con el texto despedir
        botonApellido = new JButton("Apellido");

        // crear el boton generar aleatorio
        botonAleatorio = new JButton("Generar Aleatorio");

        // crear el label de aleatorio
        textoAleatorio = new JLabel("Numero");

        // Creamos el textArea de una fila por 25 columnas
        texto = new JTextArea(1, 25);

        // Establecemos el color de fondo del textArea
        texto.setBackground(Color.gray);

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        this.add(botonNombre);
        this.add(texto);
        this.add(botonApellido);
        this.add(botonAleatorio);
        this.add(textoAleatorio);
        // Se le indica al objeto boton que escuche eventos tipo click
        // y se pasa como argumento una referencia de tipo ActionListener
        // En este caso se pasa this que es el panel sobre el 
        // que está el botón y que implementa la interfaz ActionListener
        botonNombre.addActionListener(this);
        botonApellido.addActionListener(this);
        botonAleatorio.addActionListener(this);
        botonAleatorio.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                botonAleatorio.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 botonAleatorio.setBackground(Color.white);
            }
        });

    }

    // Sobrescribimos el método de la interfaz
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Este ejemplo es tan básico que no hemos usado el objeto ae
        // Indicamos el texto que queremos mostrar en el área de texto

        Random generador = new Random();
        String random;

        //  Si el botón pulsado es botonSaludar
        if (ae.getSource().equals(botonNombre)) {
            // cambiar color de fondo
            texto.setBackground(Color.WHITE);
            // cambiar texto
            texto.setText("Jose Angel");

        }
        // si se pulsa el boton apellido
        if (ae.getSource().equals(botonApellido)) {
            //cambiar color de fondo
            texto.setBackground(Color.RED);
            // cambiar texto
            texto.setText("Gomez Morillo");
        }

        // si se pulsa el boton generar Aleatorio
        if (ae.getSource().equals(botonAleatorio)) {
            int aux = generador.nextInt(1, 11);
            random = Integer.toString(aux);
            textoAleatorio.setText(random);
        }

    }
}
