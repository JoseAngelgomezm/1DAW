/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package series;

/**
 *
 * @author joseangel
 */

// declaracion clase publica
public class Serie {
    // atributos de instancia (no son static)
    private String titulo;
    private String genero;
    private String sipnosis;
    private int numeroTemporadas;
    private int numeroLikes;
    
    // atributos de clase (son static) (no hay)
    
    // metodo que suma un like a la serie
    public void darLike(){
        this.numeroLikes ++;
    }

    // CONSTRUCTORES CON NUMERO DE LIKES
    public Serie(String titulo, String genero, String sipnosis, int numeroTemporadas, int numeroLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sipnosis = sipnosis;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroLikes = numeroLikes;
    }
    
    

    // CONSTRUCTORES SIN NUMERO DE LIKES
    public Serie(String titulo, String genero, String sipnosis, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.sipnosis = sipnosis;
        this.numeroTemporadas = numeroTemporadas;
    }
    // CONSTRUCTOR VACIO
    
    public Serie() {
        // los atributos se inicializan por defecto
        // los objeto apuntan a null
        // los numero apuntan a cero
        
    }
    
    //CONSTRUCTOR CON NUMERO DE LIKES
    
    // metodo to string

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", sipnosis=" + sipnosis + ", numeroTemporadas=" + numeroTemporadas + ", numeroLikes=" + numeroLikes + '}';
    }

    // GETTER AND SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }
    
    
}


