package by.teachmeskills.homeworks.hw_170223;

public class Task4_Vector {
    public static void main(String[] args) {
        int[] array = {7, -5, 8, 15, -10, 20};
        int min = 0;
        int max = 0;
        int sum = 0;
        int product = 1;

        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int j = 1; j < array.length - 1; j++) {
            if (array[j] < array[min]) {
                min = j;
            }
            if (array[j] > array[max]) {
                max = j;
            }
            product *= array[j];
        }
        System.out.println(product);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
