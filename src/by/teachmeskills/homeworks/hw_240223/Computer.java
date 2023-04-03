package by.teachmeskills.homeworks.hw_240223;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD Ryzen 7", 16, 512);
        computer.info();
        turnOn();
        turnOff();
    }
    private static String processor;
    private static int RAM;
    private static int HDD;

    public Computer(String processor, int RAM, int HDD) {
        this.processor = processor;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public static void info() {
        System.out.printf("The type of processor is %s, RAM capacity is %d, HDD capacity is %d", processor, RAM, HDD);
    }
    public static void turnOn() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        int inputNumber;
        for (int i = 0; i < 1; i++) {
            System.out.print("Enter number: ");
            inputNumber = scanner.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("Computer is on!");
            } else
                System.out.println("Computer is dead!");
        }
    }
    public static void turnOff() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        int inputNumber;
        for (int i = 0; i < 1; i++) {
            System.out.print("Enter number: ");
            inputNumber = scanner.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("Computer is off!");
            } else
                System.out.println("Computer is dead!");
        }
    }
}

