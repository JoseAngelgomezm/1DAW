/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frase;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class Frase {

    public static void main(String[] args) {
        // recoger frase 
        String frase = JOptionPane.showInputDialog(null, "Introduce una frase");

        // tamaño de la frase
        JOptionPane.showMessageDialog(null, frase.length());

        // preguntar por un char para buscar en la frase
        char ocurrencia = JOptionPane.showInputDialog("Introduce una ocurrencia para buscar (un caracter): ").charAt(0);

        // devolver la posicion en la que se encuentra
        JOptionPane.showMessageDialog(null, "La ocurrencia " + ocurrencia + " se encuentra en la posicion " + indiceDeOcurrencia(frase, ocurrencia));

        // crear array de posiciones
        int[] arrayPosiciones = todosLosindiceDeOcurrencia(frase, ocurrencia);
        
        // mostrar cada posicion del array
        for (int i = 0; i < arrayPosiciones.length; i++) {
            JOptionPane.showMessageDialog(null, "La letra: " + ocurrencia + " Esta en la posicion: " + arrayPosiciones[i]);
        }
        
        // recorrer caracteres del string para devolver su valor unicode, si es mayuscula, minuscula o digito
        for (int i = 0; i < frase.length(); i++) {
            JOptionPane.showMessageDialog(null, "El caracter: " + frase.charAt(i) + "\n"
                    + " Valor unicode: " + Character.getNumericValue(frase.charAt(i)) + "\n"
                    + " ¿Es minuscula?: " + Character.isLowerCase(frase.charAt(i)) + "\n"
                    + " ¿Es mayuscula?: " + Character.isUpperCase(frase.charAt(i)) + "\n"
                    + " ¿Es un digito?: " + Character.isDigit(frase.charAt(i)) + "\n");
        }
        
        // eliminar espacios de la frase y dar su tamaño nuevo
        JOptionPane.showMessageDialog(null,"La frase sin espacios: " + frase.replace(" ", "") + "\n"
                                    + "Tiene un tamaño de: " + frase.replace(" ", "").length());
        
        
    }
    
    //metodo que devuelve el indice donde se encuentra la primera ocurrencia 
    public static int indiceDeOcurrencia(String fraseEnLaQueSeBusca, char ocurrenciaABuscar) {
        // devolver el indice donde se encuentra el char
        // teniendo en cuenta que la primera posicion es 1 y no 0
        return fraseEnLaQueSeBusca.indexOf(ocurrenciaABuscar) + 1;
    }
    
    // metodo que deuvuelve cada uno de los indice donde se encuentra la ocurrencia
    public static int[] todosLosindiceDeOcurrencia(String fraseEnLaQueSeBusca, char ocurrenciaABuscar) {

        int tamañoArray = 0;

        // obtener las veces qe se repite la ocurrencia en la frase para obtener
        // el tamaño del array
        for (int i = 0; i < fraseEnLaQueSeBusca.length(); i++) {
            if (fraseEnLaQueSeBusca.charAt(i) == ocurrenciaABuscar) {
                tamañoArray++;
            }
        }

        // crear el array
        int[] arrayPosiciones = new int[tamañoArray];

        int posicionInsertar = 0;// contador para insertar la ocurrencia

        // recorrer la frase y por cada ocurrencia guardar el indice en el array
        for (int i = 0; i < fraseEnLaQueSeBusca.length(); i++) {
            // si el char de la frase que estamos mirando es igual
            // al de la ocurrencia pasada por parametro añadir la posicion al
            // array
            if (fraseEnLaQueSeBusca.charAt(i) == ocurrenciaABuscar) {
                arrayPosiciones[posicionInsertar] = i + 1;
                posicionInsertar++;
            }
        }

        return arrayPosiciones;
    }
    
    
}
