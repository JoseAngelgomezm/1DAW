/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

import java.time.LocalDate;

/**
 *
 * @author Jose Angel
 */
public final class Pintura extends Obra{

    private LocalDate añoCreacion;

    public Pintura(LocalDate añoCreacion, int idObra, String autor) {
        super(idObra, autor);
        this.añoCreacion = añoCreacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Pintura{");
        sb.append("a\u00f1oCreacion=").append(añoCreacion);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    public LocalDate getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(LocalDate añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

   

}
