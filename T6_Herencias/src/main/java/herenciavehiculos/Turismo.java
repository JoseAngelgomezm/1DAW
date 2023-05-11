/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciavehiculos;

import herenciacatalogos.Color;
import herenciacatalogos.Modelo;

/**
 *
 * @author Jose Angel
 */
public class Turismo extends Vehiculo{
    
    private int peso;

    public Turismo(int peso, String bastidor, String matricula, Color color, Modelo modelo, double tarifa) {
        super(bastidor, matricula, color, modelo, tarifa);
        this.peso = peso;
    }

    public Turismo() {
    }
    
    
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turismo{");
        sb.append("peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
    
    
}
