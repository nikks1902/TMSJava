package by.teachmeskills.homeworks.hw_030323.part1.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price){
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
