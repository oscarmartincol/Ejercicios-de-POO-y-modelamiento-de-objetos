package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

/**
 * Clase que representa un coche.
 * @author Oscar David Martinez Benavides
 */
public class Car extends Vehicle {
    /**
     * Método que describe si el coche tiene tres o cinco puertas.
     */
    private boolean hasDoors;

    /**
     * Constructor que define el tipo de vehículo como coche y hasDoors como verdadero.
     */
    public Car(){
        setVehicleType("Coche");
        this.hasDoors = true;
    }

    /**
     * Método para acceder al válor de hasDoors
     * @return vehículo tiene tres o cinco puertas.
     */
    public boolean isHasDoors() {
        return hasDoors;
    }

    /**
     * Método para asignar el válor de hasDoors
     * @param doors Tiene tres o cinco puertas (true o false)
     */
    public void setHasDoors(boolean doors) {
        this.hasDoors = doors;
    }

    /**
     * Método para acceder a la información del vehículo
     * @return Valores y atributos del vehículo
     */
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
