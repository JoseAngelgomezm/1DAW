/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author joseangel
 */
public final class Humedad extends Sensor {
    
    private double humedadActual;
    private final double maximaHumedad;
    private final double minimaHumedad;
    
    public Humedad(double humedadActual) {
        super(0);
        this.humedadActual = humedadActual;
        this.maximaHumedad = 18;
        this.minimaHumedad = 5;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Humedad{");
        sb.append("humedadActual=").append(humedadActual);
        sb.append(", maximaHumedad=").append(maximaHumedad);
        sb.append(", minimaHumedad=").append(minimaHumedad);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void alarma() {
        if (this.humedadActual > maximaHumedad) {
            
            System.out.println("Alarma: humedad por encima del minimo");
            
        } else if (this.humedadActual < this.minimaHumedad) {
            
            System.out.println("Alarma: humedad por debajo del minimo");
            
        }
    }
    
    public double getHumedadActual() {
        return humedadActual;
    }
    
    public void setHumedadActual(double humedadActual) {
        this.humedadActual = humedadActual;
    }
    
}
