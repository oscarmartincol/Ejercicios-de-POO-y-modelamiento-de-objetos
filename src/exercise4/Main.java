package exercise4;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        ArrayMethods array = new ArrayMethods();

        try {
            for(int i = 0; i < vehicles.length; i++) {
                System.out.println("A continución ingrese la información del vehículo " + i);
                vehicles[i] = array.addVehicles();
            }
        } catch (ParseException e) {
           e.printStackTrace();
        }
        array.showVehicles(vehicles);
    }
}
