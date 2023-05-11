/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package arrayjoptionrecursivo;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class ArrayJoptionRecursivo {

    public static void main(String[] args) {
        int numero = -1;

        // lectura de un numero valido por JOption
        do {
            String numeroString = JOptionPane.showInputDialog("Introduce un numero: ");
            try {
                numero = Integer.parseInt(numeroString);
            } catch (NumberFormatException ime) {
                JOptionPane.showMessageDialog(null, "Introduce un numero valido");
            }

        } while (numero < 1);

        // pasar el numero a String
        String numeroConvertidoString = String.valueOf(numero);

        // crear el array del atamaño del string
        char[] arrayChar = new char[numeroConvertidoString.length()];

        // recorrer el String y llenar array de char
        for (int i = 0; i < numeroConvertidoString.length(); i++) {
            // en cada posicion del string poner el char de cada numero del string
            arrayChar[i] = numeroConvertidoString.charAt(i);

        }

        // mostrar el array de char
        for (int i = 0; i < arrayChar.length; i++) {
            JOptionPane.showMessageDialog(null, arrayChar[i] + " ");
        }

        JOptionPane.showMessageDialog(null, "¿Es capicua?: " + capicuaRecursiva(arrayChar, 0, arrayChar.length - 1));

    }

    public static boolean capicuaRecursiva(char[] arrayChar, int primeraPosicion, int ultimaPosicion) {

        // si llegamos al centro (la primera posicion es la misma que la ultima)
        // significa que es capicuo porque solo devuelve false cuando los numeros
        // no sean iguales
        if (primeraPosicion == ultimaPosicion) {
            return true;
        }
        // si el primer numero es igual al ultimo
        if (arrayChar[primeraPosicion] == arrayChar[ultimaPosicion]) {

            // llamar al metodo aumentando primera y ultima posicion
            return capicuaRecursiva(arrayChar, primeraPosicion + 1, ultimaPosicion - 1);

            // si no son iguales devolver false
        } else {
            return false;
        }

    }
}
