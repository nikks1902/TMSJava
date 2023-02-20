package by.teachmeskills.homeworks.hw_17022023;

public class HomeWork17022023_task7 {
    public static void main(String[] args) {
        double[][] num = new double[10][];

        for (int i = 0; i < num.length; i++){
            num[i] = new double[i + 1];
            for (int j = 0; j < num[i].length; j++){
                num[i][j] = Math.random();
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}
