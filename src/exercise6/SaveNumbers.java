package exercise6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class SaveNumbers {
    Vector numbers = new Vector(2,1);

    public void addNumbers() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Acontinuación se solicita ingresar números, el programa terminara cuando " +
                "ingrese el mismo número dos veces seguidas.");
        System.out.print("Ingrese el primer número: ");
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

    public void showNumbers() {
        for (Object number : numbers) {
            System.out.print(number + " ");
        }
    }

}
