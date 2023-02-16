package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;

public class HomeWork17022023_task1 {
    public static void main(String[] args) {
        System.out.println("side1, side2, radius");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int side1 = 10, side2 = 5, radius = 8;
        if ((side1*side1)+(side2*side2)<=(radius*2)*(radius*2))
        System.out.println("The hole can be completely covered");
        else System.out.println("The hole cannot be completely covered");
    }
        }

