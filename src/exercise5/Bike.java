package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

public class Bike extends Vehicle {
    private boolean hasPedals;
    public Bike(){
        setVehicleType("Bicicleta");
        this.hasPedals = true;
    }

    public boolean isHasPedals() {
        return hasPedals;
    }

    public void setHasPedals(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Bicicleta{" +
                "número de pasajeros=" + getPassengersNumber() +
                ", presencia de tripulación=" + isCrewPresence() +
                ", número de ruedas=" + getWheelsNumber() +
                ", fecha de matricula=" + format.format(getRegistrationDate()) +
                ", medio por el que se desplaza='" + getScrollMeans() +
                " Tiene pedales= " + this.hasPedals + '\'' +
                '}';
    }
}
