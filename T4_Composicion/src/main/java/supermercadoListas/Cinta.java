/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercadoListas;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Jose Angel
 */
public class Cinta {
    private List<Productos> listaProductos;
    
    // Metodo que añade productos a la lista
    public void añadirProducto(Productos cualquierProducto){
        // comprobar si la lista tiene el producto
        if (this.listaProductos.contains(cualquierProducto)) {
            // si lo tiene añadir la cantidad del producto que pasamos por
            // parametro al producto que hay en la lista
            // obtener el indice del producto en la lista
            int indice = this.listaProductos.indexOf(cualquierProducto);
            // obtener el prodcuto que hay en la lista
            Productos productoLista = this.listaProductos.get(indice);
            // obtener la cantidad de ese producto
            int cantidadDelProductoLista = productoLista.cantidad();
            // la cantidad del producto nuevo sera la suma de la cantidad
            // del producto que pasamos por parametro
            int cantidadDelProductoNuevo = cantidadDelProductoLista + cualquierProducto.cantidad();
            // eliminar el producto que habia en la lista
            this.listaProductos.remove(indice);
            // añadir un prodcuto nuevo con la cantidad nueva
            // crear el producto con la nueva cantidad
            Productos nuevoProducto = new Productos
                (cualquierProducto.nombre(), 
                 cantidadDelProductoNuevo, 
                 cualquierProducto.precio(), 
                 cualquierProducto.tipoDeIva());
            // Añadir el producto nuevo en el indice que estaba el que eliminamos
            this.listaProductos.add(indice, nuevoProducto);
        // si no lo contiene añadirlo
        }else{
            this.listaProductos.add(cualquierProducto);
        }
    }
    
    // metodo que quita productos si esta en la lista
    public void quitarProducto(String nombreDelProducto){
        // comprobar si la lista tiene el producto
        // recorrer la lista y obtener el nombre
        for (int i = 0; i < listaProductos.size(); i++) {
            // obtener el nombre del prodcuto
            String nombreDeProductoEnLista = this.listaProductos.get(i).nombre();
            // quitar espacios del nombre del producto en la lista
            nombreDeProductoEnLista = StringUtils.trim(nombreDeProductoEnLista);
            // comprobar si es igual al nombre del producto de la lista
            if (nombreDeProductoEnLista.equalsIgnoreCase(nombreDelProducto)){
                // si es igual significa que existe en la lista y lo borra
                this.listaProductos.remove(i);
            }
            
        }
    }
    
    // metodo que devuelve true si la lista de productos esta vacia
    public boolean cestaVacia(){
        return this.listaProductos.isEmpty(); 
    }
    
    //TO STRING

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cinta{");
        sb.append("listaProductos=").append(listaProductos);
        sb.append('}');
        return sb.toString();
    }
    
    
    // CONSTRUCTOR
    public Cinta() {
        this.listaProductos = new ArrayList<>();
    }
    
    // GETTER Y SETTER
    public List<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
    
    
    
}
