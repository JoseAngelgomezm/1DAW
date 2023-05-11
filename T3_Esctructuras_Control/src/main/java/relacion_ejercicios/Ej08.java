/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacion_ejercicios;

/**
 *
 * @author Jose Angel
 */
public class Ej08 {
      public static void main(String args[]){
      char departamento = 'B';

      switch(departamento)
      {
         case 'A' :
            System.out.println("Desarrollo");
            break;
         case 'B' :
    	System.out.println("Recursos Humanos");
            break;
         case 'C' :
            System.out.println("Finanzas");
            break;
         case 'D' :
            System.out.println("Mercadeo");
         default :
            System.out.println("Departamento no válido");
      }
      System.out.println("Código para el departamento es " + departamento);
      
      // En funcion del departamento devuelve el departamento especificado
      // en este caso al estar inicializado a B
      // devolverá Recursos humanos y al final devuelve el código en este caso B
   }

}
