package by.teachmeskills.homeworks.hw_030323.part3;

public class Lion extends Feline {
    public Lion(String picture, String food, int hungerLevel, Boundaries boundaries, Location location) {
        super(picture, food, hungerLevel, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Arrrrrrr!");
    }

    @Override
    protected void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    protected void roam() {
        System.out.println("Lion walks alone");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }
}
