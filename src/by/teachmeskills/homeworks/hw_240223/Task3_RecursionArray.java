package by.teachmeskills.homeworks.hw_240223;

public class Task3_RecursionArray {
    public static void main(String[] args) {
        int[] array = {3, 12, 10, 11, 24, 19, 4, 8, 11, 23};
        System.out.println(RecursionSum(0, array));
    }

    private static int RecursionSum(int x, int[] array) {
        if (x == array.length - 1) {
            return array[x];
        }
        return array[x] + RecursionSum(x + 1, array);
    }
}


