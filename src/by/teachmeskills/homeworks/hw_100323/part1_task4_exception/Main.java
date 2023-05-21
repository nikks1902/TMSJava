package by.teachmeskills.homeworks.hw_100323.part1_task4_exception;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        try {
            car.start();
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());;
        }
        Car car1 = new Car("Audi");
        try {
            car1.start();
        }catch (MyCustomException e){
            System.out.println(e.getMessage());
        }
    }
}
