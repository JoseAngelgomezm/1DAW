/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14Electrodomestico;

/**
 *
 * @author Jose Angel
 */
public class CampanaExtractora extends Electrodomestico {

    private int decibelios;

    public CampanaExtractora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (decibelios < 50) {
            System.out.println("Decibelios no pueden ser menor a 50");
        } else {
            this.decibelios = decibelios;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CampanaExtractora{");
        sb.append("decibelios=").append(decibelios);
        sb.append('}');
        return sb.toString();
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

}
