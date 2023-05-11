/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class MainEj1 {

    public static void main(String[] args) {
        List<Trabajador> listaTrabajadores = ServiciosFicheros.leerFichero("RelEmpCenAus.txt");

        for (int i = 0; i < listaTrabajadores.size(); i++) {
            Trabajador get = listaTrabajadores.get(i);
            System.out.println(get);
        }

    }
}
