package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

/**
 * Clase que representa una motocicleta
 * @author Oscar David Martinez Benavides
 */
public class Motorcycle extends Vehicle {
    /**
     * Variable que describe si tiene embrague de manubrio.
     */
    private boolean handlebarClutch;

    /**
     * Constructor que define el tipo de vehículo como Motocicleta y handlebarClutch como true
     */
    public Motorcycle(){
        setVehicleType("Motocicleta");
        this.handlebarClutch = true;
    }

    public boolean isHandlebarClutch() {
        return handlebarClutch;
    }

    public void setHandlebarClutch(boolean handlebarClutch) {
        this.handlebarClutch = handlebarClutch;
    }

    /**
     * Método para acceder a la información del vehículo.
     * @return Atributos y valores del vehículo
     */
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Motocicleta{" +
                "número de pasajeros=" + getPassengersNumber() +
                ", presencia de tripulación=" + isCrewPresence() +
                ", número de ruedas=" + getWheelsNumber() +
                ", fecha de matricula=" + format.format(getRegistrationDate()) +
                ", medio por el que se desplaza='" + getScrollMeans() +
                " Tiene embrague de manillar= " + this.handlebarClutch + '\'' +
                '}';
    }
}
