package by.teachmeskills.homeworks.hw_030323.part3;

public class Main {
    public static void main(String[] args) {
        Feline cat = new Cat("Cat.jpg", "Mice", 3, new Animal.Boundaries(50, 100), new Animal.Location(5, 10));
        Feline tiger = new Tiger("Tiger.jpg", "Meat", 5, new Animal.Boundaries(2000, 1000), new Animal.Location(7, 20));
        Canine dog = new Dog("Dog.jpg", "Meat and Chappi", 4, new Animal.Boundaries(100, 200), new Animal.Location(3, 8));
        Animal hippo = new Hippo("Hippo.jpg", "Grass", 7, new Animal.Boundaries(3000, 2000), new Animal.Location(11, 15));
        Feline lion = new Lion("Lion.jpg", "Meat", 8, new Animal.Boundaries(2500, 3000), new Animal.Location(12, 17));
        Canine wolf = new Wolf("Wolf.jpg", "Meat", 10, new Animal.Boundaries(4000, 5000), new Animal.Location(20, 18));

        Animal[] animals = {cat, tiger, dog, hippo, lion, wolf};
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            animal.roam();
            System.out.println("*******************************************************");
        }

        Feline[] felines = {cat, tiger, lion};
        for (Feline feline : felines) {
            feline.makeNoise();
            feline.eat();
            feline.sleep();
            feline.roam();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

        Canine[] canines = {dog, wolf};
        for (Canine canine : canines) {
            canine.makeNoise();
            canine.eat();
            canine.sleep();
            canine.roam();
            System.out.println("========================================================");
        }
    }
}
