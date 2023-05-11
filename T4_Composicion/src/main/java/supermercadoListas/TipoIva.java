/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package supermercadoListas;

/**
 *
 * @author Jose Angel
 */
public enum TipoIva {
    CUATRO(1,4),
    DIEZ(2,10),
    VIENTIUNO(3,21);

    // atributos del enum
    private int codigo;
    private int numero;
    
    // CONSTRUCTOR PRIVADO PARA LOS ENUM ARRIBA DECLARADOS
    private TipoIva(int codigo, int numero) {
        this.codigo = codigo;
        this.numero = numero;
    }
    
    // SOLO GETTERS
    public int getCodigo() {
        return codigo;
    }

    public int getNumero() {
        return numero;
    }

    

    
}
