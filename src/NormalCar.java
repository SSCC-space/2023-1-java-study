import utils.Car;

import java.util.Random;

public class NormalCar implements Car {
    private String name = "";
    private int speed = 0;
    private int score = 0;

    public NormalCar(String name, int speed) {
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
        System.out.print("[ " + this.name + "(Normal) ] ");
        System.out.print("Speed : " + this.speed);
        System.out.println();
    }

    @Override
    public void move() {
        Random random = new Random();
        this.score += random.nextInt(2) * this.speed;
    }

    @Override
    public void printResult() {
        System.out.print("[ " + this.name + "(Normal) ] ");
        System.out.print("score : " + this.score);
        System.out.println();
    }
}