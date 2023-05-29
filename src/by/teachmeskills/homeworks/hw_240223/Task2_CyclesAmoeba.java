package by.teachmeskills.homeworks.hw_240223;

public class Task2_CyclesAmoeba {
    public static void main(String[] args) {
        int amoebaNumber = 1;
        for (int i = 0; i < 24; i += 3) {
            amoebaNumber *= 2;
            System.out.println(amoebaNumber);
        }
    }
}

