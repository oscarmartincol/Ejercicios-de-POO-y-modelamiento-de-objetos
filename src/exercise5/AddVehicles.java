package exercise5;

import exercise4.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AddVehicles {

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

    public Car addCar() throws ParseException {
        Car car = new Car();
        generalParameters(car);
        return car;
    }

    public Bike addBike() throws ParseException {
        Bike bike = new Bike();
        generalParameters(bike);
        return bike;
    }

    public Boat addBoat() throws ParseException {
        Boat boat = new Boat();
        generalParameters(boat);
        return boat;
    }

    public Motorcycle addMotorcycle() throws ParseException {
        Motorcycle motorcycle = new Motorcycle();
        generalParameters(motorcycle);
        return motorcycle;
    }

    public Truck addTruck() throws  ParseException {
        Truck truck = new Truck();
        generalParameters(truck);
        return truck;
    }
    public void showVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle: vehicles) {
            if(vehicle != null) {
                System.out.println(vehicle);
            }
        }
    }
}
