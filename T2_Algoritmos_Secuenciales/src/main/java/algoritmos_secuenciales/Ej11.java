/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos_secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class Ej11 {
    public static void main(String[] args) {
        //Declaracion de variables
        double areaTriangulo;
        double areaSemicirculo;
        double radio;
        double altura;
        double cateto;
        double areaTotal;
        
        
        // Pedir datos al usuario
        String r = JOptionPane.showInputDialog("Introduce el radio: ");
        radio = Double.parseDouble(r);
        
        String h = JOptionPane.showInputDialog("Introduce la altura: ");
        cateto = Double.parseDouble(h);
        
        // Determinar las areas
        // area triangulo b*h/2
        // no sabemos la altura pero si un cateto
        // determinar tamaño de la altura 
        altura = Math.sqrt(Math.pow(cateto, 2) - Math.pow(radio, 2));
        // Determinar el area del triagnulo rectangulo
        areaTriangulo = (radio * altura) / 2;
        // Multiplicamos el area x2 porque son 2 triangulo rectangulos
        areaTriangulo = areaTriangulo * 2;
        areaSemicirculo = (Math.PI * Math.pow(radio, 2)) / 2;
        
        // Sumar las areas de las 2 figuras
        areaTotal = areaTriangulo + areaSemicirculo;
        
        // Mostrar resultado por pantalla
        JOptionPane.showMessageDialog(null, "El area de la pieza es : " + areaTotal);
        
        
    }
}
