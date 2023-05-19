/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jose Angel
 */
@Entity
@Table(name = "tarjetasBancarias")
@NamedQueries({
    @NamedQuery(name = "TarjetasBancarias.findAll", query = "SELECT t FROM TarjetasBancarias t"),
    @NamedQuery(name = "TarjetasBancarias.findByIdtarjetaBancaria", query = "SELECT t FROM TarjetasBancarias t WHERE t.idtarjetaBancaria = :idtarjetaBancaria"),
    @NamedQuery(name = "TarjetasBancarias.findByNumeroTarjeta", query = "SELECT t FROM TarjetasBancarias t WHERE t.numeroTarjeta = :numeroTarjeta")})
public class TarjetasBancarias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tarjetaBancaria")
    private Integer idtarjetaBancaria;
    @Column(name = "numero_tarjeta")
    private String numeroTarjeta;

    public TarjetasBancarias() {
    }

    public TarjetasBancarias(Integer idtarjetaBancaria) {
        this.idtarjetaBancaria = idtarjetaBancaria;
    }

    public Integer getIdtarjetaBancaria() {
        return idtarjetaBancaria;
    }

    public void setIdtarjetaBancaria(Integer idtarjetaBancaria) {
        this.idtarjetaBancaria = idtarjetaBancaria;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarjetaBancaria != null ? idtarjetaBancaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarjetasBancarias)) {
            return false;
        }
        TarjetasBancarias other = (TarjetasBancarias) object;
        if ((this.idtarjetaBancaria == null && other.idtarjetaBancaria != null) || (this.idtarjetaBancaria != null && !this.idtarjetaBancaria.equals(other.idtarjetaBancaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TarjetasBancarias[ idtarjetaBancaria=" + idtarjetaBancaria + " ]";
    }
    
}
