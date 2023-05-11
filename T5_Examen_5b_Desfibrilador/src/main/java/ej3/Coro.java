/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Jose Angel
 */
public class Coro {

    private List<Voz> listaVoces;

    public Coro() {
        this.listaVoces = generarVoces(20);
    }

    // metodo que genera las voces del coro aleatorias
    public List<Voz> generarVoces(int numeroVoces) {
        java.util.Random generador = new java.util.Random();
        List<Voz> voces = new ArrayList<>();
        int aleatorio;// numero aleatorio para determinar que voz se creara
        int numeroMinimoVoces = 6;
        if (numeroVoces < numeroMinimoVoces) {
            throw new IllegalArgumentException("Numero de voces no permitido");
        } else {
            for (int i = 0; i < numeroVoces; i++) {

                aleatorio = generador.nextInt(1, 7);

                switch (aleatorio) {
                    case 1 ->
                        voces.add(Voz.CONTRATENOR);
                    case 2 ->
                        voces.add(Voz.TENOR);
                    case 3 ->
                        voces.add(Voz.BARITONO);
                    case 4 ->
                        voces.add(Voz.SOPRANO);
                    case 5 ->
                        voces.add(Voz.MEZZOSOPRANO);
                    case 6 ->
                        voces.add(Voz.CONTRALTO);
                }

            }

            return voces;
        }
    }

    // metodo que monta los coros posibles a montar
    public int getNumeroCorosMixtos() {
        int numeroCoros = 0;
        int contadorContratenor = 0;
        int contadorTenor = 0;
        int contadorBaritono = 0;
        int contadorSoprano = 0;
        int contadorMezzosoprano = 0;
        int contadorContraalto = 0;

        // contar cuantas voces hay de cada tipo
        // recorrer la lista
        for (int i = 0; i < this.listaVoces.size(); i++) {

            // obtener el numero de voces de cada tipo
            switch (this.listaVoces.get(i)) {
                case CONTRATENOR ->
                    contadorContratenor++;
                case TENOR ->
                    contadorTenor++;
                case BARITONO ->
                    contadorBaritono++;
                case SOPRANO ->
                    contadorSoprano++;
                case MEZZOSOPRANO ->
                    contadorMezzosoprano++;
                case CONTRALTO ->
                    contadorContraalto++;
                default ->
                    throw new AssertionError();
            }

        }

        // imprimir conteo de los tipos de voces
        System.out.println("Contatenores:  " + contadorContratenor);
        System.out.println("Tenores:       " + contadorTenor);
        System.out.println("Baritono:      " + contadorBaritono);
        System.out.println("Sopranos:      " + contadorSoprano);
        System.out.println("Mezzosopranos: " + contadorMezzosoprano);
        System.out.println("Contraaltos:   " + contadorContraalto);

        // montar los coros
        do {
            // si hay alemenos una voz de cada, se puede montar un coro
            if (contadorContratenor >= 1
                    && contadorTenor >= 1
                    && contadorBaritono >= 1
                    && contadorSoprano >= 1
                    && contadorMezzosoprano >= 1
                    && contadorContraalto >= 1) {

                numeroCoros++;

                // restar 1 a cada uno de los contadores porque se ha formado un coro
                contadorContratenor--;
                contadorTenor--;
                contadorBaritono--;
                contadorSoprano--;
                contadorMezzosoprano--;
                contadorContraalto--;

            }

            // repetir la operacion hasta que uno de los tipos de voces llegue a 0
        } while (contadorContratenor > 0
                && contadorTenor > 0
                && contadorBaritono > 0
                && contadorSoprano > 0
                && contadorMezzosoprano > 0
                && contadorContraalto > 0);

        return numeroCoros;
    }

    public List<Voz> buscarVozMasRepetida() {
        List<Voz> lista = new ArrayList<>();

        int numeroCoros = 0;
        int contadorContratenor = 0;
        int contadorTenor = 0;
        int contadorBaritono = 0;
        int contadorSoprano = 0;
        int contadorMezzosoprano = 0;
        int contadorContraalto = 0;

        // contar cuantas voces hay de cada tipo
        // recorrer la lista
        for (int i = 0; i < this.listaVoces.size(); i++) {

            // obtener el numero de voces de cada tipo
            switch (this.listaVoces.get(i)) {
                case CONTRATENOR ->
                    contadorContratenor++;
                case TENOR ->
                    contadorTenor++;
                case BARITONO ->
                    contadorBaritono++;
                case SOPRANO ->
                    contadorSoprano++;
                case MEZZOSOPRANO ->
                    contadorMezzosoprano++;
                case CONTRALTO ->
                    contadorContraalto++;
                default ->
                    throw new AssertionError();
            }

        }

        return lista;
    }

    public List<Voz> getListaVoces() {
        return listaVoces;
    }

    public void setListaVoces(List<Voz> listaVoces) {
        this.listaVoces = listaVoces;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.listaVoces);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coro other = (Coro) obj;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coro{");
        sb.append("listaVoces=").append(listaVoces);
        sb.append('}');
        return sb.toString();
    }

}
