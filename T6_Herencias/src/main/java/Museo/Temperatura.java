/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author joseangel
 */
public final class Temperatura extends Sensor {
    
    private double temperaturaActual;
    private final double maximaTemperatura;
    private final double minimaTemperatura;
    
    public Temperatura(double temperaturaActual) {
        super(0);
        this.temperaturaActual = temperaturaActual;
        this.maximaTemperatura = 36;
        this.minimaTemperatura = 5;
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temperatura{");
        sb.append("temperaturaActual=").append(temperaturaActual);
        sb.append(", maximaTemperatura=").append(maximaTemperatura);
        sb.append(", minimaTemperatura=").append(minimaTemperatura);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void alarma() {
        if (this.temperaturaActual > maximaTemperatura) {
            
            System.out.println("Alarma: temperatura por encima del minimo");
            
        } else if (this.temperaturaActual < this.minimaTemperatura) {
            
            System.out.println("Alarma: temperatura por debajo del minimo");
            
        }
    }
    
    public double getTemperaturaActual() {
        return temperaturaActual;
    }
    
    public void setTemperaturaActual(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }
    
}
