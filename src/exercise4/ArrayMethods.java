package exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ArrayMethods {

    public Vehicle addVehicles() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
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
            return vehicle;
    }

    public void showVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle: vehicles) {
            if(vehicle != null) {
                System.out.println(vehicle);
            }
        }
    }
}
