/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package series;

import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class ServicioSerie {

    private static Scanner teclado = new Scanner(System.in);

    // lee por teclado los datos de una serie y devuleve el objeto creado de tipo serie
    public static Serie leerSeriePorTeclado() {
        // Creamos el objeto de tipo serie (declaracion)
        Serie serie;
        // Leer por teclado e instanciar
        // son variables locales del metodo
        System.out.println("Nombre de la serie: ");
        String nombreSerie = teclado.nextLine();
        System.out.println("Genero de la serie: ");
        String generoSerie = teclado.nextLine();
        System.out.println("Productora de la serie: ");
        String productoraSerie = teclado.nextLine();
        System.out.println("Sinopsis de la serie: ");
        String sinopsisSerie = teclado.nextLine();
        System.out.println("Nº Temporadas de la serie: ");
        int temporadasSerie = teclado.nextInt();
        System.out.println("Likes de la serie: ");
        int likesSerie = teclado.nextInt();

        serie = new Serie(nombreSerie, generoSerie,
                sinopsisSerie, temporadasSerie,
                likesSerie);

        // devolvemos el tipo Serie
        return serie;
    }
    
    public static void darLike (Serie serie){
        System.out.println("Te ha gustado la serie " + serie.getTitulo() + "?");
        String respuesta = teclado.nextLine();
        if (respuesta.equals("si")) {
            serie.darLike();
        }
    }
}
