import utils.Car;

import java.util.Random;

public class SuperCar implements Car {
    private String name = "";
    private int speed = 0;
    private int score = 0;
    private int boostCount = 0;

    public SuperCar(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void describe() {
        System.out.print("[ " + this.name + "(Super) ] ");
        System.out.print("Speed : " + this.speed);
        System.out.println();
    }

    @Override
    public void move() {
        Random random = new Random();
        int mainActive = random.nextInt(2);
        int boostMultiply = 2 - random.nextInt(2);
        if (mainActive == 1 && boostMultiply == 2) {
            boostCount++;
        }
        this.score += mainActive * boostMultiply * this.speed;
    }

    @Override
    public void printResult() {
        System.out.print("[ " + this.name + "(Super) ]");
        System.out.print(" score : " + this.score);
        System.out.print(" active boost : " + this.boostCount);
        System.out.println();
    }
}