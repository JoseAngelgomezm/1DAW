/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author joseangel
 */
public abstract class Sensor {

    private int idSensor;

    public Sensor(int id) {
        this.idSensor = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.idSensor;
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
        final Sensor other = (Sensor) obj;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sensor{");
        sb.append("idSensor=").append(idSensor);
        sb.append('}');
        return sb.toString();
    }

    public abstract void alarma();

    public int getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(int idSensor) {
        this.idSensor = idSensor;
    }
}
