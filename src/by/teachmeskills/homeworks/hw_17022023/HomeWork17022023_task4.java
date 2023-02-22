package by.teachmeskills.homeworks.hw_17022023;

public class HomeWork17022023_task4 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int sum = 0;
        int x = 1;
        int[] array = {7, -5, 8, 15, -10, 20};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                System.out.println(min);
            }
            if (array[i] > max) {
                max = array[i];
                System.out.println(max);
            }
            if (array[i] < 0) {
                sum += array[i];
                System.out.println(sum);
            }
            if (array[i] > (min)) {
                if (array[i] < (max)) {
                    x*=array[i];
                }
            }
        }
    }
}