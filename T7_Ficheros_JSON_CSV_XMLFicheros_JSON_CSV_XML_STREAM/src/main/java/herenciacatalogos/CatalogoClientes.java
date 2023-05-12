/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciacatalogos;

/**
 *
 * @author joseangel
 */
public class CatalogoClientes extends Catalogo<Clientes> {

    public CatalogoClientes(int tamañoCatalogo) {
        super(tamañoCatalogo);
    }
    
    // metodo que devuelve un cliente completo pasandole un nif
    public Clientes buscarCliente(String nif){
        // crear un cliente con el nif que se ha pasado por parametro
        Clientes aux = new Clientes();
        aux.setNIF(nif);
        // llamada al metodo buscar clientes
        int posicion = this.buscarElemento(aux);
        // si el numero es mayor que 0 devuelve el cliente de esa posicion
        return (posicion>=0)? this.lista.get(posicion): null;
        
    }
}
