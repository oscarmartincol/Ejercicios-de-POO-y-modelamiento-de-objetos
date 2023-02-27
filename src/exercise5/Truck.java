package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

public class Truck extends Vehicle {
    private boolean height;
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
