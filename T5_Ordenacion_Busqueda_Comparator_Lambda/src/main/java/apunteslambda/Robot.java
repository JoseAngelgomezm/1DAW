/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package apunteslambda;

/**
 *
 * @author joseangel
 */
public record Robot(int numeroSerie, int vida) implements Comparable<Robot> {

    @Override
    public int compareTo(Robot o) {
        return Integer.compare(this.numeroSerie, o.numeroSerie);
    }

}
