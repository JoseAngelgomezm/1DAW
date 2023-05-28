/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author joseangel
 */
@Entity
@Table(name = "facturas")
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f"),
    @NamedQuery(name = "Facturas.findByIdCliente", query = "SELECT f FROM Facturas f WHERE f.facturasPK.idCliente = :idCliente"),
    @NamedQuery(name = "Facturas.findByIdProducto", query = "SELECT f FROM Facturas f WHERE f.facturasPK.idProducto = :idProducto"),
    @NamedQuery(name = "Facturas.findByCantidadProductos", query = "SELECT f FROM Facturas f WHERE f.cantidadProductos = :cantidadProductos"),
    @NamedQuery(name = "Facturas.findByFechaFactura", query = "SELECT f FROM Facturas f WHERE f.facturasPK.fechaFactura = :fechaFactura"),
    @NamedQuery(name = "Facturas.deleteAll", query = "DELETE FROM Facturas"),
    @NamedQuery(name = "Facturas.findByImporteTotal", query = "SELECT f FROM Facturas f WHERE f.importeTotal = :importeTotal")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacturasPK facturasPK;
    @Column(name = "cantidad_productos")
    private Integer cantidadProductos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe_total")
    private Double importeTotal;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Clientes clientes;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productos productos;

    public Facturas() {
    }

    public Facturas(FacturasPK facturasPK) {
        this.facturasPK = facturasPK;
    }

    public Facturas(int idCliente, int idProducto, Date fechaFactura) {
        this.facturasPK = new FacturasPK(idCliente, idProducto, fechaFactura);
    }

    public FacturasPK getFacturasPK() {
        return facturasPK;
    }

    public void setFacturasPK(FacturasPK facturasPK) {
        this.facturasPK = facturasPK;
    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(Integer cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturasPK != null ? facturasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.facturasPK == null && other.facturasPK != null) || (this.facturasPK != null && !this.facturasPK.equals(other.facturasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Facturas[ facturasPK=" + facturasPK + " ]";
    }
    
}
