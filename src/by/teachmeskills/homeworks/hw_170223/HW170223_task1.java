package by.teachmeskills.homeworks.hw_170223;

import java.util.Scanner;

public class HW170223_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side1: ");
        int side1 = sc.nextInt();
        System.out.print("Input side2: ");
        int side2 = sc.nextInt();
        System.out.print("Input radius: ");
        int radius = sc.nextInt();

        if ((side1*side1)+(side2*side2)<=(radius*2)*(radius*2))
            System.out.println("The hole can be completely covered");
        else System.out.println("The hole cannot be completely covered");
    }
}
