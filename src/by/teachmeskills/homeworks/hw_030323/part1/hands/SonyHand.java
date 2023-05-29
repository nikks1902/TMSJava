package by.teachmeskills.homeworks.hw_030323.part1.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price){
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
