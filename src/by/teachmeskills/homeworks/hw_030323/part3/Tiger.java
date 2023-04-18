package by.teachmeskills.homeworks.hw_030323.part3;

public class Tiger extends Feline {
    public Tiger(String picture, String food, int hungerLevel, Boundaries boundaries, Location location) {
        super(picture, food, hungerLevel, boundaries, location);
    }

    @Override
    protected void roam() {
        System.out.println("Tiger walks alone...");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Rrrrrrrr!");

    }

    @Override
    protected void eat() {
        System.out.println("Tiger eats meat");

    }

    @Override
    public String toString() {
        return "Tiger{" +
                "picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }
}
