/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera;

/**
 *
 * @author Jose Angel
 */
public class Cafetera {

    //Atributos de la cafetera
    private double cantidadMaxima;
    private double cantidadActual;

    //Constructor que solo recibe la cantidad maxima de la cafetera
    public Cafetera(double cantidadMaxima) {
        this.cantidadActual = cantidadMaxima;// pione la cafetera llena
    }

    // constructor con ambos parametros
    public Cafetera(double cantidadMaxima, double cantidadActual) {
       // si la cantidad actual es mayor que la maxima
        if (cantidadActual > cantidadMaxima) {
            // pone la actual igual a la maxima
            this.cantidadActual = cantidadMaxima;
            this.cantidadMaxima = cantidadMaxima;
        }
        else{
            this.cantidadActual = cantidadActual;
            this.cantidadMaxima = cantidadMaxima;
        }
    }

    // Constructor por defecto
    public Cafetera() {
        this.cantidadActual = 0; // se establece la cantidad actual a 0 (vacia)
        this.cantidadMaxima = 1000;// se establece la cantidad maxima a 1000
    }
    
    //metodo que llena la cafetera
    public void llenarCafetera (){
        this.cantidadActual = this.cantidadMaxima;
    }
    
    //metodo servir taza
    public void servirTaza(double cantidadAServir){
        // se crea una varibale para la cantidad que habra en la taza
        double cantidadTaza;
        // si la cantidadAServir es mayor a la cantidadActual, se sirve lo que queda
        if (cantidadAServir > this.cantidadActual) {
            cantidadTaza = this.cantidadActual;
            this.cantidadActual = 0;
            System.out.println("Se ha servido todo lo que habia " + cantidadTaza);
        }
        else{
            cantidadTaza = cantidadAServir;
            this.cantidadActual -= cantidadAServir;
            System.out.println("Se ha servido " + cantidadTaza + " en la taza");
        }
    }
    
    //metodo para vaciar la cafetera
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    
    // metodo que agrega cafe sin pasarse de la cantidadMaxima permitida
    public void agregarCafe(double cantidadAgregar){
        // creamos la varibale para ver el margen de llenado que tenemos
        double margen = this.cantidadMaxima - this.cantidadActual;
        // si la cantidad a agregar es mayor que lo que podemos agregar
        if (cantidadAgregar > margen) {
            //llenamos la cafetera
            llenarCafetera();
            // indicamos el margen de llenado y la cantidad que se ha indicado
            System.out.println("se ha puesto " + margen + 
                    " y se ha indicado llenar " + cantidadAgregar);
        // si no es mayor se suma la cantidad a agregar a la actual
        }else{
            this.cantidadActual += cantidadAgregar;
        }
    }
    
    // toString
    @Override
    public String toString() {
        return "Cafetera{" + "cantidadMaxima=" + cantidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    // getter y setter
    public double getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(double cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
