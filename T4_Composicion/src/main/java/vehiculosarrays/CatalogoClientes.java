/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosarrays;

/**
 *
 * @author joseangel
 */
public class CatalogoClientes {
    int numeroClientes;
    private Clientes[] listaClientes;
    
    
    // constructor para crear un catalogo de lista de clientes con 
    // nombre y apellidos a null y un NIF aleatorio
    // El constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con clientes aleatorios
    public CatalogoClientes(int numeroClientes) {
        // el numero de clientes es igual al que recibe por parametros
        this.numeroClientes = numeroClientes;
        // se crea un array con el tamaño del numero de clientes que hemos pasado
        this.listaClientes = new Clientes[numeroClientes];
        // la estructura de datos ya esta creada, ahora hay que rellenarla
        for (int i = 0; i < listaClientes.length; i++) {
            // en cada posicion llamar al constructor por defecto de clientes
            // que crea los clientes con nif aleatorio
            this.listaClientes[i] = new Clientes();
        }
        
    }
    
    // metodo que añade un cliente
     public void añadirCliente(Clientes clienteAñadir){
        // si el numero de clientes es menor al tamaño del array de la lista
        // (significa que hay un hueco) hay que buscar cual es la posicion vacia
        if (this.numeroClientes < this.listaClientes.length) {
            // se recorre el array de clientes para buscar el hueco
            for (int i = 0; i < listaClientes.length; i++) {
                // si la posicion que esta mirando es null se añade el cliente
                // (posicion disponible que buscabamos)
                if(this.listaClientes[i] == null){
                    this.listaClientes[i] = clienteAñadir;
                    // aumentar en 1 el numero de clientes una vez añadido 
                    this.numeroClientes++;
                    // salir del bucle para no seguir recorriendo el array
                    break;
                }
                
            }
        // caso en el que el array lista clientes esta lleno
        }else{
            // sobrescribe el array listaClientes con una copia de listaVehiculos
            this.listaClientes = copiarArray(this.listaClientes);
            // una vez copiado, en la ultima posicion añadir el nuevo cliente
            this.listaClientes[this.numeroClientes] = clienteAñadir;
            // añadir uno a numero de clientes
            this.numeroClientes++;
        }
    }
     
    // metodo que copia un array en otro
     private Clientes[] copiarArray(Clientes [] ArrayClientesACopiar){
        // crear un array nuevo con el doble de tamaño que el array recibido
        Clientes[] nuevo = new Clientes [ArrayClientesACopiar.length*2];
        // recorrer el array antiguo y copiarlo al nuevo
        for (int i = 0; i < ArrayClientesACopiar.length; i++) {
            // copiar del array antiguo al nuevo
            nuevo[i] = ArrayClientesACopiar [i];
        }
        return nuevo;
    }
    
    //metodo que busca un cliente y devuelve la posicion en la que esta
    private int buscarCliente(Clientes cualquierCliente) {
        // busqueda secuencial (recorre todo el array)
        // recorre toda la lista de clientes
        for (int i = 0; i < this.listaClientes.length; i++) {
            // si el cliente que recibe es igual al que esta en la posicion y
            // el cliente que estamos comparando es distinto de null devuelve 
            // la posicion actual que estamos mirando
            if (cualquierCliente.equals(this.listaClientes[i]) && this.listaClientes[i] != null) {
                //devuelve esa posicion
                return i;
            }
        }
        // devuelve -1 en caso de no encontrarlo
        return -1;
    }
    
    // metodo que devuelve un cliente completo pasandole un nif
    public Clientes buscarCliente(String nif){
        // crear un cliente con el nif que se ha pasado por parametro
        Clientes aux = new Clientes("", "", nif);
        // llamada al metodo buscar clientes
        int posicion = buscarCliente(aux);
        // si el numero es mayor que 0 devuelve el cliente de esa posicion
        return (posicion>=0)?this.listaClientes[posicion]:null;
        
    }
    
    //metodo que borra un cliente
    public boolean borrarCliente(Clientes clienteABorrar) {
        // obtenemos la posicion en la que esta el cliente que queremos borrar
        // llamando al metodo de buscar cliente
        int posicion = buscarCliente(clienteABorrar);
        // si la posicion es mayor que 0 significa que hemos encontrado al 
        // cliente
        if (posicion >= 0) {
            // ponemos la posicion de la lista de clientes a null (borrar cliente)
            this.listaClientes[posicion] = null;
            // una vez borrado el cliente restar uno a la cantidad de clientes
            this.numeroClientes--;
            return true;
        }
        return false;
    }
     
    // toString del catalogo
     @Override
    public String toString() {
        String tmp = "";
        for (Clientes v : listaClientes) {
            // si el vehiculo no es null lo añade al tmp
            if ( v != null) {
                tmp += v.toString() + "\n";
            }
        }
        return tmp;
    }
    
    // getters y setters
    public int getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }
    
    
    
}
