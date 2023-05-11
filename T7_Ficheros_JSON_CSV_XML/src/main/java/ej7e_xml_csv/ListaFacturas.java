/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7e_xml_csv;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Jose Angel
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaFacturas {

    // XmLElementWrapper define un contenedor para la lista 
    // de muebles
    @XmlElementWrapper(name = "facturas")

    // XmlElement establece el nombre de los elementos
    // Cada elemento de la lista llevará esta etiqueta en el fichero xml
    @XmlElement(name = "factura")
    private ArrayList<Factura> listaFacturas;

   
    public ArrayList<Factura> getListaMuebles() {
        return listaFacturas;
    }

    public void setLista(ArrayList<Factura> lista) {
        this.listaFacturas = lista;
    }

    

}
