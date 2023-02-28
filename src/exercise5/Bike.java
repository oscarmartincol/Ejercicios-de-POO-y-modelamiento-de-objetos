package exercise5;

import exercise4.Vehicle;

import java.text.SimpleDateFormat;

/**
 * Clase que representa una bicicleta
 * @author Oscar David Martinez Benavides
 */
public class Bike extends Vehicle {
    /**
     * Variable que describe si la bicicleta tiene pedales.
     */
    private boolean hasPedals;

    /**
     * Constructor que inicializa el tipo de vehículo y define hasPedals como verdadero.
     */
    public Bike(){
        setVehicleType("Bicicleta");
        this.hasPedals = true;
    }

    /**
     * Método que retorna el valor de hasPedals
     * @return si tiene pedales el vehículo.
     */
    public boolean isHasPedals() {
        return hasPedals;
    }

    /**
     * Método para asignar valor a la variable hasPedals
     * @param hasPedals true o false
     */
    public void setHasPedals(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }

    /**
     * Método para imprimir los datos de la bicicleta.
     * @return Datos de la bicicleta.
     */
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
