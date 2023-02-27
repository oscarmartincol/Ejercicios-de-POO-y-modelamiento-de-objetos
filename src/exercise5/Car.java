package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

public class Car extends Vehicle {
    private boolean hasDoors;

    public Car(){
        setVehicleType("Coche");
        this.hasDoors = true;
    }

    public boolean isHasDoors() {
        return hasDoors;
    }

    public void setHasDoors(boolean doors) {
        this.hasDoors = doors;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Coche{" +
                "número de pasajeros=" + getPassengersNumber() +
                ", presencia de tripulación=" + isCrewPresence() +
                ", número de ruedas=" + getWheelsNumber() +
                ", fecha de matricula=" + format.format(getRegistrationDate()) +
                ", medio por el que se desplaza='" + getScrollMeans() +
                " Tiene puertas= " + this.hasDoors + '\'' +
                '}';
    }
}
