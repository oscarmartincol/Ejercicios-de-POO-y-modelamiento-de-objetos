package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

/**
 * Clase que representa un camión
 * @author Oscar David Martinez Benavides
 */
public class Truck extends Vehicle {
    /**
     * Variable que describe si tiene altura
     */
    private boolean height;

    /**
     * Constructor que determina el valor del tipo de vehículo como Camión y el parametro height como true
     */
    public Truck() {
        setVehicleType("Camión");
        this.height = true;
    }

    public boolean isHeight() {
        return height;
    }

    public void setHeight(boolean height) {
        this.height = height;
    }

    /**
     * Método para acceder al válor de los atributos del vehículo.
     * @return Valores de los atributos del vehículo.
     */
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Camión{" +
                "número de pasajeros=" + getPassengersNumber() +
                ", presencia de tripulación=" + isCrewPresence() +
                ", número de ruedas=" + getWheelsNumber() +
                ", fecha de matricula=" + format.format(getRegistrationDate()) +
                ", medio por el que se desplaza='" + getScrollMeans() +
                " Tiene altura= " + this.height + '\'' +
                '}';
    }
}
