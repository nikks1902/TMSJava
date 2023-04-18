package by.teachmeskills.homeworks.hw_030323.part3;

public class Hippo extends Animal {
    public Hippo(String picture, String food, int hungerLevel, Boundaries boundaries, Location location) {
        super(picture, food, hungerLevel, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Hippo is very noisy");
    }

    @Override
    protected void eat() {
        System.out.println("Hippo eats grass");
    }

    @Override
    public String toString() {
        return "Hippo{" +
                "picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }
}
