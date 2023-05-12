/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciacatalogos;

/**
 *
 * @author joseangel
 */
public class CatalogoAlquiler extends Catalogo<Alquiler> {

    public CatalogoAlquiler(int tamañoCatalogo) {
        super(tamañoCatalogo);
    }

    // metodo que devuelve un cliente completo pasandole un nif
    public Alquiler buscarAlquiler(int codigoAlquiler) {
        // crear un alquiler con el coigoAlquiler que se ha pasado por parametro
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(codigoAlquiler);
        // llamada al metodo buscar alquiler pasando el alquiler aux con 
        // codigo de alquiler puesto pasado por parametro
        int posicion = this.buscarElemento(aux);
        // si el numero es mayor que 0 devuelve el cliente de esa posicion
        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }
    
    
}
