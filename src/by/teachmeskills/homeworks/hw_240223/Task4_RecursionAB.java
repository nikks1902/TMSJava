package by.teachmeskills.homeworks.hw_240223;

public class Task4_RecursionAB {
    public static void main(String[] args) {
        System.out.println(recursionAB(0, 10));
        System.out.println(recursionAB(10, 0));
    }

    public static String recursionAB(int a, int b) {
        if (a == b) {
            return Integer.toString(a);
        }
        if (a < b)
            return a + " " + recursionAB(a + 1, b);
        else {
            return a + " " + recursionAB(a - 1, b);
        }
    }
}