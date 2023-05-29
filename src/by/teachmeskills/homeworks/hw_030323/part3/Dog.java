package by.teachmeskills.homeworks.hw_030323.part3;

public class Dog extends Canine {

    public Dog(String picture, String food, int hungerLevel, Boundaries boundaries, Location location) {
        super(picture, food, hungerLevel, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Gav-gav-gav!");

    }

    @Override
    protected void eat() {
        System.out.println("Dog eats meat and Chappi");

    }

    @Override
    protected void roam() {
        System.out.println("Dog lives in a pack");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }
}
