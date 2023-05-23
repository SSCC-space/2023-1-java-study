package CarRacing;

import java.util.Random;

public class Car {
    protected int carSpeed;
    protected String carName;
    protected int score = 0;
    protected long seed = System.currentTimeMillis();
    protected Random random = new Random(seed);

    public Car(int carSpeed, String carName) {
        this.carSpeed = carSpeed;
        this.carName = carName;
    }

    public void showInfo() {
        System.out.println("스피드는 " + carSpeed + "이고, 이름은 " + carName + "입니다.");
    }


    public void go() {
        score = score + (this.carSpeed * random.nextInt(2));
    }

    public void sayScore() {
        System.out.println("score = " + score);
    }
}