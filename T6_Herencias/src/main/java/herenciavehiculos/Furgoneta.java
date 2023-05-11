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
public class Furgoneta extends Vehiculo{
    private int cargaMaxima;

    public Furgoneta(int cargaMaxima, String bastidor, String matricula, Color color, Modelo modelo, double tarifa) {
        super(bastidor, matricula, color, modelo, tarifa);
        this.cargaMaxima = cargaMaxima;
    }

    public Furgoneta() {
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Furgoneta{");
        sb.append("cargaMaxima=").append(cargaMaxima);
        sb.append('}');
        return sb.toString();
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    
        
    
    
    
}
