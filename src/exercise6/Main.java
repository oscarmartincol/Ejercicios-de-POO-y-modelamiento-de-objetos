package exercise6;
/**
 * Clase con el método main que ejecuta la aplicación.
 * @ author Oscar David Martinez Benavides
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Objeto donde se encuentran los métodos para ingresar números y mostrarlos.
         */
        SaveNumbers arrayNumbers = new SaveNumbers();
        //Agregar números al vector hasta que se repita uno consecutivamente.
        arrayNumbers.addNumbers();
        System.out.println("Números ingresados: ");
        //imprimir los números que se ingresaron en el vector
        arrayNumbers.showNumbers();
    }
}
