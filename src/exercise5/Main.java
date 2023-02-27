package exercise5;
import exercise4.Vehicle;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        AddVehicles addvehicle = new AddVehicles();
        Scanner input = new Scanner(System.in);
        int option;

        for(int i = 0; i < vehicles.length; i++) {
            System.out.println("A continución ingrese la información del vehículo " + (i+1));
            System.out.println("Seleccione el tipo de vehículo");
            System.out.println("1.Coche");
            System.out.println("2.Bicicleta");
            System.out.println("3.Barco");
            System.out.println("4.Motocicleta");
            System.out.println("5.Camión");
            option = input.nextInt();
            try {
                switch (option) {
                    case 1 -> vehicles[i] = addvehicle.addCar();
                    case 2 -> vehicles[i] = addvehicle.addBike();
                    case 3 -> vehicles[i] = addvehicle.addBoat();
                    case 4 -> vehicles[i] = addvehicle.addMotorcycle();
                    case 5 -> vehicles[i] = addvehicle.addTruck();
                    default -> System.out.println("La opción seleccionada no es válida.");
                }
            } catch (ParseException e) {
                System.out.println("Formato de fecha ingresado es incorrecto.");
            }catch (InputMismatchException e) {
                System.out.println("Tipo del dato ingresado incorrecto.");
            }
        }
        addvehicle.showVehicles(vehicles);
    }
}