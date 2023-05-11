/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Jose Angel
 */
public class Ej03 {
    public static void main(String[] args) {
        //Declaracion de variables
        // 3.a)
        int a=10,  b=5, i=0;
        int resultadoSuma;
        int resultadoResta;
        int resultadoMultiplicacion;
        int resultadoDivision;
        // 3.b)
        double c=71.3, d=4.8; 
        double resultadoSumaComa;
        double resultadoRestaComa;
        double resultadoMultiplicacionComa;
        double resultadoDivisionComa;
        // Operaciones
        // 3.c)
        resultadoSuma = a+b;
        resultadoResta = a-b;
        resultadoMultiplicacion = a*b;
        resultadoDivision = a/b;
        resultadoSumaComa = c+d;
        resultadoRestaComa = c-d;
        resultadoMultiplicacionComa= c*d;
        resultadoDivisionComa = c/d;
        //Mostrar resultados con textblock
        // 3.d)
        String resultados = """
                          Restulado a+b: %d
                          Resultado a-b: %d
                          Resultado a*b: %d
                          Resultado a/b: %d
                          Resultado c+d: %f
                          Resultado c-d: %f
                          Resultado c*d: %f
                          Resultado c/d: %f
                          """.formatted(resultadoSuma,resultadoResta,resultadoMultiplicacion,
                                  resultadoDivision,resultadoSumaComa,resultadoRestaComa,
                                  resultadoMultiplicacionComa,resultadoDivisionComa);
        
        System.out.println(resultados);
        // 3.e)
        // Operaciones
        a*=3;
        b-=1;
        a/=b;
        c+=d;
        // Mostrar resultados
        System.out.println("Resultado a*=3: " + a);
        System.out.println("Resultado b-=1: " + b);
        System.out.println("Resultado a/=b: " + a);
        System.out.println("Resultado c+=d: " + c);
        // 3.f)
        // Mostrar resultados
        System.out.println("Resultado i: " + i);
        System.out.println("Resultado i++: " + i++);
        System.out.println("Resultado i: " + i);
        System.out.println("Resultado ++i: " + ++i);
    }
}
