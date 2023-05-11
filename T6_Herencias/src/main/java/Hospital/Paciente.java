/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author joseangel
 */
public class Paciente extends Persona{
    private String numeroHistoria;

    public Paciente(String numeroHistoria, NIF nifPersona, String nombre, String apellidos) {
        super(nifPersona, nombre, apellidos);
        this.numeroHistoria = numeroHistoria;
    }
    
    public void tomarMedicina(String medicina){
       Random generador = new Random();
       int numero = generador.nextInt(1, 3);
       
        if (numero == 1) {
            System.out.println("El paciente se ha curado");
        }else{
            System.out.println("El paciente no se ha curado");
        }
    }
    
    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }
    
    
   
}
