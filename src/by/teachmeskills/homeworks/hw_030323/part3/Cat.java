package by.teachmeskills.homeworks.hw_030323.part3;

public class Cat extends Feline {
    public Cat(String picture, String food, int hungerLevel, Boundaries boundaries, Location location) {
        super(picture, food, hungerLevel, boundaries, location);
    }

    @Override
    protected void roam() {
        System.out.println("Cat walks alone...");

    }

    @Override
    protected void makeNoise() {
        System.out.println("Meow!");

    }

    @Override
    protected void eat() {
        System.out.println("Cat eats mice");

    }

    @Override
    public String toString() {
        return "Cat{" +
                "picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }
}
