/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jose Angel
 */
@Entity
@Table(name = "clientes")
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByIdCliente", query = "SELECT c FROM Clientes c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Clientes.findByNifCliente", query = "SELECT c FROM Clientes c WHERE c.nifCliente = :nifCliente"),
    @NamedQuery(name = "Clientes.findByNombrecliente", query = "SELECT c FROM Clientes c WHERE c.nombrecliente = :nombrecliente"),
    @NamedQuery(name = "Clientes.findByApellidosCliente", query = "SELECT c FROM Clientes c WHERE c.apellidosCliente = :apellidosCliente"),
    @NamedQuery(name = "Clientes.findByFechaNacimientocliente", query = "SELECT c FROM Clientes c WHERE c.fechaNacimientocliente = :fechaNacimientocliente")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "nif_cliente")
    private String nifCliente;
    @Column(name = "nombrecliente")
    private String nombrecliente;
    @Column(name = "apellidos_cliente")
    private String apellidosCliente;
    @Column(name = "fechaNacimiento_cliente")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimientocliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientes")
    private List<Facturas> facturasList;
    @JoinColumn(name = "id_tarjetaBancaria", referencedColumnName = "id_tarjetaBancaria")
    @ManyToOne
    private TarjetasBancarias idtarjetaBancaria;

    public Clientes() {
    }

    public Clientes(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public Date getFechaNacimientocliente() {
        return fechaNacimientocliente;
    }

    public void setFechaNacimientocliente(Date fechaNacimientocliente) {
        this.fechaNacimientocliente = fechaNacimientocliente;
    }

    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    public TarjetasBancarias getIdtarjetaBancaria() {
        return idtarjetaBancaria;
    }

    public void setIdtarjetaBancaria(TarjetasBancarias idtarjetaBancaria) {
        this.idtarjetaBancaria = idtarjetaBancaria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idCliente.toString();
    }
    
}
