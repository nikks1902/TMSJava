package by.teachmeskills.homeworks.hw_170223;

public class HW170223_task7 {
    public static void main(String[] args) {
        double[][] num = new double[9][];
        for (int i = 0; i < num.length; i++){
            num[i] = new double[]{Math.random()};
            for (int j = 0; j < num[i].length; j++){
                num[i][j] = Math.random();
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}
