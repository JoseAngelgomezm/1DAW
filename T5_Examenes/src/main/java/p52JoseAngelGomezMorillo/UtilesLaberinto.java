/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p52JoseAngelGomezMorillo;

/**
 *
 * @author joseangel
 */
public class UtilesLaberinto {

    public static char[][] generarLaberinto(int tamaño) {
        // control del tamaño
        if (tamaño <= 2 || tamaño >= 11) {
            throw new IllegalArgumentException();
        }
        
        char[][] laberinto = new char[tamaño][tamaño];
        java.util.Random generador = new java.util.Random();
        int numeroGenerador;// guarda el numero aleatorio
        
        // generar letra aleatoria en cada posicion
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                // generar un aleatorio entre 1 y 2
                numeroGenerador = generador.nextInt(1, 3);

                // si el numero aleatorio es 1 poner un camino
                // sino poner un bosque
                if (numeroGenerador == 1) {
                    laberinto[i][j] = 'c';
                } else {
                    laberinto[i][j] = 'b';
                }
            }
        }
        return laberinto;
    }

    public static Casilla[][] generadorLaberintoCasilla(char[][] laberintoCaminoBosque) {
        Casilla[][] laberintoCasillas = new Casilla[laberintoCaminoBosque.length][laberintoCaminoBosque.length];

        // rellenar el array segun b o c para poner camino o bosque
        for (int i = 0; i < laberintoCasillas.length; i++) {
            for (int j = 0; j < laberintoCasillas[i].length; j++) {
                // si el laberinto que recibe por parametro tiene una b crear 
                // el objeto Casilla de tipo bosque
                if (laberintoCaminoBosque[i][j] == 'b') {
                    laberintoCasillas[i][j] = 
                        new Casilla(i, j, TipoCasilla.BOSQUE);
                }
                // si el laberinto generado anteriormenete tiene una c crear
                // el objeto Casilla de tipo camino
                if (laberintoCaminoBosque[i][j] == 'c') {
                    laberintoCasillas[i][j] = 
                        new Casilla(i, j, TipoCasilla.CAMINO);
                }
            }
        }

        return laberintoCasillas;
    }

}
