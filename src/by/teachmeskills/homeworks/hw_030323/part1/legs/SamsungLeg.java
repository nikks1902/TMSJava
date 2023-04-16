package by.teachmeskills.homeworks.hw_030323.part1.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
