package by.teachmeskills.homeworks.hw_170223;

import java.util.Scanner;

public class HW170223_task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[][] array = new int[size1][size2];

        array[0][0] = 5;
        array[0][1] = 3;
        array[0][2] = 6;
        array[0][3] = 4;
        array[0][4] = 2;
        array[1][0] = 7;
        array[1][1] = 9;
        array[1][2] = 2;
        array[1][3] = 5;
        array[1][4] = 4;
        array[2][0] = 9;
        array[2][1] = 1;
        array[2][2] = 6;
        array[2][3] = 3;
        array[2][4] = 8;
        array[3][0] = 0;
        array[3][1] = 5;
        array[3][2] = 3;
        array[3][3] = 4;
        array[3][4] = 10;
        array[4][0] = 6;
        array[4][1] = 1;
        array[4][2] = 5;
        array[4][3] = 4;
        array[4][4] = 2;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
