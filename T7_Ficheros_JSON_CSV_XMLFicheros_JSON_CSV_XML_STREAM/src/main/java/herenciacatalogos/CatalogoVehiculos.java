/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciacatalogos;

/**
 *
 * @author joseangel
 */
public class CatalogoVehiculos extends Catalogo<Vehiculo> {

    public CatalogoVehiculos(int tamañoCatalogo) {
        super(tamañoCatalogo);
    }
    
     //metodo que devuelve un vehiculo completo pasandole un bastidor
    public Vehiculo buscarVehiculo(String bastidor) {
        // crear un vehiculo con el bastidor que se ha pasado por parametro
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        // llamada al metodo buscar vehiculo con el vehiculo creado
        int posicion = buscarElemento(aux);
        // si el numero es mayor que 0 devuelve el vehiculo de esa posicion
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
}
