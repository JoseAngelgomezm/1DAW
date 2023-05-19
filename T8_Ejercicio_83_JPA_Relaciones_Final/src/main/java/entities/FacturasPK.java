/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Jose Angel
 */
@Embeddable
public class FacturasPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_cliente")
    private int idCliente;
    @Basic(optional = false)
    @Column(name = "id_producto")
    private int idProducto;

    public FacturasPK() {
    }

    public FacturasPK(int idCliente, int idProducto) {
        this.idCliente = idCliente;
        this.idProducto = idProducto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCliente;
        hash += (int) idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturasPK)) {
            return false;
        }
        FacturasPK other = (FacturasPK) object;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (this.idProducto != other.idProducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FacturasPK[ idCliente=" + idCliente + ", idProducto=" + idProducto + " ]";
    }
    
}
