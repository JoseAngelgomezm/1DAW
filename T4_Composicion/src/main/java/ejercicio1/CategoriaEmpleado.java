/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Jose Angel
 */
public enum CategoriaEmpleado {
    INICIAL("Categoria Basica", 50),
    MEDIA("Categoria Media", 70),
    AVANZADA("Categoria Profesional", 100);

    private String nombreCategoria;
    private int complementoEuros;

    private CategoriaEmpleado(String nombreCategoria, int complementoEuros) {
        this.nombreCategoria = nombreCategoria;
        this.complementoEuros = complementoEuros;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public int getComplementoEuros() {
        return complementoEuros;
    }

}
