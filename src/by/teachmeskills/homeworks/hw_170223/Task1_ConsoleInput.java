package by.teachmeskills.homeworks.hw_170223;

import java.util.Scanner;

public class Task1_ConsoleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side1: ");
        int side1 = sc.nextInt();
        System.out.print("Input side2: ");
        int side2 = sc.nextInt();
        System.out.print("Input radius: ");
        int radius = sc.nextInt();

        if ((Math.pow(side1, 2))+(Math.pow(side2, 2))<=(radius*2)*(radius*2))
            System.out.println("The hole can be completely covered");
        else System.out.println("The hole cannot be completely covered");
    }
}

