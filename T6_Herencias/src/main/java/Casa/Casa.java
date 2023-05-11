/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casa;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author joseangel
 */
public class Casa {
    private Puerta puerta;
    private List<Ventana> ventanas;
    private List<Calefactor> calefactores;

    public Casa(Puerta puerta, List<Ventana> ventanas, List<Calefactor> calefactores) {
        this.puerta = puerta;
        this.ventanas = ventanas;
        this.calefactores = calefactores;
    }

    public List<Calefactor> getCalefactores() {
        return calefactores;
    }

    public void setCalefactores(List<Calefactor> calefactores) {
        this.calefactores = calefactores;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public List<Ventana> getVentanas() {
        return ventanas;
    }

    public void setVentanas(List<Ventana> ventanas) {
        this.ventanas = ventanas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.puerta);
        hash = 97 * hash + Objects.hashCode(this.ventanas);
        hash = 97 * hash + Objects.hashCode(this.calefactores);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Casa other = (Casa) obj;
        if (!Objects.equals(this.puerta, other.puerta)) {
            return false;
        }
        if (!Objects.equals(this.ventanas, other.ventanas)) {
            return false;
        }
        return Objects.equals(this.calefactores, other.calefactores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa{");
        sb.append("puerta=").append(puerta);
        sb.append(", ventanas=").append(ventanas);
        sb.append(", calefactores=").append(calefactores);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
