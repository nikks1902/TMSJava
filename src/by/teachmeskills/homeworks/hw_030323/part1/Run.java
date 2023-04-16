package by.teachmeskills.homeworks.hw_030323.part1;

import by.teachmeskills.homeworks.hw_030323.part1.hands.IHand;
import by.teachmeskills.homeworks.hw_030323.part1.hands.SamsungHand;
import by.teachmeskills.homeworks.hw_030323.part1.hands.SonyHand;
import by.teachmeskills.homeworks.hw_030323.part1.hands.ToshibaHand;
import by.teachmeskills.homeworks.hw_030323.part1.heads.IHead;
import by.teachmeskills.homeworks.hw_030323.part1.heads.SamsungHead;
import by.teachmeskills.homeworks.hw_030323.part1.heads.SonyHead;
import by.teachmeskills.homeworks.hw_030323.part1.heads.ToshibaHead;
import by.teachmeskills.homeworks.hw_030323.part1.legs.ILeg;
import by.teachmeskills.homeworks.hw_030323.part1.legs.SamsungLeg;
import by.teachmeskills.homeworks.hw_030323.part1.legs.SonyLeg;
import by.teachmeskills.homeworks.hw_030323.part1.legs.ToshibaLeg;


public class Run {
    public static void main(String[] args) {
        IHead sonyHead = new SonyHead(1500);
        IHand samsungHand = new SamsungHand(300);
        ILeg toshibaLeg = new ToshibaLeg(500);
        Robot robot1 = new Robot(sonyHead, samsungHand, toshibaLeg);
        robot1.action();
//        System.out.println("Общая стоимость robot1 составляет " + robot1.getPrice() + " евро");

        IHead toshibaHead = new ToshibaHead(1000);
        IHand sonyHand = new SonyHand(400);
        ILeg samsungLeg = new SamsungLeg(600);
        Robot robot2 = new Robot(toshibaHead, sonyHand, samsungLeg);
        robot2.action();
//        System.out.println("Общая стоимость robot2 составляет " + robot2.getPrice() + " евро");

        IHead samsungHead = new SamsungHead(1150);
        IHand toshibaHand = new ToshibaHand(350);
        ILeg sonyLeg = new SonyLeg(700);
        Robot robot3 = new Robot(samsungHead, toshibaHand, sonyLeg);
        robot3.action();
//        System.out.println("Общая стоимость robot3 составляет " + robot3.getPrice() + " евро");

        Robot[] robots = {robot1, robot2, robot3};
        for (Robot robot : robots) {
            System.out.println(robot.getPrice());
        }
    }
}
