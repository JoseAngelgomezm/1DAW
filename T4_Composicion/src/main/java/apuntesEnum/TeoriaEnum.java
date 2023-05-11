/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package apuntesEnum;

/**
 *
 * @author joseangel
 */
public enum TeoriaEnum {
    // objetos que vamos a crear para el enum separados por coma
    DESPIERTO(1,"Despierto"),
    JUGANDO(2,"Jugando"),
    COMIENDO(3,"Comiendo"),
    DURMIENDO(4,"Durmiendo");
    
    // atributos del enum
    private int codigoEstado;
    private String estado;
    
    
    // constructor privado para todos los enum
    private TeoriaEnum(int codigoEstado, String estado){
        this.codigoEstado = codigoEstado;
        this.estado = estado;
    }
    
    // SOLO SE PONEN GETTER PARA OBJETENER LOS DATOS DE LOS ATRIBUTOS

    public static TeoriaEnum getDESPIERTO() {
        return DESPIERTO;
    }

    public static TeoriaEnum getJUGANDO() {
        return JUGANDO;
    }

    public static TeoriaEnum getCOMIENDO() {
        return COMIENDO;
    }

    public static TeoriaEnum getDURMIENDO() {
        return DURMIENDO;
    }

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public String getEstado() {
        return estado;
    }
    
}
