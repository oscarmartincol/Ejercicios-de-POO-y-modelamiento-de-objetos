package exercise5;

import exercise4.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Clase que solicita los datos que tienen los vehículos.
 * @author Oscar David Martinez Benavides
 */
public class AddVehicles {

    /**
     * Método que solicita los datos en común que tienen todos los tipos de vehículo.
     * @param vehicle vehículo al que pertenecen los datos
     * @throws ParseException excepción en caso de que se ingrese un formato incorrecto a la fecha de matrícula.
     */
    public void generalParameters(Vehicle vehicle) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Capacidad de pasajeros: ");
        vehicle.setPassengersNumber(input.nextInt());
        System.out.print("¿Requiere la presencia de tripulacion? (true/false): ");
        vehicle.setCrewPresence(input.nextBoolean());
        System.out.print("Número de ruedas: ");
        vehicle.setWheelsNumber(input.nextInt());
        System.out.print("Fecha de matricula: ");
        vehicle.setRegistrationDate(format.parse(input.next()));
        input.nextLine();
        System.out.println("Medio por el que se desplaza: ");
        vehicle.setScrollMeans(input.nextLine());
    }

    /**
     * Método que crea un vehículo de tipo Coche.
     * @return Coche
     * @throws ParseException excepcion de fecha de matrícula con formato incorrecto.
     */
    public Car addCar() throws ParseException {
        Car car = new Car();
        generalParameters(car);
        return car;
    }

    /**
     * Método que crea un vehículo de tipo Bicicleta.
     * @return Bicicleta
     * @throws ParseException excepcion de fecha de matrícula con formato incorrecto.
     */
    public Bike addBike() throws ParseException {
        Bike bike = new Bike();
        generalParameters(bike);
        return bike;
    }

    /**
     * Método que crea un vehículo de tipo Barco.
     * @return Barco
     * @throws ParseException excepcion de fecha de matrícula con formato incorrecto.
     */
    public Boat addBoat() throws ParseException {
        Boat boat = new Boat();
        generalParameters(boat);
        return boat;
    }

    /**
     * Método que crea un vehículo de tipo Motocicleta.
     * @return Motocicleta
     * @throws ParseException excepcion de fecha de matrícula con formato incorrecto.
     */
    public Motorcycle addMotorcycle() throws ParseException {
        Motorcycle motorcycle = new Motorcycle();
        generalParameters(motorcycle);
        return motorcycle;
    }

    /**
     * Método que crea un vehículo de tipo Camión.
     * @return Camión
     * @throws ParseException excepcion de fecha de matrícula con formato incorrecto.
     */
    public Truck addTruck() throws  ParseException {
        Truck truck = new Truck();
        generalParameters(truck);
        return truck;
    }

    /**
     * Método que imprime el contenido de un arreglo que almacena vehículos
     * @param vehicles Arreglo de vehiculos.
     */
    public void showVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle: vehicles) {
            if(vehicle != null) {
                System.out.println(vehicle);
            }
        }
    }
}
