package by.teachmeskills.homeworks.hw_240223;

import java.util.Scanner;

public class Task5_RecursionYesNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = in.nextInt();
        System.out.println(recursion(number / 2) == 1 ? "Yes" : "No");
    }

    public static int recursion(double num) {
        if (num == 1) {
            return 1;
        } else if (num > 1 && num < 2) {
            return 0;
        } else {
            return recursion(num / 2);
        }
    }
}


