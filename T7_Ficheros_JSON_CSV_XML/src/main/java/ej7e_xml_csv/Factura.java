/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7e_xml_csv;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Jose Angel
 */
// Anotación @XmlRootElement, nombre de la etiqueta XML raíz.
@XmlRootElement(name = "factura")
// Anotación @XmlAccesorType define el elemento que usará JAXB durante el 
// procesamiento de datos (en este caso por atributo)
@XmlAccessorType(XmlAccessType.FIELD)
public class Factura {

    private String codigoUnico;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate fechaEmision;
    private String descripcion;
    private double totalImporteFactura;
    private static int contadorInstancias = 0;

    public Factura(LocalDate fechaEmision, String descripcion, double totalImporteFactura) {
        contadorInstancias++;

        this.codigoUnico = Integer.toString(contadorInstancias);
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporteFactura = totalImporteFactura;
    }

    public Factura() {
        Random generador = new Random();
        double[] numero = generador.doubles(1, 100, 1001).toArray();
        contadorInstancias++;

        this.codigoUnico = Integer.toString(contadorInstancias);
        this.fechaEmision = LocalDate.now();
        this.descripcion = RandomStringUtils.randomAlphabetic(10);
        this.totalImporteFactura = numero[0];

    }

    public Factura(LocalDate fechaEmision, String descripcion, double totalImporteFactura, String codigo) {
        this.codigoUnico = codigo;
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporteFactura = totalImporteFactura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codigoUnico).append(";");
        sb.append(fechaEmision).append(";");
        sb.append(descripcion).append(";");
        sb.append(totalImporteFactura).append(";");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.codigoUnico);
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
        final Factura other = (Factura) obj;
        return Objects.equals(this.codigoUnico, other.codigoUnico);
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotalImporteFactura() {
        return totalImporteFactura;
    }

    public void setTotalImporteFactura(double totalImporteFactura) {
        this.totalImporteFactura = totalImporteFactura;
    }

}
