/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej3;

/**
 *
 * @author Jose Angel
 */
public enum Voz {
    CONTRATENOR("Masculina"),
    TENOR("Masculina"),
    BARITONO("Masculina"),
    SOPRANO("Femenina"),
    MEZZOSOPRANO("Femenina"),
    CONTRALTO("Femenina");

    private String tipoVoz;

    private Voz(String tipoVoz) {
        this.tipoVoz = tipoVoz;
    }

    public static Voz getCONTRATENOR() {
        return CONTRATENOR;
    }

    public static Voz getTENOR() {
        return TENOR;
    }

    public static Voz getBARITONO() {
        return BARITONO;
    }

    public static Voz getSOPRANO() {
        return SOPRANO;
    }

    public static Voz getMEZZOSOPRANO() {
        return MEZZOSOPRANO;
    }

    public static Voz getCONTRALTO() {
        return CONTRALTO;
    }

    public String getTipoVoz() {
        return tipoVoz;
    }

}
