package by.teachmeskills.homeworks.hw_100323.part1_task4_exception;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public void start() throws MyCustomException{
        int a = 0;
        int b = 20;
        int randomNumber = a + (int) (Math.random() * b);
        System.out.println("Random number: " + randomNumber);
        if(randomNumber % 2 == 0)
            throw new MyCustomException("Автомобиль марки " + this.brand + " не завелся");
        else
            System.out.println("Автомобиль марки " + this.brand + " завелся");

        }


    }

