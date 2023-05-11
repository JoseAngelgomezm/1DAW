/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciavehiculos;

import herenciacatalogos.Color;
import herenciacatalogos.Modelo;

/**
 *
 * @author joseangel
 */

// Deportivo hereda de vehiculo (extends)
public class Deportivo extends Vehiculo{
    
    // este atributo solo lo tiene deportivo, desde la clase padre (vehiculo)
    // no es accesible , ya que no lo contiene
    private int cilindrada;
    
    // los constructores no se heredan, hay que crear uno nuevo,
    // la primera linea de codigo de un constructor en la clase hija (deportivo)
    // debe llamar al constructor de la clase padre (vehiculo)
    public Deportivo(int cilindrada, String bastidor, String matricula, Color color, Modelo modelo, double tarifa) {
        // llamada al constructor de la clase vehiculo
        super(bastidor, matricula, color, modelo, tarifa);
        // inicializa los atributos de la clase hija (que es esta, vehiculo)
        this.cilindrada = cilindrada;
    }
    
    // constructor por defecto
    public Deportivo() {
        // implicitamente llama al constructor por defecto del padre (vehiculo)
    }

    // si no hay toString en la clase hija, llama al toString de la clase padre.
    // solo se añaden los atributos de la clase hija (cilindrada).
    // si queremos representar mas atributos hay que añadirlos:
    // sb.append("bastidor=").append(this.getBastidor());
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deportivo{");
        sb.append("cilindrada=").append(cilindrada);
        sb.append(" bastidor=").append(this.getBastidor());
        sb.append(" matricula=").append(this.getCilindrada());
        sb.append('}');
        return sb.toString();
    }

    
    
    
    // los getter y setter de los atributos de la clase hija (deportivo)
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
    
}
