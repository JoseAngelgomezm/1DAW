/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

/**
 *
 * @author joseangel
 */
public class Premios {
    private int premio;

    public Premios(int premio) {
        this.premio = premio;
    }

    public Premios() {
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.premio;
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
        final Premios other = (Premios) obj;
        return this.premio == other.premio;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Premios{");
        sb.append("premio=").append(premio);
        sb.append('}');
        return sb.toString();
    }
    
    
}
