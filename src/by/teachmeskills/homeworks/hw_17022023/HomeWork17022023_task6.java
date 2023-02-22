package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;

public class HomeWork17022023_task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int size = sc.nextInt();
        int[][] array = new int[size][size];

        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr);
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }
}

