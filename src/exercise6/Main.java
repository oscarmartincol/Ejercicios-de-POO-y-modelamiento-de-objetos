package exercise6;

public class Main {
    public static void main(String[] args) {
        SaveNumbers arrayNumbers = new SaveNumbers();
        arrayNumbers.addNumbers();
        System.out.println("Números ingresados: ");
        arrayNumbers.showNumbers();
    }
}
