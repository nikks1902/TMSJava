package by.teachmeskills.homeworks.hw_17022023;

import java.util.Arrays;

public class HomeWork17022023_task5 {
    public static void main(String[] args) {
        int[] array = {7, 13, 2, 0, 11};

        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array [i] > array [i + 1]) {
                    temp = array [i];
                    array [i] = array [i + 1];
                    array [i + 1] = temp;
                    sorted = false;

                }
            }

        }
        System.out.println(Arrays.toString(array));
    }
}