/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjNumerosRomanos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class EjNumerosRomanos {

    public static void main(String[] args) {
        // Opcion 1: representar un numero romano a partir de un decimal
        // Entre 1 y 10
        // Opcion 2: contar vocales de un nombre
        // opcion3: salir
        
        // Pedir la opcion hasta que el numero sea 1 2 o 3
        int resultadoOpcion;
        do {
            // Pedir al usuario la opcion que quiere usar
            String opciones = """
                     --- Selecciona una opcion---
                     1- Representar un numero en romano
                     2- Contar vocales de un nombre
                     3- Salir
                     """;

            resultadoOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, opciones));
        } while (resultadoOpcion > 3 || resultadoOpcion < 1);

        //Segun la opcion elegida haremos una serie de cosas
        switch (resultadoOpcion) {
            case 1 -> {
                // Pedir numero al usuario hasta que sea un numero entre 1 y 10
                int numero;
                do {
                    // Pedir un numero al usuario
                    numero = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Introduce un numero para convertirlo a "
                                    + "numero romano (solo entre 1 y 10) "));
                } while (numero < 1 || numero > 10); // mientras sea menor que 0
                // y mayor que 11, pide el numero de nuevo
                
                // Segun el numero devolver su resutlado equivalente
                switch (numero) {
                    case 1 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: I");
                    case 2 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: II");
                    case 3 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: III");
                    case 4 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: IV");
                    case 5 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: V");
                    case 6 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: VI");
                    case 7 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: VII");
                    case 8 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: VIII");
                    case 9 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: IX");
                    case 10 ->
                        JOptionPane.showMessageDialog(null, "El numero "
                                + numero + " en romano es: X");
                }
            }
            case 2 -> {
                //Pedir nombre para contar vocales
                String nombre = JOptionPane.showInputDialog("Introduce un nombre para contar sus vocales");

                //recorremos el nombre con un for
                //mientras que nuestra variable de control (i) sea menor
                //que la longitud del nombre, seguir viendo letra por letra
                //Variable para controlar las vocales que tenemos
                int numeroVocales = 0;
                for (int i = 0; i < nombre.length(); i++) {
                    // si la posicion en la que estamos del string, es una vocal,
                    // sumar 1 al numero de vocales
                    if (nombre.charAt(i) == 'a'
                            || nombre.charAt(i) == 'e'
                            || nombre.charAt(i) == 'i'
                            || nombre.charAt(i) == 'o'
                            || nombre.charAt(i) == 'u') {

                        numeroVocales++;

                    }
                }

                JOptionPane.showMessageDialog(null,
                        "El nombre " + nombre + " contiene " + numeroVocales
                        + " vocales");
            }
            default ->
                JOptionPane.showMessageDialog(null, "Saliendo");
        }
    }
}
