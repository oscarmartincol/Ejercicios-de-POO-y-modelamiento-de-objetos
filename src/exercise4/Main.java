package exercise4;

import java.text.ParseException;

/**
 * Clase con el método main que crea un arreglo de 10 posiciones que almacena vehículos
 */
public class Main {
    public static void main(String[] args) {
        /*
        vehicles --> array de 10 posiciones que almacena instancias de Vehicle
        array --> Instancia de ArrayMethods que contiene los metodos para agregar vehiculos y mostrarlos.
         */
        Vehicle[] vehicles = new Vehicle[10];
        ArrayMethods array = new ArrayMethods();

        //Gestión de la excepción cuando se ingresa una fecha con formato incorrecto.
        try {
            //Ciclo para llenar el arreglo
            for(int i = 0; i < vehicles.length; i++) {
                System.out.println("A continución ingrese la información del vehículo " + i);
                vehicles[i] = array.addVehicles();
            }
        } catch (ParseException e) {
           e.printStackTrace();
        }
        //Mostrar vehículos almacenados en el arreglo
        array.showVehicles(vehicles);
    }
}
