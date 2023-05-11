/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package imprimirnumero;

/**
 *
 * @author joseangel
 */
public class Recursividad {

    public static void main(String[] args) {
        imprimirNumeroRecursivo(5);
    }
    
    public static void imprimirNumeroRecursivo(int numero){
        // si el numero es mayor o igual que 0, llama de nuevo al metodo
        if (numero > 0) {
            // llamara a este metodo con el numero introducido
            // por parametro menos 1
            imprimirNumeroRecursivo(numero -1);
        }
        // si ponemos numero >= 0 en la condicion
        // (imprimira todos los numeros pero imprimira -1, porque cuando
        // el numero llega a ser -1 no se vuelve a llamar al metodo 
        // pero si imprimira cuando 0 sea menos 1)
        System.out.println(numero);
    }
}
