package by.teachmeskills.homeworks.hw_100323.part1_task2_enum;

public class School {
    public static int NumberOfPupils = 666;

    public static void main(String[] args) {
        Season season1 = Season.WINTER;
        Season season2 = Season.SPRING;
        Season season3 = Season.SUMMER;
        Season season4 = Season.AUTUMN;
        System.out.println(season1.information());
        System.out.println(season2.information());
        System.out.println(season3.information());
        System.out.println(season4.information());

    }
}
