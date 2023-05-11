/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import ejercicio1.*;
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
public class MainEj3 {

    public static void main(String[] args) {
        List<TrabajadorEj3> listaTrabajadores = ServiciosFicherosEj3.leerFichero("RelEmpCenAus.csv");

        for (int i = 0; i < listaTrabajadores.size(); i++) {
            TrabajadorEj3 get = listaTrabajadores.get(i);
            System.out.println(get);
        }

    }
}
