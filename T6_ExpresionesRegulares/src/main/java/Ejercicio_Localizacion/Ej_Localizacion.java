/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Localizacion;

import java.util.regex.Matcher;

/**
 *
 * @author joseangel
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej_Localizacion {

    public static void main(String[] args) {
        // crear una expresion que busque lo siguiente: Localizacion: N  S  E  O
        // crear el patron con un string
        final String patron1 = "Localizacion: [NSEO]";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String prueba1 = "texto con Localizacion: N";

        // crear el pattern y pasarle el patron
        final Pattern pattern1 = Pattern.compile(patron1, Pattern.MULTILINE);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcher1 = pattern1.matcher(prueba1);
        
        while (matcher1.find()) {
            System.out.println("Full match: " + matcher1.group(0));

            for (int i = 1; i <= matcher1.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher1.group(i));
            }
        }
        
        // crear una expresion regular que empieze por ini+2numeros del 0 al 9+fin
        final String patron2 = "^ini[0-9]{2}fin$";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String prueba2 = "ini99fin";

        // crear el pattern y pasandole el patron
        final Pattern pattern2 = Pattern.compile(patron2);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcher2 = pattern2.matcher(prueba2);

        while (matcher2.find()) {
            System.out.println("Full match: " + matcher2.group(0));

            for (int i = 1; i <= matcher2.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher2.group(i));
            }
        }
        
        // crear una expresion regular que sea letra numero letra numero y se repita
        // siempre que quiera
        final String patron3 = "[A-Z|a-z][0-9]";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String prueba3 = "w9k1m2k3";

        // crear el pattern y pasandole el patron
        final Pattern pattern3 = Pattern.compile(patron3);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcher3 = pattern3.matcher(prueba3);

        while (matcher3.find()) {
            System.out.println("Full match: " + matcher3.group(0));

            for (int i = 1; i <= matcher3.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher3.group(i));
            }
        }
        
    }
}
