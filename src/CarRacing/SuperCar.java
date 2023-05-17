package CarRacing;

public class SuperCar extends Car {
    private int boosterCnt = 0;
    int notBoostCnt = 0;

    public SuperCar(int carSpeed, String carName) {
        super(carSpeed, carName);
    }

    @Override
    public void go() {
        if (random.nextInt(2) != 1) {
            super.go();
            notBoostCnt ++;
        } else {
            score = score + ((carSpeed * 2));
            boosterCnt++;
        }
    }

    @Override
    public void sayScore() {
        System.out.println("score = " + score + ", booster : " + boosterCnt);
    }
}
