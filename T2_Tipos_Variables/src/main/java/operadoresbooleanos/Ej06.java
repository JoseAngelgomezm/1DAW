/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresbooleanos;

/**
 *
 * @author Jose Angel
 */
public class Ej06 {
    public static void main(String[] args) {
        // Funciona, compara si el numero 83 se corresponde con el valor numerico de
        // la letra a, siempre saldrá falso porque tiene un falso despues del &&
        boolean adivina = ((83 == 'a') && false);
	System.out.println(adivina);
        
        // Funciona pero muestra el valor numerico de la letra a
	int a = 'a';
	System.out.println(a);
        
        // no funciona, el correcto funcionamiento seria quitando la parte decimal
        // o declarando el numero como double
	int number = 2;
	System.out.println(number);
        
        // no funciona, el correcto funcionamiento seria cambiar la coma por el punto
	double pi = 3.14;
	System.out.println(pi);
        
        // funciona, compara que el primer valor sea igual que el segundo 
	 boolean test = (1==1);
	System.out.println(test);
    }
}
