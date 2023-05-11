/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejGeneradorPassword;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author joseangel
 */
public class passwords {

    public static void main(String[] args) {
        String resultado;
        int opcion;

        do {
            opcion = mostrarMenu();
            switch (opcion) {
                // llamada al metodo que genera el pin
                case 1 -> {
                    resultado = generarPin();
                }
                // llamada al metodo que genera contraseña
                case 2 -> {
                    resultado = generarContraseña();
                }
                // llamada al metodo que genera contraseña 
                case 3 -> {
                    resultado = generarConstraseñaCharArray();
                }

            }
        } while (opcion != 4);// mostrar el menu hasta introducir 4
    }

    // metodo que muestra el menu y recoge la opcion que queremos hacer
    public static int mostrarMenu() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        String menu = """
                          -------------------------------
                          GENERADOR DE 10 CONTRASEÑAS
                          Introduce una opcion:
                          1- Generar PIN
                          2- Generar Constraseña
                          3- Generar Contraseña con Array
                          4- Salir
                          -------------------------------
                          """;
        System.out.println(menu);

        // control de excepcion 
        try {
            opcion = teclado.nextInt();

        } catch (InputMismatchException ime) {
            System.out.println("Introduce un numero!");
        }

        return opcion;
    }

    // metodo que genera un pin aleatorio de 4 digitos
    public static String generarPin() {
        // declara e inicializa el pin
        String pin = "";
        // mensaje que dice lo que hacemos
        System.out.println("Contraseñas de 4 digitos solo numericos");
        // bucle que se repite 10 veces
        for (int i = 0; i < 10; i++) {
            // opcion 1 pin de 4 digitos
            // genera un pin de 4 digitos
            pin = RandomStringUtils.randomNumeric(4);
            // imprime el pin
            System.out.println(pin);
        }
        return pin;
    }

    // metodo que genera una contraseña de 8 digitos
    public static String generarContraseña() {
        // declara la contraseña
        String contraseña = "";
        // mensaje que dice lo que hacemos
        System.out.println("Contraseñas de 8 digitos mezclando numeros y letras");
        // bucle que se repite 10 veces
        for (int i = 0; i < 10; i++) {
            // genera la contraseña de 8 digitos alfanumericos
            String password = RandomStringUtils.randomAlphabetic(8);
            // muestra cada contraseña
            System.out.println(password);
        }
        return contraseña;
    }

    public static String generarConstraseñaCharArray() {
        Scanner teclado = new Scanner(System.in);
        // declara e inicializa la variable password 2
        String password2 = "";
        // mensaje que dice lo que hacemos
        System.out.println("Contraseñas de caracteres introducidos en array");
        // array de caracteres
        char[] conjuntocaracteres = {'a', '<', 'p', '@', 'ç', '>', 'ñ', '-', 's', 'L'};
        // pedimos el tamaño de la contraseña
        System.out.println("Introduce el tamaño de la contraseña");
        int numero = teclado.nextInt();
        // bucle que genera 10 contraseñas
        for (int i = 0; i < 10; i++) {
            // genera la contraseña
            password2 = RandomStringUtils.random(numero, conjuntocaracteres);
            // muestra la contraseña por pantalla
            System.out.println(password2);
        }
        return password2;
    }

}
