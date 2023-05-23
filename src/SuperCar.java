import java.util.Random;

public class SuperCar extends Car {

    private int boost = 0;

    SuperCar(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void go(int time) { // 만약 time이 10일때
        Random r = new Random();
        Random isboost = new Random();

        for (int t = 0; t < time; t++) {
            if (r.nextBoolean()) {
                if (isboost.nextBoolean()) {
                    this.boost += 1;
                    this.score += this.getSpeed() * 2;
                } else
                    this.score += this.getSpeed();
            }
        }
    }


    public void sayScore() {
        System.out.println("차 이름:" + this.getName() + " 달린거리 : " + this.score + " boost = " + this.boost);
    }


}
