/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Jose Angel
 */
public class PanelPrincipal extends JPanel implements ActionListener {

    // Atributos de la clase (privados)
    private PanelBotones botonera;
    private JTextArea areaTexto;
    private int tipoOperacion;

    // Constructor
    public PanelPrincipal() {
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }

    // Se inicializan los componentes gráficos y se colocan en el panel
    private void initComponents() {
        // Creamos el panel de botones
        botonera = new PanelBotones();

        // Creamos el área de texto
        areaTexto = new JTextArea(10, 50);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.WHITE);

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());

        // Colocamos la botonera y el área texto
        this.add(areaTexto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        for (JButton boton : this.botonera.getgrupoBotones()) {
            boton.addActionListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Se obtiene el objeto que desencadena el evento
        Object o = ae.getSource();

        // si lo que pulsamos es un boton
        String nuevoNumero;
        if (o instanceof JButton) {
            // segun el boton que se pulse
            switch (((JButton) o).getText()) {
                case "0" -> {
                    nuevoNumero = areaTexto.getText().concat("0");
                    areaTexto.setText(nuevoNumero);
                }
                case "1" -> {
                    nuevoNumero = areaTexto.getText().concat("1");
                    areaTexto.setText(nuevoNumero);
                }
                case "2" -> {
                    nuevoNumero = areaTexto.getText().concat("2");
                    areaTexto.setText(nuevoNumero);
                }
                case "3" -> {
                    nuevoNumero = areaTexto.getText().concat("3");
                    areaTexto.setText(nuevoNumero);
                }
                case "4" -> {
                    nuevoNumero = areaTexto.getText().concat("4");
                    areaTexto.setText(nuevoNumero);
                }
                case "5" -> {
                    nuevoNumero = areaTexto.getText().concat("5");
                    areaTexto.setText(nuevoNumero);
                }
                case "6" -> {
                    nuevoNumero = areaTexto.getText().concat("6");
                    areaTexto.setText(nuevoNumero);
                }
                case "7" -> {
                    nuevoNumero = areaTexto.getText().concat("7");
                    areaTexto.setText(nuevoNumero);
                }
                case "8" -> {
                    nuevoNumero = areaTexto.getText().concat("8");
                    areaTexto.setText(nuevoNumero);
                }
                case "9" -> {
                    nuevoNumero = areaTexto.getText().concat("9");
                    areaTexto.setText(nuevoNumero);
                }

                // operadores
                case "+" -> {

                    String loQueHay = areaTexto.getText();

                    areaTexto.setText(controlarRepeticionOperadores(loQueHay, "+"));

                    this.tipoOperacion = 1;

                }
                case "-" -> {
                    String loQueHay = areaTexto.getText();
                    // controlar que no se pongan 2 operadores
                    areaTexto.setText(controlarRepeticionOperadores(loQueHay, "-"));

                    this.tipoOperacion = 2;
                }
                case "/" -> {
                    String loQueHay = areaTexto.getText();
                    // controlar que no se pongan 2 operadores
                    areaTexto.setText(controlarRepeticionOperadores(loQueHay, "/"));

                    this.tipoOperacion = 3;
                }
                case "*" -> {
                    String loQueHay = areaTexto.getText();
                    // controlar que no se pongan 2 operadores
                    areaTexto.setText(controlarRepeticionOperadores(loQueHay, "*"));

                    this.tipoOperacion = 4;
                }
                case "C" -> {
                    areaTexto.setText("");
                }

                // resolver la operacion de la calculadora
                case "=" -> {
                    double resultadoOperacion; // variable para guardar resultados

                    // dividir el string en 2 partes
                    // dividir el string en 2 partes con split
                    // posicion 0 = primera parte del string
                    // posicion 1 = segunda parte del string
                    // crear el patron para dividir el string
                    final String patronOperando = "[+\\-*/]|(?<!\\d)\\.(?!\\d)";
                    String[] stringDividido = areaTexto.getText().split(patronOperando);
                    // pasar a double los 2 operandos
                    double operando1 = Double.parseDouble(stringDividido[0]);
                    double operando2 = Double.parseDouble(stringDividido[1]);

                    // segun la operacion que tengamos
                    switch (tipoOperacion) {
                        case 1 -> {
                            resultadoOperacion = operando1 + operando2;
                            areaTexto.setText(Double.toString(resultadoOperacion));
                        }
                        case 2 -> {
                            resultadoOperacion = operando1 - operando2;
                            areaTexto.setText(Double.toString(resultadoOperacion));
                        }
                        case 3 -> {
                            resultadoOperacion = operando1 / operando2;
                            areaTexto.setText(Double.toString(resultadoOperacion));
                        }
                        case 4 -> {
                            resultadoOperacion = operando1 * operando2;
                            areaTexto.setText(Double.toString(resultadoOperacion));
                        }
                        default -> {
                        }
                    }
                }

                default ->
                    throw new AssertionError();
            }
        }

    }

    // metodo que controla que no se repitan operandos en las operaciones
    public String controlarRepeticionOperadores(String loQueHayEnCajaTexto, String operandoReemplazar) {
        String resultadoNuevo;
        final String patronOperando = "[+\\-*/]|(?<!\\d)\\.(?!\\d)";

        // si lo que hay en la caja de texto ya contiene algun operando
        if (loQueHayEnCajaTexto.contains("+")
                || loQueHayEnCajaTexto.contains("-")
                || loQueHayEnCajaTexto.contains("*")
                || loQueHayEnCajaTexto.contains("/")) {

            // reemplazar el operador por el nuevo pulsado
            resultadoNuevo = loQueHayEnCajaTexto.replaceAll(patronOperando, operandoReemplazar);
            
           return resultadoNuevo;
            
        } else {
            // si no contiene operando añadirlo
            resultadoNuevo = loQueHayEnCajaTexto.concat(operandoReemplazar);

        }
        return resultadoNuevo;
    }
}
