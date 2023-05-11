/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package series;


import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;


/**
 *
 * @author Jose Angel
 */
public class Persona {
    // ATRIBUTOS DE LA CLASE PERSONA
    private String nombre;
    private String NIF;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    
    // METODO PARA FILTRAR EL SEXO
    private boolean filtrarSexo(char sexo){
       return (sexo == 'H' || sexo == 'M');
    }
    // METODO PARA COMPROBAR EL IMC Y SEGUN EL IMC NOS DEVULEVE UNA RESPUESTA
    public String comprobarIMC(float imc){
        if (imc < 18.4 ) {
            return "Bajo Peso";
        }
        else if (imc >= 18.5 && imc <=24.9) {
            return "Peso Normal";
        }else if (imc >= 25 && imc <=25.9) {
            return "Sobrepeso";
        }else if (imc >= 30 && imc <=34.9) {
            return "Obesidad 1";
        }else if (imc >= 35 && imc <=35.9) {
            return "Obesidad 2";
        }
        else{
            return "Obesidad 3";
        }
    }
    
    // METODO QUE GENERA UN NIF ALEATORIO
    private String generarNif() {
        // genera 8 numeros aleatorio
       String numeros = RandomStringUtils.randomNumeric(8);
       // determinamos el resto de la division entre 23
       int aux = Integer.parseInt(numeros);
       int resto = aux % 23;
       String letra = "a";
       // segun el resto obtenemos una letra
        switch (resto) {
            case 0 -> letra = "T";
            case 1 -> letra = "R";
            case 2 -> letra = "W";
            case 3 -> letra = "A";
            case 4 -> letra = "G";
            case 5 -> letra = "M";
            case 6 -> letra = "Y";
            case 7 -> letra = "F";
            case 8 -> letra = "P";
            case 9 -> letra = "D";
            case 10 -> letra = "X";
            case 11 -> letra = "B";
            case 12 -> letra = "N";
            case 13 -> letra = "J";
            case 14 -> letra = "Z";
            case 15 -> letra = "S";
            case 16 -> letra = "Q";
            case 17 -> letra = "V";
            case 18 -> letra = "H";
            case 19 -> letra = "L";
            case 20 -> letra = "C";
            case 21 -> letra = "K";
            case 22 -> letra = "E";
        }
       // el nif es los 8 numeros + la letra
       String nif = numeros + letra;
       return nif;
    }
    
    // CONSTRUCTOR PARAMETRIZADO QUE GENERA UN NIF ALEATORIO
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.NIF = generarNif();
        this.edad = edad;
        // si el sexo es uno que corresponde se crea con ese sexo sino se crea con O
        if (filtrarSexo(sexo)) {
            this.sexo = sexo;
        } else{
            this.sexo = 'O';
        }
        this.peso = peso;
        this.altura = altura;
    }

    // CONTRCUTOR QUE GENERA UNA PERSONA CON PARAMETROS POR DEFECTO
    public Persona() {
    }
    
    // METODO QUE DETERMINA LA MAYORIA DE EDAD
    public boolean esMayorEdad (){
        return this.edad >= 18;
    }
    
    // METODO QUE CALCULA EL IMC
    public float calcularIMC (){
        // formula imc (peso / altura/100 al cuadrado) teniendo en cuenta 
        // que el peso es en Kg y la altura en metros
        float imc = (float) (this.peso / Math.pow(altura, 2));
        return imc;
    }
    
    // METODO QUE AL PASARLE UNA SERIE PREGUNTA SI LE HA GUSTADO Y LE DA LIKE
    public void darLike (Serie serie){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Te ha gustado la serie " + serie.getTitulo() + "?");
        String respuesta = teclado.nextLine();
        // si decimos que si, aumentamos un like
        if (respuesta.equals("si")) {
            serie.darLike();// metodo de la clase serie que suma un like a la serie
        }
    }
    
    // METODO TO STRING CON TODOS LOS PARAMETROS
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", NIF=" + NIF + 
                ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + 
                ", altura=" + altura + '}';
    }
    
    // METODOS GET Y SET
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
