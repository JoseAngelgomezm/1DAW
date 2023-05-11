/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ex_bloque1_JosAngelGomezMorillo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author joseangel
 */
public class Margaritas {

    public static void main(String[] args) {
        
        //declaracion variables
        int numeroMargaritas;
        int numeroHojasMargaritas;
        String decision;
        String opcionJugarOtravez;
        String resultado;
        
        //Creacion objeto scanner para preguntar si queremos jugar de nuevo o no
        Scanner teclado = new Scanner(System.in);
        
        do {
            // Pedir cuantas margaritas tiene romeo
            numeroMargaritas = contarMargaritas();

            // pedir las hojas de las margaritas hasta que llegue a la ultima
            // margarita introducida
            for (int i = 1; i <= numeroMargaritas; i++) {
                // Pedir cuantas hojas tiene la margarita nº1
                numeroHojasMargaritas = pedirHojas(i);
                // tirar el dado
                int tirada = tirarDado();

                // decidir si empieza con me quiere o no me quiere
                if (empezarMeQuiereNoMeQuiere(tirada)) {
                    decision = "Me Quiere";
                } else {
                    decision = "No Me Quiere";
                }

                // Mostrar tirada y la decision
                System.out.println("la margarita tiene " + numeroHojasMargaritas
                        + " hojas, Romeo saca " + tirada +
                        " y empieza con "+ decision);

                // mostrar el reultado final
                // si empieza con me quiere y el resultado es par es NO ME QUIERE
                if (decision.equals("Me Quiere") &&
                    numeroHojasMargaritas % 2 == 0) {
                    
                    resultado = "El resultado es que su amada NO LO QUIERE";
                    
                // si empieza con me quiere y el resultado es impar es me quiere
                }else if (decision.equals("Me Quiere") && 
                          numeroHojasMargaritas % 2 == 1) {
                    
                    resultado = "El resultado es que su amada LO QUIERE";
                    
                // si empieza con no me quiere y el resultado es par
                // el resultado es me quiere
                }else if (decision.equals("No Me Quiere") && 
                          numeroHojasMargaritas % 2 == 0){
                    
                    resultado = "El resultado es que su amada LO QUIERE";
                    
                // si empiza con no me quiere y el resultado es impar
                // el resultado es no me quiere
                }else{
                    resultado = "El resultado es que su amada NO LO QUIERE";
                }
                // mostrar por pantalla el resultado
                System.out.println(resultado);
            }
                // Pedir si el usuario quiere jugar otra vez o no
            System.out.println("¿Quieres jugar otra vez ?");
            opcionJugarOtravez = teclado.nextLine().toLowerCase();
            
            // mientras que la opcion no sea si o no decirle que introduzca si
            // o no
            while (!opcionJugarOtravez.equals("si")
                    && !opcionJugarOtravez.equals("no")) {  
                System.out.println("Respuesta no correcta");
                System.out.println("¿Quieres jugar otra vez ?");
                opcionJugarOtravez = teclado.nextLine().toLowerCase();
            }
            
            // si la opcion no es si o no se vuelve a pedir

        } while (opcionJugarOtravez.equals("si")); 
        // bucle que se repite si ponemos si en la pregunta

    }

    // metodo que saca un numero del 1 al 6 y se repite si saca 3
    public static int tirarDado() {
        java.util.Random generador = new java.util.Random();
        int dado = 0;
        do {
            dado = generador.nextInt(1, 7);
        } while (dado == 3); // repetir hasta que el numero no sea 3

        return dado;
    }

    // metodo que pregunta cuantas margaritas tiene romeo
    public static int contarMargaritas() {
        // delcaracion objeto scanner
        Scanner teclado = new Scanner(System.in);
        // declaracion variable
        int numeroMargaritas = 0;
        
        do {
            System.out.println("Introduce cuantas margaritas tiene "
                    + "romeo: (1-10)");
            // tratado expeccion IM
            try {
                numeroMargaritas = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero");
            }
            //limpiar buffer
            teclado.nextLine();
        //repteir hasta que el numero esté entre 1 y 10
        } while (numeroMargaritas < 1 || numeroMargaritas > 10);

        return numeroMargaritas;
    }

    // metodo que devuelve true o false para ver por donde empieza
    public static boolean empezarMeQuiereNoMeQuiere(int numeroDado) {
        int resto;
        // determinar el resto
        resto = numeroDado % 2;
        return resto == 0;// si el resto es 0 devolver true sino false
    }

    // metodo que pide el numero de hojas de las margaritas
    public static int pedirHojas(int numeroMargarita) {
        Scanner teclado = new Scanner(System.in);
        int numeroHojas = 0;
        do {
            System.out.println("Introduce cuantas hojas tiene la margarita nº: "
                    + numeroMargarita);
            // tratado expeccion ime
            try {
                numeroHojas = teclado.nextInt();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero");
            }
            //limpiar buffer
            teclado.nextLine();
        } while (true);//repite el bucle hasta que se introduzca un numero valido
        return numeroHojas;
    }

}
