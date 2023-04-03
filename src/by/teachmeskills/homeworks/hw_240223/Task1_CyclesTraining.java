package by.teachmeskills.homeworks.hw_240223;

public class Task1_CyclesTraining {
    public static void main(String[] args) {
        int day;
        double kmDay;
        double kmSum;
        kmDay = kmSum = 10.0;

        for (day = 2; day <= 7; day++) {
            kmDay *= 1.1;
            kmSum += kmDay;
        }
        System.out.println("Всего за 7 дней спортсмен пробежит " + kmSum + " км");
    }
}