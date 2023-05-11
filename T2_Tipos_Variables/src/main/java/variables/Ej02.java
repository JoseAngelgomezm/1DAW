/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author Jose Angel
 */
public class Ej02 {
     public static void main(String[] args) {
        // 2.a)
        int a = 1, b = 2, c = 3;
        // 2.b)
        double d = 4.5, e = 5.7, f = 6.9;
        // 2.c)
        System.out.println("Enteros: " + a + ", " + b + ", " + c);
        System.out.println("Decimales: " + d + ", " + e + ", " + f);
        // 2.d)
        b=c;
        c=a;
        a=b;
        System.out.println("Enteros cambiados: " + a + ", " + b + ", " + c);
    }
}
