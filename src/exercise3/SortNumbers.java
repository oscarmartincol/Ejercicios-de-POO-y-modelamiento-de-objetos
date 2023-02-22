package exercise3;

public class SortNumbers {

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

    public void quickSort(int[] numbers, int left, int right) {
        int pivot = numbers[left];
        int i = left;
        int j = right;
        int temp;
        while (i < j) {
            while (numbers[i] <= pivot && i < j) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i < j) {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        numbers[left] = numbers[j];
        numbers[j] = pivot;

        if (left < j-1){
            quickSort(numbers, left, j-1);
        }
        if (j+1 < right){
            quickSort(numbers, j+1, right);
        }

    }
}
