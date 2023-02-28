package exercise6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Clase donde se utiliza la implementación de un Vector para ingresar cualquier cantidad de números hasta que
 * se repita alguno de forma consecutiva.
 */
public class SaveNumbers {
    /**
     * Vector con tamaño inicial de dos, que incrementa su capacidad en uno cada vez que se llena.
     */
    private Vector numbers = new Vector(2,1);

    /**
     * Método que solicita números hasta que se repita alguno de forma consecutiva.
     */
    public void addNumbers() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Acontinuación se solicita ingresar números, el programa terminara cuando " +
                "ingrese el mismo número dos veces seguidas.");
        System.out.print("Ingrese el primer número: ");
        /*
          Gestión de la excepcion cuando se ingrese un valor que no sea un número.
         */
        try {
            numbers.add(input.nextInt());
            do {
                System.out.print("Ingrese otro número: ");
                numbers.add(input.nextInt());
                i++;
            } while (numbers.get(i) != numbers.get(i - 1));
        }catch (InputMismatchException e) {
            System.out.println("Solo se pueden ingresar números enteros.");
        }
    }

    /**
     * Método que imprime los números ingresados en el vector.
     */
    public void showNumbers() {
        for (Object number : numbers) {
            System.out.print(number + " ");
        }
    }

}
