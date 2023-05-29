package by.teachmeskills.homeworks.hw_030323.part3;

public class Wolf extends Canine {
    public Wolf(String picture, String food, int hungerLevel, Boundaries boundaries, Location location) {
        super(picture, food, hungerLevel, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Auuuuuuuuu!");
    }

    @Override
    protected void eat() {
        System.out.println("Wolf eats meat");
    }

    @Override
    protected void roam() {
        System.out.println("Wolf lives in a pack");

    }

    @Override
    public String toString() {
        return "Wolf{" +
                "picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }
}
