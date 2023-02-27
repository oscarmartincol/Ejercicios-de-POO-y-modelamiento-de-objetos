package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

public class Boat extends Vehicle {
    private boolean hasAnchor;
    public Boat(){
        setVehicleType("Barco");
        this.hasAnchor = true;
    }

    public boolean isHasAnchor() {
        return hasAnchor;
    }

    public void setHasAnchor(boolean hasAnchor) {
        this.hasAnchor = hasAnchor;
    }
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
