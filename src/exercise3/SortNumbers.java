package exercise3;

public class SortNumbers {

    /**
     * Método burbuja para ordenar números
     * @param numbers arreglo que se quiere ordenar
     */
    public void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    /**
     * Método quicksort para ordenar números
     * @param numbers Arreglo que se quiere ordenar
     * @param left puntero izquierdo
     * @param right puntero derecho
     */
    public void quickSort(int[] numbers, int left, int right) {
        int pivot = numbers[left];
        int i = left;
        int j = right;
        int temp;
        while (i < j) {
            //ciclo para encontrar números menores que el pivote
            while (numbers[i] <= pivot && i < j) {
                i++;
            }
            //ciclo para encontrar los números mayores al pivote
            while (numbers[j] > pivot) {
                j--;
            }
            //verificar cruce de punteros
            if (i < j) {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        numbers[left] = numbers[j];
        numbers[j] = pivot;

        // repetir proceso con los subarreglos
        if (left < j-1){
            quickSort(numbers, left, j-1);
        }
        if (j+1 < right){
            quickSort(numbers, j+1, right);
        }

    }
}
