package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

public class Motorcycle extends Vehicle {
    private boolean handlebarClutch;
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
