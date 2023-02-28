package exercise3;

import java.util.Scanner;

/**
 * Clase con el método principal para correr la aplicación
 * @author Oscar David Martinez Benavides
 */
public class Main {
    /**
     * Arreglo que almacena los números
     */
    static int[] numbers;
    public static void main(String[] args) {
        /*
        sort --> Instancia con los métodos para ordenar los números
        size --> Cantidad de números que se quieren guardar
        maxNumber --> Número maximo que se va a generar
        option --> variable para seleccionar el método para ordenar.
         */
        SortNumbers sort = new SortNumbers();
        int size, maxNumber, option;
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese la cantidad de números que quiere en el arreglo: ");
        size = input.nextInt();
        System.out.print("Ingrese el número máximo que puede estar en el arreglo: ");
        maxNumber = input.nextInt();
        numbers = new int[size];
        //generar números aleatorios
        addNumbers(maxNumber);
        // Imprimir números sin ordenar
        System.out.println("Números sin ordenar: ");
        printNumbers();
        System.out.println();
        System.out.println("Seleccione el método con el que quiere ordenar los números:");
        System.out.println("1.Método Burbuja.");
        System.out.println("2.Métoso Quicksort");
        option = input.nextInt();
        if (option == 1){
            sort.bubbleSort(numbers);
        } else if (option == 2) {
            sort.quickSort(numbers, 0, numbers.length - 1);
        }else {
            System.out.println("Debe ingresar 1 o 2.");
            System.out.println("Vuelva a ejecutar la aplicación,");
        }
        if (option == 1 || option == 2) {
            //imprimir los números ordenados
            System.out.println("Números ordenados: ");
            printNumbers();
        }

    }

    /**
     * Método para imprimir los números
     */
    public static void printNumbers() {
        for(int number: numbers){
            System.out.print(number + " ");
        }
    }

    /**
     * Método para agregar números aleatorios al arreglo.
     * @param maxNumber Número mayor que se va a generar
     */
    public static void addNumbers(int maxNumber) {
        for (int i=0; i < numbers.length; i++) {
            numbers[i] = (int)Math.floor(Math.random() * (maxNumber + 1));
        }
    }
}
