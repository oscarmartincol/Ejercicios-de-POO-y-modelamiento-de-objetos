package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

/**
 * Clase que representa un barco
 * @author Oscar David Martinez Benavides
 */
public class Boat extends Vehicle {
    /**
     * Variable que describe si el vehículo tiene ancla
     */
    private boolean hasAnchor;

    /**
     * Constructor que define el tipo de vehículo como barco y hasAnchor como true.
     */
    public Boat(){
        setVehicleType("Barco");
        this.hasAnchor = true;
    }

    /**
     * Método para acceder al válor de la variable hasAnchor
     * @return valor de hasAnchor
     */
    public boolean isHasAnchor() {
        return hasAnchor;
    }

    /**
     * Método para asignar el válor de la variable hasAnchor
     * @param hasAnchor tiene o no tiene ancla (true o false).
     */
    public void setHasAnchor(boolean hasAnchor) {
        this.hasAnchor = hasAnchor;
    }

    /**
     * Método para acceder a los datos del vehículo.
     * @return Datos del barco.
     */
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Barco{" +
                "número de pasajeros=" + getPassengersNumber() +
                ", presencia de tripulación=" + isCrewPresence() +
                ", número de ruedas=" + getWheelsNumber() +
                ", fecha de matricula=" + format.format(getRegistrationDate()) +
                ", medio por el que se desplaza='" + getScrollMeans() +
                " Tiene ancla= " + this.hasAnchor + '\'' +
                '}';
    }
}
