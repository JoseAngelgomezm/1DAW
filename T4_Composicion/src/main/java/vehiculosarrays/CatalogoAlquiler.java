/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosarrays;

/**
 *
 * @author joseangel
 */
public class CatalogoAlquiler {
    int numeroAlquileres;
    private Alquiler[] listaAlquileres;
    
    
    // constructor para crear un catalogo de lista de alquileres con alquilerID
    // autoincrementado
    // El constructor recibe el tamaño de alquileres e inicializa la estructura
    // de datos con alquileres vacios
    public CatalogoAlquiler(int numeroAlquiler) {
        // el numero de alquiler es igual al que recibe por parametros
        this.numeroAlquileres = 0;
        // se crea un array con el tamaño del numero de alquiler que hemos pasado
        this.listaAlquileres = new Alquiler[numeroAlquiler];
        // la estructura de datos ya esta creada, ahora hay que rellenarla
    }
    
    // metodo que añade un alquiler
     public void añadirAlquiler(Alquiler AlquilerAñadir){
        // si el numero de alquileres es menor al tamaño del array de la lista
        // (significa que hay un hueco) hay que buscar cual es la posicion vacia
        if (this.numeroAlquileres < this.listaAlquileres.length) {
            // se recorre el array de alquiler para buscar el hueco
            for (int i = 0; i < listaAlquileres.length; i++) {
                // si la posicion que esta mirando es null se añade el alquiler
                // (posicion disponible que buscabamos)
                if(this.listaAlquileres[i] == null){
                    this.listaAlquileres[i] = AlquilerAñadir;
                    // aumentar en 1 el numero de alquileres una vez añadido 
                    this.numeroAlquileres++;
                    // salir del bucle para no seguir recorriendo el array
                    break;
                }
                
            }
        // caso en el que el array lista alquileres esta lleno
        }else{
            // sobrescribe el array listaAlquileres con una copia de listaAlquieleres
            this.listaAlquileres = copiarArray(this.listaAlquileres);
            // una vez copiado, en la ultima posicion añadir el nuevo alquiler
            this.listaAlquileres[this.numeroAlquileres] = AlquilerAñadir;
            // añadir uno a numero de alquileres
            this.numeroAlquileres++;
        }
    }
     
    // metodo que copia un array en otro
     private Alquiler[] copiarArray(Alquiler [] ArrayAlquilerCopiar){
        // crear un array nuevo con el doble de tamaño que el array recibido
        Alquiler[] nuevo = new Alquiler [ArrayAlquilerCopiar.length*2];
        // recorrer el array antiguo y copiarlo al nuevo
        for (int i = 0; i < ArrayAlquilerCopiar.length; i++) {
            // copiar del array antiguo al nuevo
            nuevo[i] = ArrayAlquilerCopiar [i];
        }
        return nuevo;
    }
    
    //metodo que busca un alquiler y devuelve la posicion en la que esta
    private int buscarAlquiler(Alquiler cualquierAlquiler) {
        // busqueda secuencial (recorre todo el array)
        // recorre toda la lista de clientes
        for (int i = 0; i < this.listaAlquileres.length; i++) {
            // si el alquiler que recibe es igual al que esta en la posicion y
            // el cliente que estamos comparando es distinto de null devuelve 
            // la posicion actual que estamos mirando
            if (cualquierAlquiler.equals(this.listaAlquileres[i]) && this.listaAlquileres[i] != null) {
                //devuelve esa posicion
                return i;
            }
        }
        // devuelve -1 en caso de no encontrarlo
        return -1;
    }
    
    // metodo que devuelve un cliente completo pasandole un nif
    public Alquiler buscarAlquiler(int codigoAlquiler){
        // crear un alquiler con el coigoAlquiler que se ha pasado por parametro
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(codigoAlquiler);
        // llamada al metodo buscar alquiler pasando el alquiler aux con 
        // codigo de alquiler puesto pasado por parametro
        int posicion = buscarAlquiler(aux);
        // si el numero es mayor que 0 devuelve el cliente de esa posicion
        return (posicion>=0)?this.listaAlquileres[posicion]:null;
        
    }
    
    //metodo que borra un alquiler
    public boolean borrarAlquiler(Alquiler alquilerABorrar) {
        // obtenemos la posicion en la que esta el alquiler que queremos borrar
        // llamando al metodo de buscar alquiler
        int posicion = buscarAlquiler(alquilerABorrar);
        // si la posicion es mayor que 0 significa que hemos encontrado
        // el alquiler
        if (posicion >= 0) {
            // ponemos la posicion de la lista de alquileres a null (borrar alquiler)
            this.listaAlquileres[posicion] = null;
            // una vez borrado el alquiler restar uno a la cantidad de alquileres
            this.numeroAlquileres--;
            return true;
        }
        return false;
    }
     
    // toString del catalogo
     @Override
    public String toString() {
        String tmp = "";
        for (Alquiler v : listaAlquileres) {
            // si el vehiculo no es null lo añade al tmp
            if ( v != null) {
                tmp += v.toString() + "\n";
            }
        }
        return tmp;
    }
    
    // getters y setters
    public int getNumeroClientes() {
        return numeroAlquileres;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroAlquileres = numeroClientes;
    }
    
    
    
}
